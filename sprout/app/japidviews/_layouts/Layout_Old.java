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
// NOTE: This file was generated from: japidviews/_layouts/Layout_Old.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class Layout_Old extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/Layout_Old.html";
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


	public Layout_Old() {
		super(null);
	}
	public Layout_Old(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		beginDoLayout(sourceTemplate);		p("<!DOCTYPE html>\n" + 
"<html>\n" + 
"<head>\n" + 
"<meta charset=\"UTF-8\">\n" + 
"<title>");// line 1, japidviews\_layouts\Layout_Old.html
		title();p("</title>\n" + 
"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 5, japidviews\_layouts\Layout_Old.html
		p(lookupStatic("/public/stylesheets/reset.css"));// line 6, japidviews\_layouts\Layout_Old.html
		p("\">\n" + 
"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 6, japidviews\_layouts\Layout_Old.html
		p(lookupStatic("/public/stylesheets/layout.css"));// line 7, japidviews\_layouts\Layout_Old.html
		p("\">\n" + 
"<link rel=\"shortcut icon\" type=\"image/png\" href=\"");// line 7, japidviews\_layouts\Layout_Old.html
		p(lookupStatic("/public/images/favicon.png"));// line 8, japidviews\_layouts\Layout_Old.html
		p("\">\n" + 
"<script src=\"");// line 8, japidviews\_layouts\Layout_Old.html
		p(lookupStatic("/public/javascripts/jquery-1.7.2.js"));// line 9, japidviews\_layouts\Layout_Old.html
		p("\" type=\"text/javascript\"></script>\n");// line 9, japidviews\_layouts\Layout_Old.html
		css();p("<script   type=\"text/javascript\">\n" + 
"function upload(){\n" + 
" 		$('#dialog').dialog({\n" + 
"					autoOpen: false,\n" + 
"					width: 600,\n" + 
"					buttons: {\n" + 
"						\"Ok\": function() {\n" + 
"							$(this).dialog(\"close\");\n" + 
"						},\n" + 
"						\"Cancel\": function() {\n" + 
"							$(this).dialog(\"close\");\n" + 
"						}\n" + 
"					}\n" + 
"				});\n" + 
"				}\n" + 
"</script> \n" + 
"</head>\n" + 
"<body>\n" + 
"	<div id=\"spruce_site\">\n" + 
"		<div id=\"spruce_header\">\n" + 
"			<div class=\"container-960 header-inner\">\n" + 
"				<span><a href=\"#\"><div id=\"spruce_logo\" class=\"left\">Spruce</div></a></span>\n" + 
"				<div id=\"spruce_main_nav\">\n" + 
"					<ul class=\"nav-list left\">\n" + 
"						<li class=\"\"><a href=\"/show\">Photos</a>\n" + 
"							<ul class=\"nav-dropdown\" style=\"width: 150px; margin-left: -1px; z-index: 300;\">\n" + 
"								<li><a href=\"/last\">Last</a></li>\n" + 
"								<li><a href=\"/popular\">Popular</a></li>\n" + 
"								<li><a href=\"/top\">Top</a></li>\n" + 
"								<li><a href=\"/random\">Random</a></li>\n" + 
"								<li><a href=\"/catalog\">Catalog</a></li>\n" + 
"							</ul>\n" + 
"						</li>\n" + 
"\n" + 
"						<li class=\"\"><a href=\"/shop\">Shop</a>\n" + 
"							<ul class=\"nav-dropdown\" style=\"width: 150px; margin-left: 0px; z-index: 300;\">\n" + 
"								<li><a href=\"/shop/best\">Best</a></li>\n" + 
"								<li><a href=\"/shop/bestSellers\">Best Sellers</a></li>\n" + 
"								<li><a href=\"/shop/random\">Random</a></li>\n" + 
"								<li><a href=\"/shop/catalog\">Catalog</a></li>\n" + 
"								<li><a href=\"/shop/new\">New Show</a></li>\n" + 
"							</ul>\n" + 
"						</li>\n" + 
"						\n" + 
"						<li class=\"\">			\n" + 
"							<div class=\" input-header-container\">\n" + 
"								<form method=\"post\" action=\"#\" onsubmit=\"\">\n" + 
"									<input class=\"input-header left example\" type=\"text\" id=\"search_hex\" name=\"search_hex\" /> <input type=\"submit\" class=\"button search-button left\" value=\"Search\" />\n" + 
"								</form>\n" + 
"							</div>\n" + 
"						</li>\n" + 
"						\n" + 
"					");// line 10, japidviews\_layouts\Layout_Old.html
		if (true){// line 63, japidviews\_layouts\Layout_Old.html
		p("						<li class=\"\"><a href=\"/you\">You</a>\n" + 
"							<ul class=\"nav-dropdown\" style=\"width: 150px; margin-left: 0px; z-index: 300;\">\n" + 
"								<li><a href=\"/setting\">Setting</a></li>\n" + 
"								<li><a href=\"/account\">Account</a></li>\n" + 
"								<li><a href=\"/profile\">Profile</a></li>\n" + 
"								<li><a href=\"/store\">Store</a></li>\n" + 
"							</ul></li>\n" + 
"						<li>\n" + 
"					\n" + 
"						<li class=\"\"><a href=\"#\">Add</a>\n" + 
"							<ul class=\"nav-dropdown\" style=\"width: 150px; margin-left: 0px; z-index: 300;\">\n" + 
"								<li><a href=\"/upload\">Upload</a></li>\n" + 
"								<li><a href=\"/manage\">Manage</a></li>\n" + 
"							</ul></li>\n" + 
"					");// line 63, japidviews\_layouts\Layout_Old.html
		}else{// line 78, japidviews\_layouts\Layout_Old.html
		p("						<li class=\"nav-list-action\"><a href=\"/login\">Login</a></li>\n" + 
"						<li class=\"nav-list-action\"><a href=\"/signup\">Sign Up</a></li>\n" + 
"					");// line 78, japidviews\_layouts\Layout_Old.html
		}// line 81, japidviews\_layouts\Layout_Old.html
		p("					</ul>\n" + 
"\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"		<div id=\"spruce_body\" class=\"container-960\">");// line 81, japidviews\_layouts\Layout_Old.html
		doLayout();// line 88, japidviews\_layouts\Layout_Old.html
		p("</div>\n" + 
"\n" + 
"		<div id=\"spruce_footer\" class=\"footer clearfix container-repeat-footer\">\n" + 
"			<div class=\"container-960 container-repeat-footer\">\n" + 
"				<div class=\"left\">\n" + 
"					<div class=\"left copyright\">\n" + 
"						Copyright 2012, Spruce</a>\n" + 
"					</div>\n" + 
"					<br>\n" + 
"\n" + 
"					<ul class=\"footer-site-links\">\n" + 
"						<li><a href=\"mail:fengfei1000@gmail.com\">Contact Us</a></li>\n" + 
"						<li><a href=\"/Advertising\">Advertising</a></li>\n" + 
"						<li><a href=\"/lastestNews\">Latest News</a></li>\n" + 
"						<li><a href=\"/rss\">RSS Feeds</a></li>\n" + 
"						<li><a href=\"#\">Sitemap</a></li>\n" + 
"						<li><a href=\"#\">Developers</a></li>\n" + 
"					</ul>\n" + 
"				</div>\n" + 
"\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"<div id=\"dialog\"></div>\n" + 
"</body>\n" + 
"</html>");// line 88, japidviews\_layouts\Layout_Old.html
				endDoLayout(sourceTemplate);	}
	 protected void title() {};
	 protected void css() {};

	protected abstract void doLayout();
}