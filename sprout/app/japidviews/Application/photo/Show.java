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
// NOTE: This file was generated from: japidviews/Application/photo/Show.html
// Change to this file will be lost next time the template file is compiled.
//

public class Show extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Show.html";
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

	public Show() {
		super(null);
	}

	public Show(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"photo", "rank", "exif", "isFollow", "isFavorite", "isVote", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"Photo", "Rank", "Map", "boolean", "boolean", "boolean", };
	public static final Object[] argDefaults = new Object[] { null, null, null,
			null, null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Show.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private Photo photo; // line 4
	private Rank rank; // line 4
	private Map exif; // line 4
	private boolean isFollow; // line 4
	private boolean isFavorite; // line 4
	private boolean isVote; // line 4

	public cn.bran.japid.template.RenderResult render(Photo photo, Rank rank,
			Map exif, boolean isFollow, boolean isFavorite, boolean isVote) {
		this.photo = photo;
		this.rank = rank;
		this.exif = exif;
		this.isFollow = isFollow;
		this.isFavorite = isFavorite;
		this.isVote = isVote;
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

		p("<div class=\"grid_row show\">\n" +
				"\n" +
				"    <div class=\"col col_16  \">\n" +
				"        <div class=\"title\">\n" +
				"            <h4>");// line 30
		try {
			p((photo.title == null || "".equals(photo.title.trim())) ? "Untitled"
					: photo.title);
		} catch (NullPointerException npe) {
		}// line 35
		p("</h4>\n" +
				"        </div>\n" +
				"    </div>\n" +
				"    <div class=\"col col_12  \">\n" +
				"\n" +
				"        <div class=\"\">\n" +
				"            <img src=\"");// line 35
		try {
			p(Path.getJpegDownloadPath(photo.idPhoto, 0));
		} catch (NullPointerException npe) {
		}// line 41
		p("\" class=\"rounded3 img_shadow\" alt=\"\">\n"
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
				"                    &nbsp;&nbsp; ");// line 41
		;
		p(getMessage("i.wanna.buy.photo"));// line 47
		p("&nbsp;&nbsp;\n"
				+
				"                </button>\n"
				+
				"            </div>\n"
				+
				"            <div class=\"span5\">\n"
				+
				"                <!-- Baidu Button BEGIN -->\n"
				+
				"                <div id=\"bdshare\" class=\"bdshare_t bds_tools get-codes-bdshare\">\n"
				+
				"                    <a class=\"bds_tsina\"></a>\n" +
				"                    <a class=\"bds_qzone\"></a>\n" +
				"                    <a class=\"bds_tqq\"></a>\n" +
				"                    <a class=\"bds_douban\"></a>\n" +
				"                    <a class=\"bds_tqf\"></a>\n" +
				"                    <a class=\"bds_sqq\"></a>\n" +
				"                    <a class=\"bds_renren\"></a>\n" +
				"                    <a class=\"bds_twi\"></a>\n" +
				"                    <a class=\"bds_fbook\"></a>\n" +
				"                    <a class=\"bds_msn\"></a>\n" +
				"                    <span class=\"bds_more\">&nbsp; ");// line 47
		;
		p(getMessage("more"));// line 63
		p("</span>\n"
				+
				"                    <a class=\"shareCount\"></a>\n"
				+
				"                </div>\n"
				+
				"                <script type=\"text/javascript\" id=\"bdshare_js\" data=\"type=tools&amp;uid=0\"></script>\n"
				+
				"                <script type=\"text/javascript\" id=\"bdshell_js\"></script>\n"
				+
				"                <script type=\"text/javascript\">\n"
				+
				"                    document.getElementById(\"bdshell_js\").src = \"http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=\" + Math.ceil(new Date() / 3600000)\n"
				+
				"                </script>\n"
				+
				"                <!-- Baidu Button END -->\n"
				+
				"            </div>\n"
				+
				"        </div>\n"
				+
				"        <div class=\"line10\"></div>\n"
				+
				"        <div>\n"
				+
				"            <form class=\"form-horizontal\" id=\"commentForm\" method=\"post\">\n"
				+
				"                ");// line 63
		if (session.get(Admin.SESSION_LOGIN_KEY) == null) {// line 77
			p("\n"
					+
					"                <div class=\"line10\"></div>\n"
					+
					"                <div class=\"line12\"></div>\n"
					+
					"                <a href=\"/login\">Login</a> or <a href=\"/signup\">Sign up</a> to comment.\n"
					+
					"                <div class=\"line10\"></div>\n" +
					"                <div class=\"line10\"></div>\n" +
					"                ");// line 77
		} else {// line 84
			p("                <textarea class=\"col_12 comment\" rows=\"3\" cols=\"\" id=\"comment\" name=\"comment\"\n"
					+
					"                          placeholder=\"Add your comments...\"></textarea>\n"
					+
					"\n"
					+
					"                <div class=\"line3\"></div>\n"
					+
					"                <input type=\"hidden\" name=\"comment_count\" id=\"comment_count\"\n"
					+
					"                       value=\"");// line 84
			try {
				p(photo.commentCount);
			} catch (NullPointerException npe) {
			}// line 90
			p("\"/>\n" +
					"\n" +
					"                ");// line 90
			//if(!String.valueOf(photo.idUser).equals(session.get(Admin.SESSION_USER_ID_KEY))){// line 92
			p("                <button type=\"button\" id=\"comment_btn\" class=\"btn btn-info  btn-mini\">\n"
					+
					"                    ");// line 92
			;
			p(getMessage("comment"));// line 94
			p("                </button>\n" +
					"                ");// line 94
			//}// line 96

		}// line 98
		p("                <input type=\"hidden\" name=\"id_photo\" id=\"id_photo_x\" value=\"");// line 98
		try {
			p(photo.idPhoto);
		} catch (NullPointerException npe) {
		}// line 99
		p("\"/>\n"
				+
				"                <input type=\"hidden\" name=\"niceName\" id=\"niceNameX\" value=\"");// line 99
		try {
			p(photo.user.niceName);
		} catch (NullPointerException npe) {
		}// line 100
		p("\"/>\n"
				+
				"                <input type=\"hidden\" name=\"photoIdUser\" id=\"photoIdUserX\" value=\"");// line 100
		try {
			p(photo.idUser);
		} catch (NullPointerException npe) {
		}// line 101
		p("\"/>\n"
				+
				"\n"
				+
				"                <input type=\"hidden\" name=\"category\" id=\"categoryx\" value=\"");// line 101
		try {
			p(photo.category);
		} catch (NullPointerException npe) {
		}// line 103
		p("\"/>\n"
				+
				"\n"
				+
				"                <input type=\"hidden\" name=\"id_user\" id=\"id_user\" value=\"");// line 103
		try {
			p(photo.idUser);
		} catch (NullPointerException npe) {
		}// line 105
		p("\"/>\n"
				+
				"                <input type=\"hidden\" name=\"id_photo\" id=\"id_photo\" value=\"");// line 105
		try {
			p(photo.idPhoto);
		} catch (NullPointerException npe) {
		}// line 106
		p("\"/>\n"
				+
				"            </form>\n"
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
				"    <div class=\"col col_4 \">\n"
				+
				"        <div class=\"row-fluid stat left_rounded6 shadow \">\n"
				+
				"            <div class=\"span6\">\n"
				+
				"                <img width=\"90\" height=\"90\" class=\"img-rounded\"\n"
				+
				"                     src=\"");// line 106
		try {
			p(fengfei.spruce.utils.PhotoPathUtils
					.getUserPhotoDownloadPath(photo.idUser));
		} catch (NullPointerException npe) {
		}// line 121
		p("\">\n" +
				"            </div>\n" +
				"            <div class=\"span6\">\n" +
				"                <p>\n" +
				"                    ");// line 121
		try {
			p(photo.user.niceName);
		} catch (NullPointerException npe) {
		}// line 125
		p("                </p>\n" +
				"\n" +
				"                <p>\n" +
				"                    <button\n" +
				"                            class=\"follow_btn btn ");// line 125
		if (isFollow) {// line 130
			p(" btn-success");// line 130
		} else {// line 130
			p("btn-info");// line 130
		}// line 130
		p(" btn-mini  \"\n"
				+
				"                            type=\"button\" id=\"follow\" toid=\"");// line 130
		try {
			p(photo.idUser);
		} catch (NullPointerException npe) {
		}// line 131
		p("\" isfollow=\"");// line 131
		try {
			p(isFollow);
		} catch (NullPointerException npe) {
		}// line 131
		p("\">\n" +
				"                        ");// line 131
		try {
			p(isFollow ? i18n("following") : i18n("follow"));
		} catch (NullPointerException npe) {
		}// line 132
		p("                    </button>\n" +
				"                </p>\n" +
				"            </div>\n" +
				"        </div>\n" +
				"        <div class=\"line6\"></div>\n" +
				"        ");// line 132
		final RankShow _RankShow5 = new RankShow(getOut());
		_RankShow5.setActionRunners(getActionRunners()).setOut(getOut());
		_RankShow5.render(rank); // line 138// line 138
		p("        <div class=\"line6\"></div>\n" +
				"\n" +
				"        <div class=\"row-fluid  \">\n" +
				"            <div class=\"btn-group span12\">\n" +
				"                <button id=\"vote_btn\"\n" +
				"                        class=\"btn ");// line 138
		if (isVote) {// line 144
			p("disabled");// line 144
		} else {// line 144
			p(" btn-success ");// line 144
		}// line 144
		p("  btn-mini  span10 pull-left\"\n" +
				"                        type=\"button\"\n" +
				"                        isvote=\"");// line 144
		try {
			p(isVote);
		} catch (NullPointerException npe) {
		}// line 146
		p("\">\n" +
				"                    ");// line 146
		if (isVote) {// line 147
			;
			p(getMessage("thank.vote"));// line 147
		} else {// line 147
			;
			p(getMessage("like"));// line 147
		}// line 147
		p("                </button>\n" +
				"                <button id=\"favorite_btn\" title=\"");// line 147
		if (isFavorite) {// line 149
			;
			p(getMessage("favorite.cancel"));// line 149
		} else {// line 149
			;
			p(getMessage("favorite"));// line 149
		}// line 149
		p("\"\n" +
				"                        class=\"btn favorite ");// line 149
		if (isFavorite) {// line 150
			p("favorited");// line 150
		} else {// line 150
			p("unfavorited");// line 150
		}// line 150
		p(" ico_favorite btn-mini span2\n" +
				"                pull-right\" type=\"button\"\n" +
				"                        isfavorite=\"");// line 150
		try {
			p(isFavorite);
		} catch (NullPointerException npe) {
		}// line 152
		p("\">&nbsp;\n"
				+
				"                </button>\n"
				+
				"            </div>\n"
				+
				"        </div>\n"
				+
				"        <div class=\"line6\"></div>\n"
				+
				"        <div class=\"row-fluid border-bottom shadow rounded6\">\n"
				+
				"            ");// line 152
		if (photo.description != null && !"".equals(photo.description)) {// line 158
			p("            <div class=\"span12\">\n"
					+
					"                <div id=\"desc\" class=\"photo_stats border-bottom\">\n"
					+
					"                    ");// line 158
			try {
				p(photo.description);
			} catch (NullPointerException npe) {
			}// line 161
			p("                </div>\n" +
					"            </div>\n" +
					"\n" +
					"            ");// line 161
		}// line 165

		if (photo.tagList != null) {// line 167
			p("            <div class=\"span12\">\n"
					+
					"                <div id=\"tags\" class=\"photo_stats border-bottom\">\n"
					+
					"                    ");// line 167
			for (String tag : photo.tagList) {// line 170
				p("                    <a class=\"badge tag\" href=\"javascript:void(0)\"> ");// line 170
				try {
					p(tag);
				} catch (NullPointerException npe) {
				}// line 171
				p(" </a>\n" +
						"                    ");// line 171
			}// line 172
			p("                </div>\n" +
					"            </div>\n" +
					"\n" +
					"            ");// line 172
		}// line 176
		p("\n" +
				"            <div class=\"span12\">\n" +
				"                <div id=\"exif\" class=\"exif_info \">\n" +
				"                    <ul>\n" +
				"                        ");// line 176
		Set sets = exif.entrySet();// line 181
		for (Object obj : sets) {// line 182
			Entry entry = (Entry) obj;// line 183
			String key = (String) entry.getKey();// line 184
			String keyI18n = i18n(key);// line 185
			p("                        <li>\n" +
					"                            <small class=\"key\">");// line 185
			try {
				p(keyI18n);
			} catch (NullPointerException npe) {
			}// line 187
			p("</small>\n" +
					"                            <strong class=\"value\">");// line 187
			try {
				p(entry.getValue());
			} catch (NullPointerException npe) {
			}// line 188
			p("</strong>\n" +
					"                        </li>\n" +
					"                        ");// line 188
		}// line 190
		p("                    </ul>\n" +
				"                </div>\n" +
				"            </div>\n" +
				"        </div>\n" +
				"\n" +
				"        <div class=\"row-fluid border-bottom show_map\">\n" +
				"\n" +
				"            <div class=\"span12\">\n" +
				"                <div id=\"map_show_canvas\" lat=\"");// line 190
		try {
			p(photo.GPSLatitude);
		} catch (NullPointerException npe) {
		}// line 199
		p("\" lng=\"");// line 199
		try {
			p(photo.GPSLongitude);
		} catch (NullPointerException npe) {
		}// line 199
		p("\"\n"
				+
				"                     class=\"show_map_canvas shadow rounded6\"></div>\n"
				+
				"            </div>\n"
				+
				"\n"
				+
				"            <div class=\"span12\">\n"
				+
				"                <div id=\"address\">\n"
				+
				"\n"
				+
				"                </div>\n"
				+
				"            </div>\n"
				+
				"        </div>\n"
				+
				"    </div>\n"
				+
				"\n"
				+
				"</div>\n"
				+
				"<script id=\"comments_tml\" type=\"text/x-tmpl\">\n"
				+
				"\n"
				+
				"    <li class=\"media\"><a class=\"pull-left\" href=\"#\"> <img width=\"64\" height=\"64\"\n"
				+
				"                                                          class=\"media-object\">\n"
				+
				"    </a>\n"
				+
				"\n"
				+
				"        <div class=\"media-body\">\n"
				+
				"            <h5 class=\"media-heading border-bottom\">{%=o.username%} 1 minutes ago</h5>\n"
				+
				"            <small>{%=o.content%}</small>\n" +
				"\n" +
				"        </div>\n" +
				"    </li>\n" +
				"\n" +
				"</script>\n");// line 199

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p(photo.title + " by " + photo.niceName);
		;
	}

	@Override
	protected void desc() {
		p(photo.title + (photo.tags == null ? "" : ("," + photo.tags)));
		;
	}

	@Override
	protected void keywords() {
		p(photo.tags == null ? photo.title : photo.tags);
		;
	}

	@Override
	protected void css() {
		p("<script type=\"text/javascript\"\n"
				+
				"        src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDqPLY_onh61yMSw5KSVICJN-B5igbHCTs&sensor=false&language=zh-cn\"></script>\n"
				+
				"<script src=\"");// line 10
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 13
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 13
		p(lookupStatic("/public/app/map.js"));// line 14
		p("\"></script>\n" +
				"<script src=\"");// line 14
		p(lookupStatic("/public/app/show.js"));// line 15
		p("\"></script>\n" +
				"<script src=\"");// line 15
		p(lookupStatic("/public/app/follow.js"));// line 16
		p("\"></script>\n" +
				"<script src=\"");// line 16
		p(lookupStatic("/public/app/comment.js"));// line 17
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
				"</style>\n" +
				"\n");// line 17
		;
	}

	@Override
	protected void header() {
		p("Show");
		;
	}
}
