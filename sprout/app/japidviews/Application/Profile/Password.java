package japidviews.Application.Profile;
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
// NOTE: This file was generated from: japidviews/Application/Profile/Password.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Password extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/Profile/Password.html";
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


	public Password() {
		super(null);
	}
	public Password(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Profile.Password.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/Profile/Password.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Password().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\Profile\Password.html
p("\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 3, japidviews\Application\Profile\Password.html
		final SettingsMenu _SettingsMenu2 = new SettingsMenu(getOut()); _SettingsMenu2.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu2.render("Password"); // line 9, japidviews\Application\Profile\Password.html// line 9, japidviews\Application\Profile\Password.html
		p("        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row-fluid well profile_right\">\n" + 
"            <div class=\"span10 \">\n" + 
"\n" + 
"                <form class=\"form-horizontal\" action=\"/settings/password/done\"\n" + 
"                      method=\"post\">\n" + 
"                    ");// line 9, japidviews\Application\Profile\Password.html
		final AllMessage _AllMessage3 = new AllMessage(getOut()); _AllMessage3.setActionRunners(getActionRunners()).setOut(getOut()); _AllMessage3.render(); // line 18, japidviews\Application\Profile\Password.html// line 18, japidviews\Application\Profile\Password.html
		p("                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"oldPassword\">");// line 18, japidviews\Application\Profile\Password.html
		;p(getMessage("password.old"));// line 20, japidviews\Application\Profile\Password.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"password\" id=\"oldPassword\" name=\"oldPassword\"\n" + 
"                                   class=\"span10\" placeholder=\"");// line 20, japidviews\Application\Profile\Password.html
		;p(getMessage("password.old"));// line 24, japidviews\Application\Profile\Password.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"newPassword\">");// line 24, japidviews\Application\Profile\Password.html
		;p(getMessage("password.again"));// line 28, japidviews\Application\Profile\Password.html
		p("                            </label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"password\" id=\"newPassword\" name=\"newPassword\"\n" + 
"                                   class=\"span10\" placeholder=\"");// line 28, japidviews\Application\Profile\Password.html
		;p(getMessage("password.again"));// line 33, japidviews\Application\Profile\Password.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"reNewPassword\">");// line 33, japidviews\Application\Profile\Password.html
		;p(getMessage("password.again.repeat"));// line 37, japidviews\Application\Profile\Password.html
		p("                            </label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"password\" id=\"reNewPassword\" name=\"reNewPassword\"\n" + 
"                                   class=\"span10\" placeholder=\"");// line 37, japidviews\Application\Profile\Password.html
		;p(getMessage("password.again.repeat"));// line 42, japidviews\Application\Profile\Password.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn\">\n" + 
"                                ");// line 42, japidviews\Application\Profile\Password.html
		;p(getMessage("save.change"));// line 49, japidviews\Application\Profile\Password.html
		p("                            </button>\n" + 
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
"\n");// line 49, japidviews\Application\Profile\Password.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("password.title"));;
	}
	@Override protected void header() {
		p("Change Password");;
	}
}