package test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;

import fengfei.fir.service.JpegExifReader;
import fengfei.fir.service.JpegExifWriter;
import fengfei.fir.service.impl.SanselanJpegExifReader;
import fengfei.fir.service.impl.SanselanJpegExifWriter;

public class SanselanExifWritetest {

	public static void main(String[] args) throws Exception {
		JpegExifWriter w = new SanselanJpegExifWriter();
		JpegExifReader d = new SanselanJpegExifReader();
		// JpegExifReadWrite d = new PhilHarveyJpegExifReadWrite();

		//
		String file = "C:/Users/wtt/Documents/GitHub/spruce/sprucy/upload/0/0/183g4mm1h8bgp1-1cb7ofb/0.JPG";
//		File files = new File("C:\\Users\\wtt\\Desktop\\3");
		File files = new File(file);
		File[] fs = files.listFiles();

		for (File f : fs) {
			if (f.isFile()
					&& "jpg".equalsIgnoreCase(FilenameUtils.getExtension(f
							.getName()))) {
				System.out.println("==========================="
						+ f.getAbsolutePath());
				Map<String, String> values = new HashMap<>();
				values.put(JpegExifWriter.Make, "NewCanon");
				values.put(JpegExifWriter.Model, "New CI F560P");
				// values.put(JpegExifReadWrite.FNumber, "1.7");
				values.put(JpegExifWriter.ExposureTime, "1/2000");
				values.put(JpegExifWriter.ShutterSpeedValue, "1/5000");

				values.put(JpegExifWriter.iso, "1000");
				values.put(JpegExifWriter.LensModel, "New EFC 55-250MM IS USM");
				values.put(JpegExifWriter.Lens, "New EFC 55-250MM IS USM");
				values.put(JpegExifWriter.FocalLength, "314");

				values.put(JpegExifWriter.ExposureCompensation, "0.1");

				w.writeExif(f.getAbsolutePath(), values);

			}
		}
		fs = files.listFiles();
		for (File f : fs) {
			if (f.isFile()
					&& "jpg".equalsIgnoreCase(FilenameUtils.getExtension(f
							.getName()))) {
				System.out.println("==========================="
						+ f.getAbsolutePath());
				Map<String, String> exif = d.readExif(f);
				System.out.println(exif);

			}
		}

	}
}
