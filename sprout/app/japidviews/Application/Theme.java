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
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
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
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/Application/Theme.html
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
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 1, japidviews\Application\Theme.html
		p(lookupStatic("/public/bootstrap/css/bootstrap.min.css"));// line 7, japidviews\Application\Theme.html
		p("\">\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 7, japidviews\Application\Theme.html
		p(lookupStatic("/public/bootstrap/css/bootstrap.theme.css"));// line 8, japidviews\Application\Theme.html
		p("\">\n" + 
"    <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 8, japidviews\Application\Theme.html
		p(lookupStatic("/public/demo/bootswatch.css"));// line 9, japidviews\Application\Theme.html
		p("\">\n" + 
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
"    <script src=\"");// line 14, japidviews\Application\Theme.html
		p(lookupStatic("/public/js/jquery.smooth-scroll.js"));// line 15, japidviews\Application\Theme.html
		p("\"></script>\n" + 
"    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n" + 
"    <!--[if lt IE 9]>\n" + 
"    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" + 
"    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n" + 
"    <![endif]-->\n" + 
"\n" + 
"</head>\n" + 
"<body>\n" + 
"\n" + 
"\n" + 
"<!-- Navbar\n" + 
"  ================================================== -->\n" + 
"<div class=\"navbar navbar-fixed-top\">\n" + 
"    <div class=\"navbar-inner\">\n" + 
"        <div class=\"container\">\n" + 
"            <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"            </a>\n" + 
"            <a class=\"brand\" href=\"../\">Bootswatch</a>\n" + 
"\n" + 
"            <div class=\"nav-collapse collapse\" id=\"main-menu\">\n" + 
"                <ul class=\"nav\" id=\"main-menu-left\">\n" + 
"                    <li>\n" + 
"                        <a onclick=\"pageTracker._link(this.href); return false;\" href=\"http://news.bootswatch.com\">News</a>\n" + 
"                    </li>\n" + 
"                    <li><a id=\"swatch-link\" href=\"../#gallery\">Gallery</a></li>\n" + 
"                    <li class=\"dropdown\">\n" + 
"                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Preview <b class=\"caret\"></b></a>\n" + 
"                        <ul class=\"dropdown-menu\" id=\"swatch-menu\">\n" + 
"                            <li><a href=\"../default/\">Default</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a href=\"../amelia/\">Amelia</a></li>\n" + 
"                            <li><a href=\"../cerulean/\">Cerulean</a></li>\n" + 
"                            <li><a href=\"../cosmo/\">Cosmo</a></li>\n" + 
"                            <li><a href=\"../cyborg/\">Cyborg</a></li>\n" + 
"                            <li><a href=\"../flatly/\">Flatly</a></li>\n" + 
"                            <li><a href=\"../journal/\">Journal</a></li>\n" + 
"                            <li><a href=\"../readable/\">Readable</a></li>\n" + 
"                            <li><a href=\"../simplex/\">Simplex</a></li>\n" + 
"                            <li><a href=\"../slate/\">Slate</a></li>\n" + 
"                            <li><a href=\"../spacelab/\">Spacelab</a></li>\n" + 
"                            <li><a href=\"../spruce/\">Spruce</a></li>\n" + 
"                            <li><a href=\"../superhero/\">Superhero</a></li>\n" + 
"                            <li><a href=\"../united/\">United</a></li>\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"                    <li class=\"dropdown\" id=\"preview-menu\">\n" + 
"                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Download <b class=\"caret\"></b></a>\n" + 
"                        <ul class=\"dropdown-menu\">\n" + 
"                            <li><a target=\"_blank\" href=\"bootstrap.min.css\">bootstrap.min.css</a></li>\n" + 
"                            <li><a target=\"_blank\" href=\"bootstrap.css\">bootstrap.css</a></li>\n" + 
"                            <li class=\"divider\"></li>\n" + 
"                            <li><a target=\"_blank\" href=\"variables.less\">variables.less</a></li>\n" + 
"                            <li><a target=\"_blank\" href=\"bootswatch.less\">bootswatch.less</a></li>\n" + 
"                        </ul>\n" + 
"                    </li>\n" + 
"                </ul>\n" + 
"                <ul class=\"nav pull-right\" id=\"main-menu-right\">\n" + 
"                    <li>\n" + 
"                        <a rel=\"tooltip\" target=\"_blank\" href=\"http://builtwithbootstrap.com/\" title=\"Showcase of Bootstrap sites &amp; apps\" onclick=\"_gaq.push(['_trackEvent', 'click', 'outbound', 'builtwithbootstrap']);\">Built\n" + 
"                            With Bootstrap <i class=\"icon-share-alt\"></i></a></li>\n" + 
"                    <li>\n" + 
"                        <a rel=\"tooltip\" target=\"_blank\" href=\"https://wrapbootstrap.com/?ref=bsw\" title=\"Marketplace for premium Bootstrap templates\" onclick=\"_gaq.push(['_trackEvent', 'click', 'outbound', 'wrapbootstrap']);\">WrapBootstrap\n" + 
"                            <i class=\"icon-share-alt\"></i></a></li>\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<div class=\"container\">\n" + 
"\n" + 
"\n" + 
"<!-- Masthead\n" + 
"================================================== -->\n" + 
"<header class=\"jumbotron subhead\" id=\"overview\">\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"span6\">\n" + 
"            <h1>Spacelab</h1>\n" + 
"\n" + 
"            <p class=\"lead\">Silvery and sleek.</p>\n" + 
"        </div>\n" + 
"        <div class=\"span6\">\n" + 
"            <div class=\"bsa well\">\n" + 
"                <div id=\"bsap_1277971\" class=\"bsarocks bsap_c466df00a3cd5ee8568b5c4983b6bb19\"></div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"subnav\">\n" + 
"        <ul class=\"nav nav-pills\">\n" + 
"            <li><a href=\"#typography\">Typography</a></li>\n" + 
"            <li><a href=\"#navbar\">Navbar</a></li>\n" + 
"            <li><a href=\"#buttons\">Buttons</a></li>\n" + 
"            <li><a href=\"#forms\">Forms</a></li>\n" + 
"            <li><a href=\"#tables\">Tables</a></li>\n" + 
"            <li><a href=\"#miscellaneous\">Miscellaneous</a></li>\n" + 
"        </ul>\n" + 
"    </div>\n" + 
"</header>\n" + 
"\n" + 
"\n" + 
"<!-- Typography\n" + 
"================================================== -->\n" + 
"<section id=\"typography\">\n" + 
"    <div class=\"page-header\">\n" + 
"        <h1>Typography</h1>\n" + 
"    </div>\n" + 
"\n" + 
"    <!-- Headings & Paragraph Copy -->\n" + 
"    <div class=\"row\">\n" + 
"\n" + 
"        <div class=\"span4\">\n" + 
"            <div class=\"well\">\n" + 
"                <h1>h1. Heading 1</h1>\n" + 
"\n" + 
"                <h2>h2. Heading 2</h2>\n" + 
"\n" + 
"                <h3>h3. Heading 3</h3>\n" + 
"                <h4>h4. Heading 4</h4>\n" + 
"                <h5>h5. Heading 5</h5>\n" + 
"                <h6>h6. Heading 6</h6>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"\n" + 
"        <div class=\"span4\">\n" + 
"            <h3>Example body text</h3>\n" + 
"\n" + 
"            <p>Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis\n" + 
"                parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n" + 
"\n" + 
"            <p>Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo\n" + 
"                luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Donec sed odio dui.</p>\n" + 
"        </div>\n" + 
"\n" + 
"        <div class=\"span4\">\n" + 
"            <h3>Example addresses</h3>\n" + 
"            <address>\n" + 
"                <strong>Twitter, Inc.</strong><br>\n" + 
"                795 Folsom Ave, Suite 600<br>\n" + 
"                San Francisco, CA 94107<br>\n" + 
"                <abbr title=\"Phone\">P:</abbr> (123) 456-7890\n" + 
"            </address>\n" + 
"            <address>\n" + 
"                <strong>Full Name</strong><br>\n" + 
"                <a href=\"mailto:#\">first.last@gmail.com</a>\n" + 
"            </address>\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"span6\">\n" + 
"            <blockquote>\n" + 
"                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n" + 
"                <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\n" + 
"            </blockquote>\n" + 
"        </div>\n" + 
"        <div class=\"span6\">\n" + 
"            <blockquote class=\"pull-right\">\n" + 
"                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n" + 
"                <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\n" + 
"            </blockquote>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"</section>\n" + 
"\n" + 
"\n" + 
"<!-- Navbar\n" + 
"================================================== -->\n" + 
"<section id=\"navbar\">\n" + 
"    <div class=\"page-header\">\n" + 
"        <h1>Navbars</h1>\n" + 
"    </div>\n" + 
"    <div class=\"navbar\">\n" + 
"        <div class=\"navbar-inner\">\n" + 
"            <div class=\"container\" style=\"width: auto;\">\n" + 
"                <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                </a>\n" + 
"                <a class=\"brand\" href=\"#\">Project name</a>\n" + 
"\n" + 
"                <div class=\"nav-collapse\">\n" + 
"                    <ul class=\"nav\">\n" + 
"                        <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"                        <li><a href=\"#\">Link</a></li>\n" + 
"                        <li><a href=\"#\">Link</a></li>\n" + 
"                        <li><a href=\"#\">Link</a></li>\n" + 
"                        <li class=\"dropdown\">\n" + 
"                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown\n" + 
"                                <b class=\"caret\"></b></a>\n" + 
"                            <ul class=\"dropdown-menu\">\n" + 
"                                <li><a href=\"#\">Action</a></li>\n" + 
"                                <li><a href=\"#\">Another action</a></li>\n" + 
"                                <li><a href=\"#\">Something else here</a></li>\n" + 
"                                <li class=\"divider\"></li>\n" + 
"                                <li><a href=\"#\">Separated link</a></li>\n" + 
"                            </ul>\n" + 
"                        </li>\n" + 
"                    </ul>\n" + 
"                    <form class=\"navbar-search pull-left\" action=\"\">\n" + 
"                        <input type=\"text\" class=\"search-query span2\" placeholder=\"Search\">\n" + 
"                    </form>\n" + 
"                    <ul class=\"nav pull-right\">\n" + 
"                        <li><a href=\"#\">Link</a></li>\n" + 
"                        <li class=\"divider-vertical\"></li>\n" + 
"                        <li class=\"dropdown\">\n" + 
"                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown\n" + 
"                                <b class=\"caret\"></b></a>\n" + 
"                            <ul class=\"dropdown-menu\">\n" + 
"                                <li><a href=\"#\">Action</a></li>\n" + 
"                                <li><a href=\"#\">Another action</a></li>\n" + 
"                                <li><a href=\"#\">Something else here</a></li>\n" + 
"                                <li class=\"divider\"></li>\n" + 
"                                <li><a href=\"#\">Separated link</a></li>\n" + 
"                            </ul>\n" + 
"                        </li>\n" + 
"                    </ul>\n" + 
"                </div>\n" + 
"                <!-- /.nav-collapse -->\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <!-- /navbar-inner -->\n" + 
"    </div>\n" + 
"    <!-- /navbar -->\n" + 
"\n" + 
"    <div class=\"navbar navbar-inverse\">\n" + 
"        <div class=\"navbar-inner\">\n" + 
"            <div class=\"container\" style=\"width: auto;\">\n" + 
"                <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                    <span class=\"icon-bar\"></span>\n" + 
"                </a>\n" + 
"                <a class=\"brand\" href=\"#\">Project name</a>\n" + 
"\n" + 
"                <div class=\"nav-collapse\">\n" + 
"                    <ul class=\"nav\">\n" + 
"                        <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"                        <li><a href=\"#\">Link</a></li>\n" + 
"                        <li><a href=\"#\">Link</a></li>\n" + 
"                        <li><a href=\"#\">Link</a></li>\n" + 
"                        <li class=\"dropdown\">\n" + 
"                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown\n" + 
"                                <b class=\"caret\"></b></a>\n" + 
"                            <ul class=\"dropdown-menu\">\n" + 
"                                <li><a href=\"#\">Action</a></li>\n" + 
"                                <li><a href=\"#\">Another action</a></li>\n" + 
"                                <li><a href=\"#\">Something else here</a></li>\n" + 
"                                <li class=\"divider\"></li>\n" + 
"                                <li><a href=\"#\">Separated link</a></li>\n" + 
"                            </ul>\n" + 
"                        </li>\n" + 
"                    </ul>\n" + 
"                    <form class=\"navbar-search pull-left\" action=\"\">\n" + 
"                        <input type=\"text\" class=\"search-query span2\" placeholder=\"Search\">\n" + 
"                    </form>\n" + 
"                    <ul class=\"nav pull-right\">\n" + 
"                        <li><a href=\"#\">Link</a></li>\n" + 
"                        <li class=\"divider-vertical\"></li>\n" + 
"                        <li class=\"dropdown\">\n" + 
"                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown\n" + 
"                                <b class=\"caret\"></b></a>\n" + 
"                            <ul class=\"dropdown-menu\">\n" + 
"                                <li><a href=\"#\">Action</a></li>\n" + 
"                                <li><a href=\"#\">Another action</a></li>\n" + 
"                                <li><a href=\"#\">Something else here</a></li>\n" + 
"                                <li class=\"divider\"></li>\n" + 
"                                <li><a href=\"#\">Separated link</a></li>\n" + 
"                            </ul>\n" + 
"                        </li>\n" + 
"                    </ul>\n" + 
"                </div>\n" + 
"                <!-- /.nav-collapse -->\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <!-- /navbar-inner -->\n" + 
"    </div>\n" + 
"    <!-- /navbar -->\n" + 
"\n" + 
"</section>\n" + 
"\n" + 
"\n" + 
"<!-- Buttons\n" + 
"================================================== -->\n" + 
"<section id=\"buttons\">\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Buttons</h1>\n" + 
"</div>\n" + 
"<table class=\"table table-bordered table-striped\">\n" + 
"<thead>\n" + 
"<tr>\n" + 
"    <th>Button</th>\n" + 
"    <th>Large Button</th>\n" + 
"    <th>Small Button</th>\n" + 
"    <th>Disabled Button</th>\n" + 
"    <th>Button with Icon</th>\n" + 
"    <th>Split Button</th>\n" + 
"</tr>\n" + 
"</thead>\n" + 
"<tbody>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn\" href=\"#\">Default</a></td>\n" + 
"    <td><a class=\"btn btn-large\" href=\"#\">Default</a></td>\n" + 
"    <td><a class=\"btn btn-small\" href=\"#\">Default</a></td>\n" + 
"    <td><a class=\"btn disabled\" href=\"#\">Default</a></td>\n" + 
"    <td><a class=\"btn\" href=\"#\"><i class=\"icon-cog\"></i> Default</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn\" href=\"#\">Default</a>\n" + 
"            <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn btn-primary\" href=\"#\">Primary</a></td>\n" + 
"    <td><a class=\"btn btn-primary btn-large\" href=\"#\">Primary</a></td>\n" + 
"    <td><a class=\"btn btn-primary btn-small\" href=\"#\">Primary</a></td>\n" + 
"    <td><a class=\"btn btn-primary disabled\" href=\"#\">Primary</a></td>\n" + 
"    <td><a class=\"btn btn-primary\" href=\"#\"><i class=\"icon-shopping-cart icon-white\"></i> Primary</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn btn-primary\" href=\"#\">Primary</a>\n" + 
"            <a class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn btn-info\" href=\"#\">Info</a></td>\n" + 
"    <td><a class=\"btn btn-info btn-large\" href=\"#\">Info</a></td>\n" + 
"    <td><a class=\"btn btn-info btn-small\" href=\"#\">Info</a></td>\n" + 
"    <td><a class=\"btn btn-info disabled\" href=\"#\">Info</a></td>\n" + 
"    <td><a class=\"btn btn-info\" href=\"#\"><i class=\"icon-exclamation-sign icon-white\"></i> Info</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn btn-info\" href=\"#\">Info</a>\n" + 
"            <a class=\"btn btn-info dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn btn-success\" href=\"#\">Success</a></td>\n" + 
"    <td><a class=\"btn btn-success btn-large\" href=\"#\">Success</a></td>\n" + 
"    <td><a class=\"btn btn-success btn-small\" href=\"#\">Success</a></td>\n" + 
"    <td><a class=\"btn btn-success disabled\" href=\"#\">Success</a></td>\n" + 
"    <td><a class=\"btn btn-success\" href=\"#\"><i class=\"icon-ok icon-white\"></i> Success</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn btn-success\" href=\"#\">Success</a>\n" + 
"            <a class=\"btn btn-success dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn btn-warning\" href=\"#\">Warning</a></td>\n" + 
"    <td><a class=\"btn btn-warning btn-large\" href=\"#\">Warning</a></td>\n" + 
"    <td><a class=\"btn btn-warning btn-small\" href=\"#\">Warning</a></td>\n" + 
"    <td><a class=\"btn btn-warning disabled\" href=\"#\">Warning</a></td>\n" + 
"    <td><a class=\"btn btn-warning\" href=\"#\"><i class=\"icon-warning-sign icon-white\"></i> Warning</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn btn-warning\" href=\"#\">Warning</a>\n" + 
"            <a class=\"btn btn-warning dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn btn-danger\" href=\"#\">Danger</a></td>\n" + 
"    <td><a class=\"btn btn-danger btn-large\" href=\"#\">Danger</a></td>\n" + 
"    <td><a class=\"btn btn-danger btn-small\" href=\"#\">Danger</a></td>\n" + 
"    <td><a class=\"btn btn-danger disabled\" href=\"#\">Danger</a></td>\n" + 
"    <td><a class=\"btn btn-danger\" href=\"#\"><i class=\"icon-remove icon-white\"></i> Danger</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn btn-danger\" href=\"#\">Danger</a>\n" + 
"            <a class=\"btn btn-danger dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn btn-inverse\" href=\"#\">Inverse</a></td>\n" + 
"    <td><a class=\"btn btn-inverse btn-large\" href=\"#\">Inverse</a></td>\n" + 
"    <td><a class=\"btn btn-inverse btn-small\" href=\"#\">Inverse</a></td>\n" + 
"    <td><a class=\"btn btn-inverse disabled\" href=\"#\">Inverse</a></td>\n" + 
"    <td><a class=\"btn btn-inverse\" href=\"#\"><i class=\"icon-random icon-white\"></i> Inverse</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn btn-inverse\" href=\"#\">Inverse</a>\n" + 
"            <a class=\"btn btn-inverse dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn flat-btn \" href=\"#\">flat btn</a></td>\n" + 
"    <td><a class=\"btn flat-btn  btn-large\" href=\"#\">flat btn</a></td>\n" + 
"    <td><a class=\"btn flat-btn  btn-small\" href=\"#\">flat btn</a></td>\n" + 
"    <td><a class=\"btn flat-btn  disabled\" href=\"#\">flat btn</a></td>\n" + 
"    <td><a class=\"btn flat-btn \" href=\"#\"><i class=\"icon-exclamation-sign\"></i> flat btn</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn \" href=\"#\">flat btn</a>\n" + 
"            <a class=\"btn flat-btn  dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-blue\" href=\"#\">Blue</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-blue btn-large\" href=\"#\">Blue</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-blue btn-small\" href=\"#\">Blue</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-blue disabled\" href=\"#\">Blue</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-blue\" href=\"#\"><i class=\"icon-exclamation-sign icon-white\"></i> Blue</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-blue\" href=\"#\">Blue</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-blue dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-green\" href=\"#\">Green</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-green btn-large\" href=\"#\">Green</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-green btn-small\" href=\"#\">Green</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-green disabled\" href=\"#\">Green</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-green\" href=\"#\"><i class=\"icon-exclamation-sign icon-white\"></i> Green</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-green\" href=\"#\">Green</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-green dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td>\n" + 
"\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-green  dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Green\n" + 
"                <span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"\n" + 
"    </td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-green btn-large\" href=\"#\">Green</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-green btn-large dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"\n" + 
"    </td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-green btn-small\" href=\"#\">Green</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-green btn-small dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"    </td>\n" + 
"    <td>\n" + 
"\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-green disabled\" href=\"#\">Green</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-green disabled dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"    </td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-green btn-small\" href=\"#\">Green</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-green btn-small dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"    </td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-green\" href=\"#\">Green</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-green dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"\n" + 
"<tr>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-red\" href=\"#\">red</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-red btn-large\" href=\"#\">red</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-red btn-small\" href=\"#\">red</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-red disabled\" href=\"#\">red</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-red\" href=\"#\"><i class=\"icon-exclamation-sign icon-white\"></i> red</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-red\" href=\"#\">red</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-red dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-cyan\" href=\"#\">cyan</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-cyan btn-large\" href=\"#\">cyan</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-cyan btn-small\" href=\"#\">cyan</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-cyan disabled\" href=\"#\">cyan</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-cyan\" href=\"#\"><i class=\"icon-exclamation-sign icon-white\"></i> cyan</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-cyan\" href=\"#\">cyan</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-cyan dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-orange\" href=\"#\">orange</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-orange btn-large\" href=\"#\">orange</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-orange btn-small\" href=\"#\">orange</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-orange disabled\" href=\"#\">orange</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-orange\" href=\"#\"><i class=\"icon-exclamation-sign icon-white\"></i> orange</a>\n" + 
"    </td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-orange\" href=\"#\">orange</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-orange dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-black\" href=\"#\">black</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-black btn-large\" href=\"#\">black</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-black btn-small\" href=\"#\">black</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-black disabled\" href=\"#\">black</a></td>\n" + 
"    <td><a class=\"btn flat-btn flat-btn-black\" href=\"#\"><i class=\"icon-exclamation-sign icon-white\"></i> black</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn flat-btn flat-btn-black\" href=\"#\">black</a>\n" + 
"            <a class=\"btn flat-btn flat-btn-black dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"<tr>\n" + 
"    <td><a class=\"btn btn-link\" href=\"#\">link</a></td>\n" + 
"    <td><a class=\"btn btn-link btn-large\" href=\"#\">link</a></td>\n" + 
"    <td><a class=\"btn btn-link btn-small\" href=\"#\">link</a></td>\n" + 
"    <td><a class=\"btn btn-link disabled\" href=\"#\">link</a></td>\n" + 
"    <td><a class=\"btn btn-link\" href=\"#\"><i class=\"icon-exclamation-sign icon-white\"></i> link</a></td>\n" + 
"    <td>\n" + 
"        <div class=\"btn-group\">\n" + 
"            <a class=\"btn btn-link\" href=\"#\">link</a>\n" + 
"            <a class=\"btn btn-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n" + 
"            <ul class=\"dropdown-menu\">\n" + 
"                <li><a href=\"#\">Action</a></li>\n" + 
"                <li><a href=\"#\">Another action</a></li>\n" + 
"                <li><a href=\"#\">Something else here</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Separated link</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <!-- /btn-group -->\n" + 
"    </td>\n" + 
"</tr>\n" + 
"</tbody>\n" + 
"</table>\n" + 
"\n" + 
"</section>\n" + 
"\n" + 
"\n" + 
"<!-- Forms\n" + 
"================================================== -->\n" + 
"<section id=\"forms\">\n" + 
"    <div class=\"page-header\">\n" + 
"        <h1>Forms</h1>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"row\">\n" + 
"        <div class=\"span10 offset1\">\n" + 
"\n" + 
"            <form class=\"well form-search\">\n" + 
"                <input type=\"text\" class=\"input-medium search-query\">\n" + 
"                <button type=\"submit\" class=\"btn\">Search</button>\n" + 
"            </form>\n" + 
"\n" + 
"            <form class=\"well form-search\">\n" + 
"                <input type=\"text\" class=\"input-small\" placeholder=\"Email\">\n" + 
"                <input type=\"password\" class=\"input-small\" placeholder=\"Password\">\n" + 
"                <button type=\"submit\" class=\"btn\">Go</button>\n" + 
"            </form>\n" + 
"\n" + 
"\n" + 
"            <form class=\"form-horizontal well\">\n" + 
"                <fieldset>\n" + 
"                    <legend>Controls Bootstrap supports</legend>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"input01\">Text input</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" class=\"input-xlarge\" id=\"input01\">\n" + 
"\n" + 
"                            <p class=\"help-block\">In addition to freeform text, any HTML5 text-based input appears like\n" + 
"                                so.</p>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"optionsCheckbox\">Checkbox</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <label class=\"checkbox\">\n" + 
"                                <input type=\"checkbox\" id=\"optionsCheckbox\" value=\"option1\">\n" + 
"                                Option one is this and that&mdash;be sure to include why it's great\n" + 
"                            </label>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"select01\">Select list</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <select id=\"select01\">\n" + 
"                                <option>something</option>\n" + 
"                                <option>2</option>\n" + 
"                                <option>3</option>\n" + 
"                                <option>4</option>\n" + 
"                                <option>5</option>\n" + 
"                            </select>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"multiSelect\">Multicon-select</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <select multiple=\"multiple\" id=\"multiSelect\">\n" + 
"                                <option>1</option>\n" + 
"                                <option>2</option>\n" + 
"                                <option>3</option>\n" + 
"                                <option>4</option>\n" + 
"                                <option>5</option>\n" + 
"                            </select>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"fileInput\">File input</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input class=\"input-file\" id=\"fileInput\" type=\"file\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"textarea\">Textarea</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <textarea class=\"input-xlarge\" id=\"textarea\" rows=\"3\"></textarea>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"focusedInput\">Focused input</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input class=\"input-xlarge focused\" id=\"focusedInput\" type=\"text\" value=\"This is focused…\">\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\">Uneditable input</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <span class=\"input-xlarge uneditable-input\">Some value here</span>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"disabledInput\">Disabled input</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input class=\"input-xlarge disabled\" id=\"disabledInput\" type=\"text\" placeholder=\"Disabled input here…\" disabled>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group\">\n" + 
"                        <label class=\"control-label\" for=\"optionsCheckbox2\">Disabled checkbox</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <label class=\"checkbox\">\n" + 
"                                <input type=\"checkbox\" id=\"optionsCheckbox2\" value=\"option1\" disabled>\n" + 
"                                This is a disabled checkbox\n" + 
"                            </label>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group warning\">\n" + 
"                        <label class=\"control-label\" for=\"inputWarning\">Input with warning</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"inputWarning\">\n" + 
"                            <span class=\"help-inline\">Something may have gone wrong</span>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group error\">\n" + 
"                        <label class=\"control-label\" for=\"inputError\">Input with error</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"inputError\">\n" + 
"                            <span class=\"help-inline\">Please correct the error</span>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group success\">\n" + 
"                        <label class=\"control-label\" for=\"inputSuccess\">Input with success</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <input type=\"text\" id=\"inputSuccess\">\n" + 
"                            <span class=\"help-inline\">Woohoo!</span>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"control-group info\">\n" + 
"                        <label class=\"control-label\" for=\"selectError\">Select with info</label>\n" + 
"\n" + 
"                        <div class=\"controls\">\n" + 
"                            <select id=\"selectError\">\n" + 
"                                <option>1</option>\n" + 
"                                <option>2</option>\n" + 
"                                <option>3</option>\n" + 
"                                <option>4</option>\n" + 
"                                <option>5</option>\n" + 
"                            </select>\n" + 
"                            <span class=\"help-inline\">Woohoo!</span>\n" + 
"                        </div>\n" + 
"                    </div>\n" + 
"                    <div class=\"form-actions\">\n" + 
"                        <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\n" + 
"                        <button type=\"reset\" class=\"btn\">Cancel</button>\n" + 
"                    </div>\n" + 
"                </fieldset>\n" + 
"            </form>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"</section>\n" + 
"\n" + 
"<!-- Tables\n" + 
"================================================== -->\n" + 
"<section id=\"tables\">\n" + 
"    <div class=\"page-header\">\n" + 
"        <h1>Tables</h1>\n" + 
"    </div>\n" + 
"\n" + 
"    <table class=\"table table-bordered table-striped table-hover\">\n" + 
"        <thead>\n" + 
"        <tr>\n" + 
"            <th>#</th>\n" + 
"            <th>First Name</th>\n" + 
"            <th>Last Name</th>\n" + 
"            <th>Username</th>\n" + 
"        </tr>\n" + 
"        </thead>\n" + 
"        <tbody>\n" + 
"        <tr>\n" + 
"            <td>1</td>\n" + 
"            <td>Mark</td>\n" + 
"            <td>Otto</td>\n" + 
"            <td>@mdo</td>\n" + 
"        </tr>\n" + 
"        <tr>\n" + 
"            <td>2</td>\n" + 
"            <td>Jacob</td>\n" + 
"            <td>Thornton</td>\n" + 
"            <td>@fat</td>\n" + 
"        </tr>\n" + 
"        <tr>\n" + 
"            <td>3</td>\n" + 
"            <td>Larry</td>\n" + 
"            <td>the Bird</td>\n" + 
"            <td>@twitter</td>\n" + 
"        </tr>\n" + 
"        </tbody>\n" + 
"    </table>\n" + 
"</section>\n" + 
"\n" + 
"\n" + 
"<!-- Miscellaneous\n" + 
"================================================== -->\n" + 
"<section id=\"miscellaneous\">\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Miscellaneous</h1>\n" + 
"</div>\n" + 
"\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"span4\">\n" + 
"\n" + 
"        <h3 id=\"breadcrumbs\">Breadcrumbs</h3>\n" + 
"        <ul class=\"breadcrumb\">\n" + 
"            <li class=\"active\">Home</li>\n" + 
"        </ul>\n" + 
"        <ul class=\"breadcrumb\">\n" + 
"            <li><a href=\"#\">Home</a> <span class=\"divider\">/</span></li>\n" + 
"            <li><a href=\"#\">Library</a> <span class=\"divider\">/</span></li>\n" + 
"            <li class=\"active\">Data</li>\n" + 
"        </ul>\n" + 
"    </div>\n" + 
"    <div class=\"span4\">\n" + 
"        <h3 id=\"pagination\">Pagination</h3>\n" + 
"\n" + 
"        <div class=\"pagination\">\n" + 
"            <ul>\n" + 
"                <li><a href=\"#\">&larr;</a></li>\n" + 
"                <li class=\"active\"><a href=\"#\">10</a></li>\n" + 
"                <li class=\"disabled\"><a href=\"#\">...</a></li>\n" + 
"                <li><a href=\"#\">20</a></li>\n" + 
"                <li><a href=\"#\">&rarr;</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"        <div class=\"pagination pagination-centered\">\n" + 
"            <ul>\n" + 
"                <li class=\"active\"><a href=\"#\">1</a></li>\n" + 
"                <li><a href=\"#\">2</a></li>\n" + 
"                <li><a href=\"#\">3</a></li>\n" + 
"                <li><a href=\"#\">4</a></li>\n" + 
"                <li><a href=\"#\">5</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"span4\">\n" + 
"        <h3 id=\"pager\">Pagers</h3>\n" + 
"\n" + 
"        <ul class=\"pager\">\n" + 
"            <li><a href=\"#\">Previous</a></li>\n" + 
"            <li><a href=\"#\">Next</a></li>\n" + 
"        </ul>\n" + 
"\n" + 
"        <ul class=\"pager\">\n" + 
"            <li class=\"previous disabled\"><a href=\"#\">&larr; Older</a></li>\n" + 
"            <li class=\"next\"><a href=\"#\">Newer &rarr;</a></li>\n" + 
"        </ul>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"<!-- Navs\n" + 
"================================================== -->\n" + 
"\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"span4\">\n" + 
"\n" + 
"        <h3 id=\"tabs\">Tabs</h3>\n" + 
"        <ul class=\"nav nav-tabs\">\n" + 
"            <li class=\"active\"><a href=\"#A\" data-toggle=\"tab\">Section 1</a></li>\n" + 
"            <li><a href=\"#B\" data-toggle=\"tab\">Section 2</a></li>\n" + 
"            <li class=\"disabled\"><a href=\"#\" data-toggle=\"tab\">Section 3</a></li>\n" + 
"        </ul>\n" + 
"        <div class=\"tabbable\">\n" + 
"            <div class=\"tab-content\">\n" + 
"                <div class=\"tab-pane active\" id=\"A\">\n" + 
"                    <p>I'm in Section A.</p>\n" + 
"                </div>\n" + 
"                <div class=\"tab-pane\" id=\"B\">\n" + 
"                    <p>Howdy, I'm in Section B.</p>\n" + 
"                </div>\n" + 
"                <div class=\"tab-pane\" id=\"C\">\n" + 
"                    <p>What up girl, this is Section C.</p>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <!-- /tabbable -->\n" + 
"\n" + 
"    </div>\n" + 
"    <div class=\"span4\">\n" + 
"        <h3 id=\"pills\">Pills</h3>\n" + 
"        <ul class=\"nav nav-pills\">\n" + 
"            <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"            <li><a href=\"#\">Profile</a></li>\n" + 
"            <li class=\"dropdown\">\n" + 
"                <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Dropdown <b class=\"caret\"></b></a>\n" + 
"                <ul class=\"dropdown-menu\">\n" + 
"                    <li><a href=\"#\">Action</a></li>\n" + 
"                    <li><a href=\"#\">Another action</a></li>\n" + 
"                    <li><a href=\"#\">Something else here</a></li>\n" + 
"                    <li class=\"divider\"></li>\n" + 
"                    <li><a href=\"#\">Separated link</a></li>\n" + 
"                </ul>\n" + 
"            </li>\n" + 
"            <li class=\"disabled\"><a href=\"#\">Disabled link</a></li>\n" + 
"        </ul>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"span4\">\n" + 
"\n" + 
"        <h3 id=\"list\">Lists</h3>\n" + 
"\n" + 
"        <div class=\"well\" style=\"padding: 8px 0;\">\n" + 
"            <ul class=\"nav nav-list\">\n" + 
"                <li class=\"nav-header\">List header</li>\n" + 
"                <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"                <li><a href=\"#\">Library</a></li>\n" + 
"                <li><a href=\"#\">Applications</a></li>\n" + 
"                <li class=\"nav-header\">Another list header</li>\n" + 
"                <li><a href=\"#\">Profile</a></li>\n" + 
"                <li><a href=\"#\">Settings</a></li>\n" + 
"                <li class=\"divider\"></li>\n" + 
"                <li><a href=\"#\">Help</a></li>\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"<!-- Labels\n" + 
"================================================== -->\n" + 
"\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"span6\">\n" + 
"        <h3 id=\"labels\">Labels</h3>\n" + 
"        <span class=\"label\">Default</span>\n" + 
"        <span class=\"label label-success\">Success</span>\n" + 
"        <span class=\"label label-warning\">Warning</span>\n" + 
"        <span class=\"label label-important\">Important</span>\n" + 
"        <span class=\"label label-info\">Info</span>\n" + 
"        <span class=\"label label-inverse\">Inverse</span>\n" + 
"    </div>\n" + 
"    <div class=\"span6\">\n" + 
"        <h3 id=\"badges\">Badges</h3>\n" + 
"        <span class=\"badge\">Default</span>\n" + 
"        <span class=\"badge badge-success\">Success</span>\n" + 
"        <span class=\"badge badge-warning\">Warning</span>\n" + 
"        <span class=\"badge badge-important\">Important</span>\n" + 
"        <span class=\"badge badge-info\">Info</span>\n" + 
"        <span class=\"badge badge-inverse\">Inverse</span>\n" + 
"    </div>\n" + 
"</div>\n" + 
"<br/>\n" + 
"\n" + 
"<!-- Progress bars\n" + 
"================================================== -->\n" + 
"\n" + 
"\n" + 
"<h3 id=\"progressbars\">Progress bars</h3>\n" + 
"\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"span4\">\n" + 
"        <div class=\"progress\">\n" + 
"            <div class=\"bar\" style=\"width: 60%;\"></div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"span4\">\n" + 
"        <div class=\"progress progress-info progress-striped\">\n" + 
"            <div class=\"bar\" style=\"width: 20%;\"></div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"span4\">\n" + 
"        <div class=\"progress progress-danger progress-striped active\">\n" + 
"            <div class=\"bar\" style=\"width: 45%\"></div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"<br/>\n" + 
"\n" + 
"\n" + 
"<!-- Alerts & Messages\n" + 
"================================================== -->\n" + 
"\n" + 
"\n" + 
"<h3 id=\"alerts\">Alerts</h3>\n" + 
"\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"span12\">\n" + 
"        <div class=\"alert alert-block\">\n" + 
"            <a class=\"close\">&times;</a>\n" + 
"            <h4 class=\"alert-heading\">Alert block</h4>\n" + 
"\n" + 
"            <p>Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent\n" + 
"                commodo cursus magna, vel scelerisque nisl consectetur et.</p>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"span4\">\n" + 
"        <div class=\"alert alert-error\">\n" + 
"            <a class=\"close\">&times;</a>\n" + 
"            <strong>Error</strong> Change a few things up and try submitting again.\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"span4\">\n" + 
"        <div class=\"alert alert-success\">\n" + 
"            <a class=\"close\">&times;</a>\n" + 
"            <strong>Success</strong> You successfully read this important alert message.\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"span4\">\n" + 
"        <div class=\"alert alert-info\">\n" + 
"            <a class=\"close\">&times;</a>\n" + 
"            <strong>Information</strong> This alert needs your attention, but it's not super important.\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"</section>\n" + 
"\n" + 
"<br><br><br><br>\n" + 
"\n" + 
"\n" + 
"</div>\n" + 
"<!-- /container -->\n" + 
"\n" + 
"\n" + 
"<!-- Le javascript\n" + 
"================================================== -->\n" + 
"<!-- Placed at the end of the document so the pages load faster -->\n" + 
"<script src=\"");// line 15, japidviews\Application\Theme.html
		p(lookupStatic("/public/demo/bootswatch.js"));// line 1163, japidviews\Application\Theme.html
		p("\"></script>\n" + 
"\n" + 
"\n" + 
"</body>\n" + 
"</html>");// line 1163, japidviews\Application\Theme.html
		
		endDoLayout(sourceTemplate);
	}

}