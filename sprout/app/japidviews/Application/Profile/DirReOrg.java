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
// NOTE: This file was generated from: japidviews/Application/profile/DirReOrg.html
// Change to this file will be lost next time the template file is compiled.
//

public class DirReOrg extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/DirReOrg.html";
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

	public DirReOrg() {
		super(null);
	}

	public DirReOrg(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"photoSets", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.DirReOrg.class);

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
		p("</pre>\n" +
				"<div class=\"grid_row \" >\n" +
				"	<div class=\"col col_6\">\n" +
				"		<ul class=\"sortable nav nav-list\">\n" +
				"			");// line 10
		if (photoSets != null) {// line 15
			for (PhotoSet set : photoSets) {// line 16
				p("			<li class=\"setItem\" title=\"");// line 16
				p(set.name);// line 17
				p("\">\n"
						+
						"				<a href=\"javascript:void(0)\"  src=\"/photo/manage/set/");// line 17
				p(set.idSet);// line 18
				p("\">");// line 18
				p(set.name);// line 18
				p("</a>\n" +
						"			</li>\n" +
						"			");// line 18
			}// line 20
		}// line 21
		p("\n" +
				"		</ul>\n" +
				"	</div>\n" +
				"	<div class=\"col col_6 \">\n" +
				"\n" +
				"	</div>\n" +
				"</div>\n");// line 21

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void css() {
		p("	<script type=\"text/javascript\" src=\"");// line 7
		p(lookupStatic("/public/js/jquery-ui-1.10.3-core-interactions.js"));// line 8
		p("\"></script>\n" +
				"	<script type=\"text/javascript\" src=\"");// line 8
		p(lookupStatic("/public/app/dirOrg.js"));// line 9
		p("\"></script>\n");// line 9
		;
	}
}
