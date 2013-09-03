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
// NOTE: This file was generated from: japidviews/Application/Profile/Notification.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Notification extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/Profile/Notification.html";
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
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Profile.Notification.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/Profile/Notification.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Notification().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\Profile\Notification.html
p("\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"	<div class=\"col col_3 \">\n" + 
"		<div class=\"sidebar-nav \">\n" + 
"			");// line 3, japidviews\Application\Profile\Notification.html
		final SettingsMenu _SettingsMenu2 = new SettingsMenu(getOut()); _SettingsMenu2.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu2.render("Notifications"); // line 9, japidviews\Application\Profile\Notification.html// line 9, japidviews\Application\Profile\Notification.html
		p("		</div>\n" + 
"	</div>\n" + 
"	<div class=\"col col_13 \">\n" + 
"		<div class=\"row-fluid well profile_right\">\n" + 
"			<div class=\"span8  \">\n" + 
"\n" + 
"				<form class=\"form-horizontal\" action=\"/settings/notification/done\" method=\"post\" >\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"commented_on_your_wall\">\n" + 
"							<input\n" + 
"							checked=\"checked\" id=\"commented_on_your_wall\"\n" + 
"							name=\"commented_on_your_wall\" type=\"checkbox\" value=\"on\" />\n" + 
"							");// line 9, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.comment.wall"));// line 23, japidviews\Application\Profile\Notification.html
		p(" </label>\n" + 
"					</div>\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"commented_on_your_photo\">\n" + 
"							<input\n" + 
"							checked=\"checked\" id=\"commented_on_your_photo\"\n" + 
"							name=\"commented_on_your_photo\" type=\"checkbox\" value=\"on\" />\n" + 
"							");// line 23, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.comment.photo"));// line 30, japidviews\Application\Profile\Notification.html
		p(" </label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"commented_on_your_story\">\n" + 
"							<input\n" + 
"							checked=\"checked\" id=\"commented_on_your_story\"\n" + 
"							name=\"commented_on_your_story\" type=\"checkbox\" value=\"on\" />\n" + 
"							");// line 30, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.comment.story"));// line 38, japidviews\Application\Profile\Notification.html
		p(" </label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"added_to_favorites\">\n" + 
"							<input checked=\"checked\"\n" + 
"							id=\"added_to_favorites\" name=\"added_to_favorites\"\n" + 
"							type=\"checkbox\" value=\"on\" />\n" + 
"							");// line 38, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.favorite.photo"));// line 46, japidviews\Application\Profile\Notification.html
		p(" </label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"selected_by_editor\">\n" + 
"							<input checked=\"checked\"\n" + 
"							id=\"selected_by_editor\" name=\"selected_by_editor\"\n" + 
"							type=\"checkbox\" value=\"on\" />\n" + 
"							");// line 46, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.choice.photo"));// line 54, japidviews\Application\Profile\Notification.html
		p("</label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"reached_up_or_pop\">\n" + 
"							<input checked=\"checked\"\n" + 
"							id=\"reached_up_or_pop\" name=\"reached_up_or_pop\" type=\"checkbox\"\n" + 
"							value=\"on\" />\n" + 
"							");// line 54, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.score.up"));// line 62, japidviews\Application\Profile\Notification.html
		p("</label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"you_are_followed\">\n" + 
"							<input checked=\"checked\"\n" + 
"							id=\"you_are_followed\" name=\"you_are_followed\" type=\"checkbox\"\n" + 
"							value=\"on\" />\n" + 
"							");// line 62, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.follow.me"));// line 70, japidviews\Application\Profile\Notification.html
		p(" </label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"got_comments_reply\">\n" + 
"							<input\n" + 
"							id=\"got_comments_reply\" name=\"got_comments_reply\"\n" + 
"							type=\"checkbox\" value=\"on\" />\n" + 
"							");// line 70, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.subscribed"));// line 78, japidviews\Application\Profile\Notification.html
		p("</label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"buys_my_photo\">\n" + 
"							<input checked=\"checked\"\n" + 
"							id=\"buys_my_photo\" name=\"buys_my_photo\" type=\"checkbox\"\n" + 
"							value=\"on\" />\n" + 
"							");// line 78, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.buy.photo"));// line 86, japidviews\Application\Profile\Notification.html
		p(" </label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"newsletters\">\n" + 
"							<input checked=\"checked\"\n" + 
"							id=\"newsletters\" name=\"newsletters\" type=\"checkbox\" value=\"on\" />\n" + 
"							");// line 86, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.news"));// line 93, japidviews\Application\Profile\Notification.html
		p("</label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"checkbox control-group\">\n" + 
"						<label for=\"account_updates\">\n" + 
"							<input checked=\"checked\"\n" + 
"							id=\"account_updates\" name=\"account_updates\" type=\"checkbox\"\n" + 
"							value=\"on\" />\n" + 
"							");// line 93, japidviews\Application\Profile\Notification.html
		;p(getMessage("notify.account.change"));// line 101, japidviews\Application\Profile\Notification.html
		p("</label>\n" + 
"					</div>\n" + 
"\n" + 
"					<div class=\"control-group\">\n" + 
"						<div class=\"controls\">\n" + 
"							<button type=\"submit\" class=\"btn\">\n" + 
"								");// line 101, japidviews\Application\Profile\Notification.html
		;p(getMessage("save.change"));// line 107, japidviews\Application\Profile\Notification.html
		p("							</button>\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</form>\n" + 
"\n" + 
"			</div>\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"</div>\n" + 
"\n");// line 107, japidviews\Application\Profile\Notification.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("notify.title"));;
	}
	@Override protected void header() {
		p( "Email Notifications");;
	}
}