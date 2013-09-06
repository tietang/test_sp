package japidviews.Application.profile;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.User;
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
// NOTE: This file was generated from: japidviews/Application/profile/Profile.html
// Change to this file will be lost next time the template file is compiled.
//

public class Profile extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/Profile.html";
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

	public Profile() {
		super(null);
	}

	public Profile(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"user", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"User", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Profile.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private User user; // line 3

	public cn.bran.japid.template.RenderResult render(User user) {
		this.user = user;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 3
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------

		p("<div class=\"grid_row\">\n" +
				"\n" +
				"    <div class=\"col col_3 \">\n" +
				"        <div class=\"sidebar-nav \">\n" +
				"            ");// line 39
		final SettingsMenu _SettingsMenu3 = new SettingsMenu(getOut());
		_SettingsMenu3.setActionRunners(getActionRunners()).setOut(getOut());
		_SettingsMenu3.render("Profile"); // line 45// line 45
		p("        </div>\n" +
				"    </div>\n" +
				"\n" +
				"    <div class=\"col col_13 \">\n" +
				"        <div class=\"row-fluid well profile_right\">\n" +
				"            <div class=\"span12  \">\n" +
				"                ");// line 45
		final ErrorMessage _ErrorMessage4 = new ErrorMessage(getOut());
		_ErrorMessage4.setActionRunners(getActionRunners()).setOut(getOut());
		_ErrorMessage4.render(); // line 52// line 52
		p("\n"
				+
				"                <form class=\"\" action=\"/settings/profile/done\" method=\"post\">\n"
				+
				"                    <div class=\"row-fluid\">\n"
				+
				"                        <div class=\"span6\">\n"
				+
				"\n"
				+
				"                            <div class=\"control-group \">\n"
				+
				"                                <div class=\"controls inline\">\n"
				+
				"                                    <div class=\"head_img\">\n"
				+
				"                                        <img id=\"head_img\"\n"
				+
				"                                             src=\"");// line 52
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(
				user.idUser, 1));// line 62
		p("\">\n"
				+
				"                                    </div>\n"
				+
				"                                    <input type=\"hidden\" id=\"user_id_photo\" name=\"user_photo\"\n"
				+
				"                                           value=\"");// line 62
		p(user.isHeadPhoto);// line 65
		p("\">\n"
				+
				"                                    <label class=\" inline\">\n"
				+
				"                                    <span id=\"upload_head\"\n"
				+
				"                                          style=\"display: inline;\"\n"
				+
				"                                          class=\"inline\"></span> </label><span\n"
				+
				"                                        id=\"upload_message\"></span>\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"                            <div class=\"control-group \">\n"
				+
				"                                <label class=\"control-label\" for=\"gender0\">");// line 65
		;
		p(getMessage("user.gender"));// line 74
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls \">\n"
				+
				"                                    <label class=\"radio inline\">\n"
				+
				"                                        <input type=\"radio\"\n"
				+
				"                                               id=\"gender1\" name=\"gender\" value=\"1\" ");// line 74
		p(user.gender == 1 ? "checked" : "");// line 79
		p(">\n" +
				"                                        ");// line 79
		;
		p(getMessage("user.male"));// line 80
		p(" </label><label class=\"radio inline\">\n"
				+
				"                                    <input type=\"radio\"\n"
				+
				"                                           id=\"gender2\" name=\"gender\" value=\"2\" ");// line 80
		p(user.gender == 2 ? "checked" : "");// line 82
		p(">\n" +
				"                                    ");// line 82
		;
		p(getMessage("user.female"));// line 83
		p(" </label><label class=\"radio inline\">\n"
				+
				"                                    <input type=\"radio\"\n"
				+
				"                                           id=\"gender0\" name=\"gender\" value=\"0\"\n"
				+
				"                                    ");// line 83
		p((user.gender == null || user.gender == 0) ? "checked" : "");// line 86
		p("                                    >\n" +
				"                                    ");// line 86
		;
		p(getMessage("user.not.specified"));// line 88
		p(" </label>\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"\n"
				+
				"                            <div class=\"control-group\">\n"
				+
				"                                <label class=\"control-label\" for=\"username\">");// line 88
		;
		p(getMessage("user.username"));// line 93
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls\">\n"
				+
				"                                    <input type=\"text\" id=\"username1\" name=\"username1\"\n"
				+
				"                                           class=\"span11\" placeholder=\"");// line 93
		;
		p(getMessage("user.userName"));// line 97
		p("\"\n" +
				"                                           value=\"");// line 97
		p(user.userName);// line 98
		p("\" readonly=\"readonly\">\n"
				+
				"                                    <input\n"
				+
				"                                            type=\"hidden\" id=\"username\" name=\"username\" class=\"span11\"\n"
				+
				"                                            value=\"");// line 98
		p(user.userName);// line 101
		p("\">\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"                            <div class=\"control-group\">\n"
				+
				"                                <label class=\"control-label\" for=\"email\">");// line 101
		;
		p(getMessage("user.email"));// line 105
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls\">\n"
				+
				"                                    <input type=\"text\" id=\"email1\" name=\"email1\" class=\"span11\"\n"
				+
				"                                           placeholder=\"");// line 105
		;
		p(getMessage("user.email"));// line 109
		p("\" value=\"");// line 109
		p(user.email);// line 109
		p("\" readonly=\"readonly\">\n"
				+
				"                                    <input type=\"hidden\" id=\"email\" name=\"email\" class=\"span11\"\n"
				+
				"                                           placeholder=\"");// line 109
		;
		p(getMessage("user.email"));// line 111
		p("\" value=\"");// line 111
		p(user.email);// line 111
		p("\">\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"\n"
				+
				"                            <div class=\"control-group\">\n"
				+
				"                                <label class=\"control-label\">");// line 111
		;
		p(getMessage("user.location"));// line 116
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls\">\n"
				+
				"                                    <input id=\"city\" name=\"city\" class=\"span11\" placeholder=\"");// line 116
		;
		p(getMessage("user.city"));// line 119
		p("\"\n"
				+
				"                                           type=\"text\" value=\"");// line 119
		p(user.city);// line 120
		p("\"/>\n"
				+
				"                                    <input class=\"span11\"\n"
				+
				"                                           id=\"state\" name=\"state\" placeholder=\"");// line 120
		;
		p(getMessage("user.state"));// line 122
		p("\" type=\"text\"\n" +
				"                                           value=\"");// line 122
		p(user.state);// line 123
		p("\"/>\n"
				+
				"                                    <input id=\"country\" name=\"country\"\n"
				+
				"                                           class=\"span11\" placeholder=\"");// line 123
		;
		p(getMessage("user.country"));// line 125
		p("\" type=\"text\"\n" +
				"                                           value=\"");// line 125
		p(user.country);// line 126
		p("\"/>\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"\n"
				+
				"                        </div>\n"
				+
				"\n"
				+
				"                        <div class=\"span6  \">\n"
				+
				"\n"
				+
				"                            <div class=\"control-group\">\n"
				+
				"                                <label class=\"control-label\" for=\"nicename\">");// line 126
		;
		p(getMessage("user.nice.name"));// line 135
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls\">\n"
				+
				"                                    <input type=\"text\" id=\"nicename\" name=\"nicename\"\n"
				+
				"                                           class=\"span11\" placeholder=\"");// line 135
		;
		p(getMessage("user.nice.name"));// line 139
		p("\"\n" +
				"                                           value=\"");// line 139
		p(user.niceName);// line 140
		p("\">\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"                            <div class=\"control-group\">\n"
				+
				"                                <label class=\"control-label\" for=\"birthday\">");// line 140
		;
		p(getMessage("user.birthday"));// line 144
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls\">\n"
				+
				"                                    <input type=\"text\" id=\"birthday\" name=\"birthday\"\n"
				+
				"                                           class=\"span11\" placeholder=\"");// line 144
		;
		p(getMessage("user.birthday"));// line 148
		p("\"\n" +
				"                                           value=\"");// line 148
		p(user.birthday);// line 149
		p("\">\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"\n"
				+
				"                            <div class=\"control-group\">\n"
				+
				"                                <label class=\"control-label\" for=\"phone\">");// line 149
		;
		p(getMessage("user.phone"));// line 154
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls\">\n"
				+
				"                                    <input type=\"text\" id=\"phone\" name=\"phone\" class=\"span11\"\n"
				+
				"                                           placeholder=\"");// line 154
		;
		p(getMessage("user.phone"));// line 158
		p("\" value=\"");// line 158
		p(user.phoneNum);// line 158
		p("\">\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"                            <div class=\"control-group\">\n"
				+
				"                                <label class=\"control-label\" for=\"realName\">");// line 158
		;
		p(getMessage("user.real.name"));// line 162
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls\">\n"
				+
				"                                    <input type=\"text\" id=\"realName\" name=\"realName\"\n"
				+
				"                                           class=\"span11\" placeholder=\"");// line 162
		;
		p(getMessage("user.real.name"));// line 166
		p("\"\n" +
				"                                           value=\"");// line 166
		p(user.realName);// line 167
		p("\">\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"\n"
				+
				"                            <div class=\"control-group\">\n"
				+
				"                                <label class=\"control-label\" for=\"about\">");// line 167
		;
		p(getMessage("user.about"));// line 172
		p("</label>\n"
				+
				"\n"
				+
				"                                <div class=\"controls\">\n"
				+
				"                                    <textarea id=\"about\" name=\"about\" class=\"span11\" rows=\"6\" placeholder=\"");// line 172
		;
		p(getMessage("user.about"));// line 175
		p("\">");// line 175
		p(user.about);// line 175
		p("</textarea>\n"
				+
				"                                </div>\n"
				+
				"                            </div>\n"
				+
				"                        </div>\n"
				+
				"\n"
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
				"                                Save change\n"
				+
				"                            </button>\n"
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
				"<div id=\"userPhotoModal\" class=\"modal hide fade modal_photo\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\"\n"
				+
				"     aria-hidden=\"true\">\n"
				+
				"    <div class=\"modal-header\">\n"
				+
				"        <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n"
				+
				"                aria-hidden=\"true\">\n" +
				"            ×\n" +
				"        </button>\n" +
				"        <h3 id=\"myModalLabel\">User's photo</h3>\n" +
				"    </div>\n" +
				"    <div class=\"modal-body modal-body_photo\">\n" +
				"        <div id=\"viewUserPhoto\">\n" +
				"            <img\n" +
				"                    src=\"");// line 175
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(
				user.idUser, 0));// line 211
		p("\"\n"
				+
				"                    id=\"ora_user_photo\"/>\n"
				+
				"        </div>\n"
				+
				"    </div>\n"
				+
				"    <div class=\"modal-footer\">\n"
				+
				"        <form id=\"cropForm\" method=\"post\" class=\"form-inline\">\n"
				+
				"            <label>X1\n"
				+
				"                <input type=\"text\" size=\"4\" id=\"x1\" name=\"x1\"\n"
				+
				"                       class=\"span1\"/>\n"
				+
				"            </label><label>Y1\n"
				+
				"            <input type=\"text\" size=\"4\"\n"
				+
				"                   id=\"y1\" name=\"y1\" class=\"span1\"/>\n"
				+
				"        </label><label>X2\n"
				+
				"            <input type=\"text\" size=\"4\" id=\"x2\" name=\"x2\"\n"
				+
				"                   class=\"span1\"/>\n"
				+
				"        </label><label>Y2\n"
				+
				"            <input type=\"text\" size=\"4\"\n"
				+
				"                   id=\"y2\" name=\"y2\" class=\"span1\"/>\n"
				+
				"        </label><label>W\n"
				+
				"            <input\n"
				+
				"                    type=\"text\" size=\"4\" id=\"w\" name=\"w\" class=\"span1\"/>\n"
				+
				"        </label><label>H\n"
				+
				"            <input type=\"text\" size=\"4\" id=\"h\" name=\"h\"\n"
				+
				"                   class=\"span1\"/>\n"
				+
				"        </label>\n"
				+
				"\n"
				+
				"            <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">\n"
				+
				"                Close\n"
				+
				"            </button>\n"
				+
				"            <button class=\"btn btn-primary\" id=\"SaveUserPhoto\" type=\"button\">\n"
				+
				"                Save\n" +
				"                changes\n" +
				"            </button>\n" +
				"        </form>\n" +
				"    </div>\n" +
				"</div>\n");// line 211

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p(i18n("user.title"));
		;
	}

	@Override
	protected void css() {
		p("<link href=\"");// line 7
		p(lookupStatic("/public/js/jquery.fineuploader/fineuploader-3.6.2.css"));// line 8
		p("\"\n" +
				"      rel=\"stylesheet\"/>\n" +
				"<link href=\"");// line 8
		p(lookupStatic("public/bootstrap/datepicker/css/datepicker.css"));// line 10
		p("\" rel=\"stylesheet\"/>\n" +
				"<script src=\"");// line 10
		p(lookupStatic("public/js/jquery.fineuploader/jquery.fineuploader-3.6.2.min.js"));// line 11
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 11
		p(lookupStatic("public/app/profile.js"));// line 12
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 12
		p(lookupStatic("public/bootstrap/datepicker/js/bootstrap-datepicker.js"));// line 13
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 13
		p(lookupStatic("public/bootstrap/datepicker/js/locales/bootstrap-datepicker.zh-CN.js"));// line 14
		p("\" type=\"text/javascript\"></script>\n" +
				"\n" +
				"<link href=\"");// line 14
		p(lookupStatic("/public/jcrop/jquery.Jcrop.min.css"));// line 16
		p("\" rel=\"stylesheet\"/>\n" +
				"\n" +
				"<script src=\"");// line 16
		p(lookupStatic("public/jcrop/jquery.Jcrop.min.js"));// line 18
		p("\"\n" +
				"        type=\"text/javascript\"></script>\n" +
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
				"</style>\n");// line 18
		;
	}

	@Override
	protected void header() {
		p("Information");
		;
	}
}
