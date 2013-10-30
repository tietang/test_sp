//version: 0.9.35
package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.*;
import com.google.common.collect.ListMultimap;
import java.util.Set;import fengfei.ucm.entity.photo.*;import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import static japidviews._javatags.Pic.*;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/photo/UserViews.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class UserViews extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/UserViews.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
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
	public static final String[] argNames = new String[] {/* args of the template*/"pagePath", "photos", "pageNum", "user", "targets", "sources", "targetCount", "sourceCount", "rank", "cameras", "isFollow", "action",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<? extends PhotoShow>", "int", "User", "List<Long>", "List<Long>", "int", "int", "Rank", "ListMultimap<String, Camera>", "boolean", "String",  };
	public static final Object[] argDefaults= new Object[] {null,null,null,null,null,null,null,null,null,null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.UserViews.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String pagePath; // line 6, japidviews/Application/photo/UserViews.html
	private List<? extends PhotoShow> photos; // line 6, japidviews/Application/photo/UserViews.html
	private int pageNum; // line 6, japidviews/Application/photo/UserViews.html
	private User user; // line 6, japidviews/Application/photo/UserViews.html
	private List<Long> targets; // line 6, japidviews/Application/photo/UserViews.html
	private List<Long> sources; // line 6, japidviews/Application/photo/UserViews.html
	private int targetCount; // line 6, japidviews/Application/photo/UserViews.html
	private int sourceCount; // line 6, japidviews/Application/photo/UserViews.html
	private Rank rank; // line 6, japidviews/Application/photo/UserViews.html
	private ListMultimap<String, Camera> cameras; // line 6, japidviews/Application/photo/UserViews.html
	private boolean isFollow; // line 6, japidviews/Application/photo/UserViews.html
	private String action; // line 6, japidviews/Application/photo/UserViews.html
	public cn.bran.japid.template.RenderResult render(String pagePath,List<? extends PhotoShow> photos,int pageNum,User user,List<Long> targets,List<Long> sources,int targetCount,int sourceCount,Rank rank,ListMultimap<String, Camera> cameras,boolean isFollow,String action) {
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
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 6, japidviews/Application/photo/UserViews.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String pagePath,List<? extends PhotoShow> photos,int pageNum,User user,List<Long> targets,List<Long> sources,int targetCount,int sourceCount,Rank rank,ListMultimap<String, Camera> cameras,boolean isFollow,String action) {
		return new UserViews().render(pagePath, photos, pageNum, user, targets, sources, targetCount, sourceCount, rank, cameras, isFollow, action);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\UserViews.html

// line 9, japidviews\Application\photo\UserViews.html
		p("</pre>\n" + 
"\n" + 
"\n" + 
"<div class=\"grid_row users\">\n" + 
"	<div class=\"col col_4\">\n" + 
"		<div class=\"row-fluid card \"  >\n" + 
"			<div class=\"span6\">\n" + 
"				<img  class=\"img-rounded\"\n" + 
"				src=\"");// line 11, japidviews\Application\photo\UserViews.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(user.idUser));// line 20, japidviews\Application\photo\UserViews.html
		p("\">\n" + 
"			</div>\n" + 
"			<div class=\"span6\">\n" + 
"				<div class=\" \">\n" + 
"					<div>\n" + 
"						<strong>");// line 20, japidviews\Application\photo\UserViews.html
		p(user.niceName);// line 25, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"					</div>\n" + 
"					<div>\n" + 
"						<button\n" + 
"						class=\"follow_btn btn ");// line 25, japidviews\Application\photo\UserViews.html
		if(isFollow){// line 29, japidviews\Application\photo\UserViews.html
		p(" btn-success");// line 29, japidviews\Application\photo\UserViews.html
		}else{// line 29, japidviews\Application\photo\UserViews.html
		p("btn-info");// line 29, japidviews\Application\photo\UserViews.html
		}// line 29, japidviews\Application\photo\UserViews.html
		p(" btn-mini  \"\n" + 
"						type=\"button\" id=\"follow\" toid=\"");// line 29, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 30, japidviews\Application\photo\UserViews.html
		p("\" isfollow=\"");// line 30, japidviews\Application\photo\UserViews.html
		p(isFollow);// line 30, japidviews\Application\photo\UserViews.html
		p("\">\n" + 
"							");// line 30, japidviews\Application\photo\UserViews.html
		p(isFollow?"Following":"Follow");// line 31, japidviews\Application\photo\UserViews.html
		p("\n" + 
"						</button>\n" + 
"						<!--<a href=\"/settings/profile\" class=\"btn btn-small\">Edit profile</a>-->\n" + 
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
"					<strong>");// line 31, japidviews\Application\photo\UserViews.html
		p(rank.affection);// line 53, japidviews\Application\photo\UserViews.html
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
"						<small class=\"faded\">Views</small><strong>");// line 53, japidviews\Application\photo\UserViews.html
		p(rank.view);// line 63, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"Votes\">\n" + 
"						<small class=\"faded\">Votes</small><strong>");// line 63, japidviews\Application\photo\UserViews.html
		p(rank.vote);// line 66, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"Favorites\">\n" + 
"						<small class=\"faded\">Favorites</small><strong>");// line 66, japidviews\Application\photo\UserViews.html
		p(rank.favorite);// line 69, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"comments\">\n" + 
"						<small class=\"faded\">Comments</small><strong>");// line 69, japidviews\Application\photo\UserViews.html
		p(rank.comment);// line 72, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"					</li>\n" + 
"\n" + 
"				</ul>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div class=\"col col_4\">\n" + 
"		<div class=\" card map \"  >\n" + 
"			");// line 72, japidviews\Application\photo\UserViews.html
		String location=user.toLocation();if(location.length()<=6) location="chengdu, China";// line 81, japidviews\Application\photo\UserViews.html
		p("\n" + 
"			<a href=\"http://maps.google.com/maps?spn=0.1,0.1&t=m&z=10&q=");// line 81, japidviews\Application\photo\UserViews.html
		p(location);// line 82, japidviews\Application\photo\UserViews.html
		p("\" target=\"_blank\"> <img alt=\"Staticmap?size=280x100&amp;sensor=false&amp;zoom=6&amp;markers");// line 82, japidviews\Application\photo\UserViews.html
		p(location);// line 82, japidviews\Application\photo\UserViews.html
		p("\" src=\"http://maps.googleapis.com/maps/api/staticmap?size=280x100&amp;sensor=false&amp;zoom=6&amp;markers=");// line 82, japidviews\Application\photo\UserViews.html
		p(location);// line 82, japidviews\Application\photo\UserViews.html
		p("\" /> </a>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"\n" + 
"	<div class=\"col col_4\">\n" + 
"		<div class=\"card\">\n" + 
"			<div class=\"follow\">\n" + 
"				<div>\n" + 
"					Following (");// line 82, japidviews\Application\photo\UserViews.html
		p(targetCount);// line 90, japidviews\Application\photo\UserViews.html
		p(")\n" + 
"				</div>\n" + 
"				<div class=\"onerow\">\n" + 
"					");// line 90, japidviews\Application\photo\UserViews.html
		if(targets!=null){// line 93, japidviews\Application\photo\UserViews.html

					for(long id: targets){// line 94, japidviews\Application\photo\UserViews.html
		p("\n" + 
"					<div class=\"col3\"><img class=\"img-rounded\"\n" + 
"						src=\"");// line 94, japidviews\Application\photo\UserViews.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(id));// line 96, japidviews\Application\photo\UserViews.html
		p("\">\n" + 
"					</div>\n" + 
"\n" + 
"					");// line 96, japidviews\Application\photo\UserViews.html
		}// line 99, japidviews\Application\photo\UserViews.html

					}// line 100, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"	<div class=\"col col_4\">\n" + 
"		<div class=\" card  \">\n" + 
"			<div class=\"follow\">\n" + 
"				<div>\n" + 
"					Followed (");// line 100, japidviews\Application\photo\UserViews.html
		p(sourceCount);// line 111, japidviews\Application\photo\UserViews.html
		p(")\n" + 
"				</div>\n" + 
"				<div class=\"onerow\">\n" + 
"					");// line 111, japidviews\Application\photo\UserViews.html
		if(sources!=null){// line 114, japidviews\Application\photo\UserViews.html

					for(Long id: sources){// line 115, japidviews\Application\photo\UserViews.html
		p("\n" + 
"					<div class=\"col3\"><img class=\"img-rounded\"\n" + 
"						src=\"");// line 115, japidviews\Application\photo\UserViews.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(id));// line 117, japidviews\Application\photo\UserViews.html
		p("\">\n" + 
"					</div>\n" + 
"\n" + 
"					");// line 117, japidviews\Application\photo\UserViews.html
		}// line 120, japidviews\Application\photo\UserViews.html

					}// line 121, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div class=\"col col_4\">\n" + 
"		<div class=\" card camera \"  >\n" + 
"			<ul>\n" + 
"				");// line 121, japidviews\Application\photo\UserViews.html
		 if(cameras!=null){// line 130, japidviews\Application\photo\UserViews.html
				Set	keys = cameras.keySet();// line 131, japidviews\Application\photo\UserViews.html

				for (Object key : keys) {// line 132, japidviews\Application\photo\UserViews.html

					Collection	cs = cameras.get(key.toString());// line 133, japidviews\Application\photo\UserViews.html

					String value = null;// line 134, japidviews\Application\photo\UserViews.html

					for (Object obj : cs) {// line 135, japidviews\Application\photo\UserViews.html

						Camera camera=(Camera)obj;// line 136, japidviews\Application\photo\UserViews.html

				if (value == null) {// line 137, japidviews\Application\photo\UserViews.html

							value = camera.equipment;// line 138, japidviews\Application\photo\UserViews.html

						} else {// line 139, japidviews\Application\photo\UserViews.html

							value += ", " + camera.equipment;// line 140, japidviews\Application\photo\UserViews.html

						}// line 141, japidviews\Application\photo\UserViews.html

					}// line 142, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"				<li>\n" + 
"					<small class=\"key\">");// line 142, japidviews\Application\photo\UserViews.html
		p(key);// line 145, japidviews\Application\photo\UserViews.html
		p("</small><strong class=\"value\">");// line 145, japidviews\Application\photo\UserViews.html
		p(value);// line 145, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"				</li>\n" + 
"\n" + 
"				");// line 145, japidviews\Application\photo\UserViews.html
		}// line 148, japidviews\Application\photo\UserViews.html
				}// line 149, japidviews\Application\photo\UserViews.html
		p("			</ul>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div class=\"col col_4\">\n" + 
"		<div class=\"card \">\n" + 
"			<div class=\"feeds\">\n" + 
"				RSS Feeds:\n" + 
"				<div>\n" + 
"					<a>");// line 149, japidviews\Application\photo\UserViews.html
		p(user.niceName);// line 158, japidviews\Application\photo\UserViews.html
		p("'s Photos</a>\n" + 
"				</div>\n" + 
"				<div>\n" + 
"					<a>");// line 158, japidviews\Application\photo\UserViews.html
		p(user.niceName);// line 161, japidviews\Application\photo\UserViews.html
		p("'s Favorites</a>\n" + 
"				</div>\n" + 
"				<div>\n" + 
"					<a>");// line 161, japidviews\Application\photo\UserViews.html
		p(user.niceName);// line 164, japidviews\Application\photo\UserViews.html
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
"	");// line 164, japidviews\Application\photo\UserViews.html
		Map actions=new HashMap();// line 174, japidviews\Application\photo\UserViews.html

	actions.put(action,"class=\"active\"");// line 175, japidviews\Application\photo\UserViews.html
		p("\n" + 
"	<div class=\"col col_16 \">\n" + 
"		<div class=\"onerow\" >\n" + 
"			<div class=\"col10 nav_title  \" >\n" + 
"				<ul class=\"nav nav-pills \">\n" + 
"					<li ");// line 175, japidviews\Application\photo\UserViews.html
		p(actions.get("home"));// line 180, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"						<a href=\"/to/");// line 180, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 181, japidviews\Application\photo\UserViews.html
		p("/0/home\">Photos</a>\n" + 
"					</li>\n" + 
"					<li  ");// line 181, japidviews\Application\photo\UserViews.html
		p(actions.get("story"));// line 183, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"						<a href=\"/to/");// line 183, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 184, japidviews\Application\photo\UserViews.html
		p("/0/story\">Stories</a>\n" + 
"					</li>\n" + 
"					<li ");// line 184, japidviews\Application\photo\UserViews.html
		p(actions.get("fav"));// line 186, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"						<a href=\"/to/");// line 186, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 187, japidviews\Application\photo\UserViews.html
		p("/0/fav\">Favorites</a>\n" + 
"					</li>\n" + 
"					<li ");// line 187, japidviews\Application\photo\UserViews.html
		p(actions.get("flow"));// line 189, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"						<a href=\"/to/");// line 189, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 190, japidviews\Application\photo\UserViews.html
		p("/0/flow\">Flow</a>\n" + 
"					</li>\n" + 
"					<li ");// line 190, japidviews\Application\photo\UserViews.html
		p(actions.get("stats"));// line 192, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"						<a href=\"/to/");// line 192, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 193, japidviews\Application\photo\UserViews.html
		p("/0/stats\">Statistics</a>\n" + 
"					</li>\n" + 
"				</ul>\n" + 
"\n" + 
"			</div>\n" + 
"\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	");// line 193, japidviews\Application\photo\UserViews.html
		String path=request.url;// line 201, japidviews\Application\photo\UserViews.html

	path=path.substring(path.lastIndexOf("/")+1);// line 202, japidviews\Application\photo\UserViews.html
		p("\n" + 
"	<div class=\"  previews\">\n" + 
"		");// line 202, japidviews\Application\photo\UserViews.html
		for(PhotoShow photo : photos){// line 204, japidviews\Application\photo\UserViews.html
		p("\n" + 
"		<div class=\"col photo_col width_4\">\n" + 
"			<div class=\"photo_preview photo_preview_4\" >\n" + 
"				<a href=\"/show/");// line 204, japidviews\Application\photo\UserViews.html
		p(photo.idPhoto);// line 207, japidviews\Application\photo\UserViews.html
		p("_");// line 207, japidviews\Application\photo\UserViews.html
		p(photo.idUser);// line 207, japidviews\Application\photo\UserViews.html
		p("?from=");// line 207, japidviews\Application\photo\UserViews.html
		p(path);// line 207, japidviews\Application\photo\UserViews.html
		p("\" target=\"photo_view\" ><img src=\"");// line 207, japidviews\Application\photo\UserViews.html
		p(Path.getJpegDownloadPath(photo.idPhoto,1));// line 207, japidviews\Application\photo\UserViews.html
		p("\" /></a>\n" + 
"				<div class=\"caption\">\n" + 
"					<div class=\"title\">\n" + 
"						<a href=\"/show/");// line 207, japidviews\Application\photo\UserViews.html
		p(photo.idPhoto);// line 210, japidviews\Application\photo\UserViews.html
		p("_");// line 210, japidviews\Application\photo\UserViews.html
		p(photo.idUser);// line 210, japidviews\Application\photo\UserViews.html
		p("?feature=");// line 210, japidviews\Application\photo\UserViews.html
		p(path);// line 210, japidviews\Application\photo\UserViews.html
		p("\" target=\"photo_view\" >");// line 210, japidviews\Application\photo\UserViews.html
		p(photo.title);// line 210, japidviews\Application\photo\UserViews.html
		p("</a>\n" + 
"					</div>\n" + 
"					<div class=\"score\">\n" + 
"						");// line 210, japidviews\Application\photo\UserViews.html
		p(photo.sscore);// line 213, japidviews\Application\photo\UserViews.html
		p("\n" + 
"					</div>\n" + 
"				</div>\n" + 
"\n" + 
"			</div>\n" + 
"		</div>\n" + 
"		");// line 213, japidviews\Application\photo\UserViews.html
		}// line 219, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"	</div>\n" + 
"	<div class=\" paging\">\n" + 
"		<div class=\"col col_16 pager pagination-right\">\n" + 
"			<ul>\n" + 
"				<li>\n" + 
"					<a href=\"");// line 219, japidviews\Application\photo\UserViews.html
		p(pagePath);// line 226, japidviews\Application\photo\UserViews.html
		p("/");// line 226, japidviews\Application\photo\UserViews.html
		p((pageNum-1<=0)?1:(pageNum-1));// line 226, japidviews\Application\photo\UserViews.html
		p("\">Prev</a>\n" + 
"				</li>\n" + 
"				");// line 226, japidviews\Application\photo\UserViews.html
		if(pageNum>=2){// line 228, japidviews\Application\photo\UserViews.html
		p("\n" + 
"				<li >\n" + 
"					<a href=\"");// line 228, japidviews\Application\photo\UserViews.html
		p(pagePath);// line 230, japidviews\Application\photo\UserViews.html
		p("/1\">First</a>\n" + 
"				</li>");// line 230, japidviews\Application\photo\UserViews.html
		}// line 231, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"				<!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n" + 
"				<li><a href=\"#\">2</a></li>\n" + 
"				<li><a href=\"#\">3</a></li>\n" + 
"				<li><a href=\"#\">4</a></li>\n" + 
"				<li><a href=\"#\">5</a></li>-->\n" + 
"				");// line 231, japidviews\Application\photo\UserViews.html
		if(photos.size()>=20){// line 238, japidviews\Application\photo\UserViews.html
		p("\n" + 
"				<li>\n" + 
"					<a href=\"");// line 238, japidviews\Application\photo\UserViews.html
		p(pagePath);// line 240, japidviews\Application\photo\UserViews.html
		p("/");// line 240, japidviews\Application\photo\UserViews.html
		p(photos.size()<20?pageNum:(pageNum+1));// line 240, japidviews\Application\photo\UserViews.html
		p("\" >Next</a>\n" + 
"				</li>");// line 240, japidviews\Application\photo\UserViews.html
		}// line 241, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"			</ul>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"\n" + 
"</div>\n" + 
"\n");// line 241, japidviews\Application\photo\UserViews.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Your Page");;
	}
	@Override protected void css() {
		// line 9, japidviews\Application\photo\UserViews.html
		p("<script src=\"");// line 9, japidviews\Application\photo\UserViews.html
		p(lookupStatic("/public/app/follow.js"));// line 10, japidviews\Application\photo\UserViews.html
		p("\"></script>\n");// line 10, japidviews\Application\photo\UserViews.html
		;
	}
	@Override protected void header() {
		p( "Yours");;
	}
}