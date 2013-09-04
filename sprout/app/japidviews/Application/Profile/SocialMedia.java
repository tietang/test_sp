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
// NOTE: This file was generated from: japidviews/Application/profile/SocialMedia.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class SocialMedia extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/SocialMedia.html";
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


	public SocialMedia() {
		super(null);
	}
	public SocialMedia(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"checks",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.SocialMedia.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String checks; // line 2, japidviews/Application/profile/SocialMedia.html
	public cn.bran.japid.template.RenderResult render(String checks) {
		this.checks = checks;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2, japidviews/Application/profile/SocialMedia.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String checks) {
		return new SocialMedia().render(checks);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\profile\SocialMedia.html
p("\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 4, japidviews\Application\profile\SocialMedia.html
		final SettingsMenu _SettingsMenu2 = new SettingsMenu(getOut()); _SettingsMenu2.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu2.render("SocialMedia"); // line 10, japidviews\Application\profile\SocialMedia.html// line 10, japidviews\Application\profile\SocialMedia.html
		p("        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row-fluid well profile_right\">\n" + 
"            <div class=\"span8  \">\n" + 
"\n" + 
"                <form id=\"socialMediaForm\" class=\"\" action=\"/settings/socialmedia/done\" method=\"post\">\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"website\">");// line 10, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.website"));// line 20, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"website\" name=\"website\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 20, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.website"));// line 24, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"qq\">");// line 24, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq"));// line 28, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"qq\" name=\"qq\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 28, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq"));// line 32, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"qq_weibo\">");// line 32, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq.weibo"));// line 36, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"qq_weibo\" name=\"qq_weibo\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 36, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq.weibo"));// line 40, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"weibo\">");// line 40, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.weibo"));// line 44, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"weibo\" name=\"weibo\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 44, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.weibo"));// line 48, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"twitter\">");// line 48, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.twitter"));// line 54, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"twitter\" name=\"twitter\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 54, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.twitter"));// line 58, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"facebook\">");// line 58, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.facebook"));// line 62, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"facebook\" name=\"facebook\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 62, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.facebook"));// line 66, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"flickr\">");// line 66, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.flickr"));// line 70, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"flickr\" name=\"flickr\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 70, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.flickr"));// line 74, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"fengniao\">");// line 74, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.fengniao"));// line 78, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"fengniao\" name=\"fengniao\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 78, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.fengniao"));// line 82, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"renren\">");// line 82, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.renren"));// line 86, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"renren\" name=\"renren\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 86, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.renren"));// line 90, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"douban\">");// line 90, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.douban"));// line 94, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"douban\" name=\"douban\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 94, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.douban"));// line 97, japidviews\Application\profile\SocialMedia.html
		p("\" value=\" \">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn\">\n" + 
"                                ");// line 97, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("save.change"));// line 103, japidviews\Application\profile\SocialMedia.html
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
"\n");// line 103, japidviews\Application\profile\SocialMedia.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("notify.title"));;
	}
	@Override protected void header() {
		p( "Email Notifications");;
	}
}