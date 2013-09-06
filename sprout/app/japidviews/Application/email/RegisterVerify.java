package japidviews.Application.email;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static japidviews._javatags.Pic.*;
import japidviews._layouts.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/email/RegisterVerify.html
// Change to this file will be lost next time the template file is compiled.
//

public class RegisterVerify extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/email/RegisterVerify.html";
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

	public RegisterVerify() {
		super(null);
	}

	public RegisterVerify(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"name", "content", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"String", "String", };
	public static final Object[] argDefaults = new Object[] { null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.email.RegisterVerify.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private String name; // line 3
	private String content; // line 3

	public cn.bran.japid.template.RenderResult render(String name,
			String content) {
		this.name = name;
		this.content = content;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 3
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<!DOCTYPE html>\n");// line 1
		p("<html>\n" +
				"	<head>\n" +
				"		<meta charset=\"UTF-8\">\n" +
				"		<title>Register Verify</title>\n" +
				"	</head>\n" +
				"\n" +
				"	<body>\n" +
				"\n" +
				"		<h1></h1>\n" +
				"		<p>");// line 3
		try {
			p(content);
		} catch (NullPointerException npe) {
		}// line 13
		p("</p>\n" +
				"		<div></div>\n" +
				"	</body>\n" +
				"</html>\n");// line 13

		endDoLayout(sourceTemplate);
	}

}
