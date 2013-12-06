//version: 0.9.37
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
// NOTE: This file was generated from: japidviews/Application/photo/Upload1.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Upload1 extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Upload1.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
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


	public Upload1() {
	super((StringBuilder)null);
	initHeaders();
	}
	public Upload1(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public Upload1(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Upload1.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/Application/photo/Upload1.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Upload1().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, japidviews\Application\photo\Upload1.html
 // line 1, japidviews\Application\photo\Upload1.html
		p("<form action=\"/upload/done\" id=\"upload_done\" method=\"POST\"\n" + 
"	class=\"photos_placeholder\" enctype=\"multipart/form-data\">\n" + 
"\n" + 
"\n" + 
"	<div class=\"subheader clearfix\">\n" + 
"		<h2>Upload</h2>\n" + 
"		<div class=\"right\">\n" + 
"			<span id=\"photo_remaining_count\">9</span> of 10 uploads remaining\n" + 
"			this week. <a href=\"#\" id=\"upgrade_link\">Upgrade</a> to have\n" + 
"			unlimited uploads.\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div class=\"progress\">1</div>\n" + 
"	<input name=\"files\" id=\"files\" accept=\"image/jpeg\"\n" + 
"		class=\"vis-hidden pos-ab\" multiple=\"multiple\" type=\"file\">\n" + 
"\n" + 
"	<div id=\"dropbox\">\n" + 
"		<span id=\"drop_message\">Drag photos from your computer here or\n" + 
"			<a id=\"browse_button\">browse</a> for photos to upload. Maximum 10\n" + 
"			photos at a time.\n" + 
"		</span> <span id=\"drop_message_hover\" style=\"display: none;\">Drop\n" + 
"			photos to upload</span>\n" + 
"	</div>\n" + 
"\n" + 
"	<div id=\"files\" class=\"clearfix\"></div>\n" + 
"\n" + 
"	<div class=\"linetop clearfix\" id=\"save-edit-buttons\">\n" + 
"		<div class=\"right clearfix\">\n" + 
"			<div id=\"upload_message\">Uploading photo...</div>\n" + 
"			<input value=\"Upload\" id=\"upload\" class=\"button green disabled right\"\n" + 
"				type=\"submit\">\n" + 
"		</div>\n" + 
"	</div>\n" + 
"\n" + 
"</form>\n");// line 110, japidviews\Application\photo\Upload1.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy Home Page");;
	}
	@Override protected void css() {
		// line 1, japidviews\Application\photo\Upload1.html
		p("<style type=\"text/css\">\n" + 
"<!--\n" + 
"#dropbox {\n" + 
"	height: 200px;\n" + 
"}\n" + 
"-->\n" + 
"</style>\n" + 
"<script src=\"");// line 1, japidviews\Application\photo\Upload1.html
		p(lookupStatic("/public/js/jquery.filedrop.js"));// line 9, japidviews\Application\photo\Upload1.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script type=\"text/javascript\">\n" + 
"<!--\n" + 
"	$(function() {\n" + 
"		var dropbox = $('#dropbox'), message = $('.message', dropbox);\n" + 
"\n" + 
"		dropbox\n" + 
"				.filedrop({\n" + 
"					fallback_id : 'files',\n" + 
"					paramname : 'pic',\n" + 
"\n" + 
"					maxfiles : 1,\n" + 
"					maxfilesize : 1,\n" + 
"					url : '/upload/done',\n" + 
"\n" + 
"					uploadFinished : function(i, file, response) {\n" + 
"						$.data(file).addClass('done');\n" + 
"						// response is the JSON object that post_file.php returns\n" + 
"					},\n" + 
"\n" + 
"					error : function(err, file) {\n" + 
"						switch (err) {\n" + 
"						case 'BrowserNotSupported':\n" + 
"							showMessage('Your browser does not support HTML5 file uploads!');\n" + 
"							break;\n" + 
"						case 'TooManyFiles':\n" + 
"							alert('Too many files! Please select 5 at most! (configurable)');\n" + 
"							break;\n" + 
"						case 'FileTooLarge':\n" + 
"							alert(file.name\n" + 
"									+ ' is too large! Please upload files up to 2mb (configurable).');\n" + 
"							break;\n" + 
"						default:\n" + 
"							break;\n" + 
"						}\n" + 
"					},\n" + 
"\n" + 
"					// Called before each upload is started\n" + 
"					beforeEach : function(file) {\n" + 
"						if (!file.type.match(/^image\\//)) {\n" + 
"							alert('Only images are allowed!');\n" + 
"\n" + 
"							// Returning false will cause the\n" + 
"							// file to be rejected\n" + 
"							return false;\n" + 
"						}\n" + 
"					},\n" + 
"\n" + 
"					uploadStarted : function(i, file, len) {\n" + 
"						createImage(file);\n" + 
"					},\n" + 
"\n" + 
"					progressUpdated : function(i, file, progress) {\n" + 
"						$.data(file).find('.progress').width(progress);\n" + 
"					}\n" + 
"\n" + 
"				});\n" + 
"\n" + 
"		var template = '<div class=\"preview\">' + '<span class=\"imageHolder\">'\n" + 
"				+ '<img />' + '<span class=\"uploaded\"></span>' + '</span>'\n" + 
"				+ '<div class=\"progressHolder\">'\n" + 
"				+ '<div class=\"progress\"></div>' + '</div>' + '</div>';\n" + 
"\n" + 
"		function createImage(file) {\n" + 
"\n" + 
"			var preview = $(template), image = $('img', preview);\n" + 
"\n" + 
"			var reader = new FileReader();\n" + 
"\n" + 
"			image.width = 100;\n" + 
"			image.height = 100;\n" + 
"\n" + 
"			reader.onload = function(e) {\n" + 
"\n" + 
"				// e.target.result holds the DataURL which\n" + 
"				// can be used as a source of the image:\n" + 
"\n" + 
"				image.attr('src', e.target.result);\n" + 
"			};\n" + 
"\n" + 
"			// Reading the file as a DataURL. When finished,\n" + 
"			// this will trigger the onload function above:\n" + 
"			reader.readAsDataURL(file);\n" + 
"\n" + 
"			message.hide();\n" + 
"			preview.appendTo(dropbox);\n" + 
"\n" + 
"			// Associating a preview container\n" + 
"			// with the file, using jQuery's $.data():\n" + 
"\n" + 
"			$.data(file, preview);\n" + 
"		}\n" + 
"\n" + 
"		function showMessage(msg) {\n" + 
"			message.html(msg);\n" + 
"		}\n" + 
"\n" + 
"	});\n" + 
"//-->\n" + 
"</script>\n" + 
"\n");// line 9, japidviews\Application\photo\Upload1.html
		;
	}
}