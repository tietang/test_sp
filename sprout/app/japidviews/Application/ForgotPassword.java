package japidviews.Application;

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
// NOTE: This file was generated from: japidviews/Application/ForgotPassword.html
// Change to this file will be lost next time the template file is compiled.
//

public class ForgotPassword extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/ForgotPassword.html";
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

	public ForgotPassword() {
		super(null);
	}

	public ForgotPassword(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/};
	public static final String[] argTypes = new String[] {/* arg types of the template*/};
	public static final Object[] argDefaults = new Object[] {};
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.ForgotPassword.class);

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
		p("<div class=\"grid_row\">\n"
				+
				"	<div class=\"col col_16\">\n"
				+
				"		<div class=\"alert\">\n"
				+
				"			<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n"
				+
				"				×\n" +
				"			</button>\n" +
				"			<strong>Warning!</strong> 5forgot password\n" +
				"		</div>\n" +
				"\n" +
				"	</div>\n" +
				"</div>\n" +
				"\n");// line 2

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("forgot password");
		;
	}

	@Override
	protected void header() {
		p("forgot password");
		;
	}
}
