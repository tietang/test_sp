//version: 0.9.37
package japidviews.Application.profile;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.Camera;
import java.util.List;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import static japidviews._javatags.Pic.*;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/profile/Equipment.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Equipment extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/Equipment.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public Equipment() {
	super((StringBuilder)null);
	initHeaders();
	}
	public Equipment(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public Equipment(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"cameras",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<Camera>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Equipment.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<Camera> cameras; // line 5, japidviews/Application/profile/Equipment.html
	public cn.bran.japid.template.RenderResult render(List<Camera> cameras) {
		this.cameras = cameras;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 5, japidviews/Application/profile/Equipment.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(List<Camera> cameras) {
		return new Equipment().render(cameras);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\profile\Equipment.html

    p("\n" + 
"</pre>\n");// line 7, japidviews\Application\profile\Equipment.html
		// line 9, japidviews\Application\profile\Equipment.html
		p("\n" + 
"<div class=\"grid_row equipment\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 13, japidviews\Application\profile\Equipment.html
		new SettingsMenu(Equipment.this).render("Camera"); // line 19, japidviews\Application\profile\Equipment.html// line 19, japidviews\Application\profile\Equipment.html
		p("\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row-fluid well profile_right\">\n" + 
"            <div class=\"span11  \">\n" + 
"\n" + 
"\n" + 
"                <form class=\"form-horizontal\" method=\"post\" id=\"equipmentForm\"\n" + 
"                      action=\"/settings/camera/done\">\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <button class=\"btn btn-mini add-equipment\" type=\"button\" data-id=\"camera\">\n" + 
"                            ");// line 19, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.add.camera"));// line 32, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        </button>\n" + 
"                        <button class=\"btn btn-mini add-equipment\" type=\"button\" data-id=\"lens\">\n" + 
"                            ");// line 32, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.add.lens"));// line 35, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        </button>\n" + 
"                        <button class=\"btn btn-mini add-equipment\" type=\"button\" data-id=\"tripod\">\n" + 
"                            ");// line 35, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.add.tripod"));// line 38, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        </button>\n" + 
"                        <button class=\"btn btn-mini add-equipment\" type=\"button\" data-id=\"filter\">\n" + 
"                            ");// line 38, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.add.filter"));// line 41, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        </button>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\" id=\"equipmentFormControls\">\n" + 
"                        ");// line 41, japidviews\Application\profile\Equipment.html
		for(Camera c : cameras){// line 45, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        <div>\n" + 
"                            <div class=\"input-prepend span11\">\n" + 
"                                <span class=\"add-on add-on-head\">");// line 45, japidviews\Application\profile\Equipment.html
		p(c.type);// line 48, japidviews\Application\profile\Equipment.html
		p("</span>\n" + 
"                                <input class=\"span11\" name=\"_");// line 48, japidviews\Application\profile\Equipment.html
		p(c.type);// line 49, japidviews\Application\profile\Equipment.html
		p("\" id=\"_");// line 49, japidviews\Application\profile\Equipment.html
		p(c.type);// line 49, japidviews\Application\profile\Equipment.html
		p("\" type=\"text\" value=\"");// line 49, japidviews\Application\profile\Equipment.html
		p(c.equipment);// line 49, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"                                <button class=\"btn delete\" type=\"button\" data-id=\"");// line 49, japidviews\Application\profile\Equipment.html
		p(c.idCamera);// line 50, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"                                    ");// line 50, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 51, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                </button>\n" + 
"                            </div>\n" + 
"\n" + 
"                        </div>\n" + 
"                        ");// line 51, japidviews\Application\profile\Equipment.html
		}// line 56, japidviews\Application\profile\Equipment.html
 if(cameras.size()==0){// line 56, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        <div>\n" + 
"                            <div class=\"input-prepend span11\">\n" + 
"                                <span class=\"add-on add-on-head\">camera</span>\n" + 
"                                <input class=\" span11\" name=\"camera\" type=\"text\" placeholder=\"");// line 56, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.camera"));// line 60, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"                                <button class=\"btn  delete\" type=\"button\">\n" + 
"                                    ");// line 60, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 63, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                </button>\n" + 
"                            </div>\n" + 
"\n" + 
"                        </div>\n" + 
"                        <div>\n" + 
"                            <div class=\"input-prepend span11\">\n" + 
"\n" + 
"                                <span class=\"add-on add-on-head\">lens</span>\n" + 
"                                <input class=\"span11\" name=\"lens\" type=\"text\" placeholder=\"");// line 63, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.lens"));// line 72, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"                                <button class=\"btn  delete\" type=\"button\">\n" + 
"                                    ");// line 72, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 74, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                </button>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div>\n" + 
"                            <div class=\"input-prepend span11\">\n" + 
"                                <span class=\"add-on add-on-head\">tripod</span>\n" + 
"                                <input class=\"span11 \" name=\"tripod\" type=\"text\" placeholder=\"");// line 74, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.tripod"));// line 81, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"                                <button class=\"btn  delete\" type=\"button\">\n" + 
"                                    ");// line 81, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 83, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                </button>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div>\n" + 
"                            <div class=\"input-prepend span11\">\n" + 
"                                <span class=\"add-on add-on-head\">filter</span>\n" + 
"                                <input class=\"span11 \" name=\"filter\" type=\"text\" placeholder=\"");// line 83, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.filter"));// line 90, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"                                <button class=\"btn  delete\" type=\"button\">\n" + 
"                                    ");// line 90, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 92, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                </button>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        ");// line 92, japidviews\Application\profile\Equipment.html
		}// line 96, japidviews\Application\profile\Equipment.html
		p("\n" + 
"\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn\">\n" + 
"                                ");// line 96, japidviews\Application\profile\Equipment.html
		;p(getMessage("save.change"));// line 103, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                            </button>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"\n" + 
"                </form>\n" + 
"\n" + 
"            </div>\n" + 
"            <div class=\"span5\"></div>\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<script id=\"camera_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"    <div>\n" + 
"        <div class=\"input-prepend span11\">\n" + 
"            <span class=\"add-on add-on-head\">camera</span>\n" + 
"            <input class=\" span11\" name=\"camera\" type=\"text\" placeholder=\"");// line 103, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.camera"));// line 122, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"            <button class=\"btn  delete\" type=\"button\">\n" + 
"                ");// line 122, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 124, japidviews\Application\profile\Equipment.html
		p("\n" + 
"            </button>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"</script>\n" + 
"<script id=\"lens_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"    <div>\n" + 
"        <div class=\"input-prepend span11\">\n" + 
"\n" + 
"            <span class=\"add-on add-on-head\">lens</span>\n" + 
"            <input class=\"span11\" name=\"lens\" type=\"text\" placeholder=\"");// line 124, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.lens"));// line 136, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"            <button class=\"btn  delete\" type=\"button\">\n" + 
"                ");// line 136, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 138, japidviews\Application\profile\Equipment.html
		p("\n" + 
"            </button>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"</script>\n" + 
"\n" + 
"<script id=\"tripod_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"    <div>\n" + 
"        <div class=\"input-prepend span11\">\n" + 
"            <span class=\"add-on add-on-head\">tripod</span>\n" + 
"            <input class=\"span11 \" name=\"tripod\" type=\"text\" placeholder=\"");// line 138, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.tripod"));// line 150, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"            <button class=\"btn  delete\" type=\"button\">\n" + 
"                ");// line 150, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 152, japidviews\Application\profile\Equipment.html
		p("\n" + 
"            </button>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"</script>\n" + 
"\n" + 
"<script id=\"filter_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"    <div>\n" + 
"        <div class=\"input-prepend span11\">\n" + 
"            <span class=\"add-on add-on-head\">filter</span>\n" + 
"            <input class=\"span11 \" name=\"filter\" type=\"text\" placeholder=\"");// line 152, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.filter"));// line 164, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"            <button class=\"btn  delete\" type=\"button\">\n" + 
"                ");// line 164, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 166, japidviews\Application\profile\Equipment.html
		p("\n" + 
"            </button>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"</script>");// line 166, japidviews\Application\profile\Equipment.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( i18n("camera.title"));;
	}
	@Override protected void css() {
		// line 9, japidviews\Application\profile\Equipment.html
		p("<script src=\"");// line 9, japidviews\Application\profile\Equipment.html
		p(lookupStatic("/public/app/camera.js"));// line 10, japidviews\Application\profile\Equipment.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 10, japidviews\Application\profile\Equipment.html
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 11, japidviews\Application\profile\Equipment.html
		p("\" type=\"text/javascript\"></script>\n" + 
"\n");// line 11, japidviews\Application\profile\Equipment.html
		;
	}
	@Override protected void header() {
		p("Camera");;
	}
}