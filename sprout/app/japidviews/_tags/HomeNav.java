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
// NOTE: This file was generated from: japidviews/_tags/HomeNav.html
// Change to this file will be lost next time the template file is compiled.
//

public class HomeNav extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/HomeNav.html";
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

	public HomeNav() {
		super(null);
	}

	public HomeNav(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"item", "pathTitle", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"String", "Map<String, String>", };
	public static final Object[] argDefaults = new Object[] { null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.HomeNav.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private String item; // line 2
	private Map<String, String> pathTitle; // line 2

	public cn.bran.japid.template.RenderResult render(String item,
			Map<String, String> pathTitle) {
		this.item = item;
		this.pathTitle = pathTitle;
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
		String qs = request.querystring;// line 5
		String qString = "";// line 6
		if (qs != null && !"".equals(qs)) {// line 7
			qString = "?" + qs;// line 8
		}// line 9
		p("<div class=\"grid_row  photo_nav\" >\n" +
				"	<div class=\"col col_13\">\n" +
				"\n" +
				"		<ul class=\"nav nav-pills\">\n" +
				"			<li  ");// line 9
		p(ms.get("/flow"));// line 14
		p(">\n" +
				"				<a href=\"/flow");// line 14
		p(qString);// line 15
		p("\">Flow</a>\n" +
				"			</li>\n" +
				"			<li  ");// line 15
		p(ms.get("/fav"));// line 17
		p(">\n" +
				"				<a href=\"/fav");// line 17
		p(qString);// line 18
		p("\">Favorites</a>\n" +
				"			</li>\n" +
				"			<li  ");// line 18
		p(ms.get("/activity"));// line 20
		p(">\n" +
				"				<a href=\"/activity");// line 20
		p(qString);// line 21
		p("\">Activity</a>\n" +
				"			</li>\n" +
				"\n" +
				"		</ul>\n" +
				"\n" +
				"	</div>\n" +
				"	<div class=\"col col_3 col_right\">\n" +
				"		<div class=\"row-fluid\">\n" +
				"			\n" +
				"		</div>\n" +
				"\n" +
				"	</div>\n" +
				"	<div class=\"col col_16  hr\"></div>\n" +
				"</div>\n");// line 21

		endDoLayout(sourceTemplate);
	}

}
