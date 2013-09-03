package japidviews._javatags;

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
// NOTE: This file was generated from: japidviews/_javatags/Pic.html
// Change to this file will be lost next time the template file is compiled.
//

public class Pic extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_javatags/Pic.html";
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

	public Pic() {
		super(null);
	}

	public Pic(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"path", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._javatags.Pic.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	{
		setHasDoBody();
	}
	private String path; // line 1

	public cn.bran.japid.template.RenderResult render(DoBody body,
			cn.bran.japid.compiler.NamedArgRuntime... named) {
		Object[] args = buildArgs(named, body);
		try {
			return runRenderer(args);
		} catch (RuntimeException e) {
			handleException(e);
			throw e;
		} // line 1
	}

	private DoBody body;

	public static interface DoBody {
		void render();

		void setBuffer(StringBuilder sb);

		void resetBuffer();
	}

	String renderBody() {
		StringBuilder sb = new StringBuilder();
		if (body != null) {
			body.setBuffer(sb);
			body.render();
			body.resetBuffer();
		}
		return sb.toString();
	}

	public cn.bran.japid.template.RenderResult render(String path, DoBody body) {
		this.body = body;
		this.path = path;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	public cn.bran.japid.template.RenderResult render(String path) {
		this.path = path;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("\n" +
				"<img alt=\"\" src=\"");// line 1
		p(path);// line 4
		p("\">\n");// line 4
		if (body != null) {
			body.setBuffer(getOut());
			body.render();
			body.resetBuffer();
		}// line 5

		endDoLayout(sourceTemplate);
	}

}
