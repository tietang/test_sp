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


	public Notification() {
		super(null);
	}
	public Notification(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"checks",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"boolean[]",  };
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

	private boolean[] checks; // line 2, japidviews/Application/profile/Notification.html
	public cn.bran.japid.template.RenderResult render(boolean[] checks) {
		this.checks = checks;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2, japidviews/Application/profile/Notification.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(boolean[] checks) {
		return new Notification().render(checks);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\profile\Notification.html
p("\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 4, japidviews\Application\profile\Notification.html
		final SettingsMenu _SettingsMenu2 = new SettingsMenu(getOut()); _SettingsMenu2.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu2.render("Notifications"); // line 10, japidviews\Application\profile\Notification.html// line 10, japidviews\Application\profile\Notification.html
		p("        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row-fluid well profile_right\">\n" + 
"            <div class=\"span8  \">\n" + 
"\n" + 
"                <form class=\"form-horizontal\" action=\"/settings/notification/done\" method=\"post\">\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"commented_on_your_wall\">\n" + 
"                            <input  id=\"commented_on_your_wall\"\n" + 
"                                    name=\"notify1\" type=\"checkbox\" value=\"1\" ");// line 10, japidviews\Application\profile\Notification.html
		final NotifyChecked _NotifyChecked3 = new NotifyChecked(getOut()); _NotifyChecked3.setActionRunners(getActionRunners()).setOut(getOut()); _NotifyChecked3.render(checks,1); // line 22, japidviews\Application\profile\Notification.html// line 22, japidviews\Application\profile\Notification.html
		p("/>\n" + 
"                            ");// line 22, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.comment.wall"));// line 23, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"commented_on_your_photo\">\n" + 
"                            <input\n" + 
"                                    checked=\"checked\" id=\"commented_on_your_photo\"\n" + 
"                                    name=\"notify2\" type=\"checkbox\" value=\"2\"/>\n" + 
"                            ");// line 23, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.comment.photo"));// line 30, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"commented_on_your_story\">\n" + 
"                            <input\n" + 
"                                    checked=\"checked\" id=\"commented_on_your_story\"\n" + 
"                                    name=\"notify3\" type=\"checkbox\" value=\"3\"/>\n" + 
"                            ");// line 30, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.comment.story"));// line 38, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"added_to_favorites\">\n" + 
"                            <input checked=\"checked\"\n" + 
"                                   id=\"added_to_favorites\" name=\"notify4\"\n" + 
"                                   type=\"checkbox\" value=\"4\"/>\n" + 
"                            ");// line 38, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.favorite.photo"));// line 46, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"selected_by_editor\">\n" + 
"                            <input checked=\"checked\"\n" + 
"                                   id=\"selected_by_editor\" name=\"notify5\"\n" + 
"                                   type=\"checkbox\" value=\"5\"/>\n" + 
"                            ");// line 46, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.choice.photo"));// line 54, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"reached_up_or_pop\">\n" + 
"                            <input checked=\"checked\"\n" + 
"                                   id=\"reached_up_or_pop\" name=\"notify6\" type=\"checkbox\"\n" + 
"                                   value=\"6\"/>\n" + 
"                            ");// line 54, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.score.up"));// line 62, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"you_are_followed\">\n" + 
"                            <input checked=\"checked\"\n" + 
"                                   id=\"you_are_followed\" name=\"notify7\" type=\"checkbox\"\n" + 
"                                   value=\"7\"/>\n" + 
"                            ");// line 62, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.follow.me"));// line 70, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"got_comments_reply\">\n" + 
"                            <input\n" + 
"                                    id=\"got_comments_reply\" name=\"notify8\"\n" + 
"                                    type=\"checkbox\" value=\"8\"/>\n" + 
"                            ");// line 70, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.subscribed"));// line 78, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"buys_my_photo\">\n" + 
"                            <input checked=\"checked\"\n" + 
"                                   id=\"buys_my_photo\" name=\"notify9\" type=\"checkbox\"\n" + 
"                                   value=\"9\"/>\n" + 
"                            ");// line 78, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.buy.photo"));// line 86, japidviews\Application\profile\Notification.html
		p(" </label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"newsletters\">\n" + 
"                            <input checked=\"checked\"\n" + 
"                                   id=\"newsletters\" name=\"notify10\" type=\"checkbox\" value=\"10\"/>\n" + 
"                            ");// line 86, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.news"));// line 93, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"checkbox control-group\">\n" + 
"                        <label for=\"account_updates\">\n" + 
"                            <input checked=\"checked\"\n" + 
"                                   id=\"account_updates\" name=\"notify11\" type=\"checkbox\"\n" + 
"                                   value=\"11\"/>\n" + 
"                            ");// line 93, japidviews\Application\profile\Notification.html
		;p(getMessage("notify.account.change"));// line 101, japidviews\Application\profile\Notification.html
		p("</label>\n" + 
"                    </div>\n" + 
"\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <div class=\"controls\">\n" + 
"                            <button type=\"submit\" class=\"btn\">\n" + 
"                                ");// line 101, japidviews\Application\profile\Notification.html
		;p(getMessage("save.change"));// line 107, japidviews\Application\profile\Notification.html
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
"\n");// line 107, japidviews\Application\profile\Notification.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("notify.title"));;
	}
	@Override protected void header() {
		p( "Email Notifications");;
	}
}