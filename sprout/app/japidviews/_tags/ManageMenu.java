package japidviews._tags;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.*;
import fengfei.ucm.entity.photo.*;
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
// NOTE: This file was generated from: japidviews/_tags/ManageMenu.html
// Change to this file will be lost next time the template file is compiled.
//

public class ManageMenu extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/ManageMenu.html";
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

	public ManageMenu() {
		super(null);
	}

	public ManageMenu(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"sets", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.ManageMenu.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private List<PhotoSet> sets; // line 4

	public cn.bran.japid.template.RenderResult render(List<PhotoSet> sets) {
		this.sets = sets;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 4
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<pre style=\"display: none\">\n");// line 1
		p("</pre>\n" +
				"\n" +
				"\n" +
				"<ul class=\"nav nav-list\">\n" +
				"	<li>\n" +
				"		<h4>Photos</h4>\n" +
				"	</li>\n" +
				"	<li >\n" +
				"		<a href=\"/photo/manage/all\">所有</a>\n" +
				"	</li>\n" +
				"	<li>\n" +
				"		<a href=\"/photo/manage/public\">发布的</a>\n" +
				"	</li>\n" +
				"	<li>\n" +
				"		<h4>Sets</h4>\n" +
				"	</li>\n" +
				"	");// line 4
		if (sets != null) {// line 21
			for (PhotoSet set : sets) {// line 22
				p("	<li }>\n" +
						"		<a href=\"");// line 22
				p(set.idSet);// line 24
				p("\">");// line 24
				p(set.name);// line 24
				p("</a>\n" +
						"	</li>\n" +
						"	");// line 24
			}// line 26
		}// line 27
		p("\n" +
				"</ul>\n");// line 27

		endDoLayout(sourceTemplate);
	}

}
