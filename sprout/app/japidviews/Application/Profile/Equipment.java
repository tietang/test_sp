package japidviews.Application.profile;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.Camera;
import java.util.List;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static japidviews._javatags.Pic.*;
import japidviews._layouts.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/profile/Equipment.html
// Change to this file will be lost next time the template file is compiled.
//

public class Equipment extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/Equipment.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

	// - add implicit fields with Play

	final Request request = Request.current();
	final Response response = Response.current();
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(
			validation);
	final play.Play _play = new play.Play();

	// - end of implicit fields with Play 

	public Equipment() {
		super(null);
	}

	public Equipment(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"cameras", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<Camera>", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Equipment.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private List<Camera> cameras; // line 5

	public cn.bran.japid.template.RenderResult render(List<Camera> cameras) {
		this.cameras = cameras;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 5
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<pre style=\"display: none\">\n");// line 1
		p("\n" +
				"\n" +
				"</pre>\n");// line 7
		p("<div class=\"grid_row\">\n" +
				"\n" +
				"    <div class=\"col col_3 \">\n" +
				"        <div class=\"sidebar-nav \">\n" +
				"            ");// line 15
		final SettingsMenu _SettingsMenu3 = new SettingsMenu(getOut());
		_SettingsMenu3.setActionRunners(getActionRunners()).setOut(getOut());
		_SettingsMenu3.render("Camera"); // line 21// line 21
		p("        </div>\n"
				+
				"    </div>\n"
				+
				"    <div class=\"col col_13 \">\n"
				+
				"        <div class=\"row-fluid well profile_right\">\n"
				+
				"            <div class=\"span11  \">\n"
				+
				"\n"
				+
				"                <form class=\"form-horizontal\" method=\"post\"\n"
				+
				"                      action=\"/settings/camera/done\">\n"
				+
				"\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <button class=\"btn btn-mini\" type=\"button\" id=\"camera\">\n"
				+
				"                            ");// line 21
		;
		p(getMessage("camera.add.camera"));// line 33
		p("                        </button>\n"
				+
				"                        <button class=\"btn btn-mini\" type=\"button\" id=\"lens\">\n"
				+
				"                             ");// line 33
		;
		p(getMessage("camera.add.lens"));// line 36
		p("                        </button>\n"
				+
				"                        <button class=\"btn btn-mini\" type=\"button\" id=\"tripod\">\n"
				+
				"                            ");// line 36
		;
		p(getMessage("camera.add.tripod"));// line 39
		p("                        </button>\n"
				+
				"                        <button class=\"btn btn-mini\" type=\"button\" id=\"filter\">\n"
				+
				"                            ");// line 39
		;
		p(getMessage("camera.add.filter"));// line 42
		p("                        </button>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\" id=\"forms\">\n"
				+
				"                        ");// line 42
		for (Camera c : cameras) {// line 46
			p("                        <div>\n"
					+
					"                            <div class=\"input-prepend input-append span11\">\n"
					+
					"                                <span class=\"add-on\"><i class=\"icon-");// line 46
			p(c.type);// line 49
			p("\"></i></span>\n"
					+
					"                                <input\n"
					+
					"                                        class=\" span11\" name=\"_");// line 49
			p(c.type);// line 51
			p("\" id=\"_");// line 51
			p(c.type);// line 51
			p("\" type=\"text\"\n" +
					"                                        value=\"");// line 51
			p(c.equipment);// line 52
			p("\">\n"
					+
					"                                <button class=\"btn\" type=\"button\">\n"
					+
					"                                    ");// line 52
			;
			p(getMessage("delete"));// line 54
			p("                                </button>\n" +
					"                            </div>\n" +
					"\n" +
					"                        </div>\n" +
					"                        ");// line 54
		}// line 59
		if (cameras.size() == 0) {// line 59
			p("                        <div>\n"
					+
					"                            <div class=\"input-prepend span11\">\n"
					+
					"                                <span class=\"add-on\"><i class=\"icon-camera\"></i></span>\n"
					+
					"                                <input\n"
					+
					"                                        class=\" span11\" name=\"camera\" id=\"camera\" type=\"text\"\n"
					+
					"                                        placeholder=\"");// line 59
			;
			p(getMessage("camera.camera"));// line 65
			p("\">\n"
					+
					"                            </div>\n"
					+
					"\n"
					+
					"                        </div>\n"
					+
					"                        <div>\n"
					+
					"                            <div class=\"input-prepend span11\">\n"
					+
					"\n"
					+
					"                                <span class=\"add-on\"><i class=\"icon-eye-open\"></i></span>\n"
					+
					"                                <input\n"
					+
					"                                        class=\"span11\" name=\"lens\" id=\"lens\" type=\"text\"\n"
					+
					"                                        placeholder=\"");// line 65
			;
			p(getMessage("camera.lens"));// line 75
			p("\">\n"
					+
					"                            </div>\n"
					+
					"                        </div>\n"
					+
					"                        <div>\n"
					+
					"                            <div class=\"input-prepend span11\">\n"
					+
					"                                <span class=\"add-on\"><i class=\"icon-glass\"></i></span>\n"
					+
					"                                <input\n"
					+
					"                                        class=\"span11 \" name=\"tripod\" id=\"tripod\" type=\"text\"\n"
					+
					"                                        placeholder=\"");// line 75
			;
			p(getMessage("camera.tripod"));// line 83
			p("\">\n"
					+
					"                            </div>\n"
					+
					"                        </div>\n"
					+
					"                        <div>\n"
					+
					"                            <div class=\"input-prepend span11\">\n"
					+
					"                                <span class=\"add-on\"><i class=\"icon-filter\"></i></span>\n"
					+
					"                                <input\n"
					+
					"                                        class=\"span11 \" name=\"filter\" id=\"filter\" type=\"text\"\n"
					+
					"                                        placeholder=\"");// line 83
			;
			p(getMessage("camera.filter"));// line 91
			p("\">\n" +
					"                            </div>\n" +
					"                        </div>\n" +
					"                        ");// line 91
		}// line 94
		p("\n"
				+
				"                    </div>\n"
				+
				"\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <button type=\"submit\" class=\"btn\">\n"
				+
				"                                ");// line 94
		;
		p(getMessage("save.change"));// line 101
		p("                            </button>\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"\n"
				+
				"                </form>\n"
				+
				"\n"
				+
				"            </div>\n"
				+
				"            <div class=\"span5\"></div>\n"
				+
				"        </div>\n"
				+
				"\n"
				+
				"    </div>\n"
				+
				"</div>\n"
				+
				"\n"
				+
				"<script id=\"camera_tml\" type=\"text/x-tmpl\">\n"
				+
				"\n"
				+
				"    <div>\n"
				+
				"        <div class=\"input-prepend span11\">\n"
				+
				"            <span class=\"add-on\"><i class=\"icon-camera\"></i></span> <input class=\" span11\" name=\"camera\" id=\"camera\"\n"
				+
				"                                                                           type=\"text\" placeholder=\"");// line 101
		;
		p(getMessage("camera.camera"));// line 120
		p("\">\n"
				+
				"        </div>\n"
				+
				"    </div>\n"
				+
				"\n"
				+
				"</script>\n"
				+
				"<script id=\"lens_tml\" type=\"text/x-tmpl\">\n"
				+
				"\n"
				+
				"    <div>\n"
				+
				"        <div class=\"input-prepend span11\">\n"
				+
				"\n"
				+
				"            <span class=\"add-on\"><i class=\"icon-eye-open\"></i></span> <input class=\"span11\" name=\"lens\" id=\"lens\"\n"
				+
				"                                                                             type=\"text\" placeholder=\"");// line 120
		;
		p(getMessage("camera.lens"));// line 131
		p("\">\n"
				+
				"        </div>\n"
				+
				"    </div>\n"
				+
				"\n"
				+
				"</script>\n"
				+
				"\n"
				+
				"<script id=\"tripod_tml\" type=\"text/x-tmpl\">\n"
				+
				"\n"
				+
				"    <div>\n"
				+
				"        <div class=\"input-prepend span11\">\n"
				+
				"            <span class=\"add-on\"><i class=\"icon-glass\"></i></span> <input class=\"span11 \" name=\"tripod\" id=\"tripod\"\n"
				+
				"                                                                          type=\"text\" placeholder=\"");// line 131
		;
		p(getMessage("camera.tripod"));// line 142
		p("\">\n"
				+
				"        </div>\n"
				+
				"    </div>\n"
				+
				"\n"
				+
				"</script>\n"
				+
				"\n"
				+
				"<script id=\"filter_tml\" type=\"text/x-tmpl\">\n"
				+
				"\n"
				+
				"    <div>\n"
				+
				"        <div class=\"input-prepend span11\">\n"
				+
				"            <span class=\"add-on\"><i class=\"icon-filter\"></i></span> <input class=\"span11 \" name=\"filter\" id=\"filter\"\n"
				+
				"                                                                           type=\"text\" placeholder=\"");// line 142
		;
		p(getMessage("camera.filter"));// line 153
		p("\">\n" +
				"        </div>\n" +
				"    </div>\n" +
				"\n" +
				"</script>\n");// line 153

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p(i18n("camera.title"));
		;
	}

	@Override
	protected void css() {
		p("<script src=\"");// line 11
		p(lookupStatic("/public/app/camera.js"));// line 12
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 12
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 13
		p("\" type=\"text/javascript\"></script>\n" +
				"\n");// line 13
		;
	}

	@Override
	protected void header() {
		p("Camera");
		;
	}
}
