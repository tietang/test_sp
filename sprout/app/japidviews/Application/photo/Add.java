package japidviews.Application.photo;

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
// NOTE: This file was generated from: japidviews/Application/photo/Add.html
// Change to this file will be lost next time the template file is compiled.
//

public class Add extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Add.html";
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

	public Add() {
		super(null);
	}

	public Add(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/};
	public static final String[] argTypes = new String[] {/* arg types of the template*/};
	public static final Object[] argDefaults = new Object[] {};
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Add.class);

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
				"<div class=\"grid_row\">\n" +
				"\n" +
				"	<div class=\"col photo_col width_4\">\n" +
				"		<a href=\"/upload\"  >\n" +
				"		<div class=\"photo_preview photo_preview_4 \">\n" +
				"			");// line 3
		;
		p(getMessage("add.upload"));// line 10
		p("		</div></a>\n" +
				"	</div>\n" +
				"	<div class=\"col photo_col width_4\">\n" +
				"		<a href=\"/story\"  >\n" +
				"		<div class=\"photo_preview photo_preview_4 \">\n" +
				"			");// line 10
		;
		p(getMessage("add.story"));// line 16
		p("		</div> </a>\n" +
				"	</div>\n" +
				"	<div class=\"col photo_col width_4\">\n" +
				"		<a href=\"/blink\"   >\n" +
				"		<div class=\"photo_preview photo_preview_4 \">\n" +
				"			");// line 16
		;
		p(getMessage("add.blink"));// line 22
		p("		</div> </a>\n" +
				"	</div>\n" +
				"	<div class=\"col photo_col width_4\">\n" +
				"		<a href=\"/photo/manage\"  >\n" +
				"		<div class=\"photo_preview photo_preview_4 \">\n" +
				"			");// line 22
		;
		p(getMessage("add.manage"));// line 28
		p("		</div> </a>\n" +
				"	</div>\n" +
				"</div>\n");// line 28

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy Home Page");
		;
	}

	@Override
	protected void header() {
		p("Index");
		;
	}
}
