package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.UserPwd;
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
// NOTE: This file was generated from: japidviews/Application/Login.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Login extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/Login.html";
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


	public Login() {
		super(null);
	}
	public Login(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Login.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/Login.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Login().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\Login.html
// line 5, japidviews\Application\Login.html
		p("<div class=\"grid_row signupx\">\n" + 
"\n" + 
"	<div class=\"col col_16\" >\n" + 
"		<p>\n" + 
"			<h4>Log in with your account</h4>\n" + 
"		</p>\n" + 
"	</div>\n" + 
"\n" + 
"	<div class=\"col col_16\" >\n" + 
"\n" + 
"		<div id=\"login\"   class=\" 	cardx\">\n" + 
"			<div class=\"col left_form rigth_line\" >\n" + 
"				<form class=\"form-horizontal\"  method=\"post\" action=\"/login");// line 13, japidviews\Application\Login.html
		p(flash.get("cpage"));// line 27, japidviews\Application\Login.html
		p("\">\n" + 
"					<div class=\"form-group\">\n" + 
"						No account yet? <a href=\"/signup\">Sign up</a>\n" + 
"					</div>\n" + 
"					");// line 27, japidviews\Application\Login.html
		final ErrorMessage _ErrorMessage3 = new ErrorMessage(getOut()); _ErrorMessage3.setActionRunners(getActionRunners()).setOut(getOut()); _ErrorMessage3.render(); // line 31, japidviews\Application\Login.html// line 31, japidviews\Application\Login.html
		p("					<p class=\"form-group \">\n" + 
"						<label for=\"inputEmail\">	Login with your username or email:</label>\n" + 
"						<input type=\"text\" name=\"email\" id=\"inputEmail\" placeholder=\"Email or Username\" value=\"");// line 31, japidviews\Application\Login.html
		p(flash.get("email"));// line 34, japidviews\Application\Login.html
		p("\" class=\"input form-control\"/>\n" + 
"					</p>\n" + 
"					<p class=\"form-group \">\n" + 
"						<label for=\"inputPassword\">Input your password:</label>\n" + 
"						<input type=\"password\" name=\"password\" id=\"inputPassword\" placeholder=\"Password\" class=\"input form-control\" alt=\"\"/>\n" + 
"					</p>\n" + 
"					<div class=\"input_control_group\">\n" + 
"						<small class=\"left terms\"><a href=\"/recover\" target=\"_\">Can't access your account?</a></small>\n" + 
"						<button type=\"submit\" class=\"btn btn-primary\">\n" + 
"							Login\n" + 
"						</button>\n" + 
"					</div>\n" + 
"\n" + 
"				</form>\n" + 
"\n" + 
"			</div>\n" + 
"			<div class=\"col right_form  \" >\n" + 
"				<div class=\"cell\">\n" + 
"					<div>\n" + 
"\n" + 
"						<span id=\"qqLoginBtn\" class=\"qqLoginBtn\">Log in with QQ</span>\n" + 
"						<script type=\"text/javascript\">\n" + 
"							QC.Login({\n" + 
"								btnId : \"qqLoginBtn\", //插入按钮的节点id\n" + 
"								size : 'A_L'\n" + 
"							});\n" + 
"						</script>\n" + 
"					</div>\n" + 
"					<p></p>\n" + 
"					<div>\n" + 
"\n" + 
"						<span id=\"wb_connect_btn\"  class=\"wb_connect_btn\">Log in with Weibo</span>\n" + 
"\n" + 
"						<script type=\"text/javascript\">\n" + 
"							WB2.anyWhere(function(W) {\n" + 
"								W.widget.connectButton({\n" + 
"									id : \"wb_connect_btn\",\n" + 
"									type : '2,3',\n" + 
"									callback : {\n" + 
"										login : function(o) {//登录后的回调函数\n" + 
"											alert(\"login: \" + o.screen_name)\n" + 
"										},\n" + 
"										logout : function() {//退出后的回调函数\n" + 
"											alert('logout');\n" + 
"										}\n" + 
"									}\n" + 
"								});\n" + 
"							});\n" + 
"\n" + 
"						</script>\n" + 
"					</div>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"</div>");// line 34, japidviews\Application\Login.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy Log in Page");;
	}
	@Override protected void css() {
		// line 5, japidviews\Application\Login.html
		p("<script src=\"");// line 5, japidviews\Application\Login.html
		p(lookupStatic("/public/js/jquery.validate.js"));// line 7, japidviews\Application\Login.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 7, japidviews\Application\Login.html
		p(lookupStatic("/public/js/additional-methods.js"));// line 8, japidviews\Application\Login.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 8, japidviews\Application\Login.html
		p(lookupStatic("/public/js/jquery.validate.localization/messages_cn.js"));// line 9, japidviews\Application\Login.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 9, japidviews\Application\Login.html
		p(lookupStatic("/public/app/signup.js"));// line 10, japidviews\Application\Login.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script type=\"text/javascript\" src=\"http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js\" data-appid=\"100229030\" charset=\"utf-8\"></script>\n" + 
"<script src=\" http://tjs.sjs.sinajs.cn/open/api/js/wb.js?appkey=3168919025\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");// line 10, japidviews\Application\Login.html
		;
	}
	@Override protected void header() {
		p(" Log in ");;
	}
}