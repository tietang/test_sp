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
// NOTE: This file was generated from: japidviews/_layouts/Layout.html
// Change to this file will be lost next time the template file is compiled.
//

public abstract class Layout extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/Layout.html";
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

	public Layout() {
		super(null);
	}

	public Layout(StringBuilder out) {
		super(out);
	}

	@Override
	public void layout() {
		beginDoLayout(sourceTemplate);
		p("<!DOCTYPE html>\n");// line 1
		p("<html lang=\"en\">\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    ");// line 2
		String appName = i18n("web.app.name");// line 6
		String keywords = i18n("web.keywords");// line 7
		String desc = i18n("web.desc");// line 8
		p("    <title>");// line 8
		try {
			p(appName);
		} catch (NullPointerException npe) {
		}// line 9
		p(" / ");// line 9
		title();
		p(" </title>\n" +
				"    <meta name=\"keywords\" content=\"");// line 9
		try {
			p(keywords);
		} catch (NullPointerException npe) {
		}// line 10
		p(",");// line 10
		keywords();
		p("\"/>\n" +
				"    <meta name=\"description\" content=\"");// line 10
		desc();
		p(" ----  ");// line 11
		try {
			p(desc);
		} catch (NullPointerException npe) {
		}// line 11
		p("\"/>\n"
				+
				"    <meta name=\"viewport\" content=\"width=1240, maximum-scale=1.5\"/>\n"
				+
				"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 11
		p(lookupStatic("/public/bootstrap/css/bootstrap.min.css"));// line 13
		p("\">\n" +
				"    <!--\n" +
				"    <link rel=\"stylesheet\" media=\"screen\" 	href=\"");// line 13
		p(lookupStatic("/public/bootstrap/css/bootstrap-responsive.min.css"));// line 15
		p("\">\n" +
				"    -->\n" +
				"    <script src=\"");// line 15
		p(lookupStatic("/public/js/jquery-1.10.2.js"));// line 17
		p("\" type=\"text/javascript\"></script>\n" +
				"    <script src=\"");// line 17
		p(lookupStatic("/public/js/jquery-migrate-1.2.1.js"));// line 18
		p("\" type=\"text/javascript\"></script>\n" +
				"    <script src=\"");// line 18
		p(lookupStatic("/public/blueimp/md5.min.js"));// line 19
		p("\" type=\"text/javascript\"></script>\n" +
				"    <script src=\"");// line 19
		p(lookupStatic("/public/js/jquery.form.js"));// line 20
		p("\" type=\"text/javascript\"></script>\n" +
				"    <script src=\"");// line 20
		p(lookupStatic("/public/bootstrap/js/bootstrap.min.js"));// line 21
		p("\" type=\"text/javascript\"></script>\n" +
				"    <script src=\"");// line 21
		p(lookupStatic("/public/js/jquery.easing.1.3.min.js"));// line 22
		p("\" type=\"text/javascript\"></script>\n" +
				"    <script src=\"");// line 22
		p(lookupStatic("/public/js/jquery.bootstrap-growl.js"));// line 23
		p("\" type=\"text/javascript\"></script>\n" +
				"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 23
		p(lookupStatic("/public/styles/app.css"));// line 24
		p("\">\n" +
				"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 24
		p(lookupStatic("/public/styles/photo.css"));// line 25
		p("\">\n" +
				"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 25
		p(lookupStatic("/public/styles/grid1200.css"));// line 26
		p("\">\n" +
				"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 26
		p(lookupStatic("/public/styles/fluid20.css"));// line 27
		p("\">\n" +
				"    <script src=\"");// line 27
		p(lookupStatic("/public/app/app.js"));// line 28
		p("\" type=\"text/javascript\"></script>\n" +
				"    <script src=\"");// line 28
		p(lookupStatic("/public/app/utils.js"));// line 29
		p("\" type=\"text/javascript\"></script>\n" +
				"    <script src=\"");// line 29
		p(lookupStatic("/public/app/i18n.js"));// line 30
		p("\" type=\"text/javascript\"></script>\n" +
				"    <!--[if lte IE 6]>\n" +
				"    <link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 30
		p(lookupStatic("public/bootstrap/css/bootstrap-ie6.css"));// line 32
		p("\">\n" +
				"    <![endif]-->\n" +
				"    <!--[if lte IE 7]>\n" +
				"    <link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 32
		p(lookupStatic("public/bootstrap/css/ie.css"));// line 35
		p("\">\n" +
				"    <![endif]-->\n" +
				"    <!--[if IE 6]>\n" +
				"    <link href=\"");// line 35
		p(lookupStatic("/public/styles/app.ie6.css"));// line 38
		p("\" rel=\"stylesheet\" type=\"text/css\">\n" +
				"    <![endif]-->\n" +
				"    <!--[if IE 7]>\n" +
				"    <link href=\"");// line 38
		p(lookupStatic("/public/styles/app.ie7.css"));// line 41
		p("\" rel=\"stylesheet\" type=\"text/css\">\n" +
				"    <![endif]-->\n" +
				"\n" +
				"    <!--[if lt IE 8]>\n" +
				"    <link rel=\"stylesheet\" href=\"");// line 41
		p(lookupStatic("/public/bootstrap/css/bootstrap-ie7buttonfix.css"));// line 45
		p("\"><![endif]-->\n" +
				"    <!--[if IE 8]>\n" +
				"    <link rel=\"stylesheet\" href=\"");// line 45
		p(lookupStatic("/public/bootstrap/css/bootstrap-ie8buttonfix.css"));// line 47
		p("\"><![endif]-->\n" +
				"\n" +
				"    <!--[if lt IE 9]>\n" +
				"    <script src=\"");// line 47
		p(lookupStatic("/public/js/html5shiv.js"));// line 50
		p("\"></script>\n" +
				"    <![endif]-->\n" +
				"    <!--[if lte IE 6]>\n" +
				"    <script type=\"text/javascript\" src=\"");// line 50
		p(lookupStatic("public/bootstrap/js/bootstrap-ie.js"));// line 53
		p("\"></script>\n" +
				"    <![endif]-->\n" +
				"\n" +
				"    <link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 53
		p(lookupStatic("/public/bootstrap/select/bootstrap-select.min.css"));// line 56
		p("\"/>\n" +
				"    <script src=\"");// line 56
		p(lookupStatic("/public/bootstrap/select/bootstrap-select.js"));// line 57
		p("\" type=\"text/javascript\"></script>\n" +
				"\n" +
				"    ");// line 57
		css();
		p("</head>\n" +
				"\n" +
				"<body>\n" +
				"<div class=\"navbar navbar-inverse\">\n" +
				"    <div class=\"navbar-inner\">\n" +
				"\n" +
				"        <div class=\"grid_row\">\n" +
				"            <div class=\"col col_16 \">\n" +
				"                <a class=\"brand\" href=\"/\">Spruce</a>\n" +
				"\n" +
				"                <div class=\"nav-collapse collapse\">\n" +
				"                    <ul class=\"nav\">\n" +
				"                        <li>\n" +
				"                            <a href=\"/\">");// line 59
		;
		p(getMessage("home"));// line 73
		p("</a>\n" +
				"                        </li>\n" +
				"                        <li>\n" +
				"                            <a href=\"/photos\">");// line 73
		;
		p(getMessage("photos"));// line 76
		p("</a>\n"
				+
				"                        </li>\n"
				+
				"                        <li class=\"dropdown\" style=\"display: none\">\n"
				+
				"                            <a href=\"#\" class=\"dropdown-toggle\"\n"
				+
				"                               data-toggle=\"dropdown\">Photos <b class=\"caret\"></b></a>\n"
				+
				"                            <ul class=\"dropdown-menu\">\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/last\">Last</a>\n"
				+
				"                                </li>\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/popular\">Popular</a>\n"
				+
				"                                </li>\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/top\">Top</a>\n"
				+
				"                                </li>\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/random\">Random</a>\n"
				+
				"                                </li>\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/catalog\">Catalog</a>\n"
				+
				"                                </li>\n"
				+
				"                            </ul>\n"
				+
				"                        </li>\n"
				+
				"\n"
				+
				"                        <li class=\"dropdown\" style=\"display: none\">\n"
				+
				"                            <a href=\"#\" class=\"dropdown-toggle\"\n"
				+
				"                               data-toggle=\"dropdown\">Shop<b class=\"caret\"></b></a>\n"
				+
				"                            <ul class=\"dropdown-menu\">\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/shop/best\">Best</a>\n"
				+
				"                                </li>\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/shop/bestSellers\">Best Sellers</a>\n"
				+
				"                                </li>\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/shop/random\">Random</a>\n"
				+
				"                                </li>\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/shop/catalog\">Catalog</a>\n"
				+
				"                                </li>\n"
				+
				"                                <li>\n"
				+
				"                                    <a href=\"/shop/new\">New Show</a>\n"
				+
				"                                </li>\n"
				+
				"                            </ul>\n"
				+
				"                        </li>\n"
				+
				"\n"
				+
				"                    </ul>\n"
				+
				"                    <div class=\"nav\">\n"
				+
				"                        <form class=\"navbar-search span2\" action=\"/search\">\n"
				+
				"                            <input type=\"text\" class=\"search-query input-medium\" name=\"q\"\n"
				+
				"                                   placeholder=\"Search\">\n" +
				"                        </form>\n" +
				"                    </div>\n" +
				"                    ");// line 76
		if (session.get(Admin.SESSION_LOGIN_KEY) == null) {// line 129
			p("                    <div class=\"nav pull-right\">\n"
					+
					"                        <div class=\"btn-group\">\n"
					+
					"                            <a href=\"/signup\" class=\"btn btn-success btn-small\"><i class=\"icon-arrow-up icon-white\"></i>&ensp;Signup</a>\n"
					+
					"                        </div>\n"
					+
					"                    </div>\n"
					+
					"                    <div class=\"nav pull-right\">\n"
					+
					"                        <div class=\"btn-group\">\n"
					+
					"                            <a class=\"btn btn-primary btn-small\" href=\"/login\"><i\n"
					+
					"                                    class=\"icon-user icon-white\"></i>&ensp;Login</a>\n"
					+
					"                        </div>\n" +
					"                        &ensp;\n" +
					"                    </div>\n" +
					"\n" +
					"                    ");// line 129
		} else {// line 143
			p("                    <div class=\"nav pull-right\">\n"
					+
					"                        <div class=\"btn-group\">\n"
					+
					"                            <a class=\"btn btn-primary btn-small\" href=\"/yours\"><i\n"
					+
					"                                    class=\"icon-user icon-white\"></i> ");// line 143
			try {
				p(session.get(Admin.SESSION_USER_NAME_KEY));
			} catch (NullPointerException npe) {
			}// line 147
			p("</a><a\n"
					+
					"                                class=\"btn btn-primary btn-small dropdown-toggle\"\n"
					+
					"                                data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n"
					+
					"\n"
					+
					"                            <ul class=\"dropdown-menu\">\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/settings/profile\"><i class=\"icon-pencil\"></i>Setting</a>\n"
					+
					"                                </li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/account\"><i class=\"icon-trash\"></i> Account</a>\n"
					+
					"                                </li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/profile\"><i class=\"icon-ban-circle\"></i>Profile</a>\n"
					+
					"                                </li>\n"
					+
					"                                <li class=\"divider\"></li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/store\"><i class=\"i\"></i> Store</a>\n"
					+
					"                                </li>\n"
					+
					"                                <li class=\"divider\"></li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/logout\"><i class=\"i\"></i> Logout</a>\n"
					+
					"                                </li>\n"
					+
					"                            </ul>\n"
					+
					"                        </div>\n"
					+
					"                    </div>\n"
					+
					"                    <div class=\"nav pull-right\">\n"
					+
					"\n"
					+
					"                        <div class=\"btn-group\">\n"
					+
					"                            <a class=\"btn btn-success btn-small\" href=\"/add\"><i\n"
					+
					"                                    class=\" icon-share icon-white\"></i> Add</a><a\n"
					+
					"                                class=\"btn btn-success btn-small dropdown-toggle\"\n"
					+
					"                                data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n"
					+
					"\n"
					+
					"                            <ul class=\"dropdown-menu\">\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/upload\"><i class=\"icon-upload\"></i> Upload</a>\n"
					+
					"                                </li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/story\"><i class=\" icon-file\"></i> New Story</a>\n"
					+
					"                                </li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/blink\"><i class=\"icon-upload\"></i> Blink a photo</a>\n"
					+
					"                                </li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/upload\"><i class=\"icon-upload\"></i> Sets</a>\n"
					+
					"                                </li>\n"
					+
					"                                <li class=\"divider\"></li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/photo/manage\"> <i class=\"icon-edit\"></i> Manage </a>\n"
					+
					"                                </li>\n"
					+
					"                                <li>\n"
					+
					"                                    <a href=\"/photo/org\"> <i class=\"icon-edit\"></i> Organize </a>\n"
					+
					"                                </li>\n" +
					"                            </ul>\n" +
					"                        </div>\n" +
					"                    </div>\n" +
					"                    ");// line 147
		}// line 203
		p("                </div>\n" +
				"            </div>\n" +
				"        </div>\n" +
				"    </div>\n" +
				"</div>\n" +
				"\n" +
				"<!--\n" +
				"<div class=\"page-header\">\n" +
				"<h3>");// line 203
		header();
		p("</h3>\n" +
				"</div> -->\n" +
				"\n");// line 212
		doLayout();// line 215
		p("\n" +
				"<footer class=\"footer\">\n" +
				"    <div class=\"container\">\n" +
				"        <p>\n" +
				"            @Company\n" +
				"        </p>\n" +
				"\n" +
				"    </div>\n" +
				"</footer>\n" +
				"</body>\n" +
				"</html>\n");// line 215
		endDoLayout(sourceTemplate);
	}

	protected void title() {
	};

	protected void desc() {
	};

	protected void keywords() {
	};

	protected void header() {
	};

	protected void css() {
	};

	protected abstract void doLayout();
}
