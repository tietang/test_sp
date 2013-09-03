package fengfei;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.utils.Properties;
import fengfei.fir.service.JpegProcess;
import fengfei.fir.service.LorryStorage;
import fengfei.sprucy.Spruce;

public class SpruceInit {

	static Logger logger = LoggerFactory.getLogger(SpruceInit.class);
	final static String conf = "spruce.properties";
	static Properties properties = new Properties();
	static {
		SpruceInit.loadProperties();
		logger.info("Initialized spruce configuration.");
		SpruceInit.initApp();
		logger.info("Initialized spruce application.");
	}

	public static void loadProperties() {
		try {
			InputStream in = SpruceInit.class.getClassLoader()
					.getResourceAsStream(conf);
			if (in == null) {
				logger.info("Can't load file: " + conf);
			} else {
				properties.load(in);
			}

		} catch (IOException e) {

			logger.error("load file error: " + conf, e);
		}
	}

	public static void initApp() {
		autoInitialize();
	}

	private static void autoInitialize() {
		Field[] fields = Spruce.class.getDeclaredFields();
		for (Field field : fields) {
			try {
				Class<?> clazz = field.getType();
				String fieldName = field.getName();
				String methodName = toGetName(fieldName, clazz);
				// System.out.println(methodName);
				Method method = SpruceInit.class.getMethod(methodName,
						new Class[] {});
				Object value = method.invoke(null, new Object[] {});
				field.setAccessible(true);
				field.set(null, value);
				// System.out.println(value);
			} catch (Exception e) {
				logger.error("auto initialize error.", e);
			}

		}
	}

	private static String toGetName(String fieldName, Class<?> fieldType) {
		boolean isBool = false;
		if (fieldType.isInstance(Boolean.class)
				|| fieldType.isInstance(boolean.class)) {
			isBool = true;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(isBool ? "is" : "get");
		sb.append(Character.toUpperCase(fieldName.charAt(0)));
		sb.append(fieldName.substring(1));
		return sb.toString();
	}

	public static LorryStorage getLorryStorage() {
		String className = properties.get("LorryStorage.ClassName");
		LorryStorage lorryStorage = newInstance(className, LorryStorage.class);
		return lorryStorage;
	}

	public static JpegProcess getJpegProcess() {
		String className = properties.get("JpegProcess.ClassName");
		return newInstance(className, JpegProcess.class);
	}

	public static int getUploadMaxFolder() {
		return properties.getInt("fs.upload.MaxFolder");
	}

	public static int getCropMaxWidth() {
		return properties.getInt("image.crop.MaxWidth");
	}

	public static int getCropMaxHeight() {
		return properties.getInt("image.crop.MaxHeight");
	}

	public static int getPreviewNumber() {
		return properties.getInt("image.preview.number");
	}

	public static String getUploadRoot() {
		return properties.get("fs.upload.root");
	}

	public static Map<Integer, int[]> getPreviewDimensions() {
		Map<Integer, int[]> dimensions = new HashMap<>();
		int num = getPreviewNumber();
		for (int i = 1; i <= num; i++) {
			int w;
			int h;
			try {
				w = properties
						.getInt(String.format("image.preview%d.width", i));
				h = properties.getInt(String
						.format("image.preview%d.height", i));
				dimensions.put(i, new int[] { w, h });
			} catch (IllegalArgumentException e) {
				logger.error(
						String.format(
								"Initialized Preview width/height error, please check configuration file: %s",
								conf),

						e);
			}

		}
		return dimensions;
	}

	private static <T> T newInstance(String className, Class<T> interfaceName) {
		if (className == null || "".equals(className)) {
			throw new SpruceException("class name is null or empty for %s",
					interfaceName.getName());
		}
		try {
			Object obj = Class.forName(className).newInstance();
			if (interfaceName.isInstance(obj)) {
				return (T) obj;
			} else {
				throw new SpruceException("class: %s is not a %s instance.",
						className, interfaceName.getName());
			}
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			throw new SpruceException("class: %s can't instance.", e, className);
		}
	}
}
