package japidviews.Application.error;

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
// NOTE: This file was generated from: japidviews/Application/error/E500.html
// Change to this file will be lost next time the template file is compiled.
//

public class E500 extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/error/E500.html";
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

	public E500() {
		super(null);
	}

	public E500(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/};
	public static final String[] argTypes = new String[] {/* arg types of the template*/};
	public static final Object[] argDefaults = new Object[] {};
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.error.E500.class);

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
		p("<div class=\"grid_row\">\n" +
				"	<div class=\"col col_4\">\n" +
				"\n" +
				"		&nbsp;\n" +
				"	</div>\n" +
				"	<div class=\"col col_8\">\n" +
				"\n" +
				"		<div class=\"rounded4 img_shadow not_found \">\n" +
				"			<div  class=\"logo\">\n" +
				"				Spruce\n" +
				"			</div>\n" +
				"			<div  class=\"text\">\n" +
				"				页面不存在！\n" +
				"			</div>\n" +
				"			<p>\n" +
				"				建议访问下面的精彩内容：\n" +
				"			</p>\n" +
				"			<div class=\"bar\">\n" +
				"				<ul class=\"nav nav-pills\" >\n" +
				"					<li>\n" +
				"						<a href=\"/popular\">最受欢迎</a>\n" +
				"					</li>\n" +
				"					<li >\n" +
				"						<a href=\"/last\">最新上传</a>\n" +
				"					</li>\n" +
				"					<li >\n" +
				"						<a href=\"/choice\">我们推荐</a>\n" +
				"					</li>\n" +
				"					<li>\n" +
				"						<a href=\"/upcoming\">正在上升</a>\n" +
				"					</li>\n" +
				"\n" +
				"					<li >\n" +
				"						<a href=\"/category\">分类浏览</a>\n" +
				"					</li>\n" +
				"				</ul>\n" +
				"			</div>\n" +
				"\n" +
				"		</div>\n" +
				"\n" +
				"	</div>\n" +
				"	<div class=\"col col_4\">\n" +
				"\n" +
				"		&nbsp;\n" +
				"	</div>\n" +
				"</div>\n" +
				"\n");// line 2

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Not Found Page");
		;
	}

	@Override
	protected void header() {
		p("500");
		;
	}
}
