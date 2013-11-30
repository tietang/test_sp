package japidviews.Application;
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
// NOTE: This file was generated from: japidviews/Application/Theme.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Theme extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/Theme.html";
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


	public Theme() {
		super(null);
	}
	public Theme(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Theme.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/Theme.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Theme().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<!DOCTYPE html>\n" + 
"<html lang=\"en\">\n" + 
"<head>\n" + 
"    <title>Bootswatch: Slate</title>\n" + 
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
"    <meta charset=\"utf-8\">\n" + 
"\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 1, japidviews\Application\Theme.html
		p(lookupStatic("/public/bootstrap/css/bootstrap.min.css"));// line 8, japidviews\Application\Theme.html
		p("\">\n" + 
"    <!--<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 8, japidviews\Application\Theme.html
		p(lookupStatic("/public/styles/bootstrap-theme.css"));// line 9, japidviews\Application\Theme.html
		p("\">-->\n" + 
"    <script src=\"");// line 9, japidviews\Application\Theme.html
		p(lookupStatic("/public/js/jquery-1.10.2.js"));// line 10, japidviews\Application\Theme.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 10, japidviews\Application\Theme.html
		p(lookupStatic("/public/js/jquery-migrate-1.2.1.js"));// line 11, japidviews\Application\Theme.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 11, japidviews\Application\Theme.html
		p(lookupStatic("/public/blueimp/md5.min.js"));// line 12, japidviews\Application\Theme.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 12, japidviews\Application\Theme.html
		p(lookupStatic("/public/js/jquery.form.js"));// line 13, japidviews\Application\Theme.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <script src=\"");// line 13, japidviews\Application\Theme.html
		p(lookupStatic("/public/bootstrap/js/bootstrap.min.js"));// line 14, japidviews\Application\Theme.html
		p("\" type=\"text/javascript\"></script>\n" + 
"    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n" + 
"    <!--[if lt IE 9]>\n" + 
"    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" + 
"    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n" + 
"    <![endif]-->\n" + 
"\n" + 
"</head>\n" + 
"<body>\n" + 
"<script src=\"../assets/js/bsa.js\"></script>\n" + 
"\n" + 
"<div class=\"navbar navbar-default navbar-fixed-top\">\n" + 
"    <div class=\"container\">\n" + 
"        <div class=\"navbar-header\">\n" + 
"            <a href=\"../\" class=\"navbar-brand\">Bootswatch</a>\n" + 
"            <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-main\">\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"            </button>\n" + 
"        </div>\n" + 
"        <div class=\"navbar-collapse collapse\" id=\"navbar-main\">\n" + 
"            <ul class=\"nav navbar-nav\">\n" + 
"                <li class=\"dropdown\">\n" + 
"                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" id=\"themes\">Themes <span\n" + 
"                            class=\"caret\"></span></a>\n" + 
"                    <ul class=\"dropdown-menu\" aria-labelledby=\"themes\">\n" + 
"                        <li><a tabindex=\"-1\" href=\"../default/\">Default</a></li>\n" + 
"                        <li class=\"divider\"></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../amelia/\">Amelia</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../cerulean/\">Cerulean</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../cosmo/\">Cosmo</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../cyborg/\">Cyborg</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../flatly/\">Flatly</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../journal/\">Journal</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../readable/\">Readable</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../simplex/\">Simplex</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../slate/\">Slate</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../spacelab/\">Spacelab</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../united/\">United</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"../yeti/\">Yeti</a></li>\n" + 
"                    </ul>\n" + 
"                </li>\n" + 
"                <li>\n" + 
"                    <a href=\"../help/\">Help</a>\n" + 
"                </li>\n" + 
"                <li>\n" + 
"                    <a href=\"http://news.bootswatch.com\">Blog</a>\n" + 
"                </li>\n" + 
"                <li class=\"dropdown\">\n" + 
"                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" id=\"download\">Download <span\n" + 
"                            class=\"caret\"></span></a>\n" + 
"                    <ul class=\"dropdown-menu\" aria-labelledby=\"download\">\n" + 
"                        <li><a tabindex=\"-1\" href=\"./bootstrap.min.css\">bootstrap.min.css</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"./bootstrap.css\">bootstrap.css</a></li>\n" + 
"                        <li class=\"divider\"></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"./variables.less\">variables.less</a></li>\n" + 
"                        <li><a tabindex=\"-1\" href=\"./bootswatch.less\">bootswatch.less</a></li>\n" + 
"                    </ul>\n" + 
"                </li>\n" + 
"            </ul>\n" + 
"\n" + 
"            <ul class=\"nav navbar-nav navbar-right\">\n" + 
"                <li><a href=\"http://builtwithbootstrap.com/\" target=\"_blank\">Built With Bootstrap</a></li>\n" + 
"                <li><a href=\"https://wrapbootstrap.com/?ref=bsw\" target=\"_blank\">WrapBootstrap</a></li>\n" + 
"            </ul>\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"<div class=\"container\">\n" + 
"\n" + 
"<div class=\"page-header\" id=\"banner\">\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-6\">\n" + 
"            <h1>Slate</h1>\n" + 
"\n" + 
"            <p class=\"lead\">Shades of gunmetal gray</p>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-6\">\n" + 
"            <div class=\"bsa well\">\n" + 
"                <div id=\"bsap_1277971\" class=\"bsarocks bsap_c466df00a3cd5ee8568b5c4983b6bb19\"></div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!-- Navbar\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section clearfix\">\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div class=\"page-header\">\n" + 
"                <h1 id=\"navbar\">Navbar</h1>\n" + 
"            </div>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"navbar navbar-default\">\n" + 
"                    <div class=\"navbar-header\">\n" + 
"                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n" + 
"                                data-target=\".navbar-responsive-collapse\">\n" + 
"                            <span class=\"icon-bar\"></span>\n" + 
"                            <span class=\"icon-bar\"></span>\n" + 
"                            <span class=\"icon-bar\"></span>\n" + 
"                        </button>\n" + 
"                        <a class=\"navbar-brand\" href=\"#\">Brand</a>\n" + 
"                    </div>\n" + 
"                    <div class=\"navbar-collapse collapse navbar-responsive-collapse\">\n" + 
"                        <ul class=\"nav navbar-nav\">\n" + 
"                            <li class=\"active\"><a href=\"#\">Active</a></li>\n" + 
"                            <li><a href=\"#\">Link</a></li>\n" + 
"                            <li class=\"dropdown\">\n" + 
"                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b\n" + 
"                                        class=\"caret\"></b></a>\n" + 
"                                <ul class=\"dropdown-menu\">\n" + 
"                                    <li><a href=\"#\">Action</a></li>\n" + 
"                                    <li><a href=\"#\">Another action</a></li>\n" + 
"                                    <li><a href=\"#\">Something else here</a></li>\n" + 
"                                    <li class=\"divider\"></li>\n" + 
"                                    <li class=\"dropdown-header\">Dropdown header</li>\n" + 
"                                    <li><a href=\"#\">Separated link</a></li>\n" + 
"                                    <li><a href=\"#\">One more separated link</a></li>\n" + 
"                                </ul>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                        <form class=\"navbar-form navbar-left\">\n" + 
"                            <input type=\"text\" class=\"form-control col-lg-8\" placeholder=\"Search\">\n" + 
"                        </form>\n" + 
"                        <ul class=\"nav navbar-nav navbar-right\">\n" + 
"                            <li><a href=\"#\">Link</a></li>\n" + 
"                            <li class=\"dropdown\">\n" + 
"                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b\n" + 
"                                        class=\"caret\"></b></a>\n" + 
"                                <ul class=\"dropdown-menu\">\n" + 
"                                    <li><a href=\"#\">Action</a></li>\n" + 
"                                    <li><a href=\"#\">Another action</a></li>\n" + 
"                                    <li><a href=\"#\">Something else here</a></li>\n" + 
"                                    <li class=\"divider\"></li>\n" + 
"                                    <li><a href=\"#\">Separated link</a></li>\n" + 
"                                </ul>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"                    <!-- /.nav-collapse -->\n" + 
"                </div>\n" + 
"                <!-- /.navbar -->\n" + 
"\n" + 
"\n" + 
"                <div class=\"navbar navbar-inverse\">\n" + 
"                    <div class=\"navbar-header\">\n" + 
"                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n" + 
"                                data-target=\".navbar-inverse-collapse\">\n" + 
"                            <span class=\"icon-bar\"></span>\n" + 
"                            <span class=\"icon-bar\"></span>\n" + 
"                            <span class=\"icon-bar\"></span>\n" + 
"                        </button>\n" + 
"                        <a class=\"navbar-brand\" href=\"#\">Brand</a>\n" + 
"                    </div>\n" + 
"                    <div class=\"navbar-collapse collapse navbar-inverse-collapse\">\n" + 
"                        <ul class=\"nav navbar-nav\">\n" + 
"                            <li class=\"active\"><a href=\"#\">Active</a></li>\n" + 
"                            <li><a href=\"#\">Link</a></li>\n" + 
"                            <li class=\"dropdown\">\n" + 
"                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b\n" + 
"                                        class=\"caret\"></b></a>\n" + 
"                                <ul class=\"dropdown-menu\">\n" + 
"                                    <li><a href=\"#\">Action</a></li>\n" + 
"                                    <li><a href=\"#\">Another action</a></li>\n" + 
"                                    <li><a href=\"#\">Something else here</a></li>\n" + 
"                                    <li class=\"divider\"></li>\n" + 
"                                    <li class=\"dropdown-header\">Dropdown header</li>\n" + 
"                                    <li><a href=\"#\">Separated link</a></li>\n" + 
"                                    <li><a href=\"#\">One more separated link</a></li>\n" + 
"                                </ul>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                        <form class=\"navbar-form navbar-left\">\n" + 
"                            <input type=\"text\" class=\"form-control col-lg-8\" placeholder=\"Search\">\n" + 
"                        </form>\n" + 
"                        <ul class=\"nav navbar-nav navbar-right\">\n" + 
"                            <li><a href=\"#\">Link</a></li>\n" + 
"                            <li class=\"dropdown\">\n" + 
"                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b\n" + 
"                                        class=\"caret\"></b></a>\n" + 
"                                <ul class=\"dropdown-menu\">\n" + 
"                                    <li><a href=\"#\">Action</a></li>\n" + 
"                                    <li><a href=\"#\">Another action</a></li>\n" + 
"                                    <li><a href=\"#\">Something else here</a></li>\n" + 
"                                    <li class=\"divider\"></li>\n" + 
"                                    <li><a href=\"#\">Separated link</a></li>\n" + 
"                                </ul>\n" + 
"                            </li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"                    <!-- /.nav-collapse -->\n" + 
"                </div>\n" + 
"                <!-- /.navbar -->\n" + 
"            </div>\n" + 
"            <!-- /example -->\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"<!-- Buttons\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section\">\n" + 
"    <div class=\"page-header\">\n" + 
"        <div class=\"row\">\n" + 
"            <div class=\"col-lg-12\">\n" + 
"                <h1 id=\"buttons\">Buttons</h1>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-6\">\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <p>\n" + 
"                    <button type=\"button\" class=\"btn btn-default\">Default</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-primary\">Primary</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-success\">Success</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-info\">Info</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-warning\">Warning</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-danger\">Danger</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-link\">Link</button>\n" + 
"                </p>\n" + 
"            </div>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <p>\n" + 
"                    <button type=\"button\" class=\"btn btn-default disabled\">Default</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-primary disabled\">Primary</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-success disabled\">Success</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-info disabled\">Info</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-warning disabled\">Warning</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-danger disabled\">Danger</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-link disabled\">Link</button>\n" + 
"                </p>\n" + 
"            </div>\n" + 
"\n" + 
"\n" + 
"            <div class=\"bs-example\" style=\"margin-bottom: 15px;\">\n" + 
"                <div class=\"btn-toolbar\" style=\"margin: 0;\">\n" + 
"                    <div class=\"btn-group\">\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">Default</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\"><span\n" + 
"                                class=\"caret\"></span></button>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"#\">Action</a></li>\n" + 
"                            <li><a href=\"#\">Another action</a></li>\n" + 
"                            <li><a href=\"#\">Something else here</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"#\">Separated link</a></li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"                    <!-- /btn-group -->\n" + 
"                    <div class=\"btn-group\">\n" + 
"                        <button type=\"button\" class=\"btn btn-primary\">Primary</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\"><span\n" + 
"                                class=\"caret\"></span></button>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"#\">Action</a></li>\n" + 
"                            <li><a href=\"#\">Another action</a></li>\n" + 
"                            <li><a href=\"#\">Something else here</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"#\">Separated link</a></li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"                    <!-- /btn-group -->\n" + 
"                    <div class=\"btn-group\">\n" + 
"                        <button type=\"button\" class=\"btn btn-success\">Success</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-success dropdown-toggle\" data-toggle=\"dropdown\"><span\n" + 
"                                class=\"caret\"></span></button>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"#\">Action</a></li>\n" + 
"                            <li><a href=\"#\">Another action</a></li>\n" + 
"                            <li><a href=\"#\">Something else here</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"#\">Separated link</a></li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"                    <!-- /btn-group -->\n" + 
"                    <div class=\"btn-group\">\n" + 
"                        <button type=\"button\" class=\"btn btn-info\">Info</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-info dropdown-toggle\" data-toggle=\"dropdown\"><span\n" + 
"                                class=\"caret\"></span></button>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"#\">Action</a></li>\n" + 
"                            <li><a href=\"#\">Another action</a></li>\n" + 
"                            <li><a href=\"#\">Something else here</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"#\">Separated link</a></li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"                    <!-- /btn-group -->\n" + 
"                    <div class=\"btn-group\">\n" + 
"                        <button type=\"button\" class=\"btn btn-warning\">Warning</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-warning dropdown-toggle\" data-toggle=\"dropdown\"><span\n" + 
"                                class=\"caret\"></span></button>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"#\">Action</a></li>\n" + 
"                            <li><a href=\"#\">Another action</a></li>\n" + 
"                            <li><a href=\"#\">Something else here</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"#\">Separated link</a></li>\n" + 
"                        </ul>\n" + 
"                    </div>\n" + 
"                    <!-- /btn-group -->\n" + 
"                </div>\n" + 
"                <!-- /btn-toolbar -->\n" + 
"            </div>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <p>\n" + 
"                    <button type=\"button\" class=\"btn btn-primary btn-lg\">Large button</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-primary\">Default button</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-primary btn-sm\">Small button</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-primary btn-xs\">Mini button</button>\n" + 
"                </p>\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-6\">\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <p>\n" + 
"                    <button type=\"button\" class=\"btn btn-default btn-lg btn-block\">Block level button</button>\n" + 
"                </p>\n" + 
"            </div>\n" + 
"\n" + 
"\n" + 
"            <div class=\"bs-example\" style=\"margin-bottom: 15px;\">\n" + 
"                <div class=\"btn-group btn-group-justified\">\n" + 
"                    <a href=\"#\" class=\"btn btn-default\">Left</a>\n" + 
"                    <a href=\"#\" class=\"btn btn-default\">Middle</a>\n" + 
"                    <a href=\"#\" class=\"btn btn-default\">Right</a>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"\n" + 
"            <div class=\"bs-example\" style=\"margin-bottom: 15px;\">\n" + 
"                <div class=\"btn-toolbar\">\n" + 
"                    <div class=\"btn-group\">\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">1</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">2</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">3</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">4</button>\n" + 
"                    </div>\n" + 
"                    <div class=\"btn-group\">\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">5</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">6</button>\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">7</button>\n" + 
"                    </div>\n" + 
"                    <div class=\"btn-group\">\n" + 
"                        <button type=\"button\" class=\"btn btn-default\">8</button>\n" + 
"\n" + 
"                        <div class=\"btn-group\">\n" + 
"                            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\n" + 
"                                Dropdown\n" + 
"                                <span class=\"caret\"></span>\n" + 
"                            </button>\n" + 
"                            <ul class=\"dropdown-menu\">\n" + 
"                                <li><a href=\"#\">Dropdown link</a></li>\n" + 
"                                <li><a href=\"#\">Dropdown link</a></li>\n" + 
"                                <li><a href=\"#\">Dropdown link</a></li>\n" + 
"                            </ul>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"btn-group-vertical\">\n" + 
"                    <button type=\"button\" class=\"btn btn-default\">Button</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-default\">Button</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-default\">Button</button>\n" + 
"                    <button type=\"button\" class=\"btn btn-default\">Button</button>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!-- Typography\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section\">\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div class=\"page-header\">\n" + 
"                <h1 id=\"type\">Typography</h1>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <!-- Headings -->\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"bs-example bs-example-type\">\n" + 
"                <h1>Heading 1</h1>\n" + 
"\n" + 
"                <h2>Heading 2</h2>\n" + 
"\n" + 
"                <h3>Heading 3</h3>\n" + 
"                <h4>Heading 4</h4>\n" + 
"                <h5>Heading 5</h5>\n" + 
"                <h6>Heading 6</h6>\n" + 
"            </div>\n" + 
"            <div class=\"bs-example\">\n" + 
"                <p class=\"lead\">Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"bs-example\">\n" + 
"                <h2>Example body text</h2>\n" + 
"\n" + 
"                <p>Nullam quis risus eget <a href=\"#\">urna mollis ornare</a> vel eu leo. Cum sociis natoque penatibus et\n" + 
"                    magnis dis parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula.\n" + 
"                </p>\n" + 
"\n" + 
"                <p>\n" + 
"                    <small>This line of text is meant to be treated as fine print.</small>\n" + 
"                </p>\n" + 
"                <p>The following snippet of text is <strong>rendered as bold text</strong>.</p>\n" + 
"\n" + 
"                <p>The following snippet of text is <em>rendered as italicized text</em>.</p>\n" + 
"\n" + 
"                <p>An abbreviation of the word attribute is <abbr title=\"attribute\">attr</abbr>.</p>\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"\n" + 
"            <h2>Emphasis classes</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <p class=\"text-muted\">Fusce dapibus, tellus ac cursus commodo, tortor mauris nibh.</p>\n" + 
"\n" + 
"                <p class=\"text-primary\">Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n" + 
"\n" + 
"                <p class=\"text-warning\">Etiam porta sem malesuada magna mollis euismod.</p>\n" + 
"\n" + 
"                <p class=\"text-danger\">Donec ullamcorper nulla non metus auctor fringilla.</p>\n" + 
"\n" + 
"                <p class=\"text-success\">Duis mollis, est non commodo luctus, nisi erat porttitor ligula.</p>\n" + 
"\n" + 
"                <p class=\"text-info\">Maecenas sed diam eget risus varius blandit sit amet non magna.</p>\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <!-- Blockquotes -->\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <h2 id=\"type-blockquotes\">Blockquotes</h2>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-6\">\n" + 
"            <blockquote>\n" + 
"                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n" + 
"                <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\n" + 
"            </blockquote>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-6\">\n" + 
"            <blockquote class=\"pull-right\">\n" + 
"                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n" + 
"                <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\n" + 
"            </blockquote>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!-- Tables\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section\">\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div class=\"page-header\">\n" + 
"                <h1 id=\"tables\">Tables</h1>\n" + 
"            </div>\n" + 
"\n" + 
"            <div class=\"bs-example table-responsive\">\n" + 
"                <table class=\"table table-striped table-bordered table-hover\">\n" + 
"                    <thead>\n" + 
"                    <tr>\n" + 
"                        <th>#</th>\n" + 
"                        <th>Column heading</th>\n" + 
"                        <th>Column heading</th>\n" + 
"                        <th>Column heading</th>\n" + 
"                    </tr>\n" + 
"                    </thead>\n" + 
"                    <tbody>\n" + 
"                    <tr>\n" + 
"                        <td>1</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                    </tr>\n" + 
"                    <tr>\n" + 
"                        <td>2</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                    </tr>\n" + 
"                    <tr>\n" + 
"                        <td>3</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                    </tr>\n" + 
"                    <tr class=\"success\">\n" + 
"                        <td>4</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                    </tr>\n" + 
"                    <tr class=\"danger\">\n" + 
"                        <td>5</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                    </tr>\n" + 
"                    <tr class=\"warning\">\n" + 
"                        <td>6</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                    </tr>\n" + 
"                    <tr class=\"active\">\n" + 
"                        <td>7</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                        <td>Column content</td>\n" + 
"                    </tr>\n" + 
"                    </tbody>\n" + 
"                </table>\n" + 
"            </div>\n" + 
"            <!-- /example -->\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!-- Forms\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section\">\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div class=\"page-header\">\n" + 
"                <h1 id=\"forms\">Forms</h1>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-6\">\n" + 
"            <div class=\"well\">\n" + 
"                <form class=\"bs-example form-horizontal\">\n" + 
"                    <fieldset>\n" + 
"                        <legend>Legend</legend>\n" + 
"                        <div class=\"form-group\">\n" + 
"                            <label for=\"inputEmail\" class=\"col-lg-2 control-label\">Email</label>\n" + 
"\n" + 
"                            <div class=\"col-lg-10\">\n" + 
"                                <input type=\"text\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"form-group\">\n" + 
"                            <label for=\"inputPassword\" class=\"col-lg-2 control-label\">Password</label>\n" + 
"\n" + 
"                            <div class=\"col-lg-10\">\n" + 
"                                <input type=\"password\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\">\n" + 
"\n" + 
"                                <div class=\"checkbox\">\n" + 
"                                    <label>\n" + 
"                                        <input type=\"checkbox\"> Checkbox\n" + 
"                                    </label>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"form-group\">\n" + 
"                            <label for=\"textArea\" class=\"col-lg-2 control-label\">Textarea</label>\n" + 
"\n" + 
"                            <div class=\"col-lg-10\">\n" + 
"                                <textarea class=\"form-control\" rows=\"3\" id=\"textArea\"></textarea>\n" + 
"                                <span class=\"help-block\">A longer block of help text that breaks onto a new line and may extend beyond one line.</span>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"form-group\">\n" + 
"                            <label class=\"col-lg-2 control-label\">Radios</label>\n" + 
"\n" + 
"                            <div class=\"col-lg-10\">\n" + 
"                                <div class=\"radio\">\n" + 
"                                    <label>\n" + 
"                                        <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios1\" value=\"option1\"\n" + 
"                                               checked=\"\">\n" + 
"                                        Option one is this\n" + 
"                                    </label>\n" + 
"                                </div>\n" + 
"                                <div class=\"radio\">\n" + 
"                                    <label>\n" + 
"                                        <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios2\" value=\"option2\">\n" + 
"                                        Option two can be something else\n" + 
"                                    </label>\n" + 
"                                </div>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"form-group\">\n" + 
"                            <label for=\"select\" class=\"col-lg-2 control-label\">Selects</label>\n" + 
"\n" + 
"                            <div class=\"col-lg-10\">\n" + 
"                                <select class=\"form-control\" id=\"select\">\n" + 
"                                    <option>1</option>\n" + 
"                                    <option>2</option>\n" + 
"                                    <option>3</option>\n" + 
"                                    <option>4</option>\n" + 
"                                    <option>5</option>\n" + 
"                                </select>\n" + 
"                                <br>\n" + 
"                                <select multiple=\"\" class=\"form-control\">\n" + 
"                                    <option>1</option>\n" + 
"                                    <option>2</option>\n" + 
"                                    <option>3</option>\n" + 
"                                    <option>4</option>\n" + 
"                                    <option>5</option>\n" + 
"                                </select>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                        <div class=\"form-group\">\n" + 
"                            <div class=\"col-lg-10 col-lg-offset-2\">\n" + 
"                                <button class=\"btn btn-default\">Cancel</button>\n" + 
"                                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n" + 
"                            </div>\n" + 
"                        </div>\n" + 
"                    </fieldset>\n" + 
"                </form>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4 col-lg-offset-1\">\n" + 
"\n" + 
"            <form class=\"bs-example\">\n" + 
"                <div class=\"form-group\">\n" + 
"                    <label class=\"control-label\" for=\"focusedInput\">Focused input</label>\n" + 
"                    <input class=\"form-control\" id=\"focusedInput\" type=\"text\" value=\"This is focused...\">\n" + 
"                </div>\n" + 
"                <div class=\"form-group\">\n" + 
"                    <label class=\"control-label\" for=\"disabledInput\">Disabled input</label>\n" + 
"                    <input class=\"form-control\" id=\"disabledInput\" type=\"text\" placeholder=\"Disabled input here...\"\n" + 
"                           disabled=\"\">\n" + 
"                </div>\n" + 
"                <div class=\"form-group has-warning\">\n" + 
"                    <label class=\"control-label\" for=\"inputWarning\">Input warning</label>\n" + 
"                    <input type=\"text\" class=\"form-control\" id=\"inputWarning\">\n" + 
"                </div>\n" + 
"                <div class=\"form-group has-error\">\n" + 
"                    <label class=\"control-label\" for=\"inputError\">Input error</label>\n" + 
"                    <input type=\"text\" class=\"form-control\" id=\"inputError\">\n" + 
"                </div>\n" + 
"                <div class=\"form-group has-success\">\n" + 
"                    <label class=\"control-label\" for=\"inputSuccess\">Input success</label>\n" + 
"                    <input type=\"text\" class=\"form-control\" id=\"inputSuccess\">\n" + 
"                </div>\n" + 
"                <div class=\"form-group\">\n" + 
"                    <label class=\"control-label\" for=\"inputLarge\">Large input</label>\n" + 
"                    <input class=\"form-control input-lg\" type=\"text\" id=\"inputLarge\">\n" + 
"                </div>\n" + 
"                <div class=\"form-group\">\n" + 
"                    <label class=\"control-label\" for=\"inputDefault\">Default input</label>\n" + 
"                    <input type=\"text\" class=\"form-control\" id=\"inputDefault\">\n" + 
"                </div>\n" + 
"                <div class=\"form-group\">\n" + 
"                    <label class=\"control-label\" for=\"inputSmall\">Small input</label>\n" + 
"                    <input class=\"form-control input-sm\" type=\"text\" id=\"inputSmall\">\n" + 
"                </div>\n" + 
"                <div class=\"form-group\">\n" + 
"                    <label class=\"control-label\">Input addons</label>\n" + 
"\n" + 
"                    <div class=\"input-group\">\n" + 
"                        <span class=\"input-group-addon\">$</span>\n" + 
"                        <input type=\"text\" class=\"form-control\">\n" + 
"                    <span class=\"input-group-btn\">\n" + 
"                      <button class=\"btn btn-default\" type=\"button\">Button</button>\n" + 
"                    </span>\n" + 
"                    </div>\n" + 
"                </div>\n" + 
"            </form>\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!-- Navs\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section\">\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div class=\"page-header\">\n" + 
"                <h1 id=\"nav\">Navs</h1>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <h2 id=\"nav-tabs\">Tabs</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"nav nav-tabs\" style=\"margin-bottom: 15px;\">\n" + 
"                    <li class=\"active\"><a href=\"#home\" data-toggle=\"tab\">Home</a></li>\n" + 
"                    <li><a href=\"#profile\" data-toggle=\"tab\">Profile</a></li>\n" + 
"                    <li class=\"disabled\"><a>Disabled</a></li>\n" + 
"                    <li class=\"dropdown\">\n" + 
"                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n" + 
"                            Dropdown <span class=\"caret\"></span>\n" + 
"                        </a>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"#dropdown1\" data-toggle=\"tab\">Action</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"#dropdown2\" data-toggle=\"tab\">Another action</a></li>\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"                </ul>\n" + 
"                <div id=\"myTabContent\" class=\"tab-content\">\n" + 
"                    <div class=\"tab-pane fade active in\" id=\"home\">\n" + 
"                        <p>Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown\n" + 
"                            aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan\n" + 
"                            helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh\n" + 
"                            mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan\n" + 
"                            aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\n" + 
"                    </div>\n" + 
"                    <div class=\"tab-pane fade\" id=\"profile\">\n" + 
"                        <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid.\n" + 
"                            Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan\n" + 
"                            four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft\n" + 
"                            beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda\n" + 
"                            labore aesthetic magna delectus mollit.</p>\n" + 
"                    </div>\n" + 
"                    <div class=\"tab-pane fade\" id=\"dropdown1\">\n" + 
"                        <p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic\n" + 
"                            lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork\n" + 
"                            tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica.\n" + 
"                            DIY synth PBR banksy irony. Leggings gentrify squid 8-bit cred pitchfork.</p>\n" + 
"                    </div>\n" + 
"                    <div class=\"tab-pane fade\" id=\"dropdown2\">\n" + 
"                        <p>Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out\n" + 
"                            master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan\n" + 
"                            DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY\n" + 
"                            salvia PBR, banh mi before they sold out farm-to-table VHS viral locavore cosby sweater.</p>\n" + 
"                    </div>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <h2 id=\"nav-pills\">Pills</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"nav nav-pills\">\n" + 
"                    <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"                    <li><a href=\"#\">Profile</a></li>\n" + 
"                    <li class=\"disabled\"><a href=\"#\">Disabled</a></li>\n" + 
"                    <li class=\"dropdown\">\n" + 
"                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n" + 
"                            Dropdown <span class=\"caret\"></span>\n" + 
"                        </a>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"#\">Action</a></li>\n" + 
"                            <li><a href=\"#\">Another action</a></li>\n" + 
"                            <li><a href=\"#\">Something else here</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"#\">Separated link</a></li>\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"            <br>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"nav nav-pills nav-stacked\" style=\"max-width: 300px;\">\n" + 
"                    <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"                    <li><a href=\"#\">Profile</a></li>\n" + 
"                    <li class=\"disabled\"><a href=\"#\">Disabled</a></li>\n" + 
"                    <li class=\"dropdown\">\n" + 
"                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n" + 
"                            Dropdown <span class=\"caret\"></span>\n" + 
"                        </a>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a href=\"#\">Action</a></li>\n" + 
"                            <li><a href=\"#\">Another action</a></li>\n" + 
"                            <li><a href=\"#\">Something else here</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"#\">Separated link</a></li>\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <h2 id=\"nav-breadcrumbs\">Breadcrumbs</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"breadcrumb\">\n" + 
"                    <li class=\"active\">Home</li>\n" + 
"                </ul>\n" + 
"                <ul class=\"breadcrumb\">\n" + 
"                    <li><a href=\"#\">Home</a></li>\n" + 
"                    <li class=\"active\">Library</li>\n" + 
"                </ul>\n" + 
"                <ul class=\"breadcrumb\" style=\"margin-bottom: 5px;\">\n" + 
"                    <li><a href=\"#\">Home</a></li>\n" + 
"                    <li><a href=\"#\">Library</a></li>\n" + 
"                    <li class=\"active\">Data</li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <h2 id=\"pagination\">Pagination</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"pagination\">\n" + 
"                    <li class=\"disabled\"><a href=\"#\">&laquo;</a></li>\n" + 
"                    <li class=\"active\"><a href=\"#\">1</a></li>\n" + 
"                    <li><a href=\"#\">2</a></li>\n" + 
"                    <li><a href=\"#\">3</a></li>\n" + 
"                    <li><a href=\"#\">4</a></li>\n" + 
"                    <li><a href=\"#\">5</a></li>\n" + 
"                    <li><a href=\"#\">&raquo;</a></li>\n" + 
"                </ul>\n" + 
"                <ul class=\"pagination pagination-lg\">\n" + 
"                    <li class=\"disabled\"><a href=\"#\">&laquo;</a></li>\n" + 
"                    <li class=\"active\"><a href=\"#\">1</a></li>\n" + 
"                    <li><a href=\"#\">2</a></li>\n" + 
"                    <li><a href=\"#\">3</a></li>\n" + 
"                    <li><a href=\"#\">&raquo;</a></li>\n" + 
"                </ul>\n" + 
"                <ul class=\"pagination pagination-sm\">\n" + 
"                    <li class=\"disabled\"><a href=\"#\">&laquo;</a></li>\n" + 
"                    <li class=\"active\"><a href=\"#\">1</a></li>\n" + 
"                    <li><a href=\"#\">2</a></li>\n" + 
"                    <li><a href=\"#\">3</a></li>\n" + 
"                    <li><a href=\"#\">4</a></li>\n" + 
"                    <li><a href=\"#\">5</a></li>\n" + 
"                    <li><a href=\"#\">&raquo;</a></li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <h2 id=\"pager\">Pager</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"pager\">\n" + 
"                    <li><a href=\"#\">Previous</a></li>\n" + 
"                    <li><a href=\"#\">Next</a></li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"pager\">\n" + 
"                    <li class=\"previous disabled\"><a href=\"#\">&larr; Older</a></li>\n" + 
"                    <li class=\"next\"><a href=\"#\">Newer &rarr;</a></li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!-- Indicators\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section\">\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div class=\"page-header\">\n" + 
"                <h1 id=\"indicators\">Indicators</h1>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <h2>Alerts</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"alert alert-dismissable alert-warning\">\n" + 
"                    <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n" + 
"                    <h4>Warning!</h4>\n" + 
"\n" + 
"                    <p>Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue.\n" + 
"                        Praesent commodo cursus magna, <a href=\"#\" class=\"alert-link\">vel scelerisque nisl consectetur\n" + 
"                            et</a>.</p>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"alert alert-dismissable alert-danger\">\n" + 
"                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n" + 
"                <strong>Oh snap!</strong> <a href=\"#\" class=\"alert-link\">Change a few things up</a> and try submitting\n" + 
"                again.\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"alert alert-dismissable alert-success\">\n" + 
"                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n" + 
"                <strong>Well done!</strong> You successfully read <a href=\"#\" class=\"alert-link\">this important alert\n" + 
"                message</a>.\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"alert alert-dismissable alert-info\">\n" + 
"                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n" + 
"                <strong>Heads up!</strong> This <a href=\"#\" class=\"alert-link\">alert needs your attention</a>, but it's\n" + 
"                not super important.\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <h2>Labels</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\" style=\"margin-bottom: 40px;\">\n" + 
"                <span class=\"label label-default\">Default</span>\n" + 
"                <span class=\"label label-primary\">Primary</span>\n" + 
"                <span class=\"label label-success\">Success</span>\n" + 
"                <span class=\"label label-warning\">Warning</span>\n" + 
"                <span class=\"label label-danger\">Danger</span>\n" + 
"                <span class=\"label label-info\">Info</span>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <h2>Badges</h2>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"nav nav-pills\">\n" + 
"                    <li class=\"active\"><a href=\"#\">Home <span class=\"badge\">42</span></a></li>\n" + 
"                    <li><a href=\"#\">Profile <span class=\"badge\"></span></a></li>\n" + 
"                    <li><a href=\"#\">Messages <span class=\"badge\">3</span></a></li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!-- Progress bars\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section\">\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div class=\"page-header\">\n" + 
"                <h1 id=\"progress\">Progress bars</h1>\n" + 
"            </div>\n" + 
"\n" + 
"\n" + 
"            <h3 id=\"progress-basic\">Basic</h3>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"progress\">\n" + 
"                    <div class=\"progress-bar\" style=\"width: 60%;\"></div>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"\n" + 
"            <h3 id=\"progress-alternatives\">Contextual alternatives</h3>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"progress\" style=\"margin-bottom: 9px;\">\n" + 
"                    <div class=\"progress-bar progress-bar-info\" style=\"width: 20%\"></div>\n" + 
"                </div>\n" + 
"                <div class=\"progress\" style=\"margin-bottom: 9px;\">\n" + 
"                    <div class=\"progress-bar progress-bar-success\" style=\"width: 40%\"></div>\n" + 
"                </div>\n" + 
"                <div class=\"progress\" style=\"margin-bottom: 9px;\">\n" + 
"                    <div class=\"progress-bar progress-bar-warning\" style=\"width: 60%\"></div>\n" + 
"                </div>\n" + 
"                <div class=\"progress\">\n" + 
"                    <div class=\"progress-bar progress-bar-danger\" style=\"width: 80%\"></div>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"\n" + 
"            <h3 id=\"progress-striped\">Striped</h3>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"progress progress-striped\" style=\"margin-bottom: 9px;\">\n" + 
"                    <div class=\"progress-bar progress-bar-info\" style=\"width: 20%\"></div>\n" + 
"                </div>\n" + 
"                <div class=\"progress progress-striped\" style=\"margin-bottom: 9px;\">\n" + 
"                    <div class=\"progress-bar progress-bar-success\" style=\"width: 40%\"></div>\n" + 
"                </div>\n" + 
"                <div class=\"progress progress-striped\" style=\"margin-bottom: 9px;\">\n" + 
"                    <div class=\"progress-bar progress-bar-warning\" style=\"width: 60%\"></div>\n" + 
"                </div>\n" + 
"                <div class=\"progress progress-striped\">\n" + 
"                    <div class=\"progress-bar progress-bar-danger\" style=\"width: 80%\"></div>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"\n" + 
"            <h3 id=\"progress-animated\">Animated</h3>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"progress progress-striped active\">\n" + 
"                    <div class=\"progress-bar\" style=\"width: 45%\"></div>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"\n" + 
"            <h3 id=\"progress-stacked\">Stacked</h3>\n" + 
"\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"progress\">\n" + 
"                    <div class=\"progress-bar progress-bar-success\" style=\"width: 35%\"></div>\n" + 
"                    <div class=\"progress-bar progress-bar-warning\" style=\"width: 20%\"></div>\n" + 
"                    <div class=\"progress-bar progress-bar-danger\" style=\"width: 10%\"></div>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<!-- Containers\n" + 
"================================================== -->\n" + 
"<div class=\"bs-docs-section\">\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div class=\"page-header\">\n" + 
"                <h1 id=\"container\">Containers</h1>\n" + 
"            </div>\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"jumbotron\">\n" + 
"                    <h1>Jumbotron</h1>\n" + 
"\n" + 
"                    <p>This is a simple hero unit, a simple jumbotron-style component for calling extra attention to\n" + 
"                        featured content or information.</p>\n" + 
"\n" + 
"                    <p><a class=\"btn btn-primary btn-lg\">Learn more</a></p>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <h2>List groups</h2>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"bs-example\">\n" + 
"                <ul class=\"list-group\">\n" + 
"                    <li class=\"list-group-item\">\n" + 
"                        <span class=\"badge\">14</span>\n" + 
"                        Cras justo odio\n" + 
"                    </li>\n" + 
"                    <li class=\"list-group-item\">\n" + 
"                        <span class=\"badge\">2</span>\n" + 
"                        Dapibus ac facilisis in\n" + 
"                    </li>\n" + 
"                    <li class=\"list-group-item\">\n" + 
"                        <span class=\"badge\">1</span>\n" + 
"                        Morbi leo risus\n" + 
"                    </li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"list-group\">\n" + 
"                    <a href=\"#\" class=\"list-group-item active\">\n" + 
"                        Cras justo odio\n" + 
"                    </a>\n" + 
"                    <a href=\"#\" class=\"list-group-item\">Dapibus ac facilisis in\n" + 
"                    </a>\n" + 
"                    <a href=\"#\" class=\"list-group-item\">Morbi leo risus\n" + 
"                    </a>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"bs-example\">\n" + 
"                <div class=\"list-group\">\n" + 
"                    <a href=\"#\" class=\"list-group-item\">\n" + 
"                        <h4 class=\"list-group-item-heading\">List group item heading</h4>\n" + 
"\n" + 
"                        <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed\n" + 
"                            diam eget risus varius blandit.</p>\n" + 
"                    </a>\n" + 
"                    <a href=\"#\" class=\"list-group-item\">\n" + 
"                        <h4 class=\"list-group-item-heading\">List group item heading</h4>\n" + 
"\n" + 
"                        <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed\n" + 
"                            diam eget risus varius blandit.</p>\n" + 
"                    </a>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <h2>Panels</h2>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"panel panel-default\">\n" + 
"                <div class=\"panel-body\">\n" + 
"                    Basic panel\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"panel panel-default\">\n" + 
"                <div class=\"panel-heading\">Panel heading</div>\n" + 
"                <div class=\"panel-body\">\n" + 
"                    Panel content\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"panel panel-default\">\n" + 
"                <div class=\"panel-body\">\n" + 
"                    Panel content\n" + 
"                </div>\n" + 
"                <div class=\"panel-footer\">Panel footer</div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"panel panel-primary\">\n" + 
"                <div class=\"panel-heading\">\n" + 
"                    <h3 class=\"panel-title\">Panel primary</h3>\n" + 
"                </div>\n" + 
"                <div class=\"panel-body\">\n" + 
"                    Panel content\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"panel panel-success\">\n" + 
"                <div class=\"panel-heading\">\n" + 
"                    <h3 class=\"panel-title\">Panel success</h3>\n" + 
"                </div>\n" + 
"                <div class=\"panel-body\">\n" + 
"                    Panel content\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"panel panel-warning\">\n" + 
"                <div class=\"panel-heading\">\n" + 
"                    <h3 class=\"panel-title\">Panel warning</h3>\n" + 
"                </div>\n" + 
"                <div class=\"panel-body\">\n" + 
"                    Panel content\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"panel panel-danger\">\n" + 
"                <div class=\"panel-heading\">\n" + 
"                    <h3 class=\"panel-title\">Panel danger</h3>\n" + 
"                </div>\n" + 
"                <div class=\"panel-body\">\n" + 
"                    Panel content\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"panel panel-info\">\n" + 
"                <div class=\"panel-heading\">\n" + 
"                    <h3 class=\"panel-title\">Panel info</h3>\n" + 
"                </div>\n" + 
"                <div class=\"panel-body\">\n" + 
"                    Panel content\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <h2>Wells</h2>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"well\">\n" + 
"                Look, I'm in a well!\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"well well-sm\">\n" + 
"                Look, I'm in a small well!\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-4\">\n" + 
"            <div class=\"well well-lg\">\n" + 
"                Look, I'm in a large well!\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"<footer>\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"col-lg-12\">\n" + 
"\n" + 
"            <ul class=\"list-unstyled\">\n" + 
"                <li class=\"pull-right\"><a href=\"#top\">Back to top</a></li>\n" + 
"                <li><a href=\"http://news.bootswatch.com\" onclick=\"pageTracker._link(this.href); return false;\">Blog</a>\n" + 
"                </li>\n" + 
"                <li><a href=\"http://feeds.feedburner.com/bootswatch\">RSS</a></li>\n" + 
"                <li><a href=\"https://twitter.com/thomashpark\">Twitter</a></li>\n" + 
"                <li><a href=\"https://github.com/thomaspark/bootswatch/\">GitHub</a></li>\n" + 
"                <li><a href=\"../help/#api\">API</a></li>\n" + 
"                <li><a href=\"https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&amp;hosted_button_id=F22JEM3Q78JC2\">Donate</a>\n" + 
"                </li>\n" + 
"            </ul>\n" + 
"            <p>Made by <a href=\"http://thomaspark.me\">Thomas Park</a>. Contact him at <a\n" + 
"                    href=\"mailto:hello@thomaspark.me\">hello@thomaspark.me</a>.</p>\n" + 
"\n" + 
"            <p>Code licensed under the <a href=\"http://www.apache.org/licenses/LICENSE-2.0\">Apache License v2.0</a>.</p>\n" + 
"\n" + 
"            <p>Based on <a href=\"http://getbootstrap.com\">Bootstrap</a>. Icons from <a\n" + 
"                    href=\"http://fortawesome.github.io/Font-Awesome/\">Font Awesome</a>. Web fonts from <a\n" + 
"                    href=\"http://www.google.com/webfonts\">Google</a>. Favicon by <a\n" + 
"                    href=\"https://twitter.com/geraldhiller\">Gerald Hiller</a>.</p>\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"</footer>\n" + 
"\n" + 
"\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"</body>\n" + 
"</html>");// line 14, japidviews\Application\Theme.html
		
		endDoLayout(sourceTemplate);
	}

}