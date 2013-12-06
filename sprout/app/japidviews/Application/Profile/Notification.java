//version: 0.9.37
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
// NOTE: This file was generated from: japidviews/Application/profile/Notification.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Notification extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/Notification.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
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


	public Notification() {
	super((StringBuilder)null);
	initHeaders();
	}
	public Notification(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public Notification(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"checks",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Notification.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String checks; // line 3, japidviews/Application/profile/Notification.html
	public cn.bran.japid.template.RenderResult render(String checks) {
		this.checks = checks;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 3, japidviews/Application/profile/Notification.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(String checks) {
		return new Notification().render(checks);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
p("\n");// line 1, japidviews\Application\profile\Notification.html

p("\n" + 
"\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 5, japidviews\Application\profile\Notification.html
		new SettingsMenu(Notification.this).render("Notifications"); // line 11, japidviews\Application\profile\Notification.html// line 11, japidviews\Application\profile\Notification.html
		p("\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row-fluid well profile_right\">\n" + 
"            <div class=\"span8  \">\n" + 
"\n" + 
"                <form id=\"notifyForm\" class=\"form-horizontal\" action=\"/settings/notification/done\" method=\"post\">\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"commented_on_your_wall\">\n" + 
"                            <input  id=\"commented_on_your_wall\"\n" + 
"                                    name=\"notify1\" type=\"checkbox\" value=\"1\"  />\n" + 
"                            ");// line 11, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.comment.wall"));// line 24, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"commented_on_your_photo\">\n" + 
"                            <input\n" + 
"                                     id=\"commented_on_your_photo\"\n" + 
"                                    name=\"notify2\" type=\"checkbox\" value=\"2\"/>\n" + 
"                            ");// line 24, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.comment.photo"));// line 31, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"commented_on_your_story\">\n" + 
"                            <input\n" + 
"                                     id=\"commented_on_your_story\"\n" + 
"                                    name=\"notify3\" type=\"checkbox\" value=\"3\"/>\n" + 
"                            ");// line 31, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.comment.story"));// line 39, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"added_to_favorites\">\n" + 
"                            <input \n" + 
"                                   id=\"added_to_favorites\" name=\"notify4\"\n" + 
"                                   type=\"checkbox\" value=\"4\"/>\n" + 
"                            ");// line 39, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.favorite.photo"));// line 47, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"selected_by_editor\">\n" + 
"                            <input \n" + 
"                                   id=\"selected_by_editor\" name=\"notify5\"\n" + 
"                                   type=\"checkbox\" value=\"5\"/>\n" + 
"                            ");// line 47, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.choice.photo"));// line 55, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"reached_up_or_pop\">\n" + 
"                            <input \n" + 
"                                   id=\"reached_up_or_pop\" name=\"notify6\" type=\"checkbox\"\n" + 
"                                   value=\"6\"/>\n" + 
"                            ");// line 55, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.score.up"));// line 63, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"you_are_followed\">\n" + 
"                            <input \n" + 
"                                   id=\"you_are_followed\" name=\"notify7\" type=\"checkbox\"\n" + 
"                                   value=\"7\"/>\n" + 
"                            ");// line 63, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.follow.me"));// line 71, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"got_comments_reply\">\n" + 
"                            <input\n" + 
"                                    id=\"got_comments_reply\" name=\"notify8\"\n" + 
"                                    type=\"checkbox\" value=\"8\"/>\n" + 
"                            ");// line 71, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.subscribed"));// line 79, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"buys_my_photo\">\n" + 
"                            <input \n" + 
"                                   id=\"buys_my_photo\" name=\"notify9\" type=\"checkbox\"\n" + 
"                                   value=\"9\"/>\n" + 
"                            ");// line 79, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.buy.photo"));// line 87, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"newsletters\">\n" + 
"                            <input \n" + 
"                                   id=\"newsletters\" name=\"notify10\" type=\"checkbox\" value=\"10\"/>\n" + 
"                            ");// line 87, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.news"));// line 94, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"account_updates\">\n" + 
"                            <input \n" + 
"                                   id=\"account_updates\" name=\"notify11\" type=\"checkbox\"\n" + 
"                                   value=\"11\"/>\n" + 
"                            ");// line 94, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.account.change"));// line 102, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn\">\n" + 
"                                ");// line 102, japidviews\Application\profile\Notification.html
		;p(getMessage("save.change"));// line 108, japidviews\Application\profile\Notification.html
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
"<script type=\"text/javascript\">\n" + 
"    var checks=\"");// line 108, japidviews\Application\profile\Notification.html
		p(checks);// line 121, japidviews\Application\profile\Notification.html
		p("\";\n" + 
"    $(\"#notifyForm\").find(\":checkbox\").each(function(i){\n" + 
"        var index=checks.length-this.value;\n" + 
"        if(checks.charAt(index)==1){\n" + 
"            $(this).attr(\"checked\",\"checked\");\n" + 
"        }\n" + 
"    });\n" + 
"</script>\n" + 
"\n");// line 121, japidviews\Application\profile\Notification.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("notify.title"));;
	}
	@Override protected void header() {
		p( "Email Notifications");;
	}
}