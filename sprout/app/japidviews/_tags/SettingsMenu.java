package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/_tags/SettingsMenu.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class SettingsMenu extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/SettingsMenu.html";
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


	public SettingsMenu() {
		super(null);
	}
	public SettingsMenu(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"item",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.SettingsMenu.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String item; // line 2, japidviews/_tags/SettingsMenu.html
	public cn.bran.japid.template.RenderResult render(String item) {
		this.item = item;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 2, japidviews/_tags/SettingsMenu.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String item) {
		return new SettingsMenu().render(item);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_tags\SettingsMenu.html

Map<String,String> ms=new HashMap<String , String>();// line 3, japidviews\_tags\SettingsMenu.html

ms.put(item," class=\"active\" ");// line 4, japidviews\_tags\SettingsMenu.html
		p("\n" + 
"\n" + 
"\n" + 
"<ul class=\"nav  nav-pills nav-stacked\">\n" + 
"	<li><h4>");// line 4, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.profile"));// line 8, japidviews\_tags\SettingsMenu.html
		p("</h4></li>\n" + 
"	<li");// line 8, japidviews\_tags\SettingsMenu.html
		p(ms.get("Profile"));// line 9, japidviews\_tags\SettingsMenu.html
		p("><a href=\"/settings/profile\">");// line 9, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.profile"));// line 9, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<li");// line 9, japidviews\_tags\SettingsMenu.html
		p(ms.get("Camera"));// line 10, japidviews\_tags\SettingsMenu.html
		p("><a href=\"/settings/camera\">");// line 10, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.camera"));// line 10, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<li");// line 10, japidviews\_tags\SettingsMenu.html
		p(ms.get("Password"));// line 11, japidviews\_tags\SettingsMenu.html
		p("><a href=\"/settings/password\">");// line 11, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.password"));// line 11, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<li");// line 11, japidviews\_tags\SettingsMenu.html
		p(ms.get("Notifications"));// line 12, japidviews\_tags\SettingsMenu.html
		p("><a href=\"/settings/notification\">");// line 12, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.notifications"));// line 12, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<li");// line 12, japidviews\_tags\SettingsMenu.html
		p(ms.get("SocialMedia"));// line 13, japidviews\_tags\SettingsMenu.html
		p("><a href=\"/settings/socialmedia\">");// line 13, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.social.media"));// line 13, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<li");// line 13, japidviews\_tags\SettingsMenu.html
		p(ms.get("License"));// line 14, japidviews\_tags\SettingsMenu.html
		p("><a href=\"/settings/license\">");// line 14, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.license"));// line 14, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<!--\n" + 
"    <li");// line 14, japidviews\_tags\SettingsMenu.html
		p(ms.get("Account"));// line 16, japidviews\_tags\SettingsMenu.html
		p("><a href=\"/settings/account\">");// line 16, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.account"));// line 16, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<li><h4>");// line 16, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.album"));// line 17, japidviews\_tags\SettingsMenu.html
		p("</h4></li>\n" + 
"	<li");// line 17, japidviews\_tags\SettingsMenu.html
		p(ms.get("Settings"));// line 18, japidviews\_tags\SettingsMenu.html
		p("><a href=\"#\">");// line 18, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.settings"));// line 18, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<li");// line 18, japidviews\_tags\SettingsMenu.html
		p(ms.get("Themes"));// line 19, japidviews\_tags\SettingsMenu.html
		p("><a href=\"#\">");// line 19, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.themes"));// line 19, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	  -->\n" + 
"	<li><h4>");// line 19, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.friends"));// line 21, japidviews\_tags\SettingsMenu.html
		p("</h4></li>\n" + 
"	<li");// line 21, japidviews\_tags\SettingsMenu.html
		p(ms.get("Following"));// line 22, japidviews\_tags\SettingsMenu.html
		p("><a href=\"#\">");// line 22, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.following"));// line 22, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"	<li");// line 22, japidviews\_tags\SettingsMenu.html
		p(ms.get("Followed"));// line 23, japidviews\_tags\SettingsMenu.html
		p("><a href=\"#\">");// line 23, japidviews\_tags\SettingsMenu.html
		;p(getMessage("profile.menu.followed"));// line 23, japidviews\_tags\SettingsMenu.html
		p("</a></li>\n" + 
"\n" + 
"</ul>\n" + 
" ");// line 23, japidviews\_tags\SettingsMenu.html
		
		endDoLayout(sourceTemplate);
	}

}