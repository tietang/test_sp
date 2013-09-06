package japidviews._layouts;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static japidviews._javatags.Pic.*;
import japidviews._layouts.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/_layouts/Layoutx.html
// Change to this file will be lost next time the template file is compiled.
//

public abstract class Layoutx extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/Layoutx.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

	// - add implicit fields with Play

	final Request request = Request.current();
	final Response response = Response.current();
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(
			validation);
	final play.Play _play = new play.Play();

	// - end of implicit fields with Play 

	public Layoutx() {
		super(null);
	}

	public Layoutx(StringBuilder out) {
		super(out);
	}

	@Override
	public void layout() {
		beginDoLayout(sourceTemplate);
		p("<!DOCTYPE html>\n");// line 1
		p("<html lang=\"en\">\n" +
				"	<head>\n" +
				"		<meta charset=\"UTF-8\">\n" +
				"		<title>");// line 2
		title();
		p("</title>\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 6
		p(lookupStatic("/public/basic/css/reset.css"));// line 7
		p("\" type=\"text/css\"  />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 7
		p(lookupStatic("/public/basic/css/css3.css"));// line 8
		p("\"  type=\"text/css\" media=\"screen\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 8
		p(lookupStatic("/public/basic/css/general.css"));// line 9
		p("\"  type=\"text/css\" media=\"screen\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 9
		p(lookupStatic("/public/basic/css/grid1200.css"));// line 10
		p("\" type=\"text/css\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 10
		p(lookupStatic("/public/basic/css/onepcssgrid.css"));// line 11
		p("\" type=\"text/css\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 11
		p(lookupStatic("/public/basic/css/fluid12.css"));// line 12
		p("\" type=\"text/css\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 12
		p(lookupStatic("/public/basic/css/app.css"));// line 13
		p("\" type=\"text/css\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 13
		p(lookupStatic("/public/basic/css/wb3.css"));// line 14
		p("\" type=\"text/css\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 14
		p(lookupStatic("/public/basic/css/wb3_nav.css"));// line 15
		p("\" type=\"text/css\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 15
		p(lookupStatic("/public/basic/css/button.css"));// line 16
		p("\" type=\"text/css\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 16
		p(lookupStatic("/public/basic/css/form.css"));// line 17
		p("\" type=\"text/css\" />\n" +
				"		<link rel=\"stylesheet\" href=\"");// line 17
		p(lookupStatic("/public/basic/css/paging.css"));// line 18
		p("\" type=\"text/css\" />\n" +
				"		<!--[if (gte IE 6)&(lte IE 8)]>\n" +
				"		<script src=\"");// line 18
		p(lookupStatic("/public/basic/js/selectivizr.js"));// line 20
		p("\"></script>\n" +
				"		<![endif]-->\n" +
				"		<script src=\"");// line 20
		p(lookupStatic("/public/js/jquery-1.10.1.js"));// line 22
		p("\"></script>\n" +
				"		<script src=\"");// line 22
		p(lookupStatic("/public/js/jquery-migrate-1.2.1.js"));// line 23
		p("\"></script>\n" +
				"		<script src=\"");// line 23
		p(lookupStatic("/public/basic/js/modernizr-1.7.min.js"));// line 24
		p("\"></script><!-- this is the javascript allowing html5 to run in older browsers -->\n"
				+
				"		");// line 24
		css();
		p("		\n" +
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
				"							");// line 25
		if (session.get(Admin.SESSION_LOGIN_KEY) == null) {// line 59
			p("\n"
					+
					"							<div class=\"nav right\">\n"
					+
					"								<a class=\"btn btn-small btn-primary\" href=\"/login\">Login</a>\n"
					+
					"							</div>	\n"
					+
					"							<div class=\"nav right\">\n"
					+
					"								<a class=\"btn btn-small btn-success\" href=\"/signup\">Sign Up</a>\n"
					+
					"							</div>\n" +
					"							");// line 59
		} else {// line 67
			p("							<div class=\"nav right\" >\n"
					+
					"								<a class=\"btn btn-primary btn-small\" href=\"/yours\"> ");// line 67
			try {
				p(session.get(Admin.SESSION_USER_NAME_KEY));
			} catch (NullPointerException npe) {
			}// line 69
			p("</a>\n"
					+
					"\n"
					+
					"							</div>\n"
					+
					"							<div class=\"nav right\">\n"
					+
					"								<a class=\"btn btn-success btn-small\" href=\"#\">Add</a>\n"
					+
					"							</div>\n" +
					"\n" +
					"							");// line 69
		}// line 76
		p("							<div class=\"nav right\">\n"
				+
				"								<form class=\"navbar_search\" action=\"\">\n"
				+
				"									<input type=\"text\" class=\"search-query \" placeholder=\"Search\">\n"
				+
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
				"		<h3>");// line 76
		header();
		p("</h3>\n" +
				"		</div> -->\n" +
				"\n" +
				"		");// line 92
		doLayout();// line 95
		p("		<footer>\n" +
				"			<div class=\"row\">\n" +
				"				<div class=\"col col_16\">\n" +
				"					fjdslfjsdl积分电流声开放的；是\n" +
				"				</div>\n" +
				"			</div><div class=\"clear\"></div>\n" +
				"\n" +
				"		</footer>\n" +
				"	</body>\n" +
				"</html>\n");// line 95
		endDoLayout(sourceTemplate);
	}

	protected void title() {
	};

	protected void header() {
	};

	protected void css() {
	};

	protected abstract void doLayout();
}
