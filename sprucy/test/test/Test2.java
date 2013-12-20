package test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.commons.io.FilenameUtils;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.formats.jpeg.JpegImageMetadata;
import org.apache.sanselan.formats.jpeg.exifRewrite.ExifRewriter;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.constants.ExifTagConstants;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.formats.tiff.constants.TiffFieldTypeConstants;
import org.apache.sanselan.formats.tiff.write.TiffOutputDirectory;
import org.apache.sanselan.formats.tiff.write.TiffOutputField;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;

public class Test2 {

    private static TiffField t;

    /**
     * Read metadata from image file and display it.
     * 
     * @param file
     */
    public static void readMetaData(File file) {
        IImageMetadata metadata = null;
        try {
            metadata = Sanselan.getMetadata(file);
        } catch (ImageReadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (metadata instanceof JpegImageMetadata) {
            JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
            //System.out.println("\nFile: " + file.getPath());
            printTagValue(jpegMetadata, TiffConstants.TIFF_TAG_XRESOLUTION);
            printTagValue(jpegMetadata, TiffConstants.TIFF_TAG_DATE_TIME);
            printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_DATE_TIME_ORIGINAL);
            printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_CREATE_DATE);
            printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_ISO);
            printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_SHUTTER_SPEED_VALUE);
            printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_APERTURE_VALUE);
            printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_BRIGHTNESS_VALUE);

            // simple interface to GPS data
            TiffImageMetadata exifMetadata = jpegMetadata.getExif();
            if (exifMetadata != null) {
                try {
                    TiffImageMetadata.GPSInfo gpsInfo = exifMetadata.getGPS();
                    if (null != gpsInfo) {
                        double longitude = gpsInfo.getLongitudeAsDegreesEast();
                        double latitude = gpsInfo.getLatitudeAsDegreesNorth();
                        //System.out.println("    " + "GPS Description: " + gpsInfo);
                        //System.out.println("    " + "GPS Longitude (Degrees East): " + longitude);
                        //System.out.println("    " + "GPS Latitude (Degrees North): " + latitude);
                    }
                } catch (ImageReadException e) {
                    e.printStackTrace();
                }
            }

            //System.out.println("EXIF items -");
            ArrayList<?> items = jpegMetadata.getItems();
            for (int i = 0; i < items.size(); i++) {
                Object item = items.get(i);
                //System.out.println(item.getClass());
                //System.out.println(((TiffImageMetadata.Item) item).getTiffField());
                t = ((TiffImageMetadata.Item) item).getTiffField();
                //System.out.println("    " + "item: " + item);
            }
            //System.out.println();
        }
    }

    private static void printTagValue(JpegImageMetadata jpegMetadata, TagInfo tagInfo) {
        TiffField field = jpegMetadata.findEXIFValue(tagInfo);
        if (field == null) {
            //System.out.println(tagInfo.name + ": " + "Not Found.");
        } else {
            //System.out.println(tagInfo.name + ": " + field.getValueDescription());
        }
    }

    /**
     * Example of adding an EXIF item to metadata, in this case using ImageHistory field. (I have
     * no idea if this is an appropriate use of ImageHistory, or not, just picked a field to update
     * that looked like it wasn't commonly mucked with.)
     * 
     * @param file
     */
    public static void addImageHistoryTag(File file) {
        File dst = null;
        IImageMetadata metadata = null;
        JpegImageMetadata jpegMetadata = null;
        TiffImageMetadata exif = null;
        OutputStream os = null;
        TiffOutputSet outputSet = new TiffOutputSet();

        // establish metadata
        try {
            metadata = Sanselan.getMetadata(file);
        } catch (ImageReadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // establish jpegMedatadata
        if (metadata != null) {
            jpegMetadata = (JpegImageMetadata) metadata;
        }

        // establish exif
        if (jpegMetadata != null) {
            exif = jpegMetadata.getExif();
        }

        // establish outputSet
        if (exif != null) {
            try {
                outputSet = exif.getOutputSet();
            } catch (ImageWriteException e) {
                e.printStackTrace();
            }
        }

        if (outputSet != null) {
            // check if field already EXISTS - if so remove
            TiffOutputField imageHistoryPre = outputSet
                .findField(TiffConstants.EXIF_TAG_XPCOMMENT);
            if (imageHistoryPre != null) {
                //System.out.println("REMOVE");
                outputSet.removeField(TiffConstants.EXIF_TAG_XPCOMMENT);
            }
            // add field
            try {
                String fieldData = "Hallo";
                TiffOutputField imageHistory = new TiffOutputField(
                    TiffConstants.EXIF_TAG_XPCOMMENT,
                    TiffFieldTypeConstants.FIELD_TYPE_BYTE,
                    fieldData.length(),
                    fieldData.getBytes());
                //
                TiffOutputDirectory exifDirectory = outputSet.getOrCreateExifDirectory();
                exifDirectory.add(imageHistory);

            } catch (ImageWriteException e) {

                e.printStackTrace();
            }
        }

        try {
            dst = new File("Hallo.jpg");
            os = new FileOutputStream(dst);
            os = new BufferedOutputStream(os);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // write/update EXIF metadata to output stream
        try {
            new ExifRewriter().updateExifMetadataLossless(file, os, outputSet);
        } catch (ImageReadException e) {
            e.printStackTrace();
        } catch (ImageWriteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                }
            }
        }

        // file.delete();
        // dst.renameTo(file);
    }

    public static void main(String[] args) {
        File files = new File("C:\\Users\\tietang\\Desktop\\3");
        File[] fs = files.listFiles();

        for (File f : fs) {
            if (f.isFile() && "jpg".equalsIgnoreCase(FilenameUtils.getExtension(f.getName()))) {
                //System.out.println("===========================" + f.getAbsolutePath());
                readMetaData(f);
            }
        }
        // readMetaData(new File("Adler (2).jpg"));
        // addImageHistoryTag(new File("Adler (2).jpg"));
        // readMetaData(new File("Hallo.jpg"));
    }

}