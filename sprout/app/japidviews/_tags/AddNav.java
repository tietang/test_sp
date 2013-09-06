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
// NOTE: This file was generated from: japidviews/_tags/AddNav.html
// Change to this file will be lost next time the template file is compiled.
//

public class AddNav extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/AddNav.html";
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

	public AddNav() {
		super(null);
	}

	public AddNav(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"item", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.AddNav.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private String item; // line 2

	public cn.bran.japid.template.RenderResult render(String item) {
		this.item = item;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 2
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		Map ms = new HashMap();// line 3
		ms.put(item, " class=\"active\" ");// line 4
		System.out.println(ms);// line 5
		String qs = request.querystring;// line 6
		String qString = "";// line 7
		if (qs != null && !"".equals(qs)) {// line 8
			qString = "?" + qs;// line 9
		}// line 10
		p("<div class=\"grid_row  photo_nav\" >\n" +
				"	<div class=\"col col_13\">\n" +
				"\n" +
				"		<ul class=\"nav nav-pills\">\n" +
				"			<li  ");// line 10
		p(ms.get("upload"));// line 15
		p(">\n" +
				"				<a href=\"/upload");// line 15
		p(qString);// line 16
		p("\">");// line 16
		;
		p(getMessage("add.upload"));// line 16
		p("</a>\n" +
				"			</li>\n" +
				"			<li  ");// line 16
		p(ms.get("story"));// line 18
		p(">\n" +
				"				<a href=\"/story");// line 18
		p(qString);// line 19
		p("\">");// line 19
		;
		p(getMessage("add.story"));// line 19
		p("</a>\n" +
				"			</li>\n" +
				"			<li  ");// line 19
		p(ms.get("blink"));// line 21
		p(">\n" +
				"				<a href=\"/blink");// line 21
		p(qString);// line 22
		p("\">");// line 22
		;
		p(getMessage("add.blink"));// line 22
		p("</a>\n" +
				"			</li>\n" +
				"			<li  ");// line 22
		p(ms.get("manage"));// line 24
		p(">\n" +
				"				<a href=\"/photo/manage");// line 24
		p(qString);// line 25
		p("\">");// line 25
		;
		p(getMessage("add.manage"));// line 25
		p("</a>\n" +
				"			</li>\n" +
				"\n" +
				"		 \n" +
				"		</ul>\n" +
				"\n" +
				"	</div>\n" +
				" \n" +
				"	<div class=\"col col_16  hr\"></div>\n" +
				"</div>\n");// line 25

		endDoLayout(sourceTemplate);
	}

}
