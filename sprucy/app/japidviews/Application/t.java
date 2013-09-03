package japidviews.Application;

import play.data.validation.Validation;
import play.mvc.Http.Request;
import play.mvc.Http.Response;
import play.mvc.Scope.Params;
import play.mvc.Scope.RenderArgs;
import play.mvc.Scope.Session;
//
// NOTE: This file was generated from: japidviews/Application/t.html
// Change to this file will be lost next time the template file is compiled.
//

public class t extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/t.html";
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

	public t() {
		super(null);
	}

	public t(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/};
	public static final String[] argTypes = new String[] {/* arg types of the template*/};
	public static final Object[] argDefaults = new Object[] {};
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.t.class);

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
		p("<!DOCTYPE html>\n"
				+
				"<html>\n"
				+
				"<head>\n"
				+
				"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\n"
				+
				"<title>����ͼƬԤ�����루֧�� IE6��IE7��</title>\n"
				+
				"<style type=\"text/css\">\n"
				+
				"#newPreview {\n"
				+
				"	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale);\n"
				+
				"}\n"
				+
				"</style>\n"
				+
				"<script type=\"text/javascript\" language=\"javascript\">\n"
				+
				"<!--\n"
				+
				"function PreviewImg(imgFile)\n"
				+
				"{\n"
				+
				" \n"
				+
				"//�µ�Ԥ�����룬֧�� IE6��IE7��\n"
				+
				"var newPreview = document.getElementById(\"newPreview\");\n"
				+
				"newPreview.filters.item(\"DXImageTransform.Microsoft.AlphaImageLoader\").src = imgFile.value;\n"
				+
				"newPreview.style.width = \"400px\";\n"
				+
				"newPreview.style.height = \"300px\";\n"
				+
				"}\n"
				+
				"-->\n"
				+
				"</script>\n"
				+
				"</head>\n"
				+
				"<body>\n"
				+
				"	<p>˵����������Ե��ǻ����������������ڱ��������ԣ���������ĵ�ַ�ǣ�http://127.0.0.1/...������Կ���ȫ��Ԥ����</p>\n"
				+
				"	<hr />\n"
				+
				"	<p>�����ʹ�õ��� IE6������Կ�������Ԥ���������ʹ�õ��� IE7���򿴲�������Ԥ����</p>\n"
				+
				"	<div id=\"oldPreview\"></div>\n"
				+
				"	<hr />\n"
				+
				"	<p>������ʹ�õ��� IE6 ���� IE7������Կ�������Ԥ����</p>\n"
				+
				"	<div id=\"newPreview\"></div>\n"
				+
				"	<hr />\n"
				+
				"	<p>\n"
				+
				"		��ѡ��һ��ͼƬ����Ԥ����<input type=\"file\" size=\"20\" onchange=\"javascript:PreviewImg(this);\" />\n"
				+
				"	</p>\n" +
				"</body>\n" +
				"</html>\n" +
				"\n");// line 1

		endDoLayout(sourceTemplate);
	}

}
