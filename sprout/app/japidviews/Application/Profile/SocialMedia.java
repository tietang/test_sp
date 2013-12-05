//version: 0.9.35
package japidviews.Application.profile;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.UserSocial;
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
	public static final String[] argNames = new String[] {/* args of the template*/"m",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"UserSocial",  };
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

	private UserSocial m; // line 3, japidviews/Application/profile/SocialMedia.html
	public cn.bran.japid.template.RenderResult render(UserSocial m) {
		this.m = m;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 3, japidviews/Application/profile/SocialMedia.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(UserSocial m) {
		return new SocialMedia().render(m);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\profile\SocialMedia.html

p("\n" + 
"\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 5, japidviews\Application\profile\SocialMedia.html
		final SettingsMenu _SettingsMenu2 = new SettingsMenu(getOut()); _SettingsMenu2.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu2.render("SocialMedia"); // line 11, japidviews\Application\profile\SocialMedia.html// line 11, japidviews\Application\profile\SocialMedia.html
		p("\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row well profile_right\">\n" + 
"            <div class=\"col-lg-12  \">\n" + 
"                ");// line 11, japidviews\Application\profile\SocialMedia.html
		final AllMessage _AllMessage3 = new AllMessage(getOut()); _AllMessage3.setActionRunners(getActionRunners()).setOut(getOut()); _AllMessage3.render(); // line 17, japidviews\Application\profile\SocialMedia.html// line 17, japidviews\Application\profile\SocialMedia.html
		p("\n" + 
"                <form id=\"socialMediaForm\" class=\"form-horizontal\" action=\"/settings/socialmedia/done\" method=\"post\">\n" + 
"                    <div class=\"form-group\">\n" + 
"                        <label class=\"control-label\" for=\"website\">");// line 17, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.website"));// line 20, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"website\" name=\"web_site\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 20, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.website"));// line 24, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 24, japidviews\Application\profile\SocialMedia.html
		p(m.web_site);// line 24, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"\n" + 
"\n" + 
"                        <label class=\"control-label\" for=\"qq\">");// line 24, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq"));// line 28, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"qq\" name=\"qq\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 28, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq"));// line 32, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 32, japidviews\Application\profile\SocialMedia.html
		p(m.qq);// line 32, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"\n" + 
"\n" + 
"                        <label class=\"control-label\" for=\"qq_weibo\">");// line 32, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq.weibo"));// line 36, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\" input-group\">\n" + 
"                            <span class=\"input-group-addon\">@</span>\n" + 
"                            <input type=\"text\" id=\"qq_weibo\" name=\"qq_weibo\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 36, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq.weibo"));// line 41, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 41, japidviews\Application\profile\SocialMedia.html
		p(m.qq_weibo);// line 41, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"\n" + 
"\n" + 
"                        <label class=\"control-label\" for=\"weibo\">");// line 41, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.weibo"));// line 45, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"input-group\">\n" + 
"                            <span class=\"input-group-addon\">@</span>\n" + 
"                            <input type=\"text\" id=\"weibo\" name=\"weibo\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 45, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.weibo"));// line 50, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 50, japidviews\Application\profile\SocialMedia.html
		p(m.weibo);// line 50, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"\n" + 
"\n" + 
"                        <label class=\"control-label\" for=\"twitter\">");// line 50, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.twitter"));// line 54, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"input-group\">\n" + 
"                            <span class=\"input-group-addon\">@</span>\n" + 
"                            <input type=\"text\" id=\"twitter\" name=\"twitter\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 54, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.twitter"));// line 59, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 59, japidviews\Application\profile\SocialMedia.html
		p(m.twitter);// line 59, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                        <label class=\"control-label\" for=\"facebook\">");// line 59, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.facebook"));// line 61, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"facebook\" name=\"facebook\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 61, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.facebook"));// line 65, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 65, japidviews\Application\profile\SocialMedia.html
		p(m.facebook);// line 65, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                        <label class=\"control-label\" for=\"flickr\">");// line 65, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.flickr"));// line 67, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"flickr\" name=\"flickr\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 67, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.flickr"));// line 71, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 71, japidviews\Application\profile\SocialMedia.html
		p(m.flickr);// line 71, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                        <label class=\"control-label\" for=\"fengniao\">");// line 71, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.fengniao"));// line 73, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"fengniao\" name=\"fengniao\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 73, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.fengniao"));// line 77, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 77, japidviews\Application\profile\SocialMedia.html
		p(m.fengniao);// line 77, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                        <!--      <div class=\"form-group\">\n" + 
"                                  <label class=\"control-label\" for=\"renren\">");// line 77, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.renren"));// line 80, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                                  <div class=\"controls\">\n" + 
"                                      <input type=\"text\" id=\"renren\" name=\"renren\" class=\" form-control col-lg-9\"\n" + 
"                                             placeholder=\"");// line 80, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.renren"));// line 84, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 84, japidviews\Application\profile\SocialMedia.html
		p(m.renren);// line 84, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                                  </div>\n" + 
"                              </div>-->\n" + 
"                        <label class=\"control-label\" for=\"douban\">");// line 84, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.douban"));// line 87, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"douban\" name=\"douban\" class=\" form-control col-lg-9\"\n" + 
"                                   placeholder=\"");// line 87, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.douban"));// line 91, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 91, japidviews\Application\profile\SocialMedia.html
		p(m.douban);// line 91, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"form-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn btn-default\">\n" + 
"                                ");// line 91, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("save.change"));// line 97, japidviews\Application\profile\SocialMedia.html
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
"\n");// line 97, japidviews\Application\profile\SocialMedia.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("notify.title"));;
	}
	@Override protected void header() {
		p( "Email Notifications");;
	}
}