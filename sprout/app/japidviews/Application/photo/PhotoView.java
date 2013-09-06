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
// NOTE: This file was generated from: japidviews/Application/photo/PhotoView.html
// Change to this file will be lost next time the template file is compiled.
//

public class PhotoView extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/PhotoView.html";
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

	public PhotoView() {
		super(null);
	}

	public PhotoView(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"pagePath", "photos", "pageNum", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"String", "List<? extends PhotoShow>", "int", };
	public static final Object[] argDefaults = new Object[] { null, null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.PhotoView.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private String pagePath; // line 3
	private List<? extends PhotoShow> photos; // line 3
	private int pageNum; // line 3

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
		} // line 3
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("\n"
				+
				"<!--\n"
				+
				"<div class=\"alert\">\n"
				+
				"<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n"
				+
				"×\n"
				+
				"</button>\n"
				+
				"<strong>Warning!</strong> Best check yo self, you're not looking too\n"
				+
				"good.\n" +
				"</div>\n" +
				"-->\n");// line 3
		if (photos == null) {
		} else {// line 14
			p("<div class=\"grid_row\">\n" +
					"\n" +
					"	");// line 14
			for (PhotoShow photo : photos) {// line 17
				p("	<div class=\"col photo_col width_4\">\n" +
						"		<div class=\"photo_preview photo_preview_4 \">\n" +
						"			<a href=\"/show/");// line 17
				p(photo.idPhoto);// line 20
				p("_");// line 20
				p(photo.idUser);// line 20
				p("?from=");// line 20
				p(pagePath);// line 20
				p("\" target=\"photo_view\" > <img src=\"");// line 20
				p(Path.getJpegDownloadPath(photo.idPhoto, 1));// line 20
				p("\" class=\"rounded3\" /></a>\n" +
						"			<div class=\"caption\">\n" +
						"				<div class=\"title\">\n" +
						"					<a href=\"/show/");// line 20
				p(photo.idPhoto);// line 23
				p("_");// line 23
				p(photo.idUser);// line 23
				p("?feature=popular\" target=\"photo_view\" >");// line 23
				p((photo.title == null || "".equals(photo.title.trim())) ? "Untitled"
						: photo.title);// line 23
				p("</a>\n" +
						"				</div>\n" +
						"				<div class=\"info\">\n" +
						"					<a href=\"/to/");// line 23
				p(photo.idUser);// line 26
				p("\">");// line 26
				p(photo.niceName);// line 26
				p("</a>\n" +
						"				</div>\n" +
						"				<div class=\"score\">\n" +
						"					<a href=\"#\">");// line 26
				p(photo.sscore);// line 29
				p("</a>\n" +
						"				</div>\n" +
						"			</div>\n" +
						"		</div>\n" +
						"	</div>\n" +
						"	");// line 29
			}// line 34
			p("\n" +
					"</div>\n" +
					"<div class=\"grid_row\">\n" +
					"	<div class=\"col col_16 pager  pagination-right\">\n" +
					"		<ul>\n" +
					"			<li>\n" +
					"				<a href=\"");// line 34
			p(pagePath);// line 41
			p("/");// line 41
			p((pageNum - 1 <= 0) ? 1 : (pageNum - 1));// line 41
			p("\">Prev</a>\n" +
					"			</li>\n" +
					"			");// line 41
			if (pageNum >= 2) {// line 43
				p("			<li >\n" +
						"				<a href=\"");// line 43
				p(pagePath);// line 45
				p("/1\">First</a>\n" +
						"			</li>");// line 45
			}// line 46
			p("\n" +
					"			<!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n"
					+
					"			<li><a href=\"#\">2</a></li>\n" +
					"			<li><a href=\"#\">3</a></li>\n" +
					"			<li><a href=\"#\">4</a></li>\n" +
					"			<li><a href=\"#\">5</a></li>-->\n" +
					"			");// line 46
			if (photos.size() >= 20) {// line 53
				p("			<li>\n" +
						"				<a href=\"");// line 53
				p(pagePath);// line 55
				p("/");// line 55
				p(photos.size() < 20 ? pageNum : (pageNum + 1));// line 55
				p("\" >Next</a>\n" +
						"			</li>");// line 55
			}// line 56
			p("\n" +
					"		</ul>\n" +
					"	</div>\n" +
					"</div>\n");// line 56
		}// line 61

		endDoLayout(sourceTemplate);
	}

}
