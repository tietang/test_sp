package japidviews.Application.photo;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.*;
import com.google.common.collect.ListMultimap;
import java.util.Set;
import fengfei.ucm.entity.photo.*;
import fengfei.fir.utils.Path;
import fengfei.fir.model.PhotoShow;
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
// NOTE: This file was generated from: japidviews/Application/photo/UserViews.html
// Change to this file will be lost next time the template file is compiled.
//

public class UserViews extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/UserViews.html";
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

	public UserViews() {
		super(null);
	}

	public UserViews(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"pagePath", "photos", "pageNum", "user", "targets", "sources",
			"targetCount", "sourceCount", "rank", "cameras", "isFollow",
			"action", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"String", "List<? extends PhotoShow>", "int", "User", "List<Long>",
			"List<Long>", "int", "int", "Rank", "ListMultimap<String, Camera>",
			"boolean", "String", };
	public static final Object[] argDefaults = new Object[] { null, null, null,
			null, null, null, null, null, null, null, null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.UserViews.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private String pagePath; // line 6
	private List<? extends PhotoShow> photos; // line 6
	private int pageNum; // line 6
	private User user; // line 6
	private List<Long> targets; // line 6
	private List<Long> sources; // line 6
	private int targetCount; // line 6
	private int sourceCount; // line 6
	private Rank rank; // line 6
	private ListMultimap<String, Camera> cameras; // line 6
	private boolean isFollow; // line 6
	private String action; // line 6

	public cn.bran.japid.template.RenderResult render(String pagePath,
			List<? extends PhotoShow> photos, int pageNum, User user,
			List<Long> targets, List<Long> sources, int targetCount,
			int sourceCount, Rank rank, ListMultimap<String, Camera> cameras,
			boolean isFollow, String action) {
		this.pagePath = pagePath;
		this.photos = photos;
		this.pageNum = pageNum;
		this.user = user;
		this.targets = targets;
		this.sources = sources;
		this.targetCount = targetCount;
		this.sourceCount = sourceCount;
		this.rank = rank;
		this.cameras = cameras;
		this.isFollow = isFollow;
		this.action = action;
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
		p("<pre style=\"display: none\">\n");// line 1
		p("</pre>\n" +
				"\n" +
				"\n" +
				"<div class=\"grid_row users\">\n" +
				"	<div class=\"col col_4\">\n" +
				"		<div class=\"row-fluid card \"  >\n" +
				"			<div class=\"span6\">\n" +
				"				<img  class=\"img-rounded\"\n" +
				"				src=\"");// line 11
		p(fengfei.spruce.utils.PhotoPathUtils
				.getUserPhotoDownloadPath(user.idUser));// line 20
		p("\">\n" +
				"			</div>\n" +
				"			<div class=\"span6\">\n" +
				"				<div class=\" \">\n" +
				"					<div>\n" +
				"						<strong>");// line 20
		p(user.niceName);// line 25
		p("</strong>\n" +
				"					</div>\n" +
				"					<div>\n" +
				"						<button\n" +
				"						class=\"follow_btn btn ");// line 25
		if (isFollow) {// line 29
			p(" btn-success");// line 29
		} else {// line 29
			p("btn-info");// line 29
		}// line 29
		p(" btn-mini  \"\n" +
				"						type=\"button\" id=\"follow\" toid=\"");// line 29
		p(user.idUser);// line 30
		p("\" isfollow=\"");// line 30
		p(isFollow);// line 30
		p("\">\n" +
				"							");// line 30
		p(isFollow ? "Following" : "Follow");// line 31
		p("						</button>\n"
				+
				"						<!--<a href=\"/settings/profile\" class=\"btn btn-small\">Edit Profile</a>-->\n"
				+
				"					</div>\n" +
				"				</div>\n" +
				"			</div>\n" +
				"\n" +
				"		</div>\n" +
				"	</div>\n" +
				"	<div class=\"col col_4\">\n" +
				"		<div class=\" card \"  >\n" +
				"			<div class=\"introduction\">\n" +
				"				个人介绍\n" +
				"			</div>\n" +
				"\n" +
				"		</div>\n" +
				"	</div>\n" +
				"	<div class=\"col col_4\">\n" +
				"\n" +
				"		<div class=\"row-fluid card \">\n" +
				"			<div class=\"span6 affection\">\n" +
				"				<div>\n" +
				"					<strong>");// line 31
		p(rank.affection);// line 53
		p("</strong>\n" +
				"				</div>\n" +
				"				<div>\n" +
				"					Affection\n" +
				"				</div>\n" +
				"			</div>\n" +
				"			<div class=\"span6 photo_stats\">\n" +
				"				<ul class=\"stats\">\n" +
				"\n" +
				"					<li title=\"Views\">\n" +
				"						<small class=\"faded\">Views</small><strong>");// line 53
		p(rank.view);// line 63
		p("</strong>\n" +
				"					</li>\n" +
				"					<li title=\"Votes\">\n" +
				"						<small class=\"faded\">Votes</small><strong>");// line 63
		p(rank.vote);// line 66
		p("</strong>\n" +
				"					</li>\n" +
				"					<li title=\"Favorites\">\n" +
				"						<small class=\"faded\">Favorites</small><strong>");// line 66
		p(rank.favorite);// line 69
		p("</strong>\n" +
				"					</li>\n" +
				"					<li title=\"comments\">\n" +
				"						<small class=\"faded\">Comments</small><strong>");// line 69
		p(rank.comment);// line 72
		p("</strong>\n" +
				"					</li>\n" +
				"\n" +
				"				</ul>\n" +
				"			</div>\n" +
				"		</div>\n" +
				"	</div>\n" +
				"	<div class=\"col col_4\">\n" +
				"		<div class=\" card map \"  >\n" +
				"			");// line 72
		String location = user.toLocation();
		if (location.length() <= 6)
			location = "chengdu, China";// line 81
		p("			<a href=\"http://maps.google.com/maps?spn=0.1,0.1&t=m&z=10&q=");// line 81
		p(location);// line 82
		p("\" target=\"_blank\"> <img alt=\"Staticmap?size=280x100&amp;sensor=false&amp;zoom=6&amp;markers");// line 82
		p(location);// line 82
		p("\" src=\"http://maps.googleapis.com/maps/api/staticmap?size=280x100&amp;sensor=false&amp;zoom=6&amp;markers=");// line 82
		p(location);// line 82
		p("\" /> </a>\n" +
				"		</div>\n" +
				"	</div>\n" +
				"\n" +
				"	<div class=\"col col_4\">\n" +
				"		<div class=\"card\">\n" +
				"			<div class=\"follow\">\n" +
				"				<div>\n" +
				"					Following (");// line 82
		p(targetCount);// line 90
		p(")\n" +
				"				</div>\n" +
				"				<div class=\"onerow\">\n" +
				"					");// line 90
		if (targets != null) {// line 93
			for (long id : targets) {// line 94
				p("					<div class=\"col3\"><img class=\"img-rounded\"\n" +
						"						src=\"");// line 94
				p(fengfei.spruce.utils.PhotoPathUtils
						.getUserPhotoDownloadPath(id));// line 96
				p("\">\n" +
						"					</div>\n" +
						"\n" +
						"					");// line 96
			}// line 99
		}// line 100
		p("\n" +
				"				</div>\n" +
				"			</div>\n" +
				"		</div>\n" +
				"\n" +
				"	</div>\n" +
				"	<div class=\"col col_4\">\n" +
				"		<div class=\" card  \">\n" +
				"			<div class=\"follow\">\n" +
				"				<div>\n" +
				"					Followed (");// line 100
		p(sourceCount);// line 111
		p(")\n" +
				"				</div>\n" +
				"				<div class=\"onerow\">\n" +
				"					");// line 111
		if (sources != null) {// line 114
			for (Long id : sources) {// line 115
				p("					<div class=\"col3\"><img class=\"img-rounded\"\n" +
						"						src=\"");// line 115
				p(fengfei.spruce.utils.PhotoPathUtils
						.getUserPhotoDownloadPath(id));// line 117
				p("\">\n" +
						"					</div>\n" +
						"\n" +
						"					");// line 117
			}// line 120
		}// line 121
		p("\n" +
				"				</div>\n" +
				"			</div>\n" +
				"		</div>\n" +
				"	</div>\n" +
				"	<div class=\"col col_4\">\n" +
				"		<div class=\" card camera \"  >\n" +
				"			<ul>\n" +
				"				");// line 121
		if (cameras != null) {// line 130
			Set keys = cameras.keySet();// line 131
			for (Object key : keys) {// line 132
				Collection cs = cameras.get(key.toString());// line 133
				String value = null;// line 134
				for (Object obj : cs) {// line 135
					Camera camera = (Camera) obj;// line 136
					if (value == null) {// line 137
						value = camera.equipment;// line 138
					} else {// line 139
						value += ", " + camera.equipment;// line 140
					}// line 141
				}// line 142
				p("\n" +
						"				<li>\n" +
						"					<small class=\"key\">");// line 142
				p(key);// line 145
				p("</small><strong class=\"value\">");// line 145
				p(value);// line 145
				p("</strong>\n" +
						"				</li>\n" +
						"\n" +
						"				");// line 145
			}// line 148
		}// line 149
		p("			</ul>\n" +
				"		</div>\n" +
				"	</div>\n" +
				"	<div class=\"col col_4\">\n" +
				"		<div class=\"card \">\n" +
				"			<div class=\"feeds\">\n" +
				"				RSS Feeds:\n" +
				"				<div>\n" +
				"					<a>");// line 149
		p(user.niceName);// line 158
		p("'s Photos</a>\n" +
				"				</div>\n" +
				"				<div>\n" +
				"					<a>");// line 158
		p(user.niceName);// line 161
		p("'s Favorites</a>\n" +
				"				</div>\n" +
				"				<div>\n" +
				"					<a>");// line 161
		p(user.niceName);// line 164
		p("'s Stories</a>\n" +
				"				</div>\n" +
				"			</div>\n" +
				"		</div>\n" +
				"\n" +
				"	</div>\n" +
				"	<div class=\"col col_16 \">\n" +
				"		<div class=\"nav_title\"></div>\n" +
				"\n" +
				"	</div>\n" +
				"	");// line 164
		Map actions = new HashMap();// line 174
		actions.put(action, "class=\"active\"");// line 175
		p("	<div class=\"col col_16 \">\n" +
				"		<div class=\"onerow\" >\n" +
				"			<div class=\"col10 nav_title  \" >\n" +
				"				<ul class=\"nav nav-pills \">\n" +
				"					<li ");// line 175
		p(actions.get("home"));// line 180
		p(">\n" +
				"						<a href=\"/to/");// line 180
		p(user.idUser);// line 181
		p("/0/home\">Photos</a>\n" +
				"					</li>\n" +
				"					<li  ");// line 181
		p(actions.get("story"));// line 183
		p(">\n" +
				"						<a href=\"/to/");// line 183
		p(user.idUser);// line 184
		p("/0/story\">Stories</a>\n" +
				"					</li>\n" +
				"					<li ");// line 184
		p(actions.get("fav"));// line 186
		p(">\n" +
				"						<a href=\"/to/");// line 186
		p(user.idUser);// line 187
		p("/0/fav\">Favorites</a>\n" +
				"					</li>\n" +
				"					<li ");// line 187
		p(actions.get("flow"));// line 189
		p(">\n" +
				"						<a href=\"/to/");// line 189
		p(user.idUser);// line 190
		p("/0/flow\">Flow</a>\n" +
				"					</li>\n" +
				"					<li ");// line 190
		p(actions.get("stats"));// line 192
		p(">\n" +
				"						<a href=\"/to/");// line 192
		p(user.idUser);// line 193
		p("/0/stats\">Statistics</a>\n" +
				"					</li>\n" +
				"				</ul>\n" +
				"\n" +
				"			</div>\n" +
				"\n" +
				"		</div>\n" +
				"	</div>\n" +
				"	");// line 193
		String path = request.url;// line 201
		path = path.substring(path.lastIndexOf("/") + 1);// line 202
		p("	<div class=\"  previews\">\n" +
				"		");// line 202
		for (PhotoShow photo : photos) {// line 204
			p("		<div class=\"col photo_col width_4\">\n" +
					"			<div class=\"photo_preview photo_preview_4\" >\n" +
					"				<a href=\"/show/");// line 204
			p(photo.idPhoto);// line 207
			p("_");// line 207
			p(photo.idUser);// line 207
			p("?from=");// line 207
			p(path);// line 207
			p("\" target=\"photo_view\" ><img src=\"");// line 207
			p(Path.getJpegDownloadPath(photo.idPhoto, 1));// line 207
			p("\" /></a>\n" +
					"				<div class=\"caption\">\n" +
					"					<div class=\"title\">\n" +
					"						<a href=\"/show/");// line 207
			p(photo.idPhoto);// line 210
			p("_");// line 210
			p(photo.idUser);// line 210
			p("?feature=");// line 210
			p(path);// line 210
			p("\" target=\"photo_view\" >");// line 210
			p(photo.title);// line 210
			p("</a>\n" +
					"					</div>\n" +
					"					<div class=\"score\">\n" +
					"						");// line 210
			p(photo.sscore);// line 213
			p("					</div>\n" +
					"				</div>\n" +
					"\n" +
					"			</div>\n" +
					"		</div>\n" +
					"		");// line 213
		}// line 219
		p("\n" +
				"	</div>\n" +
				"	<div class=\" paging\">\n" +
				"		<div class=\"col col_16 pager pagination-right\">\n" +
				"			<ul>\n" +
				"				<li>\n" +
				"					<a href=\"");// line 219
		p(pagePath);// line 226
		p("/");// line 226
		p((pageNum - 1 <= 0) ? 1 : (pageNum - 1));// line 226
		p("\">Prev</a>\n" +
				"				</li>\n" +
				"				");// line 226
		if (pageNum >= 2) {// line 228
			p("				<li >\n" +
					"					<a href=\"");// line 228
			p(pagePath);// line 230
			p("/1\">First</a>\n" +
					"				</li>");// line 230
		}// line 231
		p("\n" +
				"				<!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n" +
				"				<li><a href=\"#\">2</a></li>\n" +
				"				<li><a href=\"#\">3</a></li>\n" +
				"				<li><a href=\"#\">4</a></li>\n" +
				"				<li><a href=\"#\">5</a></li>-->\n" +
				"				");// line 231
		if (photos.size() >= 20) {// line 238
			p("				<li>\n" +
					"					<a href=\"");// line 238
			p(pagePath);// line 240
			p("/");// line 240
			p(photos.size() < 20 ? pageNum : (pageNum + 1));// line 240
			p("\" >Next</a>\n" +
					"				</li>");// line 240
		}// line 241
		p("\n" +
				"			</ul>\n" +
				"		</div>\n" +
				"	</div>\n" +
				"\n" +
				"</div>\n" +
				"\n");// line 241

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy Your Page");
		;
	}

	@Override
	protected void css() {
		p("<script src=\"");// line 9
		p(lookupStatic("/public/app/follow.js"));// line 10
		p("\"></script>\n");// line 10
		;
	}

	@Override
	protected void header() {
		p("Yours");
		;
	}
}
