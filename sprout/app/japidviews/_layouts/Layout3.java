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
// NOTE: This file was generated from: japidviews/_layouts/Layout3.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class Layout3 extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/Layout3.html";
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


	public Layout3() {
		super(null);
	}
	public Layout3(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		beginDoLayout(sourceTemplate);		p("<!DOCTYPE html>\n" + 
"<html lang=\"en\">\n" + 
"	<head>\n" + 
"		<meta charset=\"UTF-8\">\n" + 
"		<title>");// line 1, japidviews\_layouts\Layout3.html
		title();p("</title>\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 5, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/52framework/css/reset.css"));// line 6, japidviews\_layouts\Layout3.html
		p("\" type=\"text/css\"  />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 6, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/52framework/css/css3.css"));// line 7, japidviews\_layouts\Layout3.html
		p("\"  type=\"text/css\" media=\"screen\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 7, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/52framework/css/general.css"));// line 8, japidviews\_layouts\Layout3.html
		p("\"  type=\"text/css\" media=\"screen\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 8, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/52framework/css/grid1200.css"));// line 9, japidviews\_layouts\Layout3.html
		p("\" type=\"text/css\" />\n" + 
"\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 9, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/basic/css/bootstrap.css"));// line 11, japidviews\_layouts\Layout3.html
		p("\" type=\"text/css\" />\n" + 
"		<link rel=\"stylesheet\" href=\"");// line 11, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/52framework/css/wb3.css"));// line 12, japidviews\_layouts\Layout3.html
		p("\" type=\"text/css\" />\n" + 
"		<!--[if (gte IE 6)&(lte IE 8)]>\n" + 
"		<script src=\"");// line 12, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/52framework/js/selectivizr.js"));// line 14, japidviews\_layouts\Layout3.html
		p("\"></script>\n" + 
"		<![endif]-->\n" + 
"		<script src=\"");// line 14, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/js/jquery-1.10.1.js"));// line 16, japidviews\_layouts\Layout3.html
		p("\"></script>\n" + 
"		<script src=\"");// line 16, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/js/jquery-migrate-1.2.1.js"));// line 17, japidviews\_layouts\Layout3.html
		p("\"></script>\n" + 
"		<script src=\"");// line 17, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/52framework/js/modernizr-1.7.min.js"));// line 18, japidviews\_layouts\Layout3.html
		p("\"></script><!-- this is the javascript allowing html5 to run in older browsers -->\n" + 
"		<script src=\"");// line 18, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/js/jquery-1.10.1.js"));// line 19, japidviews\_layouts\Layout3.html
		p("\"></script>\n" + 
"		<script src=\"");// line 19, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/js/jquery-migrate-1.2.1.js"));// line 20, japidviews\_layouts\Layout3.html
		p("\"></script>\n" + 
"		<script src=\"");// line 20, japidviews\_layouts\Layout3.html
		p(lookupStatic("/public/basic/js/bootstrap.js"));// line 21, japidviews\_layouts\Layout3.html
		p("\"></script>\n" + 
"		");// line 21, japidviews\_layouts\Layout3.html
		css();p("	</head>\n" + 
"\n" + 
"\n" + 
"\n" + 
"	<body>\n" + 
"\n" + 
"		<div class=\"navbar navbar-inverse\" >\n" + 
"			<div class=\"navbar-inner\">\n" + 
"				<div class=\"row \">\n" + 
"					<div class=\"col  col_16\">\n" + 
"						<a class=\"brand\" href=\"#\">时间</a>\n" + 
"						<div class=\"nav-collapse collapse navbar-inverse-collapse\">\n" + 
"							<ul class=\"nav\">\n" + 
"								<li class=\"active\">\n" + 
"									<a href=\"#\">照片</a>\n" + 
"								</li>\n" + 
"								<li>\n" + 
"									<a href=\"#\">博客</a>\n" + 
"								</li>\n" + 
"								<li>\n" + 
"									<a href=\"#\">Link</a>\n" + 
"								</li>\n" + 
"								<li class=\"dropdown\">\n" + 
"									<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n" + 
"									<ul class=\"dropdown-menu\">\n" + 
"										<li>\n" + 
"											<a href=\"#\">Action</a>\n" + 
"										</li>\n" + 
"										<li>\n" + 
"											<a href=\"#\">Another action</a>\n" + 
"										</li>\n" + 
"										<li>\n" + 
"											<a href=\"#\">Something else here</a>\n" + 
"										</li>\n" + 
"										<li class=\"divider\"></li>\n" + 
"										<li class=\"nav-header\">\n" + 
"											Nav header\n" + 
"										</li>\n" + 
"										<li>\n" + 
"											<a href=\"#\">Separated link</a>\n" + 
"										</li>\n" + 
"										<li>\n" + 
"											<a href=\"#\">One more separated link</a>\n" + 
"										</li>\n" + 
"									</ul>\n" + 
"								</li>\n" + 
"							</ul>\n" + 
"\n" + 
"							<div class=\"right\">\n" + 
"								<ul class=\"nav\">\n" + 
"\n" + 
"									<li class=\"divider-vertical\"></li>\n" + 
"									<li class=\"dropdown\">\n" + 
"										<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n" + 
"										<ul class=\"dropdown-menu\">\n" + 
"											<li>\n" + 
"												<a href=\"#\">Action</a>\n" + 
"											</li>\n" + 
"											<li>\n" + 
"												<a href=\"#\">Another action</a>\n" + 
"											</li>\n" + 
"											<li>\n" + 
"												<a href=\"#\">Something else here</a>\n" + 
"											</li>\n" + 
"											<li class=\"divider\"></li>\n" + 
"											<li>\n" + 
"												<a href=\"#\">Separated link</a>\n" + 
"											</li>\n" + 
"										</ul>\n" + 
"									</li>\n" + 
"								</ul>\n" + 
"							</div>\n" + 
"\n" + 
"							<div class=\"right\">\n" + 
"								<button href=\"#\" class=\"btn btn-small btn-info\">\n" + 
"									Link\n" + 
"								</button>\n" + 
"							</div>\n" + 
"							<div class=\"right\">\n" + 
"								<form class=\"navbar-search pull-right\" action=\"\">\n" + 
"									<input type=\"text\" class=\"search-query span2\" placeholder=\"Search\">\n" + 
"								</form>\n" + 
"							</div>\n" + 
"						</div>\n" + 
"					</div>\n" + 
"				</div>\n" + 
"			</div><!-- /navbar-inner -->\n" + 
"		</div><!-- /navbar -->\n" + 
"		<div class=\"row container\">\n" + 
"			<div class=\"col col_16 nav_title\">\n" + 
"				<ul class=\"nav nav-pills\">\n" + 
"					<li class=\"active\">\n" + 
"						<a href=\"#\">Popular</a>\n" + 
"					</li>\n" + 
"					<li>\n" + 
"						<a href=\"#\">recommendation</a>\n" + 
"					</li>\n" + 
"					<li>\n" + 
"						<a href=\"#\">Follow</a>\n" + 
"					</li>\n" + 
"				</ul>\n" + 
"			</div>\n" + 
"\n" + 
"		</div><!--\n" + 
"			<div class=\"page-header\">\n" + 
"			<h3>");// line 22, japidviews\_layouts\Layout3.html
		header();p("</h3>\n" + 
"			</div> -->\n");// line 128, japidviews\_layouts\Layout3.html
		doLayout();// line 130, japidviews\_layouts\Layout3.html
		p("		<div class=\"row container\">\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview medium\" id=\"photo_preview_preview_39189268\">\n" + 
"					<a href=\"/photo_preview/39189268?from=popular\"><img src=\"http://pcdn.500px.net/39189268/a26d91580c3c6f3aa6c4ff09564a752ced00b738/3.jpg\" /></a>\n" + 
"\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/HuyTonthat\">Huy Tonthat</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39189268?feature=popular\">A beautiful moment</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.8\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview medium\" id=\"photo_preview_preview_39183530\">\n" + 
"					<a href=\"/photo_preview/39183530?from=popular\"><img src=\"http://pcdn.500px.net/39183530/c61384fd22bc4fc088a6d3f8bbb78a5ea68dd735/3.jpg\" /></a>\n" + 
"\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/matif\">Atif Saeed</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39183530?feature=popular\">In yellow..</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.8\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview medium\" id=\"photo_preview_preview_39179372\">\n" + 
"					<a href=\"/photo_preview/39179372?from=popular\"><img src=\"http://pcdn.500px.net/39179372/a99419ecc15e01f3b64a97a95dfb41105ba94c93/3.jpg\" /></a>\n" + 
"\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/xurxo\">Jorge Cacharrón</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39179372?feature=popular\">Rincones 7</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.8\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview medium\" id=\"photo_preview_preview_39175598\">\n" + 
"					<a href=\"/photo_preview/39175598?from=popular\"><img src=\"http://pcdn.500px.net/39175598/0width_439520482da2b61b39fb8b55b2dec08eeda93c/3.jpg\" /></a>\n" + 
"\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ItamarCampos\">Itamar Campos</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39175598?feature=popular\">Sleepless night!</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.8\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview medium\" id=\"photo_preview_preview_39186690\">\n" + 
"					<a href=\"/photo_preview/39186690?from=popular\"><img src=\"http://pcdn.500px.net/39186690/b675780c768ff92f9142138ff8617815eedfcadb/3.jpg\" /></a>\n" + 
"\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/Patrice97434\">THOMAS Patrice</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39186690?feature=popular\">In the forest!</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview medium\" id=\"photo_preview_preview_39177630\">\n" + 
"					<a href=\"/photo_preview/39177630?from=popular\"><img src=\"http://pcdn.500px.net/39177630/ca8a59462388d839cd3f93db7f049470acad209b/3.jpg\" /></a>\n" + 
"\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/MaxRinaldi\">Max Rinaldi</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39177630?feature=popular\">Soft Touch</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview medium\" id=\"photo_preview_preview_39175622\">\n" + 
"					<a href=\"/photo_preview/39175622?from=popular\"><img src=\"http://pcdn.500px.net/39175622/ff942249bfe7c7fa80eb3width_4d3a5e5d7684670877/3.jpg\" /></a>\n" + 
"\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/BelenArgueso\">Belén Argüeso Castelos</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39175622?feature=popular\">Moments....</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview medium\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_4\">\n" + 
"				<div class=\"photo_preview photo_preview_4\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col width_2\">\n" + 
"				<div class=\"photo_preview photo_preview_2\" id=\"photo_preview_preview_39167014\">\n" + 
"					<a href=\"/photo_preview/39167014?from=popular\"><img src=\"http://pcdn.500px.net/39167014/1c8b5a9b28943638332a51fc798ae283d9c55e90/3.jpg\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"info\">\n" + 
"							<a href=\"/ddumoulin\">Denis Dumoulin</a>\n" + 
"						</div>\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/photo_preview/39167014?feature=popular\">Martin le fier.</a>\n" + 
"						</div>\n" + 
"						<div class=\"score rollover\">\n" + 
"							99.7\n" + 
"						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"		</div>\n" + 
"\n" + 
"		<footer>\n" + 
"			<div class=\"row\">\n" + 
"				<div class=\"col col_16\">\n" + 
"					fjdslfjsdl积分电流声开放的；是\n" + 
"				</div>\n" + 
"			</div><div class=\"clear\"></div>\n" + 
"\n" + 
"		</footer>\n" + 
"	</body>\n" + 
"</html>\n");// line 130, japidviews\_layouts\Layout3.html
				endDoLayout(sourceTemplate);	}
	 protected void title() {};
	 protected void header() {};
	 protected void css() {};

	protected abstract void doLayout();
}