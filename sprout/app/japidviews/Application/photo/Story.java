package japidviews.Application.photo;

import japidviews._tags.AddNav;

import static cn.bran.play.JapidPlayAdapter.lookupStatic;
//
// NOTE: This file was generated from: japidviews/Application/photo/Story.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Story extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Story.html";
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


	public Story() {
		super(null);
	}
	public Story(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Story.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/photo/Story.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Story().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\Story.html
// line 7, japidviews\Application\photo\Story.html
		p("</pre>\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n");// line 103, japidviews\Application\photo\Story.html
		final AddNav _AddNav3 = new AddNav(getOut()); _AddNav3.setActionRunners(getActionRunners()).setOut(getOut()); _AddNav3.render("story"); // line 111, japidviews\Application\photo\Story.html// line 111, japidviews\Application\photo\Story.html
		p("\n" + 
"<form id=\"fileuploadForm\" action=\"/story/done\" method=\"post\" enctype=\"multipart/form-data\">\n" + 
"\n" + 
"	<div class=\"grid_row story\">\n" + 
"<!--\n" + 
"		<div class=\"col col_16\"  >\n" + 
"			<div class=\"title\">\n" + 
"				New Story\n" + 
"			</div>\n" + 
"		</div>-->\n" + 
"\n" + 
"\n" + 
"		<div class=\"col col_4\">\n" + 
"			<div class=\"help  edit\">\n" + 
"				<img src=\"");// line 111, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/images/stories_edit.png"));// line 126, japidviews\Application\photo\Story.html
		p("\" />\n" + 
"				<div  >\n" + 
"					Story book\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"		</div>\n" + 
"\n" + 
"		<div class=\"col col_12\"  >\n" + 
"			<div>\n" + 
"				<input  type=\"text\" name=\"story_title\" placeholder=\"Story title\" title=\"Story title\" class=\"col_12\"/>\n" + 
"			</div>\n" + 
"			<div>\n" + 
"				<textarea name=\"content\" placeholder=\"Your story\" title=\"Your story\" class=\"col_12\" rows=\"6\"></textarea>\n" + 
"			</div>\n" + 
"			<div>\n" + 
"				<textarea name=\"tags\" placeholder=\"List tags\" title=\"List tags\" class=\"col_12\" rows=\"2\"></textarea>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"\n" + 
"		<div class=\"col col_16  \"  >\n" + 
"			<div class=\"well fileupload-buttonbar shadow\">\n" + 
"\n" + 
"				<div class=\"\">\n" + 
"					<!-- The fileinput-button span is used to style the file input field as button -->\n" + 
"					<span class=\"btn btn-success fileinput-button\"> <i class=\"icon-plus icon-white\"></i> <span>Add files...</span>\n" + 
"						<input type=\"file\" name=\"files[]\" multiple>\n" + 
"					</span>\n" + 
"					<button type=\"submit\" class=\"btn btn-primary start\">\n" + 
"						<i class=\"icon-upload icon-white\"></i>\n" + 
"						<span>Start All</span>\n" + 
"					</button>\n" + 
"					<button type=\"reset\" class=\"btn btn-warning cancel\">\n" + 
"						<i class=\"icon-ban-circle icon-white\"></i>\n" + 
"						<span>Cancel All</span>\n" + 
"					</button>\n" + 
"					<!-- The loading indicator is shown during file processing -->\n" + 
"					<span class=\"fileupload-loading\"></span>\n" + 
"				</div>\n" + 
"				<!-- The global progress information -->\n" + 
"				<div class=\" fileupload-progress fade\">\n" + 
"					<!-- The global progress bar -->\n" + 
"					<div class=\"progress progress-success progress-striped active\" role=\"progressbar\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n" + 
"						<div class=\"bar\" style=\"width:0%;\"></div>\n" + 
"					</div>\n" + 
"					<!-- The extended global progress information -->\n" + 
"					<div class=\"progress-extended\">\n" + 
"						&nbsp;\n" + 
"					</div>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"files\"></div>\n" + 
"\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"</form>\n" + 
"\n" + 
"<script id=\"template-upload\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"	{% for (var i=0, file; file=o.files[i]; i++) {console.info(o);  var data=o.data;var imgIndex=data.imageIndex;  %}\n" + 
"	<table class=\"table table-striped img_shadow template-upload fade\">\n" + 
"	<thead>\n" + 
"	<tr>\n" + 
"	<td colspan=\"2\" class=\"non-border \">\n" + 
"	<div class=\"progress_per progress progress-info progress-striped\" >\n" + 
"	<div class=\"bar\"></div>\n" + 
"	</div></td>\n" + 
"	<td> {% if (!o.files.error && !i && !o.options.autoUpload) { %}\n" + 
"	{% if (!o.options.autoUpload) { %}\n" + 
"	<button class=\"btn btn-primary start\">\n" + 
"	<i class=\"icon-upload icon-white\"></i>\n" + 
"	<span>{%=locale.fileupload.start%}</span>\n" + 
"	</button> {% } %}  {% } %}\n" + 
"	{% if (!i) { %}\n" + 
"	<button class=\"btn btn-warning cancel\">\n" + 
"	<i class=\"icon-ban-circle icon-white\"></i>\n" + 
"	<span>{%=locale.fileupload.cancel%}</span>\n" + 
"	</button> {% } %} </td>\n" + 
"	</tr>\n" + 
"	</thead>\n" + 
"	<tbody >\n" + 
"	<tr>\n" + 
"	<td class=\"right_line  col_8\">\n" + 
"	<div class=\" magin_left\">\n" + 
"\n" + 
"	<div id=\"preview\" class=\"  preview img_shadow\"></div>\n" + 
"	<p>\n" + 
"	{% if (file.error) { %}\n" + 
"	<div>\n" + 
"	<span class=\"label label-important\">Error</span> {%=file.error%}\n" + 
"	</div>\n" + 
"	{% } %}\n" + 
"	</p>\n" + 
"	<p>\n" + 
"	file name: <span id=\"name\">{%=file.name%}</span>\n" + 
"	</p>\n" + 
"	<p>\n" + 
"	source size: <span id=\"size\">{%=o.formatFileSize(file.size)%}</span>\n" + 
"	</p>\n" + 
"	</div></td>\n" + 
"\n" + 
"	<td class=\"right_line col_4\">\n" + 
"	<div class=\" magin_left\">\n" + 
"	<div class=\"block\">\n" + 
"	<label for=\"title{%=imgIndex%}\">Title</label>\n" + 
"	<input type=\"text\"\n" + 
"	placeholder=\"title\" maxlength=\"100\" id=\"title{%=imgIndex%}\" value=\"{%=file.name%}\"\n" + 
"	name=\"title\" class=\" span4 \">\n" + 
"	<input	type=\"hidden\"  id=\"id{%=imgIndex%}\" name=\"id\" />\n" + 
"	<input	type=\"hidden\"  id=\"index{%=imgIndex%}\"	value=\"{%=imgIndex%}\" name=\"index\"/>\n" + 
"\n" + 
"	</div>\n" + 
"	<div class=\"block\">\n" + 
"	<label for=\"description{%=imgIndex%}\">Description</label>\n" + 
"	<textarea class=\" span4 \" id=\"description{%=imgIndex%}\" rows=\"6\"	placeholder=\"Description\" name=\"description\"></textarea>\n" + 
"	</div>\n" + 
"	<div class=\"block\">\n" + 
"	<select name=\"category\" id=\"category{%=imgIndex%}\"\n" + 
"	class=\"category span4\">\n" + 
"	<optgroup label=\"Category\"></optgroup>\n" + 
"	<option value=\"10\">Abstract</option>\n" + 
"	<option value=\"11\">Animals</option>\n" + 
"	<option value=\"5\">Black and White</option>\n" + 
"	<option value=\"1\">Celebrities</option>\n" + 
"	<option value=\"9\">City and Architecture</option>\n" + 
"	<option value=\"15\">Commercial</option>\n" + 
"	<option value=\"16\">Concert</option>\n" + 
"	<option value=\"20\">Family</option>\n" + 
"	<option value=\"14\">Fashion</option>\n" + 
"	<option value=\"2\">Film</option>\n" + 
"	<option value=\"24\">Fine Art</option>\n" + 
"	<option value=\"23\">Food</option>\n" + 
"	<option value=\"3\">Journalism</option>\n" + 
"	<option value=\"8\">Landscapes</option>\n" + 
"	<option value=\"12\">Macro</option>\n" + 
"	<option value=\"18\">Nature</option>\n" + 
"	<option value=\"4\">Nude</option>\n" + 
"	<option value=\"7\">People</option>\n" + 
"	<option value=\"19\">Performing Arts</option>\n" + 
"	<option value=\"17\">Sport</option>\n" + 
"	<option value=\"6\">Still Life</option>\n" + 
"	<option value=\"21\">Street</option>\n" + 
"	<option value=\"26\">Transportation</option>\n" + 
"	<option value=\"13\">Travel</option>\n" + 
"	<option value=\"22\">Underwater</option>\n" + 
"	<option value=\"27\">Urban Exploration</option>\n" + 
"	<option value=\"25\">Wedding</option>\n" + 
"	<option selected=\"selected\" value=\"0\">Uncategorized</option>\n" + 
"	</select>\n" + 
"	</div>\n" + 
"	<div class=\"block\">\n" + 
"	<label for=\"tags{%=imgIndex%}\">Tags</label>\n" + 
"	<textarea   placeholder=\"Tags (divide by comma)\" rows=\"6\"\n" + 
"	class=\"span4\" name=\"tags\" id=\"tags{%=imgIndex%}\"></textarea>\n" + 
"	</div>\n" + 
"\n" + 
"	</div></td>\n" + 
"	<td class=\"col_4\">\n" + 
"	<div class=\" magin_left\">\n" + 
"	<div class=\"inline input-prepend\">\n" + 
"	<span class=\"add-on\"><span class=\"icon-head left\">Camera</span></span>\n" + 
"	<input type=\"text\" placeholder=\"Camera\" value=\"\"\n" + 
"	class=\"Camera\" id=\"camera{%=imgIndex%}\" name=\"camera\">\n" + 
"	<input\n" + 
"	type=\"hidden\" placeholder=\"Make\" value=\"\" class=\"make\"\n" + 
"	id=\"make{%=imgIndex%}\" name=\"make\">\n" + 
"	<input type=\"hidden\"  value=\"\" id=\"WhiteBalance{%=imgIndex%}\" name=\"WhiteBalance\">\n" + 
"	<input type=\"hidden\"  value=\"\" id=\"Software{%=imgIndex%}\" name=\"Software\">\n" + 
"	<input type=\"hidden\"  value=\"\" id=\"Flash{%=imgIndex%}\" name=\"Flash\">\n" + 
"	<input type=\"hidden\"  value=\"\" id=\"ColorSpace{%=imgIndex%}\" name=\"ColorSpace\">\n" + 
"	<input type=\"hidden\"  value=\"\" id=\"MeteringMode{%=imgIndex%}\" name=\"MeteringMode\">\n" + 
"\n" + 
"	</div>\n" + 
"	<div class=\"inline input-prepend\">\n" + 
"	<span class=\"add-on\"><span class=\"icon-head left\">Lens</span> </span>\n" + 
"	<input type=\"text\" placeholder=\"Lens\" value=\"\" class=\"lens\"\n" + 
"	id=\"lens{%=imgIndex%}\" name=\"lens\">\n" + 
"	</div>\n" + 
"	<div class=\"inline input-prepend\">\n" + 
"	<span class=\"add-on\"><span class=\"icon-head left\">Focus </span></span>\n" + 
"	<input type=\"text\" placeholder=\"Focal Length\" value=\"\"\n" + 
"	class=\"focal-length\" id=\"focus{%=imgIndex%}\" name=\"focus\">\n" + 
"	</div>\n" + 
"	<div class=\"inline input-prepend\">\n" + 
"	<span class=\"add-on \"><span class=\"icon-head left\">Shutter </span></span>\n" + 
"	<input type=\"text\" placeholder=\"Shutter Speed\" value=\"\"\n" + 
"	class=\"shutter-speed\" id=\"shutter{%=imgIndex%}\" name=\"shutter\">\n" + 
"	</div>\n" + 
"	<div class=\"inline input-prepend\">\n" + 
"	<span class=\"add-on\"><span class=\"icon-head left\">Aperture</span></span>\n" + 
"	<input type=\"text\" placeholder=\"Aperture\" value=\"\"\n" + 
"	class=\"aperture\" id=\"aperture{%=imgIndex%}\" name=\"aperture\">\n" + 
"	</div>\n" + 
"	<div class=\"inline input-prepend last\">\n" + 
"	<span class=\"add-on\"><span class=\"icon-head left\">ISO </span></span>\n" + 
"	<input type=\"text\" placeholder=\"ISO/Film\" value=\"\" class=\"iso\"\n" + 
"	id=\"iso{%=imgIndex%}\" name=\"iso\">\n" + 
"	</div>\n" + 
"	<div class=\"inline input-prepend last\">\n" + 
"	<span class=\"add-on\"><span class=\"icon-head left\">EV</span></span>\n" + 
"	<input type=\"text\" placeholder=\"Exposure Compensation\" value=\"\"\n" + 
"	class=\"iso\" id=\"ev{%=imgIndex%}\" name=\"ev\">\n" + 
"	</div>\n" + 
"	<div class=\"inline input-prepend\">\n" + 
"	<span class=\"add-on\"><span class=\"icon-head left\"> Taken </span></span>\n" + 
"	<input type=\"hidden\" value=\"\" id=\"taken_at{%=imgIndex%}\"\n" + 
"	name=\"taken_at\">\n" + 
"	<input type=\"text\"\n" + 
"	placeholder=\"Date Taken\" value=\"\" class=\"date\"\n" + 
"	id=\"taken_at_display{%=imgIndex%}\">\n" + 
"	</div>\n" + 
"	<div class=\"checkbox\">\n" + 
"	<label for=\"adult{%=imgIndex%}\">\n" + 
"	<input type=\"checkbox\" value=\"1\"\n" + 
"	id=\"adult{%=imgIndex%}\" name=\"adult\">\n" + 
"	For adult content?</label>\n" + 
"	</div>\n" + 
"	<div class=\"checkbox\">\n" + 
"	<label for=\"copyright{%=imgIndex%}\">\n" + 
"	<input type=\"checkbox\"\n" + 
"	value=\"1\" id=\"copyright{%=imgIndex%}\" name=\"copyright\" checked=\"checked\">\n" + 
"	Owns\n" + 
"	the copyright?</label>\n" + 
"	</div>\n" + 
"	</div></td>\n" + 
"	</tr>\n" + 
"	</tbody>\n" + 
"	</table>\n" + 
"	{%  } %}\n" + 
"</script>\n");// line 126, japidviews\Application\photo\Story.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Story Page");;
	}
	@Override protected void css() {
		// line 7, japidviews\Application\photo\Story.html
		p("<!--[if lt IE 7]><link rel=\"stylesheet\" href=\"http://blueimp.github.com/cdn/css/bootstrap-ie6.min.css\"><![endif]-->\n" + 
"<link rel=\"stylesheet\" href=\"");// line 7, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/css/jquery.fileupload-ui.css"));// line 9, japidviews\Application\photo\Story.html
		p("\">\n" + 
"<script src=\"");// line 9, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/js/vendor/jquery.ui.widget.js"));// line 10, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 10, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/load-image.min.js"));// line 11, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 11, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 12, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 12, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/canvas-to-blob.min.js"));// line 13, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 13, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/js/jquery.iframe-transport.js"));// line 14, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 14, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/js/jquery.fileupload.js"));// line 15, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 15, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/js/jquery.fileupload-process.js"));// line 16, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 16, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/js/jquery.fileupload-image.js"));// line 17, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 17, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/blueimp/js/jquery.fileupload-validate.js"));// line 18, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 18, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/js/binaryajax.js"));// line 19, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 19, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/js/exif.js"));// line 20, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 20, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/app/ExifUtils.js"));// line 21, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<script src=\"");// line 21, japidviews\Application\photo\Story.html
		p(lookupStatic("/public/app/story.js"));// line 22, japidviews\Application\photo\Story.html
		p("\"></script>\n" + 
"<style type=\"text/css\">\n" + 
"	.left {\n" + 
"		text-align: left;\n" + 
"		padding: 0px;\n" + 
"		padding-right: 4px;\n" + 
"		margin: 0px;\n" + 
"		width: 50px;\n" + 
"		*width: 50px;\n" + 
"		margin: 0px;\n" + 
"	}\n" + 
"\n" + 
"	.right_line {\n" + 
"		border-right: 1px solid #dddddd;\n" + 
"	}\n" + 
"\n" + 
"	.non-border {\n" + 
"		border: 0px;\n" + 
"	}\n" + 
"\n" + 
"	.magin_left {\n" + 
"		margin-left: 0px;\n" + 
"	}\n" + 
"\n" + 
"	.center {\n" + 
"		text-align: center;\n" + 
"		margin-left: auto;\n" + 
"		margin-right: auto;\n" + 
"	}\n" + 
"	.story {\n" + 
"\n" + 
"	}\n" + 
"	.story .title {\n" + 
"		border-bottom: 1px solid #CCCCCC;\n" + 
"		padding-bottom: 20px;\n" + 
"		width: 100%;\n" + 
"		margin-bottom: 20px;\n" + 
"		font-size: 18px;\n" + 
"	}\n" + 
"	.story input.col_12, .story textarea.col_12 {\n" + 
"		width: 866px;\n" + 
"		max-width: 866px;\n" + 
"	}\n" + 
"	.story .well {\n" + 
"		width: 1140px;\n" + 
"		max-width: 1140px;\n" + 
"		margin-top: 15px;\n" + 
"	}\n" + 
"	.story .edit_exif {\n" + 
"		display: none;\n" + 
"	}\n" + 
"	.story .edit {\n" + 
"		height: 240px;\n" + 
"		max-height: 240px;\n" + 
"	}\n" + 
"	.story .preview {\n" + 
"		width: 100%;\n" + 
"		margin-left: auto;\n" + 
"		margin-right: auto;\n" + 
"		*zoom: 1;\n" + 
"		overflow: hidden;\n" + 
"	}\n" + 
"	.story .preview img, .story .preview canvas {\n" + 
"		width: 100%;\n" + 
"		-moz-box-shadow: 0px 1px 3px rgba(0,0,0,0.3);\n" + 
"		-webkit-box-shadow: 0px 1px 3px rgba(0,0,0,0.3);\n" + 
"		box-shadow: 0px 1px 3px rgba(0,0,0,0.3);\n" + 
"	}\n" + 
"\n" + 
"	.story .help {\n" + 
"		width: 240px;\n" + 
"		max-width: 240px;\n" + 
"	}\n" + 
"	.story .icon-head {\n" + 
"		width: 60px;\n" + 
"		max-width: 60px;\n" + 
"		overflow: hidden;\n" + 
"	}\n" + 
"\n" + 
"</style>\n" + 
"\n");// line 22, japidviews\Application\photo\Story.html
		;
	}
	@Override protected void header() {
		p( "Story");;
	}
}