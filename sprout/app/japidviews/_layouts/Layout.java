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
// NOTE: This file was generated from: japidviews/_layouts/Layout.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class Layout extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/Layout.html";
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


	public Layout() {
		super(null);
	}
	public Layout(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		beginDoLayout(sourceTemplate);		p("<!DOCTYPE html>\n");// line 1, japidviews\_layouts\Layout.html
		p("\n" + 
"<html lang=\"en\">\n" + 
"<head>\n" + 
"    <meta charset=\"UTF-8\">\n" + 
"    ");// line 2, japidviews\_layouts\Layout.html
		String appName=i18n("web.app.name");// line 6, japidviews\_layouts\Layout.html

    String keywords=i18n("web.keywords");// line 7, japidviews\_layouts\Layout.html

    String description=i18n("web.description");// line 8, japidviews\_layouts\Layout.html
		p("\n" + 
"    <title>");// line 8, japidviews\_layouts\Layout.html
		try { p(appName); } catch (NullPointerException npe) {}// line 9, japidviews\_layouts\Layout.html
		p(" / ");// line 9, japidviews\_layouts\Layout.html
		title();p(" </title>\n" + 
"    <meta name=\"keywords\" content=\"");// line 9, japidviews\_layouts\Layout.html
		try { p(keywords); } catch (NullPointerException npe) {}// line 10, japidviews\_layouts\Layout.html
		p(",");// line 10, japidviews\_layouts\Layout.html
		keywords();p("\"/>\n" + 
"    <meta name=\"description\" content=\"");// line 10, japidviews\_layouts\Layout.html
		description();p(" ----  ");// line 11, japidviews\_layouts\Layout.html
		try { p(description); } catch (NullPointerException npe) {}// line 11, japidviews\_layouts\Layout.html
		p("\"/>\n" + 
"    <meta name=\"viewport\" content=\"width=1240, maximum-scale=1.5\"/>\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 11, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/bootstrap/css/bootstrap.min.css"));// line 13, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 13, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/styles/bootstrap-theme.css"));// line 14, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    <!--\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" 	href=\"");// line 14, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/bootstrap/css/bootstrap-responsive.min.css"));// line 16, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    -->\n" + 
"    <script src=\"");// line 16, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/js/jquery-1.10.2.js"));// line 18, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 18, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/js/jquery-migrate-1.2.1.js"));// line 19, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 19, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/blueimp/md5.min.js"));// line 20, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 20, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/bootstrap/js/bootstrap.min.js"));// line 21, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 21, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/bootstrap/js/bootstrap3-typeahead.js"));// line 22, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 22, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/js/jquery.form.js"));// line 23, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 23, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/js/jquery.easing.1.3.min.js"));// line 24, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 24, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/js/jquery.bootstrap-growl.js"));// line 25, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 25, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/styles/app.css"));// line 26, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 26, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/styles/photo.css"));// line 27, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 27, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/styles/grid1200.css"));// line 28, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 28, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/styles/fluid20.css"));// line 29, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    <script src=\"");// line 29, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/app/app.js"));// line 30, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 30, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/app/utils.js"));// line 31, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 31, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/app/i18n.js"));// line 32, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <!--[if lte IE 6]>\n" + 
"    <link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 32, japidviews\_layouts\Layout.html
		p(lookupStatic("public/bootstrap/css/bootstrap-ie6.css"));// line 34, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    <![endif]-->\n" + 
"    <!--[if lte IE 7]>\n" + 
"    <link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 34, japidviews\_layouts\Layout.html
		p(lookupStatic("public/bootstrap/css/ie.css"));// line 37, japidviews\_layouts\Layout.html
		p("\">\n" + 
"    <![endif]-->\n" + 
"    <!--[if IE 6]>\n" + 
"    <link href=\"");// line 37, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/styles/app.ie6.css"));// line 40, japidviews\_layouts\Layout.html
		p("\" rel=\"stylesheet\" type=\"text/css\">\n" + 
"    <![endif]-->\n" + 
"    <!--[if IE 7]>\n" + 
"    <link href=\"");// line 40, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/styles/app.ie7.css"));// line 43, japidviews\_layouts\Layout.html
		p("\" rel=\"stylesheet\" type=\"text/css\">\n" + 
"    <![endif]-->\n" + 
"\n" + 
"    <!--[if lt IE 8]>\n" + 
"    <link rel=\"stylesheet\" href=\"");// line 43, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/bootstrap/css/bootstrap-ie7buttonfix.css"));// line 47, japidviews\_layouts\Layout.html
		p("\"><![endif]-->\n" + 
"    <!--[if IE 8]>\n" + 
"    <link rel=\"stylesheet\" href=\"");// line 47, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/bootstrap/css/bootstrap-ie8buttonfix.css"));// line 49, japidviews\_layouts\Layout.html
		p("\"><![endif]-->\n" + 
"\n" + 
"    <!--[if lt IE 9]>\n" + 
"    <script src=\"");// line 49, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/js/html5shiv.js"));// line 52, japidviews\_layouts\Layout.html
		p("\"></script>\n" + 
"    <![endif]-->\n" + 
"    <!--[if lte IE 6]>\n" + 
"    <script type=\"text/javascript\" src=\"");// line 52, japidviews\_layouts\Layout.html
		p(lookupStatic("public/bootstrap/js/bootstrap-ie.js"));// line 55, japidviews\_layouts\Layout.html
		p("\"></script>\n" + 
"    <![endif]-->\n" + 
"\n" + 
"    <link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 55, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/bootstrap/select/bootstrap-select.min.css"));// line 58, japidviews\_layouts\Layout.html
		p("\"/>\n" + 
"    <script src=\"");// line 58, japidviews\_layouts\Layout.html
		p(lookupStatic("/public/bootstrap/select/bootstrap-select.js"));// line 59, japidviews\_layouts\Layout.html
		p("\" type=\"text/javascript\"></script>\n" + 
"\n" + 
"    ");// line 59, japidviews\_layouts\Layout.html
		css();p("\n" + 
"</head>\n" + 
"\n" + 
"<body>\n" + 
"\n" + 
"<div class=\"navbar navbar-inverse navbar-static-top\" role=\"navigation\">\n" + 
"    <div class=\"grid_row\">\n" + 
"        <div class=\"col col_16 \">\n" + 
"            <div class=\"navbar-header\">\n" + 
"                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" + 
"                    <span class=\"sr-only\">Toggle navigation</span>\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                </button>\n" + 
"                <a class=\"navbar-brand\" href=\"/\">Spruce</a>\n" + 
"            </div>\n" + 
"\n" + 
"\n" + 
"            <div class=\"navbar-collapse collapse\">\n" + 
"                <ul class=\" navbar-nav nav\">\n" + 
"                    <li>\n" + 
"                        <a href=\"/\">");// line 61, japidviews\_layouts\Layout.html
		;p(getMessage("home"));// line 83, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                    </li>\n" + 
"                    <li>\n" + 
"                        <a href=\"/photos\">");// line 83, japidviews\_layouts\Layout.html
		;p(getMessage("photos"));// line 86, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                    </li>\n" + 
"\n" + 
"                    <li class=\"dropdown\" style=\"\">\n" + 
"                        <a href=\"#\" class=\"dropdown-toggle\"\n" + 
"                           data-toggle=\"dropdown\">Photos <b class=\"caret\"></b></a>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li>\n" + 
"                                <a href=\"/last\">Last</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/popular\">Popular</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/top\">Top</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/random\">Random</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/catalog\">Catalog</a>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"\n" + 
"                    <li class=\"dropdown\" style=\"display: none\">\n" + 
"                        <a href=\"#\" class=\"dropdown-toggle\"\n" + 
"                           data-toggle=\"dropdown\">Shop<b class=\"caret\"></b></a>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li>\n" + 
"                                <a href=\"/shop/best\">Best</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/shop/bestSellers\">Best Sellers</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/shop/random\">Random</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/shop/catalog\">Catalog</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/shop/new\">New Show</a>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"\n" + 
"                </ul>\n" + 
"\n" + 
"\n" + 
"                <ul class=\"nav navbar-nav navbar-right\">\n" + 
"                    <li>\n" + 
"                        <form class=\"navbar-form navbar-left  col-lg-2\" role=\"search\" action=\"/search\">\n" + 
"                            <div class=\"form-group\">\n" + 
"                                <input type=\"text\" class=\"form-control\" placeholder=\"Search\"/>\n" + 
"                            </div>\n" + 
"                        </form>\n" + 
"                    </li>\n" + 
"                    ");// line 86, japidviews\_layouts\Layout.html
		if (session.get(Admin.SESSION_LOGIN_KEY) == null) {// line 144, japidviews\_layouts\Layout.html
		p("\n" + 
"\n" + 
"                    <li>\n" + 
"                        <div class=\"btn-group\">\n" + 
"                            <a class=\"btn btn-primary btn-sm navbar-btn\" href=\"/login\"><span\n" + 
"                                    class=\"glyphicon glyphicon-user glyphicon-white\"></span>&ensp;Login</a>\n" + 
"                        </div>\n" + 
"                        <div class=\"btn-group\">\n" + 
"                            <a href=\"/signup\" class=\"btn btn-success btn-sm navbar-btn \"><span\n" + 
"                                    class=\"glyphicon glyphicon-arrow-up glyphicon-white\"></span>&ensp;Signup</a>\n" + 
"                        </div>\n" + 
"                    </li>\n" + 
"\n" + 
"                    ");// line 144, japidviews\_layouts\Layout.html
		}else{// line 157, japidviews\_layouts\Layout.html
		p("\n" + 
"\n" + 
"                    <li class=\"dropdown\">\n" + 
"                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n" + 
"                            ");// line 157, japidviews\_layouts\Layout.html
		String idUserStr=session.get(Admin.SESSION_USER_ID_KEY);// line 161, japidviews\_layouts\Layout.html

                            Integer idUser=Integer.parseInt(idUserStr);// line 162, japidviews\_layouts\Layout.html
		p("\n" + 
"                            <img class=\"image_18 round3\"\n" + 
"                                 src=\"");// line 162, japidviews\_layouts\Layout.html
		try { p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(idUser,1)); } catch (NullPointerException npe) {}// line 164, japidviews\_layouts\Layout.html
		p("\"/>\n" + 
"                            ");// line 164, japidviews\_layouts\Layout.html
		try { p(session.get(Admin.SESSION_USER_NAME_KEY)); } catch (NullPointerException npe) {}// line 165, japidviews\_layouts\Layout.html
		p(" <b\n" + 
"                                class=\"caret\"></b></a>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li>\n" + 
"                                <a href=\"/yours\">\n" + 
"                                    <spanmg class=\"img_shadow image_64\"\n" + 
"                                            src=\"");// line 165, japidviews\_layouts\Layout.html
		try { p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(idUser,1)); } catch (NullPointerException npe) {}// line 171, japidviews\_layouts\Layout.html
		p("\"/>\n" + 
"                                </a>\n" + 
"\n" + 
"\n" + 
"                            </li>\n" + 
"\n" + 
"                            <li>\n" + 
"                                <a href=\"/settings/profile\"><span class=\"glyphicon glyphicon-pencil\"></span>\n" + 
"                                    ");// line 171, japidviews\_layouts\Layout.html
		;p(getMessage("settings"));// line 179, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/account\"><span class=\"glyphicon glyphicon-trash\"></span> ");// line 179, japidviews\_layouts\Layout.html
		;p(getMessage("account"));// line 182, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/settings/profile\"><span class=\"glyphicon glyphicon-ban-circle\"></span>\n" + 
"                                    ");// line 182, japidviews\_layouts\Layout.html
		;p(getMessage("profile"));// line 186, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                            </li>\n" + 
"                            <li><a href=\"/settings/password\"><span class=\"glyphicon glyphicon-ban-circle\"></span>");// line 186, japidviews\_layouts\Layout.html
		;p(getMessage("profile.menu.password"));// line 188, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                            </li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/logout\"><span class=\"i\"></span> ");// line 188, japidviews\_layouts\Layout.html
		;p(getMessage("logout"));// line 192, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"\n" + 
"                    <li>\n" + 
"                        <a class=\"dropdown-toggle\"\n" + 
"                           data-toggle=\"dropdown\">\n" + 
"                            <span class=\" glyphicon glyphicon-share glyphicon-white\"></span>\n" + 
"                            ");// line 192, japidviews\_layouts\Layout.html
		;p(getMessage("add"));// line 201, japidviews\_layouts\Layout.html
		p(" <span class=\"caret\"></span>\n" + 
"                        </a>\n" + 
"\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"/add\"><span class=\"glyphicon glyphicon-share\"></span>");// line 201, japidviews\_layouts\Layout.html
		;p(getMessage("add"));// line 205, japidviews\_layouts\Layout.html
		p("</a></li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/upload\"><span class=\"glyphicon glyphicon-picture\"></span> ");// line 205, japidviews\_layouts\Layout.html
		;p(getMessage("add.photo"));// line 207, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/ps/upload\"><span class=\" glyphicon glyphicon-leaf\"></span> ");// line 207, japidviews\_layouts\Layout.html
		;p(getMessage("add.ps"));// line 210, japidviews\_layouts\Layout.html
		p("\n" + 
"                                </a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/story\"><span class=\"glyphicon glyphicon-th-large\"></span> ");// line 210, japidviews\_layouts\Layout.html
		;p(getMessage("add.story"));// line 214, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/blink\"><span class=\"glyphicon glyphicon-eye-open\"></span> ");// line 214, japidviews\_layouts\Layout.html
		;p(getMessage("add.blink"));// line 217, japidviews\_layouts\Layout.html
		p("</a>\n" + 
"                            </li>\n" + 
"\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/photo/manage\"> <span class=\"glyphicon glyphicon-edit\"></span>\n" + 
"                                    ");// line 217, japidviews\_layouts\Layout.html
		;p(getMessage("manage"));// line 223, japidviews\_layouts\Layout.html
		p(" </a>\n" + 
"                            </li>\n" + 
"                            <li>\n" + 
"                                <a href=\"/photo/manage/set/all\"> <span class=\"glyphicon glyphicon-tasks\"></span>\n" + 
"                                    ");// line 223, japidviews\_layouts\Layout.html
		;p(getMessage("sets"));// line 227, japidviews\_layouts\Layout.html
		p("\n" + 
"                                </a>\n" + 
"                            </li>\n" + 
"\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"                    ");// line 227, japidviews\_layouts\Layout.html
		}// line 233, japidviews\_layouts\Layout.html
		p("\n" + 
"                </ul>\n" + 
"\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!--\n" + 
"<div class=\"page-header\">\n" + 
"<h3>");// line 233, japidviews\_layouts\Layout.html
		header();p("</h3>\n" + 
"</div> -->\n" + 
"<div class=\"content_container\">\n" + 
"    ");// line 243, japidviews\_layouts\Layout.html
		doLayout();// line 246, japidviews\_layouts\Layout.html
		p("\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"<footer class=\"footer\">\n" + 
"    <div class=\"container\">\n" + 
"        <p>\n" + 
"            @Company\n" + 
"        </p>\n" + 
"\n" + 
"    </div>\n" + 
"</footer>\n" + 
"</body>\n" + 
"</html>");// line 246, japidviews\_layouts\Layout.html
				endDoLayout(sourceTemplate);	}
	 protected void title() {};
	 protected void keywords() {};
	 protected void description() {};
	 protected void header() {};
	 protected void css() {};

	protected abstract void doLayout();
}