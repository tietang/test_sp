//version: 0.9.35
package japidviews.Application.profile;
import fengfei.ucm.entity.profile.UserSocial;

import static cn.bran.play.JapidPlayAdapter.*;

import japidviews._tags.*;

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
"        <div class=\"row-fluid well profile_right\">\n" + 
"            <div class=\"span8  \">\n" + 
"\n" + 
"                <form id=\"socialMediaForm\" class=\"\" action=\"/settings/socialmedia/done\" method=\"post\">\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"website\">");// line 11, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.website"));// line 21, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"website\" name=\"website\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 21, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.website"));// line 25, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 25, japidviews\Application\profile\SocialMedia.html
		p(m.web_site);// line 25, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"qq\">");// line 25, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq"));// line 29, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"qq\" name=\"qq\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 29, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq"));// line 33, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 33, japidviews\Application\profile\SocialMedia.html
		p(m.qq);// line 33, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"qq_weibo\">");// line 33, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq.weibo"));// line 37, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"\n" + 
"                        <div class=\"controls input-prepend\">\n" + 
"                            <div class=\"input-prepend span12\">\n" + 
"                                <span class=\"add-on\">@</span>\n" + 
"                                <input type=\"text\" id=\"qq_weibo\" name=\"qq_weibo\" class=\"input input-block-level span12\"\n" + 
"                                       placeholder=\"");// line 37, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.qq.weibo"));// line 44, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 44, japidviews\Application\profile\SocialMedia.html
		p(m.qq_weibo);// line 44, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                            </div>\n" + 
"\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"weibo\">");// line 44, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.weibo"));// line 50, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"weibo\" name=\"weibo\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 50, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.weibo"));// line 54, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 54, japidviews\Application\profile\SocialMedia.html
		p(m.weibo);// line 54, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"twitter\">");// line 54, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.twitter"));// line 60, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"twitter\" name=\"twitter\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 60, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.twitter"));// line 64, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 64, japidviews\Application\profile\SocialMedia.html
		p(m.twitter);// line 64, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"facebook\">");// line 64, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.facebook"));// line 68, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"facebook\" name=\"facebook\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 68, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.facebook"));// line 72, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 72, japidviews\Application\profile\SocialMedia.html
		p(m.facebook);// line 72, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"flickr\">");// line 72, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.flickr"));// line 76, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"flickr\" name=\"flickr\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 76, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.flickr"));// line 80, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 80, japidviews\Application\profile\SocialMedia.html
		p(m.flickr);// line 80, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"fengniao\">");// line 80, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.fengniao"));// line 84, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"fengniao\" name=\"fengniao\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 84, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.fengniao"));// line 88, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 88, japidviews\Application\profile\SocialMedia.html
		p(m.fengniao);// line 88, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <!--      <div class=\"control-group\">\n" + 
"                              <label class=\"control-label\" for=\"renren\">");// line 88, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.renren"));// line 92, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                              <div class=\"controls\">\n" + 
"                                  <input type=\"text\" id=\"renren\" name=\"renren\" class=\"input span9\"\n" + 
"                                         placeholder=\"");// line 92, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.renren"));// line 96, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 96, japidviews\Application\profile\SocialMedia.html
		p(m.renren);// line 96, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                              </div>\n" + 
"                          </div>-->\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"douban\">");// line 96, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.douban"));// line 100, japidviews\Application\profile\SocialMedia.html
		p("</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"douban\" name=\"douban\" class=\"input span9\"\n" + 
"                                   placeholder=\"");// line 100, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("social.douban"));// line 104, japidviews\Application\profile\SocialMedia.html
		p("\" value=\"");// line 104, japidviews\Application\profile\SocialMedia.html
		p(m.douban);// line 104, japidviews\Application\profile\SocialMedia.html
		p("\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn\">\n" + 
"                                ");// line 104, japidviews\Application\profile\SocialMedia.html
		;p(getMessage("save.change"));// line 110, japidviews\Application\profile\SocialMedia.html
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
"\n");// line 110, japidviews\Application\profile\SocialMedia.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("notify.title"));;
	}
	@Override protected void header() {
		p( "Email Notifications");;
	}
}