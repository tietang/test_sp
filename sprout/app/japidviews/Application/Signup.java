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
// NOTE: This file was generated from: japidviews/Application/Signup.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Signup extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/Signup.html";
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


	public Signup() {
		super(null);
	}
	public Signup(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"up",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"UserPwd",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Signup.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private UserPwd up; // line 3, japidviews/Application/Signup.html
	public cn.bran.japid.template.RenderResult render(UserPwd up) {
		this.up = up;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 3, japidviews/Application/Signup.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(UserPwd up) {
		return new Signup().render(up);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\Signup.html
// line 6, japidviews\Application\Signup.html
		p("<div class=\"grid_row signupx\">\n" + 
"\n" + 
"	<div class=\"col col_16\">\n" + 
"		<p>\n" + 
"			<h4>Create a account</h4>\n" + 
"		</p>\n" + 
"	</div>\n" + 
"\n" + 
"	<div class=\"col col_16\" >\n" + 
"\n" + 
"		<div id=\"login\"   class=\" 	cardx\">\n" + 
"			<div class=\"col left_form rigth_line\" >\n" + 
"				<form action=\"/signup/done\" method=\"post\" id=\"signUpForm\" class=\"form \">\n" + 
"					");// line 16, japidviews\Application\Signup.html
		if(asBoolean(asBoolean(flash.get("error")))) {// line 31, japidviews\Application\Signup.html
		p("\n" + 
"					<div class=\"alert alert-error\">\n" + 
"						<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n" + 
"							&times;\n" + 
"						</button>\n" + 
"						");// line 31, japidviews\Application\Signup.html
		p(flash.get("error"));// line 37, japidviews\Application\Signup.html
		p("					</div>\n" + 
"\n" + 
"					");// line 37, japidviews\Application\Signup.html
		}// line 40, japidviews\Application\Signup.html
		p("					<p class=\"control-group \">\n" + 
"						<label for=\"username\">User Name</label>\n" + 
"						<input id=\"username\" name=\"username\" type=\"text\" placeholder=\"User Name\" value=\"");// line 40, japidviews\Application\Signup.html
		p(up.userName);// line 43, japidviews\Application\Signup.html
		p("\" class=\"input\"/>\n" + 
"					</p>\n" + 
"					<p class=\"control-group \">\n" + 
"						<label for=\"email\">Email</label>\n" + 
"						<input id=\"email\" name=\"email\" type=\"email\" placeholder=\"Email\" value=\"");// line 43, japidviews\Application\Signup.html
		p(up.email);// line 47, japidviews\Application\Signup.html
		p("\" class=\"input\"/>\n" + 
"					</p>\n" + 
"					<p class=\"control-group \">\n" + 
"						<label for=\"password\">Password</label>\n" + 
"						<input id=\"password\" name=\"password\" type=\"password\" placeholder=\"Password\"  class=\"input\"/>\n" + 
"					</p>\n" + 
"					<p class=\"control-group \">\n" + 
"						<label for=\"confirm_password\">Confirm Password</label>\n" + 
"						<input id=\"confirm_password\" name=\"confirm_password\" type=\"password\" placeholder=\"Confirm Password\"  class=\"input\"/>\n" + 
"					</p>\n" + 
"\n" + 
"					<p class=\"control-group \">\n" + 
"\n" + 
"						<label for=\"agree\" class=\"checkbox inline\">\n" + 
"							<input type=\"checkbox\" class=\"checkbox\" id=\"agree\" name=\"agree\" checked=\"checked\" />\n" + 
"							Please agree to our policy </label>\n" + 
"\n" + 
"					</p>\n" + 
"\n" + 
"					<p>\n" + 
"						<button type=\"submit\"  class=\"btn  btn-large \" >\n" + 
"							Submit\n" + 
"						</button>\n" + 
"					</p>\n" + 
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
"</div>");// line 47, japidviews\Application\Signup.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy Sign Up Page");;
	}
	@Override protected void css() {
		// line 6, japidviews\Application\Signup.html
		p(" \n" + 
"\n" + 
"<script src=\"");// line 6, japidviews\Application\Signup.html
		p(lookupStatic("/public/js/jquery.validate.js"));// line 10, japidviews\Application\Signup.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 10, japidviews\Application\Signup.html
		p(lookupStatic("/public/js/additional-methods.js"));// line 11, japidviews\Application\Signup.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 11, japidviews\Application\Signup.html
		p(lookupStatic("/public/js/jquery.validate.localization/messages_cn.js"));// line 12, japidviews\Application\Signup.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 12, japidviews\Application\Signup.html
		p(lookupStatic("/public/app/signup.js"));// line 13, japidviews\Application\Signup.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script type=\"text/javascript\" src=\"http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js\" data-appid=\"100229030\" charset=\"utf-8\"></script>\n" + 
"<script src=\" http://tjs.sjs.sinajs.cn/open/api/js/wb.js?appkey=3168919025\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");// line 13, japidviews\Application\Signup.html
		;
	}
	@Override protected void header() {
		p(" Sign Up ");;
	}
}