package japidviews.Application.photo;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;
import fengfei.fir.model.PhotoShow;
import java.util.Set;
import fengfei.ucm.entity.photo.Refresh;
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
// NOTE: This file was generated from: japidviews/Application/photo/Views.html
// Change to this file will be lost next time the template file is compiled.
//

public class Views extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Views.html";
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

	public Views() {
		super(null);
	}

	public Views(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"pathTitle", "pagePath", "photos", "pageNum", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"Map<String, String>", "String", "List<? extends PhotoShow>",
			"int", };
	public static final Object[] argDefaults = new Object[] { null, null, null,
			null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Views.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private Map<String, String> pathTitle; // line 4
	private String pagePath; // line 4
	private List<? extends PhotoShow> photos; // line 4
	private int pageNum; // line 4

	public cn.bran.japid.template.RenderResult render(
			Map<String, String> pathTitle, String pagePath,
			List<? extends PhotoShow> photos, int pageNum) {
		this.pathTitle = pathTitle;
		this.pagePath = pagePath;
		this.photos = photos;
		this.pageNum = pageNum;
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
		final PhotoNav _PhotoNav3 = new PhotoNav(getOut());
		_PhotoNav3.setActionRunners(getActionRunners()).setOut(getOut());
		_PhotoNav3.render(pagePath, pathTitle); // line 11// line 11
		final PhotoView _PhotoView4 = new PhotoView(getOut());
		_PhotoView4.setActionRunners(getActionRunners()).setOut(getOut());
		_PhotoView4.render(pagePath, photos, pageNum); // line 12// line 12

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p(pathTitle.get(pagePath) + " " + i18n("photo.nav.suffix"));
		;
	}

	@Override
	protected void css() {
		p("<!---->\n" +
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 7
		p(lookupStatic("/public/styles/photo.css"));// line 9
		p("\"/>\n");// line 9
		;
	}

	@Override
	protected void header() {
		p("Views");
		;
	}
}
