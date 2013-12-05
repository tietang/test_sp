//version: 0.9.35
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
// NOTE: This file was generated from: japidviews/Application/Theme2.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Theme2 extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/Theme2.html";
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


	public Theme2() {
		super(null);
	}
	public Theme2(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Theme2.class);

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
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/Application/Theme2.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Theme2().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\Theme2.html

p("\n" + 
"\n" + 
"<!-- Fixed navbar -->\n" + 
"<div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n" + 
"    <div class=\"container\">\n" + 
"        <div class=\"navbar-header\">\n" + 
"            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" + 
"                <span class=\"sr-only\">Toggle navigation</span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"            </button>\n" + 
"            <a class=\"navbar-brand\" href=\"#\">Bootstrap theme</a>\n" + 
"        </div>\n" + 
"        <div class=\"navbar-collapse collapse\">\n" + 
"            <ul class=\"nav navbar-nav\">\n" + 
"                <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"                <li><a href=\"#about\">About</a></li>\n" + 
"                <li><a href=\"#contact\">Contact</a></li>\n" + 
"                <li class=\"dropdown\">\n" + 
"                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n" + 
"                    <ul class=\"dropdown-menu\">\n" + 
"                        <li><a href=\"#\">Action</a></li>\n" + 
"                        <li><a href=\"#\">Another action</a></li>\n" + 
"                        <li><a href=\"#\">Something else here</a></li>\n" + 
"                        <li class=\"divider\"></li>\n" + 
"                        <li class=\"dropdown-header\">Nav header</li>\n" + 
"                        <li><a href=\"#\">Separated link</a></li>\n" + 
"                        <li><a href=\"#\">One more separated link</a></li>\n" + 
"                    </ul>\n" + 
"                </li>\n" + 
"            </ul>\n" + 
"        </div><!--/.nav-collapse -->\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<div class=\"container theme-showcase\">\n" + 
"\n" + 
"<!-- Main jumbotron for a primary marketing message or call to action -->\n" + 
"<div class=\"jumbotron\">\n" + 
"    <h1>Hello, world!</h1>\n" + 
"    <p>This is a template for a simple marketing or informational website. It includes a large callout called a jumbotron and three supporting pieces of content. Use it as a starting point to create something more unique.</p>\n" + 
"    <p><a href=\"#\" class=\"btn btn-primary btn-lg\" role=\"button\">Learn more &raquo;</a></p>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Buttons</h1>\n" + 
"</div>\n" + 
"<p>\n" + 
"    <button type=\"button\" class=\"btn btn-lg btn-default\">Default</button>\n" + 
"    <button type=\"button\" class=\"btn btn-lg btn-primary\">Primary</button>\n" + 
"    <button type=\"button\" class=\"btn btn-lg btn-success\">Success</button>\n" + 
"    <button type=\"button\" class=\"btn btn-lg btn-info\">Info</button>\n" + 
"    <button type=\"button\" class=\"btn btn-lg btn-warning\">Warning</button>\n" + 
"    <button type=\"button\" class=\"btn btn-lg btn-danger\">Danger</button>\n" + 
"    <button type=\"button\" class=\"btn btn-lg btn-link\">Link</button>\n" + 
"</p>\n" + 
"<p>\n" + 
"    <button type=\"button\" class=\"btn btn-default\">Default</button>\n" + 
"    <button type=\"button\" class=\"btn btn-primary\">Primary</button>\n" + 
"    <button type=\"button\" class=\"btn btn-success\">Success</button>\n" + 
"    <button type=\"button\" class=\"btn btn-info\">Info</button>\n" + 
"    <button type=\"button\" class=\"btn btn-warning\">Warning</button>\n" + 
"    <button type=\"button\" class=\"btn btn-danger\">Danger</button>\n" + 
"    <button type=\"button\" class=\"btn btn-link\">Link</button>\n" + 
"</p>\n" + 
"<p>\n" + 
"    <button type=\"button\" class=\"btn btn-sm btn-default\">Default</button>\n" + 
"    <button type=\"button\" class=\"btn btn-sm btn-primary\">Primary</button>\n" + 
"    <button type=\"button\" class=\"btn btn-sm btn-success\">Success</button>\n" + 
"    <button type=\"button\" class=\"btn btn-sm btn-info\">Info</button>\n" + 
"    <button type=\"button\" class=\"btn btn-sm btn-warning\">Warning</button>\n" + 
"    <button type=\"button\" class=\"btn btn-sm btn-danger\">Danger</button>\n" + 
"    <button type=\"button\" class=\"btn btn-sm btn-link\">Link</button>\n" + 
"</p>\n" + 
"<p>\n" + 
"    <button type=\"button\" class=\"btn btn-xs btn-default\">Default</button>\n" + 
"    <button type=\"button\" class=\"btn btn-xs btn-primary\">Primary</button>\n" + 
"    <button type=\"button\" class=\"btn btn-xs btn-success\">Success</button>\n" + 
"    <button type=\"button\" class=\"btn btn-xs btn-info\">Info</button>\n" + 
"    <button type=\"button\" class=\"btn btn-xs btn-warning\">Warning</button>\n" + 
"    <button type=\"button\" class=\"btn btn-xs btn-danger\">Danger</button>\n" + 
"    <button type=\"button\" class=\"btn btn-xs btn-link\">Link</button>\n" + 
"</p>\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Thumbnails</h1>\n" + 
"</div>\n" + 
"<img data-src=\"holder.js/200x200\" class=\"img-thumbnail\" alt=\"A generic square placeholder image with a white border around it, making it resemble a photograph taken with an old instant camera\">\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Dropdown menus</h1>\n" + 
"</div>\n" + 
"<div class=\"dropdown theme-dropdown clearfix\">\n" + 
"    <a id=\"dropdownMenu1\" href=\"#\" role=\"button\" class=\"sr-only dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n" + 
"    <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\n" + 
"        <li class=\"active\" role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Action</a></li>\n" + 
"        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Another action</a></li>\n" + 
"        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Something else here</a></li>\n" + 
"        <li role=\"presentation\" class=\"divider\"></li>\n" + 
"        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Separated link</a></li>\n" + 
"    </ul>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Navbars</h1>\n" + 
"</div>\n" + 
"\n" + 
"<div class=\"navbar navbar-default\">\n" + 
"    <div class=\"container\">\n" + 
"        <div class=\"navbar-header\">\n" + 
"            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" + 
"                <span class=\"sr-only\">Toggle navigation</span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"            </button>\n" + 
"            <a class=\"navbar-brand\" href=\"#\">Project name</a>\n" + 
"        </div>\n" + 
"        <div class=\"navbar-collapse collapse\">\n" + 
"            <ul class=\"nav navbar-nav\">\n" + 
"                <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"                <li><a href=\"#about\">About</a></li>\n" + 
"                <li><a href=\"#contact\">Contact</a></li>\n" + 
"                <li class=\"dropdown\">\n" + 
"                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n" + 
"                    <ul class=\"dropdown-menu\">\n" + 
"                        <li><a href=\"#\">Action</a></li>\n" + 
"                        <li><a href=\"#\">Another action</a></li>\n" + 
"                        <li><a href=\"#\">Something else here</a></li>\n" + 
"                        <li class=\"divider\"></li>\n" + 
"                        <li class=\"dropdown-header\">Nav header</li>\n" + 
"                        <li><a href=\"#\">Separated link</a></li>\n" + 
"                        <li><a href=\"#\">One more separated link</a></li>\n" + 
"                    </ul>\n" + 
"                </li>\n" + 
"            </ul>\n" + 
"        </div><!--/.nav-collapse -->\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"<div class=\"navbar navbar-inverse\">\n" + 
"    <div class=\"container\">\n" + 
"        <div class=\"navbar-header\">\n" + 
"            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" + 
"                <span class=\"sr-only\">Toggle navigation</span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"                <span class=\"icon-bar\"></span>\n" + 
"            </button>\n" + 
"            <a class=\"navbar-brand\" href=\"#\">Project name</a>\n" + 
"        </div>\n" + 
"        <div class=\"navbar-collapse collapse\">\n" + 
"            <ul class=\"nav navbar-nav\">\n" + 
"                <li class=\"active\"><a href=\"#\">Home</a></li>\n" + 
"                <li><a href=\"#about\">About</a></li>\n" + 
"                <li><a href=\"#contact\">Contact</a></li>\n" + 
"                <li class=\"dropdown\">\n" + 
"                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n" + 
"                    <ul class=\"dropdown-menu\">\n" + 
"                        <li><a href=\"#\">Action</a></li>\n" + 
"                        <li><a href=\"#\">Another action</a></li>\n" + 
"                        <li><a href=\"#\">Something else here</a></li>\n" + 
"                        <li class=\"divider\"></li>\n" + 
"                        <li class=\"dropdown-header\">Nav header</li>\n" + 
"                        <li><a href=\"#\">Separated link</a></li>\n" + 
"                        <li><a href=\"#\">One more separated link</a></li>\n" + 
"                    </ul>\n" + 
"                </li>\n" + 
"            </ul>\n" + 
"        </div><!--/.nav-collapse -->\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Alerts</h1>\n" + 
"</div>\n" + 
"<div class=\"alert alert-success\">\n" + 
"    <strong>Well done!</strong> You successfully read this important alert message.\n" + 
"</div>\n" + 
"<div class=\"alert alert-info\">\n" + 
"    <strong>Heads up!</strong> This alert needs your attention, but it's not super important.\n" + 
"</div>\n" + 
"<div class=\"alert alert-warning\">\n" + 
"    <strong>Warning!</strong> Best check yo self, you're not looking too good.\n" + 
"</div>\n" + 
"<div class=\"alert alert-danger\">\n" + 
"    <strong>Oh snap!</strong> Change a few things up and try submitting again.\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Progress bars</h1>\n" + 
"</div>\n" + 
"<div class=\"progress\">\n" + 
"    <div class=\"progress-bar\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\"><span class=\"sr-only\">60% Complete</span></div>\n" + 
"</div>\n" + 
"<div class=\"progress\">\n" + 
"    <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\"><span class=\"sr-only\">40% Complete (success)</span></div>\n" + 
"</div>\n" + 
"<div class=\"progress\">\n" + 
"    <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\"><span class=\"sr-only\">20% Complete</span></div>\n" + 
"</div>\n" + 
"<div class=\"progress\">\n" + 
"    <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\"><span class=\"sr-only\">60% Complete (warning)</span></div>\n" + 
"</div>\n" + 
"<div class=\"progress\">\n" + 
"    <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\"><span class=\"sr-only\">80% Complete (danger)</span></div>\n" + 
"</div>\n" + 
"<div class=\"progress\">\n" + 
"    <div class=\"progress-bar progress-bar-success\" style=\"width: 35%\"><span class=\"sr-only\">35% Complete (success)</span></div>\n" + 
"    <div class=\"progress-bar progress-bar-warning\" style=\"width: 20%\"><span class=\"sr-only\">20% Complete (warning)</span></div>\n" + 
"    <div class=\"progress-bar progress-bar-danger\" style=\"width: 10%\"><span class='sr-only'>10% Complete (danger)</span></div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>List groups</h1>\n" + 
"</div>\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"col-sm-4\">\n" + 
"        <ul class=\"list-group\">\n" + 
"            <li class=\"list-group-item\">Cras justo odio</li>\n" + 
"            <li class=\"list-group-item\">Dapibus ac facilisis in</li>\n" + 
"            <li class=\"list-group-item\">Morbi leo risus</li>\n" + 
"            <li class=\"list-group-item\">Porta ac consectetur ac</li>\n" + 
"            <li class=\"list-group-item\">Vestibulum at eros</li>\n" + 
"        </ul>\n" + 
"    </div><!-- /.col-sm-4 -->\n" + 
"    <div class=\"col-sm-4\">\n" + 
"        <div class=\"list-group\">\n" + 
"            <a href=\"#\" class=\"list-group-item active\">\n" + 
"                Cras justo odio\n" + 
"            </a>\n" + 
"            <a href=\"#\" class=\"list-group-item\">Dapibus ac facilisis in</a>\n" + 
"            <a href=\"#\" class=\"list-group-item\">Morbi leo risus</a>\n" + 
"            <a href=\"#\" class=\"list-group-item\">Porta ac consectetur ac</a>\n" + 
"            <a href=\"#\" class=\"list-group-item\">Vestibulum at eros</a>\n" + 
"        </div>\n" + 
"    </div><!-- /.col-sm-4 -->\n" + 
"    <div class=\"col-sm-4\">\n" + 
"        <div class=\"list-group\">\n" + 
"            <a href=\"#\" class=\"list-group-item active\">\n" + 
"                <h4 class=\"list-group-item-heading\">List group item heading</h4>\n" + 
"                <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\n" + 
"            </a>\n" + 
"            <a href=\"#\" class=\"list-group-item\">\n" + 
"                <h4 class=\"list-group-item-heading\">List group item heading</h4>\n" + 
"                <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\n" + 
"            </a>\n" + 
"            <a href=\"#\" class=\"list-group-item\">\n" + 
"                <h4 class=\"list-group-item-heading\">List group item heading</h4>\n" + 
"                <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\n" + 
"            </a>\n" + 
"        </div>\n" + 
"    </div><!-- /.col-sm-4 -->\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Panels</h1>\n" + 
"</div>\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"col-sm-4\">\n" + 
"        <div class=\"panel panel-default\">\n" + 
"            <div class=\"panel-heading\">\n" + 
"                <h3 class=\"panel-title\">Panel title</h3>\n" + 
"            </div>\n" + 
"            <div class=\"panel-body\">\n" + 
"                Panel content\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"panel panel-primary\">\n" + 
"            <div class=\"panel-heading\">\n" + 
"                <h3 class=\"panel-title\">Panel title</h3>\n" + 
"            </div>\n" + 
"            <div class=\"panel-body\">\n" + 
"                Panel content\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div><!-- /.col-sm-4 -->\n" + 
"    <div class=\"col-sm-4\">\n" + 
"        <div class=\"panel panel-success\">\n" + 
"            <div class=\"panel-heading\">\n" + 
"                <h3 class=\"panel-title\">Panel title</h3>\n" + 
"            </div>\n" + 
"            <div class=\"panel-body\">\n" + 
"                Panel content\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"panel panel-info\">\n" + 
"            <div class=\"panel-heading\">\n" + 
"                <h3 class=\"panel-title\">Panel title</h3>\n" + 
"            </div>\n" + 
"            <div class=\"panel-body\">\n" + 
"                Panel content\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div><!-- /.col-sm-4 -->\n" + 
"    <div class=\"col-sm-4\">\n" + 
"        <div class=\"panel panel-warning\">\n" + 
"            <div class=\"panel-heading\">\n" + 
"                <h3 class=\"panel-title\">Panel title</h3>\n" + 
"            </div>\n" + 
"            <div class=\"panel-body\">\n" + 
"                Panel content\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"panel panel-danger\">\n" + 
"            <div class=\"panel-heading\">\n" + 
"                <h3 class=\"panel-title\">Panel title</h3>\n" + 
"            </div>\n" + 
"            <div class=\"panel-body\">\n" + 
"                Panel content\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div><!-- /.col-sm-4 -->\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>Wells</h1>\n" + 
"</div>\n" + 
"<div class=\"well\">\n" + 
"    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed diam eget risus varius blandit sit amet non magna. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Cras mattis consectetur purus sit amet fermentum. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Aenean lacinia bibendum nulla sed consectetur.</p>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"</div> <!-- /container -->\n" + 
"\n" + 
"\n");// line 2, japidviews\Application\Theme2.html
		
		endDoLayout(sourceTemplate);
	}

}