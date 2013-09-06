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
// NOTE: This file was generated from: japidviews/Application/photo/ShowHoriz.html
// Change to this file will be lost next time the template file is compiled.
//

public class ShowHoriz extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/ShowHoriz.html";
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

	public ShowHoriz() {
		super(null);
	}

	public ShowHoriz(StringBuilder out) {
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
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.ShowHoriz.class);

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
	private boolean isFollow; // line 5
	private boolean isFavorite; // line 5
	private boolean isVote; // line 5

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
		p("<div class=\"grid_row show\">\n" +
				"    <div class=\"col col_16  \">\n" +
				"        <div class=\"title\">\n" +
				"            <h4>");// line 27
		try {
			p((photo.title == null || "".equals(photo.title.trim())) ? "Untitled"
					: photo.title);
		} catch (NullPointerException npe) {
		}// line 31
		p("</h4>\n" +
				"        </div>\n" +
				"    </div>\n" +
				"    <div class=\"col col_12  \">\n" +
				"\n" +
				"        <div class=\"\">\n" +
				"            <img src=\"");// line 31
		try {
			p(Path.getJpegDownloadPath(photo.idPhoto, 0));
		} catch (NullPointerException npe) {
		}// line 37
		p("\" class=\"rounded3 img_shadow\" alt=\"\" class=\"\">\n"
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
				"                    &nbsp;&nbsp; I want to buy this\n"
				+
				"                    photo! &nbsp;&nbsp;\n"
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
				"            <form class=\"form-horizontal\" id=\"commentForm\" method=\"post\">\n"
				+
				"                ");// line 37
		if (session.get(Admin.SESSION_LOGIN_KEY) == null) {// line 65
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
					"                ");// line 65
		} else {// line 72
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
					"                       value=\"");// line 72
			try {
				p(photo.commentCount);
			} catch (NullPointerException npe) {
			}// line 78
			p("\"/>\n" +
					"\n" +
					"                ");// line 78
			//if(!String.valueOf(photo.idUser).equals(session.get(Admin.SESSION_USER_ID_KEY))){// line 80
			p("                <button type=\"button\" id=\"comment_btn\" class=\"btn btn-info  btn-mini\">\n"
					+
					"                    Comment\n" +
					"                </button>\n" +
					"                ");// line 80
			//}// line 84

		}// line 86
		p("                <input type=\"hidden\" name=\"id_photo\" id=\"id_photo_x\" value=\"");// line 86
		try {
			p(photo.idPhoto);
		} catch (NullPointerException npe) {
		}// line 87
		p("\"/>\n"
				+
				"                <input type=\"hidden\" name=\"niceName\" id=\"niceNameX\" value=\"");// line 87
		try {
			p(photo.user.niceName);
		} catch (NullPointerException npe) {
		}// line 88
		p("\"/>\n"
				+
				"                <input type=\"hidden\" name=\"photoIdUser\" id=\"photoIdUserX\" value=\"");// line 88
		try {
			p(photo.idUser);
		} catch (NullPointerException npe) {
		}// line 89
		p("\"/>\n"
				+
				"\n"
				+
				"                <input type=\"hidden\" name=\"category\" id=\"categoryx\" value=\"");// line 89
		try {
			p(photo.category);
		} catch (NullPointerException npe) {
		}// line 91
		p("\"/>\n"
				+
				"\n"
				+
				"                <input type=\"hidden\" name=\"id_photo\" id=\"id_photo\" value=\"");// line 91
		try {
			p(photo.idPhoto);
		} catch (NullPointerException npe) {
		}// line 93
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
				"                     src=\"");// line 93
		try {
			p(fengfei.spruce.utils.PhotoPathUtils
					.getUserPhotoDownloadPath(photo.idUser));
		} catch (NullPointerException npe) {
		}// line 108
		p("\">\n" +
				"            </div>\n" +
				"            <div class=\"span6\">\n" +
				"                <p>\n" +
				"                    ");// line 108
		try {
			p(photo.user.niceName);
		} catch (NullPointerException npe) {
		}// line 112
		p("                </p>\n" +
				"\n" +
				"                <p>\n" +
				"                    <button\n" +
				"                            class=\"follow_btn btn ");// line 112
		if (isFollow) {// line 117
			p(" btn-success");// line 117
		} else {// line 117
			p("btn-info");// line 117
		}// line 117
		p(" btn-mini  \"\n"
				+
				"                            type=\"button\" id=\"follow\" toid=\"");// line 117
		try {
			p(photo.idUser);
		} catch (NullPointerException npe) {
		}// line 118
		p("\" isfollow=\"");// line 118
		try {
			p(isFollow);
		} catch (NullPointerException npe) {
		}// line 118
		p("\">\n" +
				"                        ");// line 118
		try {
			p(isFollow ? "Following" : "Follow");
		} catch (NullPointerException npe) {
		}// line 119
		p("                    </button>\n" +
				"                </p>\n" +
				"            </div>\n" +
				"        </div>\n" +
				"        <div class=\"line6\"></div>\n" +
				"        ");// line 119
		final RankShow _RankShow3 = new RankShow(getOut());
		_RankShow3.setActionRunners(getActionRunners()).setOut(getOut());
		_RankShow3.render(rank); // line 125// line 125
		p("        <div class=\"line6\"></div>\n" +
				"\n" +
				"        <div class=\"row-fluid  \">\n" +
				"            <button id=\"vote_btn\"\n" +
				"                    class=\"btn ");// line 125
		if (isVote) {// line 130
			p("disabled");// line 130
		} else {// line 130
			p(" btn-success ");// line 130
		}// line 130
		p(" span10  btn-mini \" type=\"button\"\n" +
				"                    isvote=\"");// line 130
		try {
			p(isVote);
		} catch (NullPointerException npe) {
		}// line 131
		p("\">\n" +
				"                ");// line 131
		if (isVote) {// line 132
			p("Thank you for voting!");// line 132
		} else {// line 132
			p("Like");// line 132
		}// line 132
		p("            </button>\n" +
				"\n" +
				"            <button id=\"favorite_btn\" title=\"");// line 132
		if (isFavorite) {// line 135
			p("Cancel favorite?");// line 135
		} else {// line 135
			p("Favorite");// line 135
		}// line 135
		p("\"\n" +
				"                    class=\"btn favorite ");// line 135
		if (isFavorite) {// line 136
			p("favorited");// line 136
		} else {// line 136
			p("unfavorited");// line 136
		}// line 136
		p(" span2 btn-mini\" type=\"button\"\n" +
				"                    isfavorite=\"");// line 136
		try {
			p(isFavorite);
		} catch (NullPointerException npe) {
		}// line 137
		p("\">\n"
				+
				"                &#10084;\n"
				+
				"            </button>\n"
				+
				"\n"
				+
				"        </div>\n"
				+
				"        <div class=\"line6\"></div>\n"
				+
				"        <div class=\"row-fluid border-bottom shadow rounded6\">\n"
				+
				"            <div class=\"span12\">\n"
				+
				"                <div id=\"desc\" class=\"photo_stats border-bottom\">\n"
				+
				"                    ");// line 137
		try {
			p(photo.description);
		} catch (NullPointerException npe) {
		}// line 146
		p("                </div>\n"
				+
				"            </div>\n"
				+
				"            <div class=\"span12\">\n"
				+
				"                <div id=\"tags\" class=\"photo_stats border-bottom\">\n"
				+
				"                    <span>");// line 146
		try {
			p(photo.tags);
		} catch (NullPointerException npe) {
		}// line 151
		p("<i class=\" icon-tags\"></i>tags1 </span><span><i\n"
				+
				"                        class=\" icon-tags\"></i>tags2</span><span><i class=\" icon-tags\"></i>tags3</span>\n"
				+
				"                </div>\n" +
				"            </div>\n" +
				"            <div class=\"span12\">\n" +
				"                <div id=\"exif\" class=\"exif_info \">\n" +
				"                    <ul>\n" +
				"                        ");// line 151
		Set sets = exif.entrySet();// line 158
		for (Object obj : sets) {// line 159
			Entry entry = (Entry) obj;// line 160
			p("                        <li>\n" +
					"                            <small class=\"key\">");// line 160
			try {
				p(entry.getKey());
			} catch (NullPointerException npe) {
			}// line 162
			p("</small>\n" +
					"                            <strong class=\"value\">");// line 162
			try {
				p(entry.getValue());
			} catch (NullPointerException npe) {
			}// line 163
			p("</strong>\n" +
					"                        </li>\n" +
					"                        ");// line 163
		}// line 165
		p("                    </ul>\n"
				+
				"                </div>\n"
				+
				"            </div>\n"
				+
				"        </div>\n"
				+
				"        <div class=\"row-fluid border-bottom shadow rounded6 show_map\">\n"
				+
				"            <div class=\"span12\">\n" +
				"                <div id=\"address\">\n" +
				"\n" +
				"                </div>\n" +
				"            </div>\n" +
				"            <div class=\"span12\">\n" +
				"                <div id=\"map_show_canvas\" lat=\"");// line 165
		try {
			p(photo.GPSLatitude);
		} catch (NullPointerException npe) {
		}// line 177
		p("\" lng=\"");// line 177
		try {
			p(photo.GPSLongitude);
		} catch (NullPointerException npe) {
		}// line 177
		p("\" class=\"show_map\">\n"
				+
				"\n"
				+
				"                </div>\n"
				+
				"            </div>\n"
				+
				"\n"
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
				"</script>\n");// line 177

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy Show Page");
		;
	}

	@Override
	protected void css() {
		p("<script type=\"text/javascript\"\n"
				+
				"        src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDqPLY_onh61yMSw5KSVICJN-B5igbHCTs&sensor=false&language=zh-cn\"></script>\n"
				+
				"<script src=\"");// line 9
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 12
		p("\" type=\"text/javascript\"></script>\n" +
				"<script src=\"");// line 12
		p(lookupStatic("/public/app/show.js"));// line 13
		p("\"></script>\n" +
				"<script src=\"");// line 13
		p(lookupStatic("/public/app/follow.js"));// line 14
		p("\"></script>\n" +
				"<script src=\"");// line 14
		p(lookupStatic("/public/app/comment.js"));// line 15
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
				"</style>\n");// line 15
		;
	}

	@Override
	protected void header() {
		p("Show");
		;
	}
}
