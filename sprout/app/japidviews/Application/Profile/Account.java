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
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/profile/Account.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Account extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/Account.html";
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


	public Account() {
	super((StringBuilder)null);
	initHeaders();
	}
	public Account(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public Account(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Account.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/Application/profile/Account.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Account().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, japidviews\Application\profile\Account.html

// line 2, japidviews\Application\profile\Account.html
		p("\n" + 
"\n");// line 5, japidviews\Application\profile\Account.html
		p("\n" + 
"\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"	<div class=\"col col_3 \">\n" + 
"		<div class=\"sidebar-nav \">\n" + 
"			");// line 7, japidviews\Application\profile\Account.html
		new SettingsMenu(Account.this).render("Account"); // line 13, japidviews\Application\profile\Account.html// line 13, japidviews\Application\profile\Account.html
		p("\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div class=\"col col_13 \">\n" + 
"		<div class=\"row-fluid well profile_right\">\n" + 
"			<div class=\"span8  \">\n" + 
"\n" + 
"				<form class=\"form-horizontal\">\n" + 
"					<span id=\"qqLoginBtn\"></span>\n" + 
"					<script type=\"text/javascript\">\n" + 
"						QC.Login({\n" + 
"							btnId : \"qqLoginBtn\" //���밴ť�Ľڵ�id\n" + 
"						});\n" + 
"					</script>\n" + 
"\n" + 
"					<div id=\"wb_connect_btn\"></div>\n" + 
"					<script type=\"text/javascript\">\n" + 
"						WB2.anyWhere(function(W) {\n" + 
"							W.widget.connectButton({\n" + 
"								id : \"wb_connect_btn\",\n" + 
"								type : '3,2',\n" + 
"								callback : {\n" + 
"									login : function(o) {\n" + 
"										alert(o.screen_name)\n" + 
"									},\n" + 
"									logout : function() {\n" + 
"										alert('logout');\n" + 
"									}\n" + 
"								}\n" + 
"							});\n" + 
"						});\n" + 
"					</script>\n" + 
"\n" + 
"					<div class=\"control-group\">\n" + 
"						<div class=\"controls\">\n" + 
"							<button type=\"submit\" class=\"btn\">\n" + 
"								Save change\n" + 
"							</button>\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</form>\n" + 
"\n" + 
"			</div>\n" + 
"			<div class=\"span5\"></div>\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"</div>\n" + 
"\n");// line 13, japidviews\Application\profile\Account.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy Home Page");;
	}
	@Override protected void header() {
		p("Account");;
	}
	@Override protected void css() {
		// line 2, japidviews\Application\profile\Account.html
		p("<script src=\" http://tjs.sjs.sinajs.cn/open/api/js/wb.js?appkey=3168919025\" type=\"text/javascript\" charset=\"utf-8\"></script>\n" + 
"<script type=\"text/javascript\" src=\"http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js\" data-appid=\"APPID\" data-redirecturi=\"REDIRECTURI\" charset=\"utf-8\"></script>\n");// line 2, japidviews\Application\profile\Account.html
		;
	}
}