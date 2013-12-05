//version: 0.9.35
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
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
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
		super(null);
	}
	public Equipment(StringBuilder out) {
		super(out);
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
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 5, japidviews/Application/profile/Equipment.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(List<Camera> cameras) {
		return new Equipment().render(cameras);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n" + 
"    ");// line 1, japidviews\Application\profile\Equipment.html

        p("\n" + 
"\n" + 
"\n" + 
"</pre>\n");// line 7, japidviews\Application\profile\Equipment.html
		// line 11, japidviews\Application\profile\Equipment.html
		p("\n" + 
"<div class=\"grid_row equipment\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 15, japidviews\Application\profile\Equipment.html
		final SettingsMenu _SettingsMenu3 = new SettingsMenu(getOut()); _SettingsMenu3.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu3.render("Camera"); // line 21, japidviews\Application\profile\Equipment.html// line 21, japidviews\Application\profile\Equipment.html
		p("\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row well well-sm profile_right\">\n" + 
"            <div class=\"col-lg-11  \">\n" + 
"                ");// line 21, japidviews\Application\profile\Equipment.html
		final AllMessage _AllMessage4 = new AllMessage(getOut()); _AllMessage4.setActionRunners(getActionRunners()).setOut(getOut()); _AllMessage4.render(); // line 27, japidviews\Application\profile\Equipment.html// line 27, japidviews\Application\profile\Equipment.html
		p("\n" + 
"\n" + 
"                <form class=\"form-horizontal\" role=\"form\" method=\"post\" id=\"equipmentForm\"\n" + 
"                      action=\"/settings/camera/done\">\n" + 
"\n" + 
"                    <div class=\"form-group\">\n" + 
"                        <button class=\"btn btn-default btn-sm\" type=\"button\" id=\"camera\">\n" + 
"                            ");// line 27, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.add.camera"));// line 34, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        </button>\n" + 
"                        <button class=\"btn btn-default  btn-sm\" type=\"button\" id=\"lens\">\n" + 
"                            ");// line 34, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.add.lens"));// line 37, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        </button>\n" + 
"                        <button class=\"btn btn-default  btn-sm\" type=\"button\" id=\"tripod\">\n" + 
"                            ");// line 37, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.add.tripod"));// line 40, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        </button>\n" + 
"                        <button class=\"btn btn-default  btn-sm\" type=\"button\" id=\"filter\">\n" + 
"                            ");// line 40, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.add.filter"));// line 43, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        </button>\n" + 
"                    </div>\n" + 
"                    <div class=\"form-group\" id=\"equipmentForms\">\n" + 
"                        ");// line 43, japidviews\Application\profile\Equipment.html
		for(Camera c : cameras){// line 47, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                        <div class=\"input-group col-lg-11\">\n" + 
"                            <span class=\"input-group-addon glyphicon-head\">");// line 47, japidviews\Application\profile\Equipment.html
		p(c.type);// line 49, japidviews\Application\profile\Equipment.html
		p("</span>\n" + 
"                            <input\n" + 
"                                    class=\"form-control col-lg-9\" name=\"");// line 49, japidviews\Application\profile\Equipment.html
		p(c.type);// line 51, japidviews\Application\profile\Equipment.html
		p("\" id=\"_");// line 51, japidviews\Application\profile\Equipment.html
		p(c.type);// line 51, japidviews\Application\profile\Equipment.html
		p("\" type=\"text\"\n" + 
"                                    value=\"");// line 51, japidviews\Application\profile\Equipment.html
		p(c.equipment);// line 52, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"                            <div class=\"input-group-btn\">\n" + 
"                                <button class=\"btn btn-default delete\" type=\"button\" data-id=\"");// line 52, japidviews\Application\profile\Equipment.html
		p(c.idCamera);// line 55, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"                                    ");// line 55, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 56, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                </button>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"\n" + 
"                        ");// line 56, japidviews\Application\profile\Equipment.html
		}// line 61, japidviews\Application\profile\Equipment.html

                        if(cameras.size()==0){// line 62, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                            <div class=\"input-group col-lg-11\">\n" + 
"                                <span class=\"input-group-addon glyphicon-head\">camera</span>\n" + 
"                                <input class=\"form-control col-lg-11\" name=\"camera\" type=\"text\"\n" + 
"                                       placeholder=\"");// line 62, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.camera"));// line 66, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"                                <div class=\"input-group-btn\">\n" + 
"                                    <button class=\"btn btn-default delete\" type=\"button\">\n" + 
"                                        ");// line 66, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 70, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                    </button>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"\n" + 
"                            <div class=\"input-group col-lg-11\">\n" + 
"\n" + 
"                                <span class=\"input-group-addon glyphicon-head\">lens</span>\n" + 
"                                <input class=\"form-control col-lg-11\" name=\"lens\" type=\"text\"\n" + 
"                                       placeholder=\"");// line 70, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.lens"));// line 79, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"                                <div class=\"input-group-btn\">\n" + 
"                                    <button class=\"btn btn-default delete\" type=\"button\">\n" + 
"                                        ");// line 79, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 83, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                    </button>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                            <div class=\"input-group col-lg-11\">\n" + 
"                                <span class=\"input-group-addon glyphicon-head\">tripod</span>\n" + 
"                                <input\n" + 
"                                        class=\"form-control col-lg-11 \" name=\"tripod\" type=\"text\"\n" + 
"                                        placeholder=\"");// line 83, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.tripod"));// line 91, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"                                <div class=\"input-group-btn\">\n" + 
"                                    <button class=\"btn btn-default delete\" type=\"button\">\n" + 
"                                        ");// line 91, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 95, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                    </button>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                            <div class=\"input-group col-lg-11\">\n" + 
"                                <span class=\"input-group-addon glyphicon-head\">filter</span>\n" + 
"                                <input\n" + 
"                                        class=\"form-control col-lg-11 \" name=\"filter\" type=\"text\"\n" + 
"                                        placeholder=\"");// line 95, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.filter"));// line 103, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"                                <div class=\"input-group-btn\">\n" + 
"                                    <button class=\"btn btn-default delete\" type=\"button\">\n" + 
"                                        ");// line 103, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 107, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                                    </button>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                        ");// line 107, japidviews\Application\profile\Equipment.html
		}// line 111, japidviews\Application\profile\Equipment.html
		p("\n" + 
"\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"form-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn btn-default\">\n" + 
"                                ");// line 111, japidviews\Application\profile\Equipment.html
		;p(getMessage("save.change"));// line 118, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                            </button>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"\n" + 
"                </form>\n" + 
"\n" + 
"            </div>\n" + 
"            <div class=\"col-lg-5\"></div>\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<script id=\"camera_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"        <div class=\"input-group col-lg-11\">\n" + 
"            <span class=\"input-group-addon glyphicon-head\">camera</span>\n" + 
"            <input class=\" form-control col-lg-11 \" name=\"camera\" type=\"text\" placeholder=\"");// line 118, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.camera"));// line 136, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"            <div class=\"input-group-btn\">\n" + 
"                <button class=\"btn btn-default delete\" type=\"button\">\n" + 
"                    ");// line 136, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 140, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                </button>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"\n" + 
"</script>\n" + 
"<script id=\"lens_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"        <div class=\"input-group col-lg-11\">\n" + 
"\n" + 
"            <span class=\"input-group-addon glyphicon-head\">lens</span>\n" + 
"            <input class=\"form-control col-lg-11 \" name=\"lens\" type=\"text\" placeholder=\"");// line 140, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.lens"));// line 151, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"            <div class=\"input-group-btn\">\n" + 
"                <button class=\"btn btn-default delete\" type=\"button\">\n" + 
"                    ");// line 151, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 155, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                </button>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"\n" + 
"</script>\n" + 
"\n" + 
"<script id=\"tripod_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"        <div class=\"input-group col-lg-11\">\n" + 
"            <span class=\"input-group-addon glyphicon-head\">tripod</span>\n" + 
"            <input class=\"form-control col-lg-11  \" name=\"tripod\" type=\"text\" placeholder=\"");// line 155, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.tripod"));// line 166, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"            <div class=\"input-group-btn\">\n" + 
"                <button class=\"btn btn-default delete\" type=\"button\">\n" + 
"                    ");// line 166, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 170, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                </button>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"\n" + 
"</script>\n" + 
"\n" + 
"<script id=\"filter_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"        <div class=\"input-group col-lg-11\">\n" + 
"            <span class=\"input-group-addon glyphicon-head\">filter</span>\n" + 
"            <input class=\"form-control col-lg-11\" name=\"filter\" type=\"text\" placeholder=\"");// line 170, japidviews\Application\profile\Equipment.html
		;p(getMessage("camera.filter"));// line 181, japidviews\Application\profile\Equipment.html
		p("\">\n" + 
"\n" + 
"            <div class=\"input-group-btn\">\n" + 
"                <button class=\"btn btn-default delete\" type=\"button\">\n" + 
"                    ");// line 181, japidviews\Application\profile\Equipment.html
		;p(getMessage("delete"));// line 185, japidviews\Application\profile\Equipment.html
		p("\n" + 
"                </button>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"\n" + 
"</script>");// line 185, japidviews\Application\profile\Equipment.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( i18n("camera.title"));;
	}
	@Override protected void css() {
		// line 11, japidviews\Application\profile\Equipment.html
		p("<script src=\"");// line 11, japidviews\Application\profile\Equipment.html
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 12, japidviews\Application\profile\Equipment.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 12, japidviews\Application\profile\Equipment.html
		p(lookupStatic("/public/app/camera.js"));// line 13, japidviews\Application\profile\Equipment.html
		p("\" type=\"text/javascript\"></script>\n" + 
"\n");// line 13, japidviews\Application\profile\Equipment.html
		;
	}
	@Override protected void header() {
		p("Camera");;
	}
}