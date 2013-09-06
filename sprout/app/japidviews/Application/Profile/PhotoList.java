package japidviews.Application.profile;

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
// NOTE: This file was generated from: japidviews/Application/profile/PhotoList.html
// Change to this file will be lost next time the template file is compiled.
//

public class PhotoList extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/PhotoList.html";
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

	public PhotoList() {
		super(null);
	}

	public PhotoList(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"pagePath", "photos", "pageNum", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"String", "List<? extends PhotoShow>", "int", };
	public static final Object[] argDefaults = new Object[] { null, null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.PhotoList.class);

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
		p("\n" +
				"<div class=\"grid_row previews\" >\n" +
				"	");// line 3
		for (PhotoShow photo : photos) {// line 6
			String id = "photo_id_" + photo.idPhoto;// line 7
			p("	<div class=\"col photo_col width_2\" id=\"");// line 7
			p(id);// line 8
			p("\">\n" +
					"		<div class=\"photo_preview photo_preview_2 \">\n" +
					"			<img src=\"");// line 8
			p(Path.getJpegDownloadPath(photo.idPhoto, 2));// line 10
			p("\" class=\"rounded3\" />\n" +
					"			<div class=\"caption\">\n" +
					"				<div class=\"title\">\n" +
					"		<!--			<a href=\"/edit/");// line 10
			p(photo.idPhoto);// line 13
			p("\" target=\"photo_edit\" onclick=\"editPhoto(");// line 13
			p(photo.idPhoto);// line 13
			p(",");// line 13
			p(photo.idUser);// line 13
			p(")\" >");// line 13
			;
			p(getMessage("edit"));// line 13
			p("</a>-->\n"
					+
					"					<a href=\"javascript:void(0);\" target=\"photo_view\" onclick=\"editPhoto(");// line 13
			p(photo.idPhoto);// line 14
			p(",");// line 14
			p(photo.idUser);// line 14
			p(")\" >");// line 14
			;
			p(getMessage("edit"));// line 14
			p("</a>\n"
					+
					"				</div>\n"
					+
					"				<div class=\"score\">\n"
					+
					"					<a href=\"javascript:void(0);\" onclick=\"deletePhoto(");// line 14
			p(photo.idPhoto);// line 17
			p(",'");// line 17
			p(id);// line 17
			p("')\">");// line 17
			;
			p(getMessage("delete"));// line 17
			p("</a>\n" +
					"				</div>\n" +
					"			</div>\n" +
					"		</div>\n" +
					"	</div>\n" +
					"	");// line 17
		}// line 22
		p("\n" +
				"</div>\n" +
				"<div class=\"grid_row previews\">\n" +
				"	<div class=\"col col_14 pager  pagination-right\">\n" +
				"		<ul>\n" +
				"			<li>\n" +
				"				<a href=\"");// line 22
		p(pagePath);// line 29
		p("/");// line 29
		p((pageNum - 1 <= 0) ? 1 : (pageNum - 1));// line 29
		p("\">Prev</a>\n" +
				"			</li>\n" +
				"			");// line 29
		if (pageNum >= 2) {// line 31
			p("			<li >\n" +
					"				<a href=\"");// line 31
			p(pagePath);// line 33
			p("/1\">First</a>\n" +
					"			</li>");// line 33
		}// line 34
		p("\n" +
				"			<!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n" +
				"			<li><a href=\"#\">2</a></li>\n" +
				"			<li><a href=\"#\">3</a></li>\n" +
				"			<li><a href=\"#\">4</a></li>\n" +
				"			<li><a href=\"#\">5</a></li>-->\n" +
				"			");// line 34
		if (photos.size() >= 20) {// line 41
			p("			<li>\n" +
					"				<a href=\"");// line 41
			p(pagePath);// line 43
			p("/");// line 43
			p(photos.size() < 20 ? pageNum : (pageNum + 1));// line 43
			p("\" >Next</a>\n" +
					"			</li>");// line 43
		}// line 44
		p("\n" +
				"		</ul>\n" +
				"	</div>\n" +
				"</div>\n");// line 44

		endDoLayout(sourceTemplate);
	}

}
