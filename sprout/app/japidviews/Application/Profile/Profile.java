//version: 0.9.35
package japidviews.Application.profile;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.User;
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
// NOTE: This file was generated from: japidviews/Application/profile/Profile.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Profile extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/Profile.html";
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


	public Profile() {
		super(null);
	}
	public Profile(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"user",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"User",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Profile.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private User user; // line 3, japidviews/Application/profile/Profile.html
	public cn.bran.japid.template.RenderResult render(User user) {
		this.user = user;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 3, japidviews/Application/profile/Profile.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(User user) {
		return new Profile().render(user);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\profile\Profile.html

p("\n" + 
"\n");// line 5, japidviews\Application\profile\Profile.html
		// line 7, japidviews\Application\profile\Profile.html
		p("\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 36, japidviews\Application\profile\Profile.html
		final SettingsMenu _SettingsMenu3 = new SettingsMenu(getOut()); _SettingsMenu3.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu3.render("Profile"); // line 42, japidviews\Application\profile\Profile.html// line 42, japidviews\Application\profile\Profile.html
		p("\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row well well-sm profile_right\">\n" + 
"            <div class=\"col-lg-12  \">\n" + 
"                ");// line 42, japidviews\Application\profile\Profile.html
		final AllMessage _AllMessage4 = new AllMessage(getOut()); _AllMessage4.setActionRunners(getActionRunners()).setOut(getOut()); _AllMessage4.render(); // line 49, japidviews\Application\profile\Profile.html// line 49, japidviews\Application\profile\Profile.html
		p("\n" + 
"\n" + 
"                <form class=\"\" action=\"/settings/profile/done\" method=\"post\">\n" + 
"                    <div class=\"row\">\n" + 
"                        <div class=\"col-lg-6 \">\n" + 
"\n" + 
"                            <div class=\"form-group \">\n" + 
"                                <div class=\"controls inline\">\n" + 
"                                    <div class=\"head_img\">\n" + 
"                                        <img id=\"head_img\" class=\"image_64\"\n" + 
"                                             src=\"");// line 49, japidviews\Application\profile\Profile.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(user.idUser,1));// line 59, japidviews\Application\profile\Profile.html
		p("\">\n" + 
"                                    </div>\n" + 
"                                    <input type=\"hidden\" id=\"user_id_photo\" name=\"user_photo\"\n" + 
"                                           value=\"");// line 59, japidviews\Application\profile\Profile.html
		p(user.isHeadPhoto);// line 62, japidviews\Application\profile\Profile.html
		p("\">\n" + 
"                                    <label class=\" inline\">\n" + 
"                                    <span id=\"upload_head\"\n" + 
"                                          style=\"display: inline;\"\n" + 
"                                          class=\"inline\"></span> </label><span\n" + 
"                                        id=\"upload_message\"></span>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                            <div class=\"form-group \">\n" + 
"                                <label class=\"control-label\" for=\"gender0\">");// line 62, japidviews\Application\profile\Profile.html
		;p(getMessage("user.gender"));// line 71, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls form-control\">\n" + 
"                                    <label class=\"radio-inline\">\n" + 
"                                        <input type=\"radio\"\n" + 
"                                               id=\"gender1\" name=\"gender\" value=\"1\" ");// line 71, japidviews\Application\profile\Profile.html
		p(user.gender==1?"checked":"");// line 76, japidviews\Application\profile\Profile.html
		p(">\n" + 
"                                        ");// line 76, japidviews\Application\profile\Profile.html
		;p(getMessage("user.male"));// line 77, japidviews\Application\profile\Profile.html
		p(" </label>\n" + 
"                                    <label class=\"radio-inline\">\n" + 
"                                        <input type=\"radio\"\n" + 
"                                               id=\"gender2\" name=\"gender\" value=\"2\" ");// line 77, japidviews\Application\profile\Profile.html
		p(user.gender==2?"checked":"");// line 80, japidviews\Application\profile\Profile.html
		p(">\n" + 
"                                        ");// line 80, japidviews\Application\profile\Profile.html
		;p(getMessage("user.female"));// line 81, japidviews\Application\profile\Profile.html
		p(" </label>\n" + 
"                                    <label class=\"radio-inline\">\n" + 
"                                        <input type=\"radio\"\n" + 
"                                               id=\"gender0\" name=\"gender\" value=\"0\"\n" + 
"                                        ");// line 81, japidviews\Application\profile\Profile.html
		p((user.gender==null || user.gender==0)?"checked":"");// line 85, japidviews\Application\profile\Profile.html
		p("\n" + 
"                                        >\n" + 
"                                        ");// line 85, japidviews\Application\profile\Profile.html
		;p(getMessage("user.not.specified"));// line 87, japidviews\Application\profile\Profile.html
		p(" </label>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <label class=\"control-label\" for=\"username\">");// line 87, japidviews\Application\profile\Profile.html
		;p(getMessage("user.username"));// line 92, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls\">\n" + 
"                                    <input type=\"text\" id=\"username1\" name=\"username1\"\n" + 
"                                           class=\"form-control col-lg-11\" placeholder=\"");// line 92, japidviews\Application\profile\Profile.html
		;p(getMessage("user.userName"));// line 96, japidviews\Application\profile\Profile.html
		p("\"\n" + 
"                                           value=\"");// line 96, japidviews\Application\profile\Profile.html
		p(user.userName);// line 97, japidviews\Application\profile\Profile.html
		p("\" readonly=\"readonly\">\n" + 
"                                    <input\n" + 
"                                            type=\"hidden\" id=\"username\" name=\"username\" class=\"col-lg-11\"\n" + 
"                                            value=\"");// line 97, japidviews\Application\profile\Profile.html
		p(user.userName);// line 100, japidviews\Application\profile\Profile.html
		p("\">\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <label class=\"control-label\" for=\"email\">");// line 100, japidviews\Application\profile\Profile.html
		;p(getMessage("user.email"));// line 104, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls\">\n" + 
"                                    <input type=\"text\" id=\"email1\" name=\"email1\" class=\"form-control col-lg-11\"\n" + 
"                                           placeholder=\"");// line 104, japidviews\Application\profile\Profile.html
		;p(getMessage("user.email"));// line 108, japidviews\Application\profile\Profile.html
		p("\" value=\"");// line 108, japidviews\Application\profile\Profile.html
		p(user.email);// line 108, japidviews\Application\profile\Profile.html
		p("\" readonly=\"readonly\">\n" + 
"                                    <input type=\"hidden\" id=\"email\" name=\"email\" class=\"form-control col-lg-11\"\n" + 
"                                           placeholder=\"");// line 108, japidviews\Application\profile\Profile.html
		;p(getMessage("user.email"));// line 110, japidviews\Application\profile\Profile.html
		p("\" value=\"");// line 110, japidviews\Application\profile\Profile.html
		p(user.email);// line 110, japidviews\Application\profile\Profile.html
		p("\">\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <label class=\"control-label\">");// line 110, japidviews\Application\profile\Profile.html
		;p(getMessage("user.location"));// line 115, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls\">\n" + 
"                                    <input id=\"city\" name=\"city\" class=\"form-control col-lg-11\"\n" + 
"                                           placeholder=\"");// line 115, japidviews\Application\profile\Profile.html
		;p(getMessage("user.city"));// line 119, japidviews\Application\profile\Profile.html
		p("\"\n" + 
"                                           type=\"text\" value=\"");// line 119, japidviews\Application\profile\Profile.html
		p(user.city);// line 120, japidviews\Application\profile\Profile.html
		p("\"/>\n" + 
"                                    <input class=\"form-control col-lg-11\"\n" + 
"                                           id=\"state\" name=\"state\" placeholder=\"");// line 120, japidviews\Application\profile\Profile.html
		;p(getMessage("user.state"));// line 122, japidviews\Application\profile\Profile.html
		p("\" type=\"text\"\n" + 
"                                           value=\"");// line 122, japidviews\Application\profile\Profile.html
		p(user.state);// line 123, japidviews\Application\profile\Profile.html
		p("\"/>\n" + 
"                                    <input id=\"country\" name=\"country\"\n" + 
"                                           class=\"form-control col-lg-11\" placeholder=\"");// line 123, japidviews\Application\profile\Profile.html
		;p(getMessage("user.country"));// line 125, japidviews\Application\profile\Profile.html
		p("\" type=\"text\"\n" + 
"                                           value=\"");// line 125, japidviews\Application\profile\Profile.html
		p(user.country);// line 126, japidviews\Application\profile\Profile.html
		p("\"/>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"\n" + 
"                        </div>\n" + 
"\n" + 
"                        <div class=\"col-lg-6  \">\n" + 
"\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <label class=\"control-label\" for=\"nicename\">");// line 126, japidviews\Application\profile\Profile.html
		;p(getMessage("user.nice.name"));// line 135, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls\">\n" + 
"                                    <input type=\"text\" id=\"nicename\" name=\"nicename\"\n" + 
"                                           class=\"form-control col-lg-11\" placeholder=\"");// line 135, japidviews\Application\profile\Profile.html
		;p(getMessage("user.nice.name"));// line 139, japidviews\Application\profile\Profile.html
		p("\"\n" + 
"                                           value=\"");// line 139, japidviews\Application\profile\Profile.html
		p(user.niceName);// line 140, japidviews\Application\profile\Profile.html
		p("\">\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <label class=\"control-label\" for=\"birthday\">");// line 140, japidviews\Application\profile\Profile.html
		;p(getMessage("user.birthday"));// line 144, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls\">\n" + 
"                                    <input type=\"text\" id=\"birthday\" name=\"birthday\" data-date=\"1980-02-02\"\n" + 
"                                           class=\"form-control col-lg-11\" placeholder=\"");// line 144, japidviews\Application\profile\Profile.html
		;p(getMessage("user.birthday"));// line 148, japidviews\Application\profile\Profile.html
		p("\"\n" + 
"                                           value=\"");// line 148, japidviews\Application\profile\Profile.html
		p(user.birthday);// line 149, japidviews\Application\profile\Profile.html
		p("\">\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <label class=\"control-label\" for=\"phone\">");// line 149, japidviews\Application\profile\Profile.html
		;p(getMessage("user.phone"));// line 154, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls\">\n" + 
"                                    <input type=\"text\" id=\"phone\" name=\"phone\" class=\"form-control col-lg-11\"\n" + 
"                                           placeholder=\"");// line 154, japidviews\Application\profile\Profile.html
		;p(getMessage("user.phone"));// line 158, japidviews\Application\profile\Profile.html
		p("\" value=\"");// line 158, japidviews\Application\profile\Profile.html
		p(user.phoneNum);// line 158, japidviews\Application\profile\Profile.html
		p("\">\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <label class=\"control-label\" for=\"realName\">");// line 158, japidviews\Application\profile\Profile.html
		;p(getMessage("user.real.name"));// line 162, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls\">\n" + 
"                                    <input type=\"text\" id=\"realName\" name=\"realName\"\n" + 
"                                           class=\"form-control col-lg-11\" placeholder=\"");// line 162, japidviews\Application\profile\Profile.html
		;p(getMessage("user.real.name"));// line 166, japidviews\Application\profile\Profile.html
		p("\"\n" + 
"                                           value=\"");// line 166, japidviews\Application\profile\Profile.html
		p(user.realName);// line 167, japidviews\Application\profile\Profile.html
		p("\">\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <label class=\"control-label\" for=\"about\">");// line 167, japidviews\Application\profile\Profile.html
		;p(getMessage("user.about"));// line 172, japidviews\Application\profile\Profile.html
		p("</label>\n" + 
"\n" + 
"                                <div class=\"controls\">\n" + 
"                                    <textarea id=\"about\" name=\"about\" class=\"form-control col-lg-11\" rows=\"6\"\n" + 
"                                              placeholder=\"");// line 172, japidviews\Application\profile\Profile.html
		;p(getMessage("user.about"));// line 176, japidviews\Application\profile\Profile.html
		p("\">");// line 176, japidviews\Application\profile\Profile.html
		p(user.about);// line 176, japidviews\Application\profile\Profile.html
		p("</textarea>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"form-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn btn-default\">\n" + 
"                                Save change\n" + 
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
"\n" + 
"<div id=\"userPhotoModal\" class=\"modal fade \" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\"\n" + 
"     aria-hidden=\"true\">\n" + 
"    <div class=\"modal-dialog modal_photo\">\n" + 
"        <div class=\"modal-content \">\n" + 
"            <div class=\"modal-header\">\n" + 
"                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n" + 
"                <h4 id=\"myModalLabel\">User's photo</h4>\n" + 
"            </div>\n" + 
"            <div class=\"modal-body modal-body_photo\">\n" + 
"                <div id=\"viewUserPhoto\">\n" + 
"                    <img src=\"");// line 176, japidviews\Application\profile\Profile.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(user.idUser,0));// line 211, japidviews\Application\profile\Profile.html
		p("\"\n" + 
"                         id=\"ora_user_photo\"/>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"modal-footer\">\n" + 
"                <form id=\"cropForm\" method=\"post\" class=\"form-inline\">\n" + 
"                    <div class=\"row\">\n" + 
"                        <div class=\"col-lg-2\">\n" + 
"                            <div class=\"input-group\">\n" + 
"                                <span class=\"input-group-addon\">X1</span>\n" + 
"                                <input type=\"text\" size=\"4\" id=\"x1\" name=\"x1\"\n" + 
"                                       class=\"form-control\"/>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"col-lg-2\">\n" + 
"                            <div class=\"input-group\">\n" + 
"                                <span class=\"input-group-addon\">Y1</span>\n" + 
"                                <input type=\"text\" size=\"4\" id=\"y1\" name=\"y1\"\n" + 
"                                       class=\"form-control\"/>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"col-lg-2\">\n" + 
"                            <div class=\"input-group\">\n" + 
"                                <span class=\"input-group-addon\">X2</span>\n" + 
"                                <input type=\"text\" size=\"4\" id=\"x2\" name=\"x2\"\n" + 
"                                       class=\"form-control\"/>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"col-lg-2\">\n" + 
"                            <div class=\"input-group\">\n" + 
"                                <span class=\"input-group-addon\">Y2</span>\n" + 
"                                <input type=\"text\" size=\"4\" id=\"y2\" name=\"y2\"\n" + 
"                                       class=\"form-control\"/>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"col-lg-2\">\n" + 
"                            <div class=\"input-group\">\n" + 
"                                <span class=\"input-group-addon\">W</span>\n" + 
"                                <input type=\"text\" size=\"4\" id=\"w\" name=\"w\"\n" + 
"                                       class=\"form-control\"/>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"col-lg-2\">\n" + 
"                            <div class=\"input-group\">\n" + 
"                                <span class=\"input-group-addon\">H</span>\n" + 
"                                <input type=\"text\" size=\"4\" id=\"h\" name=\"h\"\n" + 
"                                       class=\"form-control\"/>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"\n" + 
"                    </div>\n" + 
"\n" + 
"\n" + 
"                    <button class=\"btn btn-primary\" id=\"SaveUserPhoto\" type=\"button\">\n" + 
"                        Save Changes\n" + 
"                    </button>\n" + 
"                </form>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>");// line 211, japidviews\Application\profile\Profile.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( i18n("user.title"));;
	}
	@Override protected void css() {
		// line 7, japidviews\Application\profile\Profile.html
		p("<link href=\"");// line 7, japidviews\Application\profile\Profile.html
		p(lookupStatic("/public/js/jquery.fineuploader/fineuploader-3.6.2.css"));// line 8, japidviews\Application\profile\Profile.html
		p("\"\n" + 
"      rel=\"stylesheet\"/>\n" + 
"<link href=\"");// line 8, japidviews\Application\profile\Profile.html
		p(lookupStatic("public/bootstrap/datepicker/css/datepicker.css"));// line 10, japidviews\Application\profile\Profile.html
		p("\" rel=\"stylesheet\"/>\n" + 
"<script src=\"");// line 10, japidviews\Application\profile\Profile.html
		p(lookupStatic("public/js/jquery.fineuploader/jquery.fineuploader-3.6.2.min.js"));// line 11, japidviews\Application\profile\Profile.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 11, japidviews\Application\profile\Profile.html
		p(lookupStatic("public/bootstrap/datepicker/js/bootstrap-datepicker.js"));// line 12, japidviews\Application\profile\Profile.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 12, japidviews\Application\profile\Profile.html
		p(lookupStatic("public/bootstrap/datepicker/js/locales/bootstrap-datepicker.zh-CN.js"));// line 13, japidviews\Application\profile\Profile.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<link href=\"");// line 13, japidviews\Application\profile\Profile.html
		p(lookupStatic("/public/jcrop/jquery.Jcrop.min.css"));// line 14, japidviews\Application\profile\Profile.html
		p("\" rel=\"stylesheet\"/>\n" + 
"<script src=\"");// line 14, japidviews\Application\profile\Profile.html
		p(lookupStatic("public/jcrop/jquery.Jcrop.min.js"));// line 15, japidviews\Application\profile\Profile.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 15, japidviews\Application\profile\Profile.html
		p(lookupStatic("public/app/profile.js"));// line 16, japidviews\Application\profile\Profile.html
		p("\" type=\"text/javascript\"></script>\n" + 
"\n" + 
"<style type=\"text/css\">\n" + 
"    .head_img {\n" + 
"        max-width: 100px;\n" + 
"        max-height: 100px;\n" + 
"        width: 100px;\n" + 
"        height: 100px;\n" + 
"    }\n" + 
"\n" + 
"    .modal_photo {\n" + 
"        max-width: 800px;\n" + 
"        width: 800px;\n" + 
"    }\n" + 
"\n" + 
"    .modal-body_photo {\n" + 
"        max-width: 800px;\n" + 
"        max-height: 540px;\n" + 
"    }\n" + 
"</style>\n");// line 16, japidviews\Application\profile\Profile.html
		;
	}
	@Override protected void header() {
		p("Information");;
	}
}