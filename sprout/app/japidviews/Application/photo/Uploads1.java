package japidviews.Application.photo;
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
// NOTE: This file was generated from: japidviews/Application/photo/Uploads1.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Uploads1 extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/Uploads1.html";
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


	public Uploads1() {
		super(null);
	}
	public Uploads1(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Uploads1.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/photo/Uploads1.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Uploads1().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<!DOCTYPE HTML>\n" + 
"<html>\n" + 
"<head>\n" + 
"<!-- Force latest IE rendering engine or ChromeFrame if installed -->\n" + 
"<!--[if IE]><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"><![endif]-->\n" + 
"<meta charset=\"utf-8\">\n" + 
"<title>Images Upload</title>\n" + 
"\n" + 
"\n" + 
"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 1, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/css/jquery.fileupload-ui.css"));// line 10, japidviews\Application\photo\Uploads1.html
		p("\">\n" + 
"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 10, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/css/ui-darkness/jquery-ui-1.8.22.custom.css"));// line 11, japidviews\Application\photo\Uploads1.html
		p("\">\n" + 
"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 11, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/twitter/bootstrap/cdn/css/bootstrap.min.css"));// line 12, japidviews\Application\photo\Uploads1.html
		p("\">\n" + 
"<!-- Shim to make HTML5 elements usable in older Internet Explorer versions -->\n" + 
"<!--[if lt IE 9]><script src=\"");// line 12, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/html5shiv.js"));// line 14, japidviews\Application\photo\Uploads1.html
		p("\"></script><![endif]-->\n" + 
"<script src=\"");// line 14, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/jquery-1.7.2.js"));// line 15, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"\n" + 
"<script src=\"");// line 15, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/jquery-ui-1.8.22.custom.min.js"));// line 17, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 17, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/arttemplate/template.js"));// line 18, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<!-- <script src=\"");// line 18, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/blueimp/tmpl.js"));// line 19, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script> -->\n" + 
"<script src=\"");// line 19, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/blueimp/load-image.min.js"));// line 20, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 20, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/blueimp/jquery.iframe-transport.js"));// line 21, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 21, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/blueimp/jquery.fileupload.js"));// line 22, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 22, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/blueimp/jquery.fileupload-fp.js"));// line 23, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<!-- <script src=\"");// line 23, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/blueimp/jquery.fileupload-ui.js"));// line 24, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script> -->\n" + 
"\n" + 
"<script src=\"");// line 24, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/app/u1.js"));// line 26, japidviews\Application\photo\Uploads1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<!-- The XDomainRequest Transport is included for cross-domain file deletion for IE8+ -->\n" + 
"<!--[if gte IE 8]><script src=\"");// line 26, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/javascripts/blueimp/cors/jquery.xdr-transport.js"));// line 28, japidviews\Application\photo\Uploads1.html
		p("\"></script><![endif]-->\n" + 
"\n" + 
"<style type=\"text/css\">\n" + 
"html,body {\n" + 
"	background-color: #ccc;\n" + 
"}\n" + 
"\n" + 
".ui-progressingbar {\n" + 
"	height: 18px;\n" + 
"	background-image: url(");// line 28, japidviews\Application\photo\Uploads1.html
		p(lookupStatic("/public/img/progressbar.gif"));// line 37, japidviews\Application\photo\Uploads1.html
		p("\n" + 
"\n" + 
");\n" + 
"}\n" + 
".ui-progressedbar {\n" + 
"	width: 100%;\n" + 
"	background: green;\n" + 
"}\n" + 
"\n" + 
"table {\n" + 
"	max-width: 100%;\n" + 
"	background-color: transparent;\n" + 
"	border-collapse: collapse;\n" + 
"	border-spacing: 0;\n" + 
"	background-color: #f9f9f9;\n" + 
"	width: 100%;\n" + 
"	margin-bottom: 18px;\n" + 
"}\n" + 
"\n" + 
"table th,table td {\n" + 
"	padding: 8px;\n" + 
"	line-height: 18px;\n" + 
"	text-align: left;\n" + 
"	vertical-align: top;\n" + 
"	border-top: 1px solid #dddddd;\n" + 
"}\n" + 
"\n" + 
"table th {\n" + 
"	font-weight: bold;\n" + 
"}\n" + 
"\n" + 
"table thead th {\n" + 
"	vertical-align: bottom;\n" + 
"}\n" + 
"</style>\n" + 
"</head>\n" + 
"<body>\n" + 
"\n" + 
"	<div class=\"container\">\n" + 
"		<div class=\"page-header\">\n" + 
"			<h1>Images Upload</h1>\n" + 
"		</div>\n" + 
"\n" + 
"\n" + 
"		<form id=\"fileupload\" action=\"/upload/done\" method=\"POST\" enctype=\"multipart/form-data\">\n" + 
"			<!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->\n" + 
"			<div class=\"row fileupload-buttonbar\">\n" + 
"				<div class=\"span7\">\n" + 
"					<!-- The fileinput-button span is used to style the file input field as button -->\n" + 
"					<span class=\"btn btn-success fileinput-button\"> <i class=\"icon-plus icon-white\"></i> <span>Add files...</span> <input type=\"file\" id=\"files\" name=\"files[]\"\n" + 
"						multiple>\n" + 
"					</span>\n" + 
"					<button type=\"button\" class=\"btn btn-primary start\" id=\"upload_btn\">\n" + 
"						<i class=\"icon-upload icon-white\"></i> <span>Start upload</span>\n" + 
"					</button>\n" + 
"					<button type=\"reset\" class=\"btn btn-warning cancel\">\n" + 
"						<i class=\"icon-ban-circle icon-white\"></i> <span>Cancel upload</span>\n" + 
"					</button>\n" + 
"					<button type=\"button\" class=\"btn btn-danger delete\">\n" + 
"						<i class=\"icon-trash icon-white\"></i> <span>Delete</span>\n" + 
"					</button>\n" + 
"					<input type=\"checkbox\" class=\"toggle\">\n" + 
"				</div>\n" + 
"				\n" + 
"				<div class=\"span5 fileupload-progress \"><span id=\"percentage\"></span>\n" + 
"					<!-- The global progress bar -->\n" + 
"					<div id=\"progress\" class=\"progress progress-success  active\" role=\"progressbar\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n" + 
"						<div class=\"bar\" style=\"width: 0%;\"></div>\n" + 
"					</div>\n" + 
"					<!-- The extended global progress information -->\n" + 
"					<div class=\"progress-extended\">&nbsp;</div>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<!-- The loading indicator is shown during file processing -->\n" + 
"			<div class=\"fileupload-loading\"></div>\n" + 
"			<br>\n" + 
"			<div id=\"dropbox\">\n" + 
"				<span id=\"drop_message\">Drag photos from your computer here or click \"Add files\" button for photos to upload. Maximum 10 photos at a time. </span> <span\n" + 
"					id=\"drop_message_hover\" style=\"display: none;\">Drop photos to upload</span>\n" + 
"			</div>\n" + 
"			<!-- The table listing the files available for upload/download -->\n" + 
"			<table role=\"presentation\" class=\"table table-striped\">\n" + 
"				<tbody class=\"files\" data-toggle=\"modal-gallery\" data-target=\"#modal-gallery\"></tbody>\n" + 
"			</table>\n" + 
"		</form>\n" + 
"		<div class=\" \">\n" + 
"			<form id=\"edit\" action=\"/upload/save\" class=\"clearfix photos_placeholder\" id=\"photoinfo\">\n" + 
"				<table class=\"\" id=\"upload_table\">\n" + 
"					<tbody class=\"files\">\n" + 
"\n" + 
"					</tbody>\n" + 
"				</table>\n" + 
"			</form>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div id=\"preview\"></div>\n" + 
"	<div id=\"status\"></div>\n" + 
"\n" + 
"\n" + 
"	<script id=\"template-upload-form\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"<% for (var i=0, file; file=o.files[i]; i++) { %>\n" + 
" \n" + 
"\n" + 
"				<tr>\n" + 
"						<td colspan=\"2\"></td>\n" + 
"					</tr>\n" + 
"					<tr>\n" + 
"						<td><div id=\"preview_<%=index%>_<%=i%>\"></div></td>\n" + 
"						<td>\n" + 
"\n" + 
"								<input type=\"hidden\" name=\"ids\" value=\"10996011\" id=\"ids\" />\n" + 
"								<div id=\"files\" class=\"clearfix\">\n" + 
"									<div class=\"sidebar clearfix\">\n" + 
"										<div class=\"block\">\n" + 
"											<label for=\"title\">Title</label> <input type=\"text\" name=\"title\" value=\"<%=file.name%>\" id=\"title\" maxlength=\"100\" placeholder=\"title\" />\n" + 
"										</div>\n" + 
"										<div class=\"block\">\n" + 
"											<label for=\"description\">Description</label>\n" + 
"											<textarea name=\"description\"></textarea>\n" + 
"										</div>\n" + 
"										<div class=\"block last\">\n" + 
"											<select class=\"category\" id=\"category\" name=\"category\">\n" + 
"												<option value=\"\">Category</option>\n" + 
"												<option value=\"10\">Abstract</option>\n" + 
"												<option value=\"11\">Animals</option>\n" + 
"												<option value=\"5\">Black and White</option>\n" + 
"												<option value=\"1\">Celebrities</option>\n" + 
"												<option value=\"9\">City and Architecture</option>\n" + 
"												<option value=\"15\">Commercial</option>\n" + 
"												<option value=\"16\">Concert</option>\n" + 
"												<option value=\"20\">Family</option>\n" + 
"												<option value=\"14\">Fashion</option>\n" + 
"												<option value=\"2\">Film</option>\n" + 
"												<option value=\"24\">Fine Art</option>\n" + 
"												<option value=\"23\">Food</option>\n" + 
"												<option value=\"3\">Journalism</option>\n" + 
"												<option value=\"8\">Landscapes</option>\n" + 
"												<option value=\"12\">Macro</option>\n" + 
"												<option value=\"18\">Nature</option>\n" + 
"												<option value=\"4\">Nude</option>\n" + 
"												<option value=\"7\">People</option>\n" + 
"												<option value=\"19\">Performing Arts</option>\n" + 
"												<option value=\"17\">Sport</option>\n" + 
"												<option value=\"6\">Still Life</option>\n" + 
"												<option value=\"21\">Street</option>\n" + 
"												<option value=\"26\">Transportation</option>\n" + 
"												<option value=\"13\">Travel</option>\n" + 
"												<option value=\"22\">Underwater</option>\n" + 
"												<option value=\"27\">Urban Exploration</option>\n" + 
"												<option value=\"25\">Wedding</option>\n" + 
"												<option value=\"0\" selected=\"selected\">Uncategorized</option>\n" + 
"											</select>\n" + 
"										</div>\n" + 
"\n" + 
"\n" + 
"\n" + 
"										<div class=\"clearfix nsfw_toggle\">\n" + 
"											<label>Safe for work?</label>\n" + 
"											<div class=\"nsfw_tooltip\">Safe for work photos do not contain any nudity, sexually explicit content, graphic violence, or anything else you wouldn't want\n" + 
"												your boss to catch you looking at.</div>\n" + 
"											<div class=\"right clearfix nsfw_control\">\n" + 
"												<div id=\"nsfw_radio\">\n" + 
"													<input type=\"radio\" name=\"nsfw\" id=\"nsfw_yes\" value=\"1\" /><label for=\"nsfw_yes\">Yes</label> <input type=\"radio\" name=\"nsfw\" id=\"nsfw_no\" value=\"0\" /><label\n" + 
"														for=\"nsfw_no\">No</label>\n" + 
"												</div>\n" + 
"											</div>\n" + 
"										</div>\n" + 
"\n" + 
"										<div class=\"inline\">\n" + 
"											<input type=\"text\" name=\"tags\" class=\"tags\" value=\"\" placeholder=\"Tags (divide by comma)\" />\n" + 
"										</div>\n" + 
"										<div class=\"inline\">\n" + 
"											<input type=\"hidden\" name=\"taken_at\" id=\"taken_at\" value=\"\" /> <input type=\"text\" id=\"taken_at_display\" class=\"date\" value=\"\" placeholder=\"Date Taken\" />\n" + 
"										</div>\n" + 
"										<div class=\"inline\">\n" + 
"											<input type=\"text\" name=\"camera\" class=\"camera\" value=\"\" placeholder=\"Camera\" />\n" + 
"										</div>\n" + 
"										<div class=\"inline\">\n" + 
"											<input type=\"text\" name=\"lens\" class=\"lens\" value=\"\" placeholder=\"Lens\" />\n" + 
"										</div>\n" + 
"										<div class=\"inline\">\n" + 
"											<input type=\"text\" name=\"focal_length\" class=\"focal-length\" value=\"\" placeholder=\"Focal Length\" />\n" + 
"										</div>\n" + 
"										<div class=\"inline\">\n" + 
"											<input type=\"text\" name=\"shutter_speed\" class=\"shutter-speed\" value=\"\" placeholder=\"Shutter Speed\" />\n" + 
"										</div>\n" + 
"										<div class=\"inline\">\n" + 
"											<input type=\"text\" name=\"aperture\" class=\"aperture\" value=\"\" placeholder=\"Aperture\" />\n" + 
"										</div>\n" + 
"										<div class=\"inline last\">\n" + 
"											<input type=\"text\" name=\"iso\" class=\"iso\" value=\"\" placeholder=\"ISO/Film\" />\n" + 
"										</div>\n" + 
"										<div class=\"box last\">\n" + 
"											<div id=\"map\" class=\"map\"></div>\n" + 
"											<a id=\"map_remove_marker\" class=\"sub_text\">Remove marker</a> <input type=\"hidden\" name=\"latitude\" id=\"map_latitude\" value=\"\" /> <input type=\"hidden\"\n" + 
"												name=\"longitude\" id=\"map_longitude\" value=\"\" />\n" + 
"										</div>\n" + 
"									</div>\n" + 
"									<div class=\"photo\">\n" + 
"										<p class=\"sub_text\">Click and drag on the photo to create a custom thumbnail</p>\n" + 
"										<input type=\"hidden\" name=\"thumbnail_coordinates\" id=\"thumbnail_coordinates\" value=\"\" />\n" + 
"									</div>\n" + 
"								</div>\n" + 
"								<div class=\"linetop clearfix\" id=\"save-edit-buttons\">\n" + 
"									<div class=\"left clearfix\">\n" + 
"										<input type=\"button\" value=\"Delete\" class=\"button delete right\" id=\"edit_delete\" />\n" + 
"									</div>\n" + 
"									<div class=\"right clearfix\">\n" + 
"										<div id=\"upload_message\">Saving photo...</div>\n" + 
"										<input type=\"submit\" value=\"Save\" class=\"button green right\" />\n" + 
"									</div>\n" + 
"								</div>\n" + 
"						</td>\n" + 
"					</tr>\n" + 
"\n" + 
"<% } %>\n" + 
"</script>\n" + 
"\n" + 
"</body>\n" + 
"</html>\n");// line 38, japidviews\Application\photo\Uploads1.html
		
		endDoLayout(sourceTemplate);
	}

}