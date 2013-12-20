package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Exif {

    static Map<Integer, String> tags = new HashMap<Integer, String>();
    static {

    }

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        String file = "C:\\Users\\tietang\\Desktop\\3\\DPP_0180.JPG";
        read(file);

    }

    private static void read(String file) throws Exception {

        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            byte[] b2 = new byte[2];
            in.read(b2);
            if (b2[0] != (byte) 0xFF || b2[1] != (byte) 0xD8) {
                //System.out.println("Not a tag,found: " + b2[1]);
                //System.out.println("" + 0xff + " , " + 0xd8);
                return; // not a valid jpeg
            }
            boolean isRead = true;
            while (isRead) {
                in.read(b2);
                if (b2[0] != (byte) 0xFF) {

                    //System.out.println("Not a valid marker at offset , found: " + b2[0]);
                    return; // not a valid marker, something is wrong
                }

                byte iMarker = b2[1];

                // we could implement handling for other markers here,
                // but we're only looking for 0xFFE1 for EXIF data

                if (iMarker == 22400) {

                    //System.out.println("Found 0xFFE1 marker");
                    // return readEXIFData(
                    // oFile,
                    // iOffset + 4,
                    // oFile.getShortAt(iOffset + 2, true) - 2);
                    // iOffset += 2 + oFile.getShortAt(iOffset + 2, true);

                } else if (iMarker == 225) {
                    // 0xE1 = Application-specific 1 (for EXIF)

                    //System.out.println("Found 0xFFE1 marker");
                    // return readEXIFData(
                    // oFile,
                    // iOffset + 4,
                    // oFile.getShortAt(iOffset + 2, true) - 2);

                } else {
                    // iOffset += 2 + oFile.getShortAt(iOffset + 2, true);
                }

            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            in.close();
        }

    }
}
