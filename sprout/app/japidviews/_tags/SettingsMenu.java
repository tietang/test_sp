package japidviews._tags;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.*;
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
// NOTE: This file was generated from: japidviews/_tags/SettingsMenu.html
// Change to this file will be lost next time the template file is compiled.
//

public class SettingsMenu extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/SettingsMenu.html";
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

	public SettingsMenu() {
		super(null);
	}

	public SettingsMenu(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"item", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.SettingsMenu.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private String item; // line 2

	public cn.bran.japid.template.RenderResult render(String item) {
		this.item = item;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 2
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		Map<String, String> ms = new HashMap<String, String>();// line 3
		ms.put(item, " class=\"active\" ");// line 4
		p("\n" +
				"\n" +
				"<ul class=\"nav  nav-pills nav-stacked\">\n" +
				"	<li><h4>");// line 4
		;
		p(getMessage("profile.menu.profile"));// line 8
		p("</h4></li>\n" +
				"	<li");// line 8
		p(ms.get("Profile"));// line 9
		p("><a href=\"/settings/profile\">");// line 9
		;
		p(getMessage("profile.menu.profile"));// line 9
		p("</a></li>\n" +
				"	<li");// line 9
		p(ms.get("Camera"));// line 10
		p("><a href=\"/settings/camera\">");// line 10
		;
		p(getMessage("profile.menu.camera"));// line 10
		p("</a></li>\n" +
				"	<li");// line 10
		p(ms.get("Password"));// line 11
		p("><a href=\"/settings/password\">");// line 11
		;
		p(getMessage("profile.menu.password"));// line 11
		p("</a></li>\n" +
				"	<li");// line 11
		p(ms.get("Notifications"));// line 12
		p("><a href=\"/settings/notification\">");// line 12
		;
		p(getMessage("profile.menu.notifications"));// line 12
		p("</a></li>\n" +
				"	<li");// line 12
		p(ms.get("SocialMedia"));// line 13
		p("><a href=\"/settings/socialmedia\">");// line 13
		;
		p(getMessage("profile.menu.social.media"));// line 13
		p("</a></li>\n" +
				"	<!--\n" +
				"    <li");// line 13
		p(ms.get("Account"));// line 15
		p("><a href=\"/settings/account\">");// line 15
		;
		p(getMessage("profile.menu.account"));// line 15
		p("</a></li>\n" +
				"	<li><h4>");// line 15
		;
		p(getMessage("profile.menu.album"));// line 16
		p("</h4></li>\n" +
				"	<li");// line 16
		p(ms.get("Settings"));// line 17
		p("><a href=\"#\">");// line 17
		;
		p(getMessage("profile.menu.settings"));// line 17
		p("</a></li>\n" +
				"	<li");// line 17
		p(ms.get("Themes"));// line 18
		p("><a href=\"#\">");// line 18
		;
		p(getMessage("profile.menu.themes"));// line 18
		p("</a></li>\n" +
				"	  -->\n" +
				"	<li><h4>");// line 18
		;
		p(getMessage("profile.menu.friends"));// line 20
		p("</h4></li>\n" +
				"	<li");// line 20
		p(ms.get("Following"));// line 21
		p("><a href=\"#\">");// line 21
		;
		p(getMessage("profile.menu.following"));// line 21
		p("</a></li>\n" +
				"	<li");// line 21
		p(ms.get("Followed"));// line 22
		p("><a href=\"#\">");// line 22
		;
		p(getMessage("profile.menu.followed"));// line 22
		p("</a></li>\n" +
				"\n" +
				"</ul>\n" +
				" \n");// line 22

		endDoLayout(sourceTemplate);
	}

}
