package japidviews.Application.photo;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.photo.*;
import fengfei.fir.utils.Path;
import java.util.*;
import java.util.Map.Entry;
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
// NOTE: This file was generated from: japidviews/Application/photo/Edit.html
// Change to this file will be lost next time the template file is compiled.
//

public class Edit extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Edit.html";
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

	public Edit() {
		super(null);
	}

	public Edit(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"photo", "rank", "exif", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"Photo", "Rank", "Map", };
	public static final Object[] argDefaults = new Object[] { null, null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Edit.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private Photo photo; // line 5
	private Rank rank; // line 5
	private Map exif; // line 5

	public cn.bran.japid.template.RenderResult render(Photo photo, Rank rank,
			Map exif) {
		this.photo = photo;
		this.rank = rank;
		this.exif = exif;
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

		p("</pre>\n");// line 7
		p("<div class=\"page-header\">\n" +
				"\n" +
				"    <h4>");// line 24
		try {
			p(photo.title);
		} catch (NullPointerException npe) {
		}// line 27
		p("</h4>\n" +
				"</div>\n" +
				"<div class=\"row-fluid\">\n" +
				"\n" +
				"    <div class=\"span9 \">\n" +
				"\n" +
				"        <div>\n" +
				"\n" +
				"            <img src=\"");// line 27
		try {
			p(Path.getJpegDownloadPath(photo.idPhoto, 0));
		} catch (NullPointerException npe) {
		}// line 35
		p("\" class=\"img-rounded0\" alt=\"\">\n"
				+
				"        </div>\n"
				+
				"        <div class=\"line6\"></div>\n"
				+
				"        <div class=\"row-fluid \">\n"
				+
				"            <div class=\"span7\">\n"
				+
				"                <button class=\"btn btn-mini\" type=\"button\">\n"
				+
				"                    Edit\n"
				+
				"                </button>\n"
				+
				"            </div>\n"
				+
				"            <div class=\"span5\">\n"
				+
				"                <!-- JiaThis Button BEGIN\n"
				+
				"                <div class=\"jiathis_style\">\n"
				+
				"                <a class=\"jiathis_button_qzone\"></a> <a class=\"jiathis_button_tsina\"></a> <a\n"
				+
				"                class=\"jiathis_button_tqq\"></a> <a class=\"jiathis_button_weixin\"></a> <a\n"
				+
				"                class=\"jiathis_button_renren\"></a> <a class=\"jiathis_button_xiaoyou\"></a> <a\n"
				+
				"                class=\"jiathis_button_tianya\"></a> <a class=\"jiathis_button_ishare\"></a> <a\n"
				+
				"                href=\"http://www.jiathis.com/share\" class=\"jiathis jiathis_txt jtico jtico_jiathis\"\n"
				+
				"                target=\"_blank\"></a> <a class=\"jiathis_counter_style\"></a>\n"
				+
				"                </div>\n"
				+
				"                <script type=\"text/javascript\"\n"
				+
				"                src=\"http://v3.jiathis.com/code/jia.js?uid=1363333029194573\" charset=\"utf-8\"></script> -->\n"
				+
				"                <!-- JiaThis Button END -->\n"
				+
				"            </div>\n"
				+
				"        </div>\n"
				+
				"        <div class=\"line10\"></div>\n"
				+
				"        <div>\n"
				+
				"\n"
				+
				"            <input type=\"hidden\" name=\"id_photo\" id=\"id_photo\" value=\"");// line 35
		try {
			p(photo.idPhoto);
		} catch (NullPointerException npe) {
		}// line 62
		p("\"/>\n"
				+
				"        </div>\n"
				+
				"\n"
				+
				"        <div class=\"line10\"></div>\n"
				+
				"        <div id=\"comments_c\">\n"
				+
				"            loading comments...\n"
				+
				"        </div>\n"
				+
				"\n"
				+
				"    </div>\n"
				+
				"    <!-- user info -->\n"
				+
				"    <div class=\"span3 \">\n"
				+
				"        <div class=\"row-fluid stat \">\n"
				+
				"            <div class=\"span6\">\n"
				+
				"                <img width=\"90\" height=\"90\" class=\"img-rounded\"\n"
				+
				"                     src=\"");// line 62
		try {
			p(fengfei.spruce.utils.PhotoPathUtils
					.getUserPhotoDownloadPath(photo.idUser));
		} catch (NullPointerException npe) {
		}// line 76
		p("\">\n" +
				"            </div>\n" +
				"            <div class=\"span6\">\n" +
				"                <p>\n" +
				"                    ");// line 76
		try {
			p(photo.user.niceName);
		} catch (NullPointerException npe) {
		}// line 80
		p("                </p>\n"
				+
				"\n"
				+
				"                <p>\n"
				+
				"                    <a href=\"/settings/profile\" class=\"btn btn-small\">Edit Profile</a>\n"
				+
				"                </p>\n" +
				"            </div>\n" +
				"        </div>\n" +
				"        <div class=\"line6\"></div>\n" +
				"        ");// line 80
		final RankShow _RankShow3 = new RankShow(getOut());
		_RankShow3.setActionRunners(getActionRunners()).setOut(getOut());
		_RankShow3.render(rank); // line 89// line 89
		p("        <div class=\"line6\"></div>\n"
				+
				"\n"
				+
				"        <div class=\"line6\"></div>\n"
				+
				"        <div class=\"row-fluid border-bottom  \">\n"
				+
				"            <div class=\"span12\">\n"
				+
				"                <div id=\"desc\" class=\"photo_stats border-bottom\">\n"
				+
				"                    ");// line 89
		try {
			p(photo.description);
		} catch (NullPointerException npe) {
		}// line 96
		p("                </div>\n"
				+
				"            </div>\n"
				+
				"            <div class=\"span12\">\n"
				+
				"                <div id=\"tags\" class=\"photo_stats border-bottom\">\n"
				+
				"                    <span>");// line 96
		try {
			p(photo.tags);
		} catch (NullPointerException npe) {
		}// line 101
		p("<i class=\" icon-tags\"></i>tags1 </span><span><i\n"
				+
				"                        class=\" icon-tags\"></i>tags2</span><span><i class=\" icon-tags\"></i>tags3</span>\n"
				+
				"                </div>\n" +
				"            </div>\n" +
				"            <div class=\"span12\">\n" +
				"                <div id=\"exif\" class=\" photo_stats \">\n" +
				"                    <ul class=\"stats exif\">\n" +
				"\n" +
				"                        ");// line 101
		Set// line 109
		<// line 109
		Entry>// line 109
		sets = exif.entrySet();// line 109
		for (Object obj : sets) {// line 109
			Entry// line 109
			entry = (Entry) obj;// line 110
			p("                        <li>\n" +
					"                            <small>");// line 110
			try {
				p(entry.getKey());
			} catch (NullPointerException npe) {
			}// line 112
			p("</small>\n" +
					"                            <strong class=\"faded\">");// line 112
			try {
				p(entry.getValue());
			} catch (NullPointerException npe) {
			}// line 113
			p("</strong>\n" +
					"                        </li>\n" +
					"                        ");// line 113
		}// line 115
		p("                    </ul>\n"
				+
				"                </div>\n"
				+
				"            </div>\n"
				+
				"        </div>\n"
				+
				"    </div>\n"
				+
				"</div>\n"
				+
				"<script id=\"comments_tml\" type=\"text/x-tmpl\">\n"
				+
				"\n"
				+
				"    <li class=\"media\">\n"
				+
				"        <a class=\"pull-left\" href=\"#\">\n"
				+
				"            <img width=\"64\" height=\"64\" class=\"media-object\"/>\n"
				+
				"        </a>\n"
				+
				"\n"
				+
				"        <div class=\"media-body\">\n"
				+
				"            <h5 class=\"media-heading border-bottom\">{%=o.username%} 1 minutes ago</h5>\n"
				+
				"            <small>{%=o.content%}</small>\n" +
				"        </div>\n" +
				"    </li>\n" +
				"\n" +
				"</script>\n");// line 115

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy Show Page");
		;
	}

	@Override
	protected void css() {
		p("<script src=\"");// line 9
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 10
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 10
		p(lookupStatic("/public/app/show.js"));// line 11
		p("\"></script>\n" +
				"<script src=\"");// line 11
		p(lookupStatic("/public/app/comment.js"));// line 12
		p("\"></script>\n" +
				"<style type=\"text/css\">\n" +
				"    .follow_btn {\n" +
				"        width: 80px;\n" +
				"        max-width: 80px;\n" +
				"    }\n" +
				"\n" +
				"    .comment_error {\n" +
				"        border-color: red;\n" +
				"    }\n" +
				"\n" +
				"</style>\n");// line 12
		;
	}

	@Override
	protected void header() {
		p("Show");
		;
	}
}
