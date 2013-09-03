package japidviews.Application;

import static cn.bran.play.JapidPlayAdapter.lookupStatic;
import play.data.validation.Validation;
import play.mvc.Http.Request;
import play.mvc.Http.Response;
import play.mvc.Scope.Params;
import play.mvc.Scope.RenderArgs;
import play.mvc.Scope.Session;
//
// NOTE: This file was generated from: japidviews/Application/SwfUpload.html
// Change to this file will be lost next time the template file is compiled.
//

public class SwfUpload extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/SwfUpload.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

	// - add implicit fields with Play

	final Request request = Request.current();
	final Response response = Response.current();
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(
			validation);
	final play.Play _play = new play.Play();

	// - end of implicit fields with Play 

	public SwfUpload() {
		super(null);
	}

	public SwfUpload(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/};
	public static final String[] argTypes = new String[] {/* arg types of the template*/};
	public static final Object[] argDefaults = new Object[] {};
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.SwfUpload.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}

	////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		}
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<!DOCTYPE HTML>\n"
				+
				"<html>\n"
				+
				"<head>\n"
				+
				"<!-- Force latest IE rendering engine or ChromeFrame if installed -->\n"
				+
				"<!--[if IE]><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"><![endif]-->\n"
				+
				"<meta charset=\"utf-8\">\n" +
				"<title>Images Upload</title>\n" +
				"\n" +
				"\n" +
				"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 1
		p(lookupStatic("/public/css/jquery.fileupload-ui.css"));// line 10
		p("\">\n" +
				"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 10
		p(lookupStatic("/public/twitter/bootstrap/cdn/css/bootstrap.min.css"));// line 11
		p("\">\n"
				+
				"<!-- Shim to make HTML5 elements usable in older Internet Explorer versions -->\n"
				+
				"<!--[if lt IE 9]><script src=\"");// line 11
		p(lookupStatic("/public/javascripts/html5shiv.js"));// line 13
		p("\"></script><![endif]-->\n" +
				"<script src=\"");// line 13
		p(lookupStatic("/public/javascripts/jquery-1.7.2.js"));// line 14
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 14
		p(lookupStatic("/public/javascripts/jquery-ui-1.8.22.custom.min.js"));// line 15
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 15
		p(lookupStatic("/public/swfupload/swfupload.js"));// line 16
		p("\" type=\"text/javascript\"></script>\n" +
				"\n" +
				"<script src=\"");// line 16
		p(lookupStatic("/public/app/swfupload_handlers.js"));// line 18
		p("\" type=\"text/javascript\"></script>\n"
				+
				"<script type=\"text/javascript\">\n"
				+
				"var swfu;\n"
				+
				"$(function() {\n"
				+
				"	swfu = new SWFUpload(\n"
				+
				"			{\n"
				+
				"				// Backend Settings\n"
				+
				"				upload_url : \"/upload/doit\",\n"
				+
				"				// post_params: {\"PHPSESSID\": \"lic590inmct6htfknhum0cham2\"},\n"
				+
				"\n"
				+
				"				// File Upload Settings\n"
				+
				"				file_size_limit : \"50 MB\",\n"
				+
				"				file_types : \"*.jpg;*.png\",\n"
				+
				"				file_types_description : \"JPG Images; PNG Image\",\n"
				+
				"				file_upload_limit : 0,\n"
				+
				"\n"
				+
				"				// Event Handler Settings - these functions as defined in\n"
				+
				"				// Handlers.js\n"
				+
				"				// The handlers are not part of SWFUpload but are part of my\n"
				+
				"				// website and control how\n" +
				"				// my website reacts to the SWFUpload events.\n" +
				"				swfupload_preload_handler : preLoad,\n" +
				"				swfupload_load_failed_handler : loadFailed,\n" +
				"				file_queue_error_handler : fileQueueError,\n" +
				"				file_dialog_complete_handler : fileDialogComplete,\n" +
				"				upload_progress_handler : uploadProgress,\n" +
				"				upload_error_handler : uploadError,\n" +
				"				upload_success_handler : uploadSuccess,\n" +
				"				upload_complete_handler : uploadComplete,\n" +
				"\n" +
				"				// Button Settings\n" +
				"				button_image_url : \"");// line 18
		p(lookupStatic("/public/swfupload/btn_104x30.png"));// line 49
		p("\",\n"
				+
				"				button_placeholder_id : \"spanButtonPlaceholder\",\n"
				+
				"				button_width : 104,\n"
				+
				"				button_height : 30,\n"
				+
				"			//	button_text : '<span>Add files...</span>',\n"
				+
				"			//	button_text_style : '',\n"
				+
				"			//	button_text_top_padding : 0,\n"
				+
				"			//	button_text_left_padding : 18,\n"
				+
				"				//button_window_mode : SWFUpload.WINDOW_MODE.TRANSPARENT,\n"
				+
				"				button_cursor : SWFUpload.CURSOR.HAND,\n" +
				"\n" +
				"				// Flash Settings\n" +
				"				flash_url : \"");// line 49
		p(lookupStatic("/public/swfupload/swfupload.swf"));// line 61
		p("\",\n" +
				"				flash9_url : \"");// line 61
		p(lookupStatic("/public/swfupload/swfupload_fp9.swf"));// line 62
		p("\",\n" +
				"\n" +
				"				custom_settings : {\n" +
				"					upload_target : \"divFileProgressContainer\",\n" +
				"					thumbnail_height : 1280,\n" +
				"					thumbnail_width : 1280,\n" +
				"					thumbnail_quality : 80\n" +
				"				},\n" +
				"\n" +
				"				// Debug Settings\n" +
				"				debug : true\n" +
				"			});\n" +
				"});</script>\n" +
				"<style type=\"text/css\">\n" +
				"html,body {\n" +
				"	background-color: #CCC;\n" +
				"}\n" +
				"\n" +
				".ui-progressingbar  {\n" +
				"	height: 18px;\n" +
				" 	background-image: url( ");// line 62
		p(lookupStatic("/public/img/progressbar.gif"));// line 82
		p(");\n"
				+
				"}\n"
				+
				".ui-progressedbar  {\n"
				+
				"width:100%;\n"
				+
				" 	background: green;\n"
				+
				"}\n"
				+
				"\n"
				+
				"table {\n"
				+
				"	max-width: 100%;\n"
				+
				"	background-color: transparent;\n"
				+
				"	border-collapse: collapse;\n"
				+
				"	border-spacing: 0;\n"
				+
				"	background-color: #f9f9f9;\n"
				+
				"	width: 100%;\n"
				+
				"	margin-bottom: 18px;\n"
				+
				"}\n"
				+
				"\n"
				+
				"table th,table td {\n"
				+
				"	padding: 8px;\n"
				+
				"	line-height: 18px;\n"
				+
				"	text-align: left;\n"
				+
				"	vertical-align: top;\n"
				+
				"	border-top: 1px solid #dddddd;\n"
				+
				"}\n"
				+
				"\n"
				+
				"table th {\n"
				+
				"	font-weight: bold;\n"
				+
				"}\n"
				+
				"\n"
				+
				"table thead th {\n"
				+
				"	vertical-align: bottom;\n"
				+
				"}\n"
				+
				" \n"
				+
				"\n"
				+
				".localPreview {\n"
				+
				"	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale\n"
				+
				"		);\n"
				+
				"}\n"
				+
				"</style>\n"
				+
				"</head>\n"
				+
				"<body>\n"
				+
				" \n"
				+
				"	<div class=\"container\">	<div id=\"progress\">\n"
				+
				"		<div class=\"ui-progressingbar\" style=\"width: 0%;\"></div>\n"
				+
				"	</div>		<span id=\"percentage\"></span> <br />\n"
				+
				"		<div class=\"page-header\">\n"
				+
				"			<h1>Images Upload</h1>\n"
				+
				"		</div>\n"
				+
				"\n"
				+
				"		<form id=\"form1\" action=\"/upload/doit\" method=\"post\" enctype=\"multipart/form-data\">\n"
				+
				"			\n"
				+
				"	 \n"
				+
				"		<span id=\"spanButtonPlaceholder\"> </span>\n"
				+
				"		 \n"
				+
				"	</form>\n"
				+
				"\n"
				+
				"	<div id=\"divFileProgressContainer\" style=\"height: 75px;\"></div>\n"
				+
				"	<div id=\"thumbnails\"></div>\n" +
				"	</div>\n" +
				"\n" +
				"</body>\n" +
				"</html>\n");// line 82

		endDoLayout(sourceTemplate);
	}

}
