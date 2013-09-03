package controllers;

import play.Logger;
import play.mvc.Before;
import play.mvc.Catch;
import play.mvc.Finally;
import cn.bran.play.JapidController;

public class ExceptionCatchController extends JapidController {

	@Catch(Exception.class)
	public static void logException(Throwable throwable) {
		Logger.error("Server error: ", throwable);

	}

	@Finally
	static void log() {
		Logger.info("Responsed.");
	}
}
