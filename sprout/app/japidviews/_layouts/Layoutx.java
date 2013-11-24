//version: 0.9.35
package japidviews._layouts;
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
// NOTE: This file was generated from: japidviews/_layouts/Layoutx.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class Layoutx extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/Layoutx.html";
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


	public Layoutx() {
		super(null);
	}
	public Layoutx(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		beginDoLayout(sourceTemplate);		p("<!DOCTYPE html>\n");// line 1, japidviews\_layouts\Layoutx.html
		p("\n" + 
"<html lang=\"en\">\n" + 
"	<head>\n" + 
"		<meta charset=\"UTF-8\">\n" + 
"		<title>");// line 2, japidviews\_layouts\Layoutx.html
		title();p("</title>\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 6, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/reset.css"));// line 7, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\"  />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 7, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/css3.css"));// line 8, japidviews\_layouts\Layoutx.html
		p("\"  type=\"text/css\" media=\"screen\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 8, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/general.css"));// line 9, japidviews\_layouts\Layoutx.html
		p("\"  type=\"text/css\" media=\"screen\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 9, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/grid1200.css"));// line 10, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 10, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/onepcssgrid.css"));// line 11, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 11, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/fluid12.css"));// line 12, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 12, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/app.css"));// line 13, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 13, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/wb3.css"));// line 14, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 14, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/wb3_nav.css"));// line 15, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 15, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/button.css"));// line 16, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 16, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/form.css"));// line 17, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 17, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/css/paging.css"));// line 18, japidviews\_layouts\Layoutx.html
		p("\" type=\"text/css\" />\n" + 
"		<!--[if (gte IE 6)&(lte IE 8)]>\n" + 
"		<script src=\"");// line 18, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/js/selectivizr.js"));// line 20, japidviews\_layouts\Layoutx.html
		p("\"></script>\n" + 
"		<![endif]-->\n" + 
"		<script src=\"");// line 20, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/js/jquery-1.10.1.js"));// line 22, japidviews\_layouts\Layoutx.html
		p("\"></script>\n" + 
"		<script src=\"");// line 22, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/js/jquery-migrate-1.2.1.js"));// line 23, japidviews\_layouts\Layoutx.html
		p("\"></script>\n" + 
"		<script src=\"");// line 23, japidviews\_layouts\Layoutx.html
		p(lookupStatic("/public/basic/js/modernizr-1.7.min.js"));// line 24, japidviews\_layouts\Layoutx.html
		p("\"></script><!-- this is the javascript allowing html5 to run in older browsers -->\n" + 
"		");// line 24, japidviews\_layouts\Layoutx.html
		css();p("\n" + 
"		\n" + 
"		\n" + 
"	</head>\n" + 
"\n" + 
"	<body>\n" + 
"		<div class=\"header\">\n" + 
"			<div class=\"header_inner\">\n" + 
"				<div class=\"row\">\n" + 
"					<div class=\"col col_16\"  >\n" + 
"\n" + 
"						<div class=\"logo left\" >\n" + 
"							Spruce\n" + 
"						</div>\n" + 
"						<div class=\"nav_bar left\"  >\n" + 
"							<div class=\"nav\" >\n" + 
"								<ul  >\n" + 
"									<li>\n" + 
"										<a href=\"/pop\">Photos</a>\n" + 
"									</li>\n" + 
"									<li>\n" + 
"										<a href=\"/shop\">Shop</a>\n" + 
"									</li>\n" + 
"									<li>\n" + 
"										<a href=\"/blog\">Blog</a>\n" + 
"									</li>\n" + 
"									<li>\n" + 
"										<a href=\"/\">曾经</a>\n" + 
"									</li>\n" + 
"								</ul>\n" + 
"\n" + 
"							</div>\n" + 
"						</div>\n" + 
"						<div class=\"right\">\n" + 
"							");// line 25, japidviews\_layouts\Layoutx.html
		if (session.get(Admin.SESSION_LOGIN_KEY) == null) {// line 59, japidviews\_layouts\Layoutx.html
		p("\n" + 
"\n" + 
"							<div class=\"nav right\">\n" + 
"								<a class=\"btn btn-sm btn-primary\" href=\"/login\">Login</a>\n" + 
"							</div>	\n" + 
"							<div class=\"nav right\">\n" + 
"								<a class=\"btn btn-sm btn-success\" href=\"/signup\">Sign Up</a>\n" + 
"							</div>\n" + 
"							");// line 59, japidviews\_layouts\Layoutx.html
		}else{// line 67, japidviews\_layouts\Layoutx.html
		p("\n" + 
"							<div class=\"nav right\" >\n" + 
"								<a class=\"btn btn-primary btn-sm\" href=\"/yours\"> ");// line 67, japidviews\_layouts\Layoutx.html
		try { p(session.get(Admin.SESSION_USER_NAME_KEY)); } catch (NullPointerException npe) {}// line 69, japidviews\_layouts\Layoutx.html
		p("</a>\n" + 
"\n" + 
"							</div>\n" + 
"							<div class=\"nav right\">\n" + 
"								<a class=\"btn btn-success btn-sm\" href=\"#\">Add</a>\n" + 
"							</div>\n" + 
"\n" + 
"							");// line 69, japidviews\_layouts\Layoutx.html
		}// line 76, japidviews\_layouts\Layoutx.html
		p("\n" + 
"							<div class=\"nav right\">\n" + 
"								<form class=\"navbar_search\" action=\"\">\n" + 
"									<input type=\"text\" class=\"search-query \" placeholder=\"Search\">\n" + 
"								</form>\n" + 
"							</div>\n" + 
"\n" + 
"						</div>\n" + 
"					</div>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"		\n" + 
"\n" + 
"		<!--\n" + 
"		<div class=\"page-header\">\n" + 
"		<h3>");// line 76, japidviews\_layouts\Layoutx.html
		header();p("</h3>\n" + 
"		</div> -->\n" + 
"\n" + 
"		");// line 92, japidviews\_layouts\Layoutx.html
		doLayout();// line 95, japidviews\_layouts\Layoutx.html
		p("\n" + 
"		<footer>\n" + 
"			<div class=\"row\">\n" + 
"				<div class=\"col col_16\">\n" + 
"					fjdslfjsdl积分电流声开放的；是\n" + 
"				</div>\n" + 
"			</div><div class=\"clear\"></div>\n" + 
"\n" + 
"		</footer>\n" + 
"	</body>\n" + 
"</html>\n");// line 95, japidviews\_layouts\Layoutx.html
				endDoLayout(sourceTemplate);	}
	 protected void title() {};
	 protected void header() {};
	 protected void css() {};

	protected abstract void doLayout();
}