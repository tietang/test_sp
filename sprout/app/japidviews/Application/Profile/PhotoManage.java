package japidviews.Application.profile;

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
// NOTE: This file was generated from: japidviews/Application/profile/PhotoManage.html
// Change to this file will be lost next time the template file is compiled.
//

public class PhotoManage extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/PhotoManage.html";
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

	public PhotoManage() {
		super(null);
	}

	public PhotoManage(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"sets", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.PhotoManage.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private List<PhotoSet> sets; // line 5

	public cn.bran.japid.template.RenderResult render(List<PhotoSet> sets) {
		this.sets = sets;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 5
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
				"\n");// line 12
		final AddNav _AddNav3 = new AddNav(getOut());
		_AddNav3.setActionRunners(getActionRunners()).setOut(getOut());
		_AddNav3.render("manage"); // line 17// line 17
		p("<div class=\"grid_row manage\">\n"
				+
				"\n"
				+
				"	<div class=\"col col_2 \">\n"
				+
				"		<div class=\"manage_nav \">\n"
				+
				"\n"
				+
				"			<ul class=\"nav nav-list\" id=\"manage_menu\">\n"
				+
				"				<li>\n"
				+
				"					<h4>Photos</h4>\n"
				+
				"				</li>\n"
				+
				"				<li >\n"
				+
				"					<a href=\"javascript:void(0)\" src=\"/photo/manage/all\">");// line 17
		;
		p(getMessage("all"));// line 28
		p("</a>\n"
				+
				"				</li>\n"
				+
				"				<li>\n"
				+
				"					<a href=\"javascript:void(0)\"  src=\"/photo/manage/public\">");// line 28
		;
		p(getMessage("published"));// line 31
		p("</a>\n"
				+
				"				</li>\n"
				+
				"				<li>\n"
				+
				"					<a href=\"javascript:void(0)\"  src=\"/photo/manage/set/all\"><h4>");// line 31
		;
		p(getMessage("sets"));// line 34
		p("</h4></a>\n" +
				"				</li>\n" +
				"				");// line 34
		final DirNav _DirNav4 = new DirNav(getOut());
		_DirNav4.setActionRunners(getActionRunners()).setOut(getOut());
		_DirNav4.render(sets); // line 36// line 36
		p("\n" +
				"			</ul>\n" +
				"\n" +
				"		</div>\n" +
				"	</div>\n" +
				"	<div class=\"col col_14 \">\n" +
				"\n" +
				"		<div  id=\"manage_contaner\">\n" +
				"\n" +
				"		</div>\n" +
				"\n" +
				"	</div>\n" +
				"</div>\n" +
				"\n" +
				"\n");// line 36

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy manage Page");
		;
	}

	@Override
	protected void css() {
		p("	<link type=\"text/css\" href=\"");// line 8
		p(lookupStatic("/public/styles/photo_top.css"));// line 9
		p("\" />\n" +
				"	<script type=\"text/javascript\" src=\"");// line 9
		p(lookupStatic("/public/bootstrap/bootbox.js"));// line 10
		p("\"></script>\n" +
				"	<script type=\"text/javascript\" src=\"");// line 10
		p(lookupStatic("/public/app/photoManage.js"));// line 11
		p("\"></script>\n");// line 11
		;
	}

	@Override
	protected void header() {
		p("");
		;
	}
}
