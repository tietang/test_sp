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
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/photo/UploadSwf.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class UploadSwf extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/UploadSwf.html";
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


	public UploadSwf() {
		super(null);
	}
	public UploadSwf(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.UploadSwf.class);

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
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/Application/photo/UploadSwf.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new UploadSwf().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\photo\UploadSwf.html

// line 2, japidviews\Application\photo\UploadSwf.html
		p("<div class=\"grid_row\">\n" + 
"\n" + 
"	<form id=\"multipleDemo\" enctype=\"multipart/form-data\">\n" + 
"\n" + 
"		<div id=\"multiple\"></div>\n" + 
"\n" + 
"		<div id=\"files\">\n" + 
"			<table class=\"table table-striped center \" id=\"content\"\n" + 
"			style=\"display: none\">\n" + 
"				<thead>\n" + 
"					<tr>\n" + 
"						<td colspan=\"3\" class=\"non-border span12\">\n" + 
"						<div id=\"progress\"\n" + 
"						class=\"progress progress-success progress-striped\">\n" + 
"							<div class=\"bar\"></div>\n" + 
"						</div></td>\n" + 
"					</tr>\n" + 
"				</thead>\n" + 
"				<tbody data-target=\"#modal-gallery\" data-toggle=\"modal-gallery\"\n" + 
"				class=\"files\">\n" + 
"					<tr>\n" + 
"						<td class=\"right_line span6\">\n" + 
"						<div class=\" magin_left\">\n" + 
"							<div id=\"preview\"></div>\n" + 
"							<br />\n" + 
"							<p>\n" + 
"								file name: <span id=\"name\"></span>\n" + 
"							</p>\n" + 
"							<p>\n" + 
"								source size: <span id=\"size\"></span>\n" + 
"							</p>\n" + 
"						</div></td>\n" + 
"						<td class=\"right_line span3\">\n" + 
"						<div class=\" magin_left\">\n" + 
"							<div class=\"block\">\n" + 
"								<label for=\"title1\">Title</label>\n" + 
"								<input type=\"text\"\n" + 
"								placeholder=\"title\" maxlength=\"100\" id=\"title1\" value=\"\"\n" + 
"								name=\"title\" class=\" input-width \">\n" + 
"								<input\n" + 
"								type=\"hidden\" placeholder=\"ID\" maxlength=\"100\" id=\"id1\"\n" + 
"								value=\"\" name=\"id\" class=\" input-width \">\n" + 
"							</div>\n" + 
"							<div class=\"block\">\n" + 
"								<label for=\"desc1\">Description</label>\n" + 
"								<textarea class=\" input-width \" id=\"desc1\"\n" + 
"										placeholder=\"Description\" name=\"description\"></textarea>\n" + 
"							</div>\n" + 
"							<div class=\"block\">\n" + 
"								<select name=\"category\" id=\"category1\"\n" + 
"								class=\"category select-width\">\n" + 
"									<optgroup label=\"Category\"></optgroup>\n" + 
"									<option value=\"10\">Abstract</option>\n" + 
"									<option value=\"11\">Animals</option>\n" + 
"									<option value=\"5\">Black and White</option>\n" + 
"									<option value=\"1\">Celebrities</option>\n" + 
"									<option value=\"9\">City and Architecture</option>\n" + 
"									<option value=\"15\">Commercial</option>\n" + 
"									<option value=\"16\">Concert</option>\n" + 
"									<option value=\"20\">Family</option>\n" + 
"									<option value=\"14\">Fashion</option>\n" + 
"									<option value=\"2\">Film</option>\n" + 
"									<option value=\"24\">Fine Art</option>\n" + 
"									<option value=\"23\">Food</option>\n" + 
"									<option value=\"3\">Journalism</option>\n" + 
"									<option value=\"8\">Landscapes</option>\n" + 
"									<option value=\"12\">Macro</option>\n" + 
"									<option value=\"18\">Nature</option>\n" + 
"									<option value=\"4\">Nude</option>\n" + 
"									<option value=\"7\">People</option>\n" + 
"									<option value=\"19\">Performing Arts</option>\n" + 
"									<option value=\"17\">Sport</option>\n" + 
"									<option value=\"6\">Still Life</option>\n" + 
"									<option value=\"21\">Street</option>\n" + 
"									<option value=\"26\">Transportation</option>\n" + 
"									<option value=\"13\">Travel</option>\n" + 
"									<option value=\"22\">Underwater</option>\n" + 
"									<option value=\"27\">Urban Exploration</option>\n" + 
"									<option value=\"25\">Wedding</option>\n" + 
"									<option selected=\"selected\" value=\"0\">Uncategorized</option>\n" + 
"								</select>\n" + 
"							</div>\n" + 
"							<div class=\"block\">\n" + 
"								<label for=\"tags1\">Tags</label>\n" + 
"								<textarea rows=\"\" cols=\"\" placeholder=\"Tags (divide by comma)\"\n" + 
"										class=\"tags\" name=\"tags\" id=\"tags1\"></textarea>\n" + 
"							</div>\n" + 
"							<div class=\"checkbox\">\n" + 
"								<label for=\"adult1\">\n" + 
"									<input type=\"checkbox\" value=\"1\"\n" + 
"									id=\"adult1\" name=\"adult\">\n" + 
"									For adult content?</label>\n" + 
"							</div>\n" + 
"							<div class=\"checkbox\">\n" + 
"								<label for=\"copyright1\">\n" + 
"									<input type=\"checkbox\"\n" + 
"									value=\"1\" id=\"copyright1\" name=\"copyright\" checked=\"checked\">\n" + 
"									Owns\n" + 
"									the copyright?</label>\n" + 
"							</div>\n" + 
"						</div></td>\n" + 
"						<td class=\"span3\">\n" + 
"						<div class=\" magin_left\">\n" + 
"							<div class=\"inline input-prepend\">\n" + 
"								<span class=\"add-on\"><span class=\" span1 left\">Camera </span></span>\n" + 
"								<input type=\"text\" placeholder=\"Camera\" value=\"\"\n" + 
"								class=\"Camera\" id=\"camera1\" name=\"camera\">\n" + 
"								<input\n" + 
"								type=\"hidden\" placeholder=\"Make\" value=\"\" class=\"make\"\n" + 
"								id=\"make1\" name=\"make\">\n" + 
"							</div>\n" + 
"							<div class=\"inline input-prepend\">\n" + 
"								<span class=\"add-on\"><span class=\" span1 left\">Lens</span> </span>\n" + 
"								<input type=\"text\" placeholder=\"Lens\" value=\"\" class=\"lens\"\n" + 
"								id=\"lens1\" name=\"lens\">\n" + 
"							</div>\n" + 
"							<div class=\"inline input-prepend\">\n" + 
"								<span class=\"add-on\"><span class=\" span1 left\">Focus </span></span>\n" + 
"								<input type=\"text\" placeholder=\"Focal Length\" value=\"\"\n" + 
"								class=\"focal-length\" id=\"focus1\" name=\"focus\">\n" + 
"							</div>\n" + 
"							<div class=\"inline input-prepend\">\n" + 
"								<span class=\"add-on \"><span class=\" span1 left\">Shutter </span></span>\n" + 
"								<input type=\"text\" placeholder=\"Shutter Speed\" value=\"\"\n" + 
"								class=\"shutter-speed\" id=\"shutter1\" name=\"shutter\">\n" + 
"							</div>\n" + 
"							<div class=\"inline input-prepend\">\n" + 
"								<span class=\"add-on\"><span class=\" span1 left\">Aperture</span></span>\n" + 
"								<input type=\"text\" placeholder=\"Aperture\" value=\"\"\n" + 
"								class=\"aperture\" id=\"aperture1\" name=\"aperture\">\n" + 
"							</div>\n" + 
"							<div class=\"inline input-prepend last\">\n" + 
"								<span class=\"add-on\"><span class=\" span1 left\">ISO </span></span>\n" + 
"								<input type=\"text\" placeholder=\"ISO/Film\" value=\"\" class=\"iso\"\n" + 
"								id=\"iso1\" name=\"iso\">\n" + 
"							</div>\n" + 
"							<div class=\"inline input-prepend last\">\n" + 
"								<span class=\"add-on\"><span class=\" span1 left\">EV</span></span>\n" + 
"								<input type=\"text\" placeholder=\"Exposure Compensation\" value=\"\"\n" + 
"								class=\"iso\" id=\"ev1\" name=\"ev\">\n" + 
"							</div>\n" + 
"							<div class=\"inline input-prepend\">\n" + 
"								<span class=\"add-on\"><span class=\" span1 left\"> Taken </span></span>\n" + 
"								<input type=\"hidden\" value=\"\" id=\"taken_at1\"\n" + 
"								name=\"taken_at\">\n" + 
"								<input type=\"text\"\n" + 
"								placeholder=\"Date Taken\" value=\"\" class=\"date\"\n" + 
"								id=\"taken_at_display1\">\n" + 
"							</div>\n" + 
"						</div></td>\n" + 
"					</tr>\n" + 
"					<tr class=\"template-upload fade in\">\n" + 
"						<td colspan=\"2\"></td>\n" + 
"						<td><span class=\"start\" id=\"start\"> </span><!-- 			 <span class=\"cancel\" id=\"Cancel\">\n" + 
"\n" + 
"						<button class=\"btn btn-warning\">\n" + 
"						<i class=\"icon-ban-circle icon-white\"></i> <span>Cancel</span>\n" + 
"						</button>\n" + 
"\n" + 
"						</span> --></td>\n" + 
"					</tr>\n" + 
"				</tbody>\n" + 
"			</table>\n" + 
"		</div>\n" + 
"	</form>\n" + 
"\n" + 
"	<a href=\"#\" onClick=\"document.getElementById('agileUploaderSWF').submit();\">Submit</a>\n" + 
"</div>\n" + 
"\n" + 
"<script type=\"text/javascript\">\n" + 
"	$('#multiple').agileUploader({\n" + 
"		flashSrc : 'agile-uploader.swf',\n" + 
"		submitRedirect : 'results.php',\n" + 
"		formId : 'multipleDemo',\n" + 
"		flashVars : {\n" + 
"			firebug : true,\n" + 
"			form_action : '/process.php',\n" + 
"			file_limit : 3,\n" + 
"			max_post_size : (10000 * 1024)\n" + 
"		}\n" + 
"	}); \n" + 
"</script>\n" + 
"\n");// line 40, japidviews\Application\photo\UploadSwf.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy Upload Page");;
	}
	@Override protected void css() {
		// line 2, japidviews\Application\photo\UploadSwf.html
		p("<style type=\"text/css\">\n" + 
"	<!--\n" + 
"	.left {\n" + 
"	text-align: left;\n" + 
"	padding: 0px;\n" + 
"	padding-right: 4px;\n" + 
"	margin: 0px;\n" + 
"	width: 50px;\n" + 
"	*width: 50px;\n" + 
"	margin: 0px;\n" + 
"	}\n" + 
"\n" + 
"	.right_line {\n" + 
"	border-right: 1px solid #dddddd;\n" + 
"	}\n" + 
"\n" + 
"	.non-border {\n" + 
"	border: 0px;\n" + 
"	}\n" + 
"\n" + 
"	.magin_left {\n" + 
"	margin-left: 0px;\n" + 
"	}\n" + 
"\n" + 
"	.center {\n" + 
"	text-align: center;\n" + 
"	margin-left: auto;\n" + 
"	margin-right: auto;\n" + 
"	}\n" + 
"	-->\n" + 
"</style>\n" + 
"<script src=\"");// line 2, japidviews\Application\photo\UploadSwf.html
		p(lookupStatic("/public/agile-uploader-3.0/jquery.flash.min.js"));// line 34, japidviews\Application\photo\UploadSwf.html
		p("\" type=\"text/javascript\"></script>\n" + 
"\n" + 
"<script src=\"");// line 34, japidviews\Application\photo\UploadSwf.html
		p(lookupStatic("/public/agile-uploader-3.0/agile-uploader-3.1.js"));// line 36, japidviews\Application\photo\UploadSwf.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<link type=\"text/css\" rel=\"stylesheet\" href=\"");// line 36, japidviews\Application\photo\UploadSwf.html
		p(lookupStatic("/public/agile-uploader-3.0/agile-uploader.css"));// line 37, japidviews\Application\photo\UploadSwf.html
		p("\" />\n" + 
"<script src=\"");// line 37, japidviews\Application\photo\UploadSwf.html
		p(lookupStatic("/public/app/ExifUtils.js"));// line 38, japidviews\Application\photo\UploadSwf.html
		p("\"></script>\n" + 
"<script src=\"");// line 38, japidviews\Application\photo\UploadSwf.html
		p(lookupStatic("/public/app/upload.js"));// line 39, japidviews\Application\photo\UploadSwf.html
		p("\"></script>\n");// line 39, japidviews\Application\photo\UploadSwf.html
		;
	}
}