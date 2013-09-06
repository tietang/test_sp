package japidviews.Application.profile;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/Application/profile/License.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class License extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/License.html";
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


	public License() {
		super(null);
	}
	public License(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.License.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/profile/License.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new License().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\profile\License.html

p("\n" + 
"\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 3, japidviews\Application\profile\License.html
		final SettingsMenu _SettingsMenu2 = new SettingsMenu(getOut()); _SettingsMenu2.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu2.render("Password"); // line 9, japidviews\Application\profile\License.html// line 9, japidviews\Application\profile\License.html
		p("\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row-fluid well profile_right\">\n" + 
"            <div class=\"span10 \">\n" + 
"\n" + 
"                <form class=\"form-horizontal\" action=\"/settings/password/done\"\n" + 
"                      method=\"post\">\n" + 
"                    ");// line 9, japidviews\Application\profile\License.html
		final AllMessage _AllMessage3 = new AllMessage(getOut()); _AllMessage3.setActionRunners(getActionRunners()).setOut(getOut()); _AllMessage3.render(); // line 18, japidviews\Application\profile\License.html// line 18, japidviews\Application\profile\License.html
		p("\n" + 
"                    <h2>许可协议要点</h2>\n" + 
"\n" + 
"                    <div class=\"subtitle\">本网页其他显示框的内容将根据你在下面的选择自动更新。</div>\n" + 
"\n" + 
"                    <div class=\"help_highlight\">\n" + 
"                        <div class=\"help_button\" onclick=\"CHOOSER.CALL.popup('modifications');\"></div>\n" + 
"                        <h4>允许对您的作品进行修改吗？</h4>\n" + 
"                        <ul>\n" + 
"                            <li>\n" + 
"                                <input type=\"radio\"\n" + 
"                                       checked=\"checked\"\n" + 
"                                       name=\"field_derivatives\" value=\"y\"\n" + 
"                                       id=\"question_3-5\"/>\n" + 
"                                <label for=\"question_3-5\">是</label>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <input type=\"radio\" name=\"field_derivatives\" value=\"n\"\n" + 
"\n" + 
"                                       id=\"question_3-7\"/>\n" + 
"                                <label for=\"question_3-7\">不</label>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                        <ul class=\"no_columns\">\n" + 
"                            <li>\n" + 
"                                <input type=\"radio\" name=\"field_derivatives\" value=\"sa\"\n" + 
"\n" + 
"                                       id=\"question_3-6\"/>\n" + 
"                                <label for=\"question_3-6\">\n" + 
"                                    是的，只要他人以相同方式共享\n" + 
"                                </label>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"\n" + 
"\n" + 
"                    <div class=\"help_highlight\">\n" + 
"                        <div class=\"help_button\" onclick=\"CHOOSER.CALL.popup('commercial');\"></div>\n" + 
"                        <h4>允许对您的作品进行商业性使用吗？</h4>\n" + 
"                        <ul>\n" + 
"                            <li>\n" + 
"                                <input type=\"radio\" checked=\"checked\" name=\"field_commercial\" value=\"y\"\n" + 
"                                       id=\"question_2-3\"/>\n" + 
"                                <label for=\"question_2-3\">是</label>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <input type=\"radio\" name=\"field_commercial\" value=\"n\" id=\"question_2-4\"/>\n" + 
"                                <label for=\"question_2-4\">不</label>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn\">\n" + 
"                                ");// line 18, japidviews\Application\profile\License.html
		;p(getMessage("save.change"));// line 73, japidviews\Application\profile\License.html
		p("\n" + 
"                            </button>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"\n" + 
"                </form>\n" + 
"\n" + 
"            </div>\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n");// line 73, japidviews\Application\profile\License.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("password.title"));;
	}
	@Override protected void header() {
		p("Change Password");;
	}
}