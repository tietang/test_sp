package test;
//
//import java.io.File;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.commons.io.FilenameUtils;
//
//import fengfei.sprucy.service.JpegExifReadWrite;
//import fengfei.sprucy.service.impl.ImagingJpegExifReadWrite;
//
//public class ImagingExifWritetest {
//	public static void main(String[] args) throws Exception {
//		JpegExifReadWrite d = new ImagingJpegExifReadWrite();
////		 JpegExifReadWrite d = new PhilHarveyJpegExifReadWrite();
//
//		//
//
//		File files = new File("C:\\Users\\wtt\\Desktop\\3");
//		File[] fs = files.listFiles();
//
//		for (File f : fs) {
//			if (f.isFile()
//					&& "jpg".equalsIgnoreCase(FilenameUtils.getExtension(f
//							.getName()))) {
//				System.out.println("==========================="
//						+ f.getAbsolutePath());
//				Map<String, String> values = new HashMap<>();
//				values.put(JpegExifReadWrite.Make, "NewCanon");
//				values.put(JpegExifReadWrite.Model, "New CI F560P");
//				 values.put(JpegExifReadWrite.FNumber, "1.2");
//				values.put(JpegExifReadWrite.ExposureTime, "1/200");
//				values.put(JpegExifReadWrite.ShutterSpeedValue, "1/500");
//
//				values.put(JpegExifReadWrite.iso, "1000");
//				values.put(JpegExifReadWrite.LensModel,
//						"New EFC 55-250MM IS USM");
//				values.put(JpegExifReadWrite.Lens, "New EFC 55-250MM IS USM");
//				values.put(JpegExifReadWrite.FocalLength, "314");
//
//				values.put(JpegExifReadWrite.ExposureCompensation, "0.1");
//
////				d.writeExif(f.getAbsolutePath(), values);
//
//			}
//		}
//		fs = files.listFiles();
//		for (File f : fs) {
//			if (f.isFile()
//					&& "jpg".equalsIgnoreCase(FilenameUtils.getExtension(f
//							.getName()))) {
//				System.out.println("==========================="
//						+ f.getAbsolutePath());
//				Map<String, String> exif = d.readExif(f);
//				System.out.println(exif);
//
//			}
//		}
//
//	}
//}
