package controllers;

import static fengfei.fir.service.JpegExif.DateTimeOriginal;
import static fengfei.fir.service.JpegExif.ExposureCompensation;
import static fengfei.fir.service.JpegExif.ExposureTime;
import static fengfei.fir.service.JpegExif.FNumber;
import static fengfei.fir.service.JpegExif.FocalLength;
import static fengfei.fir.service.JpegExif.ISO;
import static fengfei.fir.service.JpegExif.Lens;
import static fengfei.fir.service.JpegExif.LensModel;
import static fengfei.fir.service.JpegExif.Make;
import static fengfei.fir.service.JpegExif.Model;
import static fengfei.fir.service.JpegExif.ShutterSpeedValue;
import japidviews.Application.ImageEditor;
import japidviews.Application.SwfUpload;
import japidviews.Application.Upload;
import japidviews.Application.Upload1;
import japidviews.Application.s;
import japidviews.Application.t;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import cn.bran.play.JapidController;
import cn.bran.play.JapidResult;
import fengfei.fir.model.UploadDone;
import fengfei.fir.service.LorryStorage;
import fengfei.fir.utils.Path;
import fengfei.fir.utils.UUID;
import fengfei.fir.utils.XUID;
import fengfei.sprucy.Spruce;
import fengfei.ucm.entity.photo.PhotoModel;

public class Lorry extends JapidController {

	public static LorryStorage lorryStorage = Spruce.getLorryStorage();

	public static void done(File[] files) {
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String id = XUID.newB20String();


			int index = file.getName().lastIndexOf('.');
			String extName = file.getName().substring(index);
			String path = Path.getPath(id);
			File jpegFile = new File(path + 0 + extName);
			try {
				FileUtils.moveFile(file, jpegFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ppppppp:  " + files[0].length());
		}
//		Map<String, String> exif = new HashMap<>();
//		putExif(Make, exif);
//		putExif(Model, exif);
//		putExif(FNumber, exif);
//		putExif(ShutterSpeedValue, exif);
//		putExif(ISO, exif);
//		putExif(LensModel, exif);
//		putExif(Lens, exif);
//		putExif(FocalLength, exif);
//		putExif(ExposureTime, exif);
//		putExif(ExposureCompensation, exif);
//		putExif(DateTimeOriginal, exif);
//		System.out.println("1==================");
//		System.out.println(exif);
//		System.out.println("2==================");
//		// System.out.println(new HashMap<>(params.allSimple()));
//		System.out.println(params.allSimple());
//		UploadDone done;
//		try {
//			done = lorryStorage.writeFile(exif, exif, files[0]);
//			renderJSON(done);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new JapidResult(new Upload().render());
//		}

		// throw new JapidResult(new Upload().render());
	}

	private static void putExif(String key, Map<String, String> exif) {
		String value = params.get(key);
		if (null != value && !"".equals(value) && !"null".equals(value)) {
			exif.put(key, value);
		}
	}

	public static void savePhoto() {

		String[] title = params.getAll("title");
		String[] description = params.getAll("description");
		String[] category = params.getAll("category");
		String[] tags = params.getAll("tags");
		String[] taken_at = params.getAll("taken_at");
		String[] model = params.getAll("camera");
		String[] lens = params.getAll("lens");
		String[] focus = params.getAll("focus");
		String[] shutter = params.getAll("shutter");
		String[] aperture = params.getAll("aperture");
		String[] iso = params.getAll("iso");
		String[] ids = params.getAll("id");
		final List<PhotoModel> models = new ArrayList<>();
		int idUser = 0;
		for (int i = 0; i < ids.length; i++) {
			long id = Long.parseLong(ids[i]);
			// models.add(new PhotoModel(id, idUser, title[i], description[i],
			// category[i], "", model[i], aperture[i], shutter[i], iso[i],
			// lens[i], focus[i], "", taken_at[i], tags[i]));
		}

		System.out.println("---------------" + Arrays.asList(ids));
		Map<String, String> values = new HashMap<>();
		values.put("Make", "New CN");
		values.put("Model", "New CN S2356X-OP");
		values.put("FNumber", "0.1");
		values.put("Lens", "8-1200 F1.0");
		// writeExif(values, jpegFile2);
		System.out.println("==================");
		// System.out.println(new HashMap<>(params.allSimple()));
		System.out.println(params.allSimple());
		// try {
		// List<InsertResultSet<Long>> irs = Transactions
		// .execute(new TransactionCallback<List<InsertResultSet<Long>>>() {
		//
		// @Override
		// public List<ForestRunner.InsertResultSet<Long>> execute(
		// ForestGrower grower) throws SQLException {
		// return ExifDao.save(grower, "", models);
		// }
		// });
		// System.out.println("updated: size=" + irs.size());
		// } catch (SQLException e) {
		//
		// e.printStackTrace();
		// }

	}

	public static void upload() {
		throw new JapidResult(new Upload().render());
	}

	public static void upload1() {
		throw new JapidResult(new Upload1().render());
	}

	public static void swfupload() {
		throw new JapidResult(new SwfUpload().render());
	}

	public static void swfDone(File[] Filedata) {
		File[] files = Filedata;
		System.out.println("321313131:  " + params.allSimple().keySet());
		System.out.println("ddddd : " + Filedata.length);
		List<UploadDone> dones = new ArrayList<>();
		System.out.println(files.length);
		// return id=id_catalog_name
		for (int i = 0; i < files.length; i++) {
			String id = UUID.randomB32UUID();
			int index = files[i].getName().lastIndexOf('.');
			String extName = files[i].getName().substring(index - 1);
			String path = Path.getPath(id, extName);
			try {
				File jpegFile = new File(path);
				FileUtils.moveFile(files[i], jpegFile);
				System.out.println(jpegFile.exists());
				System.out.println(new File(path).exists());
				UploadDone done = new UploadDone(i, id);
				dones.add(done);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		renderJSON(dones);
		// throw new JapidResult(new Upload().render());
	}

	public static void editPhoto() {
		String[] titles = params.getAll("title");
		throw new JapidResult(new ImageEditor().render());
	}

	public static void editPhotoDone() {
		String[] titles = params.getAll("title");
	}

	public static void t() {
		throw new JapidResult(new t().render());
	}

	public static void s() {
		throw new JapidResult(new s().render());
	}

	/**
	 * 
	 * @param id
	 *            photo id
	 * @param pn
	 *            preview num
	 */
	public static void download(long id, int pn) {
		try {
			response.setContentTypeIfNotSet("images/jpeg");
			InputStream is = null;
			String path = Path.getPath(id);
			String photoFileName = path + pn + ".jpg";
			is = new FileInputStream(photoFileName);
			renderBinary(is, photoFileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
