package japidviews.Application.profile;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/Application/profile/SocialMedia.html
// Change to this file will be lost next time the template file is compiled.
//

public class SocialMedia extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/SocialMedia.html";
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

	public SocialMedia() {
		super(null);
	}

	public SocialMedia(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"checks", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.SocialMedia.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private String checks; // line 2

	public cn.bran.japid.template.RenderResult render(String checks) {
		this.checks = checks;
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
		p("\n" +
				"<div class=\"grid_row\">\n" +
				"\n" +
				"    <div class=\"col col_3 \">\n" +
				"        <div class=\"sidebar-nav \">\n" +
				"            ");// line 4
		final SettingsMenu _SettingsMenu2 = new SettingsMenu(getOut());
		_SettingsMenu2.setActionRunners(getActionRunners()).setOut(getOut());
		_SettingsMenu2.render("SocialMedia"); // line 10// line 10
		p("        </div>\n"
				+
				"    </div>\n"
				+
				"    <div class=\"col col_13 \">\n"
				+
				"        <div class=\"row-fluid well profile_right\">\n"
				+
				"            <div class=\"span8  \">\n"
				+
				"\n"
				+
				"                <form id=\"socialMediaForm\" class=\"\" action=\"/settings/socialmedia/done\" method=\"post\">\n"
				+
				"\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"website\">");// line 10
		;
		p(getMessage("social.website"));// line 20
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"website\" name=\"website\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 20
		;
		p(getMessage("social.website"));// line 24
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"qq\">");// line 24
		;
		p(getMessage("social.qq"));// line 28
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"qq\" name=\"qq\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 28
		;
		p(getMessage("social.qq"));// line 32
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"qq_weibo\">");// line 32
		;
		p(getMessage("social.qq.weibo"));// line 36
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"qq_weibo\" name=\"qq_weibo\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 36
		;
		p(getMessage("social.qq.weibo"));// line 40
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"weibo\">");// line 40
		;
		p(getMessage("social.weibo"));// line 44
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"weibo\" name=\"weibo\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 44
		;
		p(getMessage("social.weibo"));// line 48
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"\n"
				+
				"\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"twitter\">");// line 48
		;
		p(getMessage("social.twitter"));// line 54
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"twitter\" name=\"twitter\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 54
		;
		p(getMessage("social.twitter"));// line 58
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"facebook\">");// line 58
		;
		p(getMessage("social.facebook"));// line 62
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"facebook\" name=\"facebook\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 62
		;
		p(getMessage("social.facebook"));// line 66
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"flickr\">");// line 66
		;
		p(getMessage("social.flickr"));// line 70
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"flickr\" name=\"flickr\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 70
		;
		p(getMessage("social.flickr"));// line 74
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"fengniao\">");// line 74
		;
		p(getMessage("social.fengniao"));// line 78
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"fengniao\" name=\"fengniao\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 78
		;
		p(getMessage("social.fengniao"));// line 82
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"renren\">");// line 82
		;
		p(getMessage("social.renren"));// line 86
		p("</label>\n"
				+
				"\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"renren\" name=\"renren\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 86
		;
		p(getMessage("social.renren"));// line 90
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <label class=\"control-label\" for=\"douban\">");// line 90
		;
		p(getMessage("social.douban"));// line 94
		p("</label>\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <input type=\"text\" id=\"douban\" name=\"douban\" class=\"input span9\"\n"
				+
				"                                   placeholder=\"");// line 94
		;
		p(getMessage("social.douban"));// line 97
		p("\" value=\" \">\n"
				+
				"                        </div>\n"
				+
				"                    </div>\n"
				+
				"                    <div class=\"control-group\">\n"
				+
				"                        <div class=\"controls\">\n"
				+
				"                            <button type=\"submit\" class=\"btn\">\n"
				+
				"                                ");// line 97
		;
		p(getMessage("save.change"));// line 103
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
				"\n" +
				"\n");// line 103

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p(i18n("notify.title"));
		;
	}

	@Override
	protected void header() {
		p("Email Notifications");
		;
	}
}
