package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
import java.util.*;import fengfei.ucm.entity.photo.*;
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
// NOTE: This file was generated from: japidviews/Application/photo/Upload.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Upload extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Upload.html";
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


	public Upload() {
		super(null);
	}
	public Upload(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"photoSets",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Upload.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<PhotoSet> photoSets; // line 5, japidviews/Application/photo/Upload.html
	public cn.bran.japid.template.RenderResult render(List<PhotoSet> photoSets) {
		this.photoSets = photoSets;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 5, japidviews/Application/photo/Upload.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(List<PhotoSet> photoSets) {
		return new Upload().render(photoSets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\Upload.html

p("\n" + 
"</pre>\n");// line 5, japidviews\Application\photo\Upload.html
		// line 7, japidviews\Application\photo\Upload.html
final AddNav _AddNav2 = new AddNav(getOut()); _AddNav2.setActionRunners(getActionRunners()).setOut(getOut()); _AddNav2.render("upload"); // line 45, japidviews\Application\photo\Upload.html// line 45, japidviews\Application\photo\Upload.html
		p("\n" + 
"<form id=\"photoUploadForm\" action=\"/upload/done\" method=\"post\" enctype=\"multipart/form-data\">\n" + 
"    <div class=\"grid_row upload \">\n" + 
"        <div class=\"col col_16\">\n" + 
"\n" + 
"            <div>\n" + 
"                <div id=\"dropzone\" class=\"fade  \">\n" + 
"                    <h5> ");// line 45, japidviews\Application\photo\Upload.html
		;p(getMessage("upload.drag"));// line 52, japidviews\Application\photo\Upload.html
		p(" </h5>\n" + 
"                    <h5>");// line 52, japidviews\Application\photo\Upload.html
		;p(getMessage("upload.add.before"));// line 53, japidviews\Application\photo\Upload.html
		p("<span class=\"btn btn-success fileinput-button\"> <i\n" + 
"                            class=\"icon-plus icon-white\"></i> <span>");// line 53, japidviews\Application\photo\Upload.html
		;p(getMessage("upload.add.button"));// line 54, japidviews\Application\photo\Upload.html
		p("</span>\n" + 
"						<input id=\"fileupload\" type=\"file\" name=\"files\">\n" + 
"					</span> ");// line 54, japidviews\Application\photo\Upload.html
		;p(getMessage("upload.add.after"));// line 56, japidviews\Application\photo\Upload.html
		p("</h5>\n" + 
"\n" + 
"                </div>\n" + 
"                <input id=\"exifAll\" name=\"exifs\" type=\"hidden\"/>\n" + 
"\n" + 
"                <table class=\"table table-striped  exif_table img_shadow exif\" id=\"content\" style=\"display:none ; \">\n" + 
"                    <thead>\n" + 
"                    <tr>\n" + 
"                        <td colspan=\"3\">\n" + 
"                            <div id=\"progress\" class=\"progress_per progress progress-success progress-striped\">\n" + 
"                                <div class=\"bar\"></div>\n" + 
"                            </div>\n" + 
"                        </td>\n" + 
"                    </tr>\n" + 
"                    </thead>\n" + 
"                    <tbody>\n" + 
"                    ");// line 56, japidviews\Application\photo\Upload.html
		final UploadForm _UploadForm3 = new UploadForm(getOut()); _UploadForm3.setActionRunners(getActionRunners()).setOut(getOut()); _UploadForm3.render(null,photoSets); // line 72, japidviews\Application\photo\Upload.html// line 72, japidviews\Application\photo\Upload.html
		p("\n" + 
"\n" + 
"                    <tr>\n" + 
"                        <td>");// line 72, japidviews\Application\photo\Upload.html
		;p(getMessage("photo.note"));// line 75, japidviews\Application\photo\Upload.html
		p("</td>\n" + 
"                        <td >\n" + 
"                            <div class=\"checkbox \">\n" + 
"                                <label for=\"status1\">\n" + 
"                                    ");// line 75, japidviews\Application\photo\Upload.html
		;p(getMessage("photo.status"));// line 79, japidviews\Application\photo\Upload.html
		p("\n" + 
"                                    <input type=\"checkbox\" name=\"status\" id=\"status1\"   checked value=\"1\"/>\n" + 
"                                </label>\n" + 
"                            </div>\n" + 
"                        </td>\n" + 
"                        <td><span class=\"start\" id=\"start\"> </span>\n" + 
"                            <button class=\"btn btn-info\" type=\"button\" id=\"close\">\n" + 
"                                ");// line 79, japidviews\Application\photo\Upload.html
		;p(getMessage("close"));// line 86, japidviews\Application\photo\Upload.html
		p("\n" + 
"                            </button>\n" + 
"                        </td>\n" + 
"                    </tr>\n" + 
"                    </tbody>\n" + 
"                </table>\n" + 
"                <div class=\"block\">\n" + 
"                    ");// line 86, japidviews\Application\photo\Upload.html
		Map map=new HashMap();map.put("catefory",fengfei.spruce.cache.SimpleCache.categories);// line 93, japidviews\Application\photo\Upload.html

                    final CategorySelector _CategorySelector4 = new CategorySelector(getOut()); _CategorySelector4.setActionRunners(getActionRunners()).setOut(getOut()); _CategorySelector4.render(map,(byte) 0); // line 94, japidviews\Application\photo\Upload.html// line 94, japidviews\Application\photo\Upload.html
		p("\n" + 
"                </div>\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"\n" + 
"</form>\n");// line 94, japidviews\Application\photo\Upload.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy Upload Page");;
	}
	@Override protected void css() {
		// line 7, japidviews\Application\photo\Upload.html
		p("<style type=\"text/css\"></style>\n" + 
"<!-- Bootstrap CSS fixes for IE6 -->\n" + 
"<!--[if lt IE 7]>\n" + 
"<link rel=\"stylesheet\" href=\"http://blueimp.github.com/cdn/css/bootstrap-ie6.min.css\">\n" + 
"<![endif]-->\n" + 
"<!-- CSS to style the file input field as button and adjust the Bootstrap progress bars -->\n" + 
"<link rel=\"stylesheet\" href=\"");// line 7, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/css/jquery.fileupload.css"));// line 14, japidviews\Application\photo\Upload.html
		p("\">\n" + 
"<!-- The jQuery UI widget factory, can be omitted if jQuery UI is already included -->\n" + 
"<script src=\"");// line 14, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/js/vendor/jquery.ui.widget.js"));// line 16, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<!-- The Load Image plugin is included for the preview images and image resizing functionality -->\n" + 
"<script src=\"");// line 16, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/load-image.min.js"));// line 18, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<!-- The Canvas to Blob plugin is included for image resizing functionality -->\n" + 
"<script src=\"");// line 18, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/canvas-to-blob.min.js"));// line 20, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<!-- The Iframe Transport is required for browsers without support for XHR file uploads -->\n" + 
"<script src=\"");// line 20, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/js/jquery.iframe-transport.js"));// line 22, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<!-- The basic File Upload plugin -->\n" + 
"<script src=\"");// line 22, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/js/jquery.fileupload.js"));// line 24, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<!-- The File Upload processing plugin -->\n" + 
"<script src=\"");// line 24, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/js/jquery.fileupload-process.js"));// line 26, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<!-- The File Upload image resize plugin -->\n" + 
"<script src=\"");// line 26, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/js/jquery.fileupload-image.js"));// line 28, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<!-- The File Upload validation plugin -->\n" + 
"<script src=\"");// line 28, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/blueimp/js/jquery.fileupload-validate.js"));// line 30, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<script src=\"");// line 30, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/js/json/json2.js"));// line 31, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<script src=\"");// line 31, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/bootstrap/bootstrap-tag.js"));// line 32, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<link type=\"text/css\" href=\"");// line 32, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/bootstrap/bootstrap-tag.css"));// line 33, japidviews\Application\photo\Upload.html
		p("\" rel=\"stylesheet\"/>\n" + 
"<script type=\"text/javascript\"\n" + 
"        src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDqPLY_onh61yMSw5KSVICJN-B5igbHCTs&sensor=false&language=zh-cn\"></script>\n" + 
"<script src=\"");// line 33, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/js/gmap/gmap-context-menu.js"));// line 36, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<link type=\"text/css\" href=\"");// line 36, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/js/gmap/gmap-context-menu.css"));// line 37, japidviews\Application\photo\Upload.html
		p("\" rel=\"stylesheet\"/>\n" + 
"<script src=\"");// line 37, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/app/map.js"));// line 38, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<script src=\"");// line 38, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/js/binaryajax.js"));// line 39, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<script src=\"");// line 39, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/js/exif_ff.js"));// line 40, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<script src=\"");// line 40, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/app/ExifUtils.js"));// line 41, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"<script src=\"");// line 41, japidviews\Application\photo\Upload.html
		p(lookupStatic("/public/app/upload.js"));// line 42, japidviews\Application\photo\Upload.html
		p("\"></script>\n" + 
"\n");// line 42, japidviews\Application\photo\Upload.html
		;
	}
}