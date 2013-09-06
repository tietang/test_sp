package japidviews.Application.admin;

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
// NOTE: This file was generated from: japidviews/Application/admin/ChoiceView.html
// Change to this file will be lost next time the template file is compiled.
//

public class ChoiceView extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/admin/ChoiceView.html";
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

	public ChoiceView() {
		super(null);
	}

	public ChoiceView(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"pagePath", "photos", "pageNum", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"String", "List<? extends PhotoShow>", "int", };
	public static final Object[] argDefaults = new Object[] { null, null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.admin.ChoiceView.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private String pagePath; // line 4
	private List<? extends PhotoShow> photos; // line 4
	private int pageNum; // line 4

	public cn.bran.japid.template.RenderResult render(String pagePath,
			List<? extends PhotoShow> photos, int pageNum) {
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
		if (photos != null) {// line 11
			p("<div class=\"grid_row choice\">\n" +
					"\n" +
					"    ");// line 11
			for (PhotoShow photo : photos) {// line 14
				p("    <div class=\"col photo_col width_2\">\n"
						+
						"        <div class=\"photo_preview photo_preview_2 \">\n"
						+
						"            <a href=\"javascript:void(0)\" src=\"/show/");// line 14
				p(photo.idPhoto);// line 17
				p("_");// line 17
				p(photo.idUser);// line 17
				p("?from=");// line 17
				p(pagePath);// line 17
				p("\"\n" +
						"               target=\"photo_view\"> <img\n" +
						"                    src=\"");// line 17
				p(Path.getJpegDownloadPath(photo.idPhoto, 1));// line 19
				p("\" class=\"rounded3\"/></a>\n"
						+
						"\n"
						+
						"            <div class=\"caption\">\n"
						+
						"                <div class=\"title\">\n"
						+
						"                    <a href=\"javascript:void(0)\" src=\"/choiced/");// line 19
				p(photo.idPhoto);// line 23
				p("_");// line 23
				p(photo.idUser);// line 23
				p("?feature=popular\"\n" +
						"                       target=\"photo_view\">");// line 23
				;
				p(getMessage("editor.choice"));// line 24
				p("</a>\n" +
						"                </div>\n" +
						"                <div class=\"score\">\n" +
						"                    <a href=\"#\">");// line 24
				;
				p(getMessage("editor.view"));// line 27
				p("</a>\n" +
						"                </div>\n" +
						"            </div>\n" +
						"        </div>\n" +
						"    </div>\n" +
						"    ");// line 27
			}// line 32
			p("\n" +
					"</div>\n" +
					"<div class=\"grid_row\">\n" +
					"    <div class=\"col col_16 pager  pagination-right\">\n" +
					"        <ul>\n" +
					"            <li>\n" +
					"                <a href=\"");// line 32
			p(pagePath);// line 39
			p("/");// line 39
			p((pageNum - 1 <= 0) ? 1 : (pageNum - 1));// line 39
			p("\">Prev</a>\n" +
					"            </li>\n" +
					"            ");// line 39
			if (pageNum >= 2) {// line 41
				p("            <li>\n" +
						"                <a href=\"");// line 41
				p(pagePath);// line 43
				p("/1\">First</a>\n" +
						"            </li>\n" +
						"            ");// line 43
			}// line 45
			p("\n"
					+
					"            <!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n"
					+
					"            <li><a href=\"#\">2</a></li>\n" +
					"            <li><a href=\"#\">3</a></li>\n" +
					"            <li><a href=\"#\">4</a></li>\n" +
					"            <li><a href=\"#\">5</a></li>-->\n" +
					"            ");// line 45
			if (photos.size() >= 20) {// line 52
				p("            <li>\n" +
						"                <a href=\"");// line 52
				p(pagePath);// line 54
				p("/");// line 54
				p(photos.size() < 20 ? pageNum : (pageNum + 1));// line 54
				p("\">Next</a>\n" +
						"            </li>\n" +
						"            ");// line 54
			}// line 56
			p("\n" +
					"        </ul>\n" +
					"    </div>\n" +
					"</div>\n");// line 56
		}// line 61

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p(i18n("photo.nav.suffix"));
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
