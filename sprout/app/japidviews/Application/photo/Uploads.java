//version: 0.9.35
package japidviews.Application.photo;

import static cn.bran.play.JapidPlayAdapter.lookupStatic;
//
// NOTE: This file was generated from: japidviews/Application/photo/Uploads.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Uploads extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/Uploads.html";
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


	public Uploads() {
		super(null);
	}
	public Uploads(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Uploads.class);

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
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/Application/photo/Uploads.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Uploads().render();
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
"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 1, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/css/jquery.fileupload-ui.css"));// line 10, japidviews\Application\photo\Uploads.html
		p("\">\n" + 
"<!-- <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 10, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/css/ui-darkness/jquery-ui-1.10.2.custom.css"));// line 11, japidviews\Application\photo\Uploads.html
		p("\"> -->\n" + 
"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 11, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/bootstrap/css/bootstrap.min.css"));// line 12, japidviews\Application\photo\Uploads.html
		p("\">\n" + 
"<!-- <link rel=\"stylesheet\" media=\"screen\" href=\"");// line 12, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/css/form.css"));// line 13, japidviews\Application\photo\Uploads.html
		p("\"> -->\n" + 
"<!-- Shim to make HTML5 elements usable in older Internet Explorer versions -->\n" + 
"<!--[if lt IE 9]><script src=\"");// line 13, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/html5shiv.js"));// line 15, japidviews\Application\photo\Uploads.html
		p("\"></script><![endif]-->\n" + 
"<script src=\"");// line 15, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/jquery-1.9.1.js"));// line 16, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 16, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/bootstrap/js/bootstrap.min.js"));// line 17, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 17, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/jquery-ui-1.10.2.custom.min.js"));// line 18, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 18, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/blueimp/tmpl.js"));// line 19, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 19, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/blueimp/load-image.min.js"));// line 20, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 20, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/blueimp/canvas-to-blob.min.js"));// line 21, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 21, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/blueimp/jquery.iframe-transport.js"));// line 22, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 22, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/blueimp/jquery.fileupload.js"));// line 23, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 23, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/blueimp/jquery.fileupload-fp.js"));// line 24, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 24, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/app/ExifUtils.js"));// line 25, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<!--<script src=\"");// line 25, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/blueimp/jquery.fileupload-ui.js"));// line 26, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script> -->\n" + 
"\n" + 
" <script src=\"");// line 26, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/jquery.fileupload-ui-sprucy.js"));// line 28, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 28, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/binaryajax.js"));// line 29, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 29, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/exif.js"));// line 30, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"\n" + 
"<script src=\"");// line 30, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/app/u.js"));// line 32, japidviews\Application\photo\Uploads.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<!-- The XDomainRequest Transport is included for cross-domain file deletion for IE8+ -->\n" + 
"<!--[if gte IE 8]><script src=\"");// line 32, japidviews\Application\photo\Uploads.html
		p(lookupStatic("/public/js/blueimp/cors/jquery.xdr-transport.js"));// line 34, japidviews\Application\photo\Uploads.html
		p("\"></script><![endif]-->\n" + 
"\n" + 
"\n" + 
"<style type=\"text/css\">\n" + 
"html,body {\n" + 
"	background-color: #fff;\n" + 
"}\n" + 
"\n" + 
" \n" + 
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
"table td {\n" + 
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
"\n" + 
".select-width {\n" + 
"	width: 250px;\n" + 
"}\n" + 
"\n" + 
".input-width {\n" + 
"	width: 236px;\n" + 
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
"		<!-- The file upload form used as target for the file upload widget -->\n" + 
"		<form id=\"fileupload\" action=\"/upload/done\" method=\"POST\" enctype=\"multipart/form-data\">\n" + 
"			<!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->\n" + 
"			<div class=\"row fileupload-buttonbar\">\n" + 
"				<div class=\"span7\">\n" + 
"					<!-- The fileinput-button span is used to style the file input field as button -->\n" + 
"					<span class=\"btn btn-success fileinput-button\"> <i class=\"icon-plus icon-white\"></i> <span>Add files...</span> <input type=\"file\" name=\"files[]\" multiple>\n" + 
"					</span>\n" + 
"					<button type=\"submit\" class=\"btn btn-primary start\">\n" + 
"						<i class=\"icon-upload icon-white\"></i> <span>Start upload</span>\n" + 
"					</button>\n" + 
"					<button type=\"reset\" class=\"btn btn-warning cancel\">\n" + 
"						<i class=\"icon-ban-circle icon-white\"></i> <span>Cancel upload</span>\n" + 
"					</button>\n" + 
"\n" + 
"\n" + 
"				</div>\n" + 
"				<!-- The global progress information -->\n" + 
"				<div class=\"span5 fileupload-progress \">\n" + 
"					<!-- The global progress bar -->\n" + 
"					<div class=\"progress progress-success   progress-striped \" >\n" + 
"						<div class=\"bar\"  ></div>\n" + 
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
"		<form id=\"edit\" action=\"/upload/save\" class=\"clearfix photos_placeholder\" id=\"photoinfo\">\n" + 
"			<!-- The table listing the files available for upload/download -->\n" + 
"			<table class=\"\" id=\"upload_table\">\n" + 
"				<tbody class=\"files\">\n" + 
"\n" + 
"				</tbody>\n" + 
"				<tfoot>\n" + 
"					<tr>\n" + 
"						<td colspan=\"4\" style=\"text-align: right; padding-right: 40px;\">\n" + 
"							<button type=\"submit\" class=\"btn btn-primary  \" id=\"save\">Save</button>\n" + 
"						</td>\n" + 
"\n" + 
"					</tr>\n" + 
"				</tfoot>\n" + 
"			</table>\n" + 
"		</form>\n" + 
"\n" + 
"	</div>\n" + 
"\n" + 
"	<!-- The template to display files available for upload -->\n" + 
"	<script id=\"template-upload\" type=\"text/x-tmpl\">\n" + 
" \n" + 
"{% for (var i=0, file; file=o.files[i]; i++) { var data=o.data;var maxImageIndex=data.imageIndex;   %}\n" + 
"		<tr class=\"template-upload fade\">\n" + 
"        {% if (file.error) { %}\n" + 
"            <td class=\"error\" colspan=\"2\"><span class=\"label label-important\">{%=locale.fileupload.error%}</span> {%=locale.fileupload.errors[file.error] || file.error%}</td>\n" + 
"        {% } else if (o.files.valid && !i) { %}\n" + 
"            <td>\n" + 
"                <div class=\"progress progress-info  progress-striped\"  ><div class=\"bar\" ></div></div>\n" + 
"            </td>  \n" + 
"            <td class=\"name\"><span>{%=file.name%}</span></td>\n" + 
" 			<td class=\"size\"><span>{%=o.formatFileSize(file.size)%}</span></td>\n" + 
"            <td >\n" + 
"				<span class=\"start\">\n" + 
"				{% if (!o.options.autoUpload) { %}\n" + 
"                <button class=\"btn btn-primary\">\n" + 
"                    <i class=\"icon-upload icon-white\"></i>\n" + 
"                    <span>{%=locale.fileupload.start%}</span>\n" + 
"                </button>\n" + 
"            {% } %} \n" + 
"        		</span>  \n" + 
"			 {% } %} \n" + 
"				<span class=\"cancel\">\n" + 
"			{% if (!i) { %}\n" + 
"            <button class=\"btn btn-warning\">\n" + 
"                <i class=\"icon-ban-circle icon-white\"></i>\n" + 
"                <span>{%=locale.fileupload.cancel%}</span>\n" + 
"            </button>\n" + 
"        	{% } %}\n" + 
"\n" + 
"			</span>\n" + 
" \n" + 
"	</tr>\n" + 
"\n" + 
"    <tr class=\"template-upload fade\">\n" + 
"       <td colspan=\"3\"><center  class=\"preview\"><span class=\"fade\"></span></center></td>\n" + 
"        <td>\n" + 
" 	<div class=\"span3\">\n" + 
"			<div class=\"block\">\n" + 
"				<label for=\"title{%=maxImageIndex%}\">Title</label> <input  class=\" input-width \" type=\"text\" name=\"title\" value=\"{%=file.name%}\" id=\"title{%=maxImageIndex%}\" maxlength=\"100\"\n" + 
"					placeholder=\"title\" /> <input  class=\" input-width \" type=\"text\" name=\"id\" value=\"\" id=\"id{%=maxImageIndex%}\" maxlength=\"100\" placeholder=\"ID\" />\n" + 
"			</div>\n" + 
"			<div class=\"block\">\n" + 
"				<label for=\"description{%=maxImageIndex%}\">Description</label>\n" + 
"				<textarea name=\"description\" id=\"description{%=maxImageIndex%}\" class=\" input-width \"></textarea>\n" + 
"			</div>\n" + 
"			<div class=\"block\">\n" + 
"				<select class=\"category select-width\" id=\"category{%=maxImageIndex%}\" name=\"category\"  >\n" + 
"					<option value=\"\">Category</option>\n" + 
"					<option value=\"10\">Abstract</option>\n" + 
"					<option value=\"11\">Animals</option>\n" + 
"					<option value=\"5\">Black and White</option>\n" + 
"					<option value=\"1\">Celebrities</option>\n" + 
"					<option value=\"9\">City and Architecture</option>\n" + 
"					<option value=\"15\">Commercial</option>\n" + 
"					<option value=\"16\">Concert</option>\n" + 
"					<option value=\"20\">Family</option>\n" + 
"					<option value=\"14\">Fashion</option>\n" + 
"					<option value=\"2\">Film</option>\n" + 
"					<option value=\"24\">Fine Art</option>\n" + 
"					<option value=\"23\">Food</option>\n" + 
"					<option value=\"3\">Journalism</option>\n" + 
"					<option value=\"8\">Landscapes</option>\n" + 
"					<option value=\"12\">Macro</option>\n" + 
"					<option value=\"18\">Nature</option>\n" + 
"					<option value=\"4\">Nude</option>\n" + 
"					<option value=\"7\">People</option>\n" + 
"					<option value=\"19\">Performing Arts</option>\n" + 
"					<option value=\"17\">Sport</option>\n" + 
"					<option value=\"6\">Still Life</option>\n" + 
"					<option value=\"21\">Street</option>\n" + 
"					<option value=\"26\">Transportation</option>\n" + 
"					<option value=\"13\">Travel</option>\n" + 
"					<option value=\"22\">Underwater</option>\n" + 
"					<option value=\"27\">Urban Exploration</option>\n" + 
"					<option value=\"25\">Wedding</option>\n" + 
"					<option value=\"0\" selected=\"selected\">Uncategorized</option>\n" + 
"				</select>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"clearfix nsfw_toggle inline \">\n" + 
"				<label for=\"nsfw{%=maxImageIndex%}\"><input type=\"checkbox\" name=\"nsfw\" id=\"nsfw{%=maxImageIndex%}\" value=\"1\" />  Safe for work?</label>\n" + 
"			</div>\n" + 
"\n" + 
"			<div class=\"inline input-prepend\">\n" + 
"				<span class=\"add-on\"><i class=\"icon-tag\"></i></span> <input type=\"text\" name=\"tags\" class=\"tags\" value=\"\" placeholder=\"Tags (divide by comma)\" />\n" + 
"			</div>\n" + 
"			<div class=\"inline input-prepend\">\n" + 
"				<span class=\"add-on\"><i class=\"icon-time\"></i></span> <input type=\"hidden\" name=\"taken_at\" id=\"taken_at{%=maxImageIndex%}\" value=\"\" /> <input type=\"text\"\n" + 
"					id=\"taken_at_display{%=maxImageIndex%}\" class=\"date\" value=\"\" placeholder=\"Date Taken\" />\n" + 
"			</div>\n" + 
"			<div class=\"inline input-prepend\">\n" + 
"				<span class=\"add-on\"><i class=\"icon-camera\"></i></span> <input type=\"text\" name=\"camera\" id=\"camera{%=maxImageIndex%}\" class=\"camera\" value=\"\" placeholder=\"Camera\" />\n" + 
"			</div>\n" + 
"			<div class=\"inline input-prepend\">\n" + 
"				<span class=\"add-on\"><i class=\"icon-envelope\"></i></span> <input type=\"text\" name=\"lens\" id=\"lens{%=maxImageIndex%}\" class=\"lens\" value=\"\" placeholder=\"Lens\" />\n" + 
"			</div>\n" + 
"			<div class=\"inline input-prepend\">\n" + 
"				<span class=\"add-on\"><i class=\"icon-envelope\"></i></span> <input type=\"text\" name=\"focus\" id=\"focus{%=maxImageIndex%}\" class=\"focal-length\" value=\"\"\n" + 
"					placeholder=\"Focal Length\" />\n" + 
"			</div>\n" + 
"			<div class=\"inline input-prepend\">\n" + 
"				<span class=\"add-on\"><i class=\"icon-envelope\"></i></span> <input type=\"text\" name=\"shutter\" id=\"shutter{%=maxImageIndex%}\" class=\"shutter-speed\" value=\"\"\n" + 
"					placeholder=\"Shutter Speed\" />\n" + 
"			</div>\n" + 
"			<div class=\"inline input-prepend\">\n" + 
"				<span class=\"add-on\"><i class=\"icon-eye-open\"></i></span> <input type=\"text\" name=\"aperture\" id=\"aperture{%=maxImageIndex%}\" class=\"aperture\" value=\"\"\n" + 
"					placeholder=\"Aperture\" />\n" + 
"			</div>\n" + 
"			<div class=\"inline input-prepend last\">\n" + 
"				<span class=\"add-on\"><i class=\"icon-envelope\"></i></span> <input type=\"text\" name=\"iso\" id=\"iso{%=maxImageIndex%}\" class=\"iso\" value=\"\" placeholder=\"ISO/Film\" />\n" + 
"			</div>\n" + 
"  	</div>\n" + 
"		</td>   \n" + 
"     </tr>\n" + 
"{%  } %}\n" + 
"</script>\n" + 
"	<!-- The template to display files available for download -->\n" + 
"\n" + 
"\n" + 
"	<script id=\"template-download1\" type=\"text/x-tmpl\">\n" + 
"{% for (var i=0, file; file=o.files[i]; i++) { %}\n" + 
"    <tr class=\"template-download fade\">\n" + 
"        {% if (file.error) { %}\n" + 
"            <td></td>\n" + 
"            <td class=\"name\"><span>{%=file.name%}</span></td>\n" + 
"            <td class=\"size\"><span>{%=o.formatFileSize(file.size)%}</span></td>\n" + 
"            <td class=\"error\" colspan=\"2\"><span class=\"label label-important\">{%=locale.fileupload.error%}</span> {%=locale.fileupload.errors[file.error] || file.error%}</td>\n" + 
"        {% } else { %}\n" + 
"            <td class=\"preview\">{% if (file.thumbnail_url) { %}\n" + 
"                <a href=\"{%=file.url%}\" title=\"{%=file.name%}\" rel=\"gallery\" download=\"{%=file.name%}\"><img src=\"{%=file.thumbnail_url%}\"></a>\n" + 
"            {% } %}</td>\n" + 
"            <td class=\"name\">\n" + 
"                <a href=\"{%=file.url%}\" title=\"{%=file.name%}\" rel=\"{%=file.thumbnail_url&&'gallery'%}\" download=\"{%=file.name%}\">{%=file.name%}</a>\n" + 
"            </td>\n" + 
"            <td class=\"size\"><span>{%=o.formatFileSize(file.size)%}</span></td>\n" + 
"            <td colspan=\"2\"></td>\n" + 
"        {% } %}\n" + 
"        <td class=\"delete\">\n" + 
"            <button class=\"btn btn-danger\" data-type=\"{%=file.delete_type%}\" data-url=\"{%=file.delete_url%}\">\n" + 
"                <i class=\"icon-trash icon-white\"></i>\n" + 
"                <span>{%=locale.fileupload.destroy%}</span>\n" + 
"            </button>\n" + 
"            <input type=\"checkbox\" name=\"delete\" value=\"1\">\n" + 
"        </td>\n" + 
"    </tr>\n" + 
"{% }  %}\n" + 
"</script>\n" + 
"\n" + 
"\n" + 
"</body>\n" + 
"</html>\n");// line 34, japidviews\Application\photo\Uploads.html
		
		endDoLayout(sourceTemplate);
	}

}