package japidviews.Application;

import static cn.bran.play.JapidPlayAdapter.lookupStatic;
import play.data.validation.Validation;
import play.mvc.Http.Request;
import play.mvc.Http.Response;
import play.mvc.Scope.Params;
import play.mvc.Scope.RenderArgs;
import play.mvc.Scope.Session;
//
// NOTE: This file was generated from: japidviews/Application/s.html
// Change to this file will be lost next time the template file is compiled.
//

public class s extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/s.html";
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

	public s() {
		super(null);
	}

	public s(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/};
	public static final String[] argTypes = new String[] {/* arg types of the template*/};
	public static final Object[] argDefaults = new Object[] {};
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.s.class);

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
		p("<!DOCTYPE html>\n" +
				"<html>\n" +
				"<head>\n" +
				"<meta charset=\"UTF-8\">\n" +
				"<title>Insert title here</title>\n" +
				"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 1
		p(lookupStatic("/public/css/jquery.fileupload-ui.css"));// line 6
		p("\">\n" +
				"<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 6
		p(lookupStatic("/public/agile-uploader/agile-uploader.css"));// line 7
		p("\">\n"
				+
				"<!-- Shim to make HTML5 elements usable in older Internet Explorer versions -->\n"
				+
				"<!--[if lt IE 9]><script src=\"");// line 7
		p(lookupStatic("/public/javascripts/html5shiv.js"));// line 9
		p("\"></script><![endif]-->\n" +
				"<script src=\"");// line 9
		p(lookupStatic("/public/javascripts/jquery-1.7.2.js"));// line 10
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 10
		p(lookupStatic("/public/agile-uploader/jquery.flash.min.js"));// line 11
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 11
		p(lookupStatic("/public/agile-uploader/agile-uploader-3.0.js"));// line 12
		p("\" type=\"text/javascript\"></script>\n"
				+
				"</head>\n"
				+
				"<body>\n"
				+
				"	<form id=\"multipleDemo\" enctype=\"multipart/form-data\">\n"
				+
				"		<label for=\"title\">Title</label><br /> <input id=\"title\" type=\"input\" name=\"title\" /> <br style=\"clear: left;\" />\n"
				+
				"\n"
				+
				"		<div id=\"multiple\"></div>\n"
				+
				"\n"
				+
				"		<br style=\"clear: left;\" /> <br /> <label for=\"testdata\">Another field</label><br /> <input id=\"testdata\" type=\"input\" name=\"testdata\" /> <br />\n"
				+
				"\n"
				+
				"	</form>\n"
				+
				"\n"
				+
				"	<a href=\"#\" onClick=\"document.getElementById('agileUploaderSWF').submit();\">Submit</a>\n"
				+
				"\n" +
				"\n" +
				"	<script type=\"text/javascript\">\n" +
				"		$('#multiple').agileUploader({\n" +
				"			flashSrc : \"");// line 12
		p(lookupStatic("/public/agile-uploader/agile-uploader.swf"));// line 29
		p("\",\n" +
				"			submitRedirect : '/s',\n" +
				"			formId : 'multipleDemo',\n" +
				"			flashVars : {\n" +
				"				firebug : false,\n" +
				"				form_action : '/upload/done',\n" +
				"				file_limit : 3,\n" +
				"				max_post_size : (400 * 300)\n" +
				"			}\n" +
				"		});\n" +
				"	</script>\n" +
				"</body>\n" +
				"</html>\n");// line 29

		endDoLayout(sourceTemplate);
	}

}
