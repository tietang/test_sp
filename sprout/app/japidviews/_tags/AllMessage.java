package japidviews._tags;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.*;
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
// NOTE: This file was generated from: japidviews/_tags/AllMessage.html
// Change to this file will be lost next time the template file is compiled.
//

public class AllMessage extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/AllMessage.html";
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

	public AllMessage() {
		super(null);
	}

	public AllMessage(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/};
	public static final String[] argTypes = new String[] {/* arg types of the template*/};
	public static final Object[] argDefaults = new Object[] {};
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.AllMessage.class);

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
		p("\n" +
				"\n");// line 1
		if (asBoolean(asBoolean(flash.get("error")))) {// line 4
			p("\n"
					+
					"<div class=\"alert alert-error\">\n"
					+
					"    <button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n"
					+
					"        &times;\n" +
					"    </button>\n" +
					"    ");// line 4
			p(flash.get("error"));// line 10
			p("</div>\n" +
					"\n");// line 10
		}// line 13

		if (asBoolean(asBoolean(flash.get("success")))) {// line 15
			p("\n"
					+
					"<div class=\"alert alert-success\">\n"
					+
					"    <button type=\"button\" class=\"close\" data-dismiss=\"success\">\n"
					+
					"        &times;\n" +
					"    </button>\n" +
					"    ");// line 15
			p(flash.get("success"));// line 21
			p("</div>\n" +
					"\n");// line 21
		}// line 24

		endDoLayout(sourceTemplate);
	}

}
