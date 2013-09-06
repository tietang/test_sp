package japidviews.Application.profile;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;
import fengfei.fir.model.PhotoShow;
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
// NOTE: This file was generated from: japidviews/Application/profile/DirNav.html
// Change to this file will be lost next time the template file is compiled.
//

public class DirNav extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/DirNav.html";
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

	public DirNav() {
		super(null);
	}

	public DirNav(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"photoSets", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.DirNav.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private List<PhotoSet> photoSets; // line 6

	public cn.bran.japid.template.RenderResult render(List<PhotoSet> photoSets) {
		this.photoSets = photoSets;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 6
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<pre style=\"display: none\">\n" +
				"	\n");// line 1

		p("\n" +
				"</pre>\n");// line 6
		if (photoSets != null) {// line 9
			for (PhotoSet set : photoSets) {// line 10
				p("<li class=\"setItem\" title=\"");// line 10
				p(set.name);// line 11
				p("\">\n"
						+
						"	<a href=\"javascript:void(0)\"  src=\"/photo/manage/set/");// line 11
				p(set.idSet);// line 12
				p("\">");// line 12
				p(set.name);// line 12
				p("</a>\n" +
						"</li>\n");// line 12
			}// line 14
		}// line 15

		endDoLayout(sourceTemplate);
	}

}
