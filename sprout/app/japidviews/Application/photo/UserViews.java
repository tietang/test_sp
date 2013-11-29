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
"<div class=\"grid_row users\">\n" + 
"\n" + 
"    <div class=\"col col_4\">\n" + 
"        <div class=\" card \">\n" + 
"            <div class=\"introduction\">\n" + 
"                个人介绍\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_4\">\n" + 
"\n" + 
"        <div class=\"row-fluid card \">\n" + 
"            <div class=\"span6 affection\">\n" + 
"                <div>\n" + 
"                    <strong>");// line 11, japidviews\Application\photo\UserViews.html
		p(rank.affection);// line 29, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"                </div>\n" + 
"                <div>\n" + 
"                    Affection\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"span6 photo_stats\">\n" + 
"                <ul class=\"stats\">\n" + 
"\n" + 
"                    <li title=\"Views\">\n" + 
"                        <small class=\"faded\">Views</small>\n" + 
"                        <strong>");// line 29, japidviews\Application\photo\UserViews.html
		p(rank.view);// line 40, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"                    </li>\n" + 
"                    <li title=\"Votes\">\n" + 
"                        <small class=\"faded\">Votes</small>\n" + 
"                        <strong>");// line 40, japidviews\Application\photo\UserViews.html
		p(rank.vote);// line 44, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"                    </li>\n" + 
"                    <li title=\"Favorites\">\n" + 
"                        <small class=\"faded\">Favorites</small>\n" + 
"                        <strong>");// line 44, japidviews\Application\photo\UserViews.html
		p(rank.favorite);// line 48, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"                    </li>\n" + 
"                    <li title=\"comments\">\n" + 
"                        <small class=\"faded\">Comments</small>\n" + 
"                        <strong>");// line 48, japidviews\Application\photo\UserViews.html
		p(rank.comment);// line 52, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"                    </li>\n" + 
"\n" + 
"                </ul>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_4\">\n" + 
"        <div class=\" card map \">\n" + 
"            ");// line 52, japidviews\Application\photo\UserViews.html
		String location=user.toLocation();if(location.length()<=6) location="chengdu, China";// line 61, japidviews\Application\photo\UserViews.html
		p("\n" + 
"            <a href=\"http://maps.google.com/maps?spn=0.1,0.1&t=m&z=10&q=");// line 61, japidviews\Application\photo\UserViews.html
		p(location);// line 62, japidviews\Application\photo\UserViews.html
		p("\" target=\"_blank\"> <img\n" + 
"                    alt=\"Staticmap?size=280x100&amp;sensor=false&amp;zoom=6&amp;markers");// line 62, japidviews\Application\photo\UserViews.html
		p(location);// line 63, japidviews\Application\photo\UserViews.html
		p("\"\n" + 
"                    src=\"http://maps.googleapis.com/maps/api/staticmap?size=280x100&amp;sensor=false&amp;zoom=6&amp;markers=");// line 63, japidviews\Application\photo\UserViews.html
		p(location);// line 64, japidviews\Application\photo\UserViews.html
		p("\"/>\n" + 
"            </a>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"col col_4\">\n" + 
"        <div class=\"card\">\n" + 
"            <div class=\"follow\">\n" + 
"                <div>\n" + 
"                    Following (");// line 64, japidviews\Application\photo\UserViews.html
		p(targetCount);// line 73, japidviews\Application\photo\UserViews.html
		p(")\n" + 
"                </div>\n" + 
"                <div class=\"onerow\">\n" + 
"                    ");// line 73, japidviews\Application\photo\UserViews.html
		if(targets!=null){// line 76, japidviews\Application\photo\UserViews.html

                    for(long id: targets){// line 77, japidviews\Application\photo\UserViews.html
		p("\n" + 
"                    <div class=\"col3\"><img class=\"img-rounded\"\n" + 
"                                           src=\"");// line 77, japidviews\Application\photo\UserViews.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(id));// line 79, japidviews\Application\photo\UserViews.html
		p("\">\n" + 
"                    </div>\n" + 
"\n" + 
"                    ");// line 79, japidviews\Application\photo\UserViews.html
		}// line 82, japidviews\Application\photo\UserViews.html

                    }// line 83, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"    <div class=\"col col_4\">\n" + 
"        <div class=\" card  \">\n" + 
"            <div class=\"follow\">\n" + 
"                <div>\n" + 
"                    Followed (");// line 83, japidviews\Application\photo\UserViews.html
		p(sourceCount);// line 94, japidviews\Application\photo\UserViews.html
		p(")\n" + 
"                </div>\n" + 
"                <div class=\"onerow\">\n" + 
"                    ");// line 94, japidviews\Application\photo\UserViews.html
		if(sources!=null){// line 97, japidviews\Application\photo\UserViews.html

                    for(Long id: sources){// line 98, japidviews\Application\photo\UserViews.html
		p("\n" + 
"                    <div class=\"col3\"><img class=\"img-rounded\"\n" + 
"                                           src=\"");// line 98, japidviews\Application\photo\UserViews.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(id));// line 100, japidviews\Application\photo\UserViews.html
		p("\">\n" + 
"                    </div>\n" + 
"\n" + 
"                    ");// line 100, japidviews\Application\photo\UserViews.html
		}// line 103, japidviews\Application\photo\UserViews.html

                    }// line 104, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_4\">\n" + 
"        <div class=\" card camera \">\n" + 
"            <ul>\n" + 
"                ");// line 104, japidviews\Application\photo\UserViews.html
		 if(cameras!=null){// line 113, japidviews\Application\photo\UserViews.html
                Set keys = cameras.keySet();// line 114, japidviews\Application\photo\UserViews.html

                for (Object key : keys) {// line 115, japidviews\Application\photo\UserViews.html

                 Collection cs = cameras.get(key.toString());// line 116, japidviews\Application\photo\UserViews.html

                 String value = null;// line 117, japidviews\Application\photo\UserViews.html

                 for (Object obj : cs) {// line 118, japidviews\Application\photo\UserViews.html

                 Camera camera=(Camera)obj;// line 119, japidviews\Application\photo\UserViews.html

                if (value == null) {// line 120, japidviews\Application\photo\UserViews.html

                 value = camera.equipment;// line 121, japidviews\Application\photo\UserViews.html

                 } else {// line 122, japidviews\Application\photo\UserViews.html

                 value += ", " + camera.equipment;// line 123, japidviews\Application\photo\UserViews.html

                 }// line 124, japidviews\Application\photo\UserViews.html

                 }// line 125, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"                <li>\n" + 
"                    <small class=\"key\">");// line 125, japidviews\Application\photo\UserViews.html
		p(key);// line 128, japidviews\Application\photo\UserViews.html
		p("</small>\n" + 
"                    <strong class=\"value\">");// line 128, japidviews\Application\photo\UserViews.html
		p(value);// line 129, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"                </li>\n" + 
"\n" + 
"                ");// line 129, japidviews\Application\photo\UserViews.html
		}// line 132, japidviews\Application\photo\UserViews.html
                }// line 133, japidviews\Application\photo\UserViews.html
		p("            </ul>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_4\">\n" + 
"        <div class=\"card \">\n" + 
"            <div class=\"feeds\">\n" + 
"                RSS Feeds:\n" + 
"                <div>\n" + 
"                    <a>");// line 133, japidviews\Application\photo\UserViews.html
		p(user.niceName);// line 142, japidviews\Application\photo\UserViews.html
		p("'s Photos</a>\n" + 
"                </div>\n" + 
"                <div>\n" + 
"                    <a>");// line 142, japidviews\Application\photo\UserViews.html
		p(user.niceName);// line 145, japidviews\Application\photo\UserViews.html
		p("'s Favorites</a>\n" + 
"                </div>\n" + 
"                <div>\n" + 
"                    <a>");// line 145, japidviews\Application\photo\UserViews.html
		p(user.niceName);// line 148, japidviews\Application\photo\UserViews.html
		p("'s Stories</a>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"    <div class=\"col col_16 \">\n" + 
"        <div class=\"nav_title\"></div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"<div class=\"grid_row users\">\n" + 
"    <div class=\"col col_2\">\n" + 
"        <img class=\"img-rounded\"\n" + 
"             src=\"");// line 148, japidviews\Application\photo\UserViews.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(user.idUser));// line 161, japidviews\Application\photo\UserViews.html
		p("\"/>\n" + 
"    </div>\n" + 
"    <div class=\"col col_2\">\n" + 
"\n" + 
"        <div class=\"username txt_left\">\n" + 
"            <strong>");// line 161, japidviews\Application\photo\UserViews.html
		p(user.niceName);// line 166, japidviews\Application\photo\UserViews.html
		p("</strong>\n" + 
"        </div>\n" + 
"        <div class=\"introduction txt_left\">\n" + 
"\n" + 
"        </div>\n" + 
"        <div class=\"follow_btn txt_left\">\n" + 
"            <button\n" + 
"                    class=\"follow_btn btn ");// line 166, japidviews\Application\photo\UserViews.html
		if(isFollow){// line 173, japidviews\Application\photo\UserViews.html
		p(" btn-success");// line 173, japidviews\Application\photo\UserViews.html
		}else{// line 173, japidviews\Application\photo\UserViews.html
		p("btn-info");// line 173, japidviews\Application\photo\UserViews.html
		}// line 173, japidviews\Application\photo\UserViews.html
		p(" btn-mini  \"\n" + 
"                    type=\"button\" id=\"follow\" toid=\"");// line 173, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 174, japidviews\Application\photo\UserViews.html
		p("\" isfollow=\"");// line 174, japidviews\Application\photo\UserViews.html
		p(isFollow);// line 174, japidviews\Application\photo\UserViews.html
		p("\">\n" + 
"                ");// line 174, japidviews\Application\photo\UserViews.html
		p(isFollow?"Following":"Follow");// line 175, japidviews\Application\photo\UserViews.html
		p("\n" + 
"            </button>\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"\n" + 
"\n" + 
"    ");// line 175, japidviews\Application\photo\UserViews.html
		Map actions=new HashMap();// line 182, japidviews\Application\photo\UserViews.html

    actions.put(action,"class=\"active\"");// line 183, japidviews\Application\photo\UserViews.html
		p("\n" + 
"    <div class=\"col col_16 \">\n" + 
"        <div class=\"onerow\">\n" + 
"            <div class=\"col10 nav_title  \">\n" + 
"                <ul class=\"nav nav-pills \">\n" + 
"                    <li\n" + 
"                    ");// line 183, japidviews\Application\photo\UserViews.html
		p(actions.get("home"));// line 189, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"                    <a href=\"/to/");// line 189, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 190, japidviews\Application\photo\UserViews.html
		p("/0/home\">Photos</a>\n" + 
"                    </li>\n" + 
"                    <li\n" + 
"                    ");// line 190, japidviews\Application\photo\UserViews.html
		p(actions.get("story"));// line 193, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"                    <a href=\"/to/");// line 193, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 194, japidviews\Application\photo\UserViews.html
		p("/0/story\">Stories</a>\n" + 
"                    </li>\n" + 
"                    <li\n" + 
"                    ");// line 194, japidviews\Application\photo\UserViews.html
		p(actions.get("fav"));// line 197, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"                    <a href=\"/to/");// line 197, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 198, japidviews\Application\photo\UserViews.html
		p("/0/fav\">Favorites</a>\n" + 
"                    </li>\n" + 
"                    <li\n" + 
"                    ");// line 198, japidviews\Application\photo\UserViews.html
		p(actions.get("flow"));// line 201, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"                    <a href=\"/to/");// line 201, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 202, japidviews\Application\photo\UserViews.html
		p("/0/flow\">Flow</a>\n" + 
"                    </li>\n" + 
"                    <li\n" + 
"                    ");// line 202, japidviews\Application\photo\UserViews.html
		p(actions.get("stats"));// line 205, japidviews\Application\photo\UserViews.html
		p(">\n" + 
"                    <a href=\"/to/");// line 205, japidviews\Application\photo\UserViews.html
		p(user.idUser);// line 206, japidviews\Application\photo\UserViews.html
		p("/0/stats\">Statistics</a>\n" + 
"                    </li>\n" + 
"                </ul>\n" + 
"\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    ");// line 206, japidviews\Application\photo\UserViews.html
		String path=request.url;// line 214, japidviews\Application\photo\UserViews.html

    path=path.substring(path.lastIndexOf("/")+1);// line 215, japidviews\Application\photo\UserViews.html
		p("\n" + 
"    <div class=\"  previews\">\n" + 
"        ");// line 215, japidviews\Application\photo\UserViews.html
		for(PhotoShow photo : photos){// line 217, japidviews\Application\photo\UserViews.html
		p("\n" + 
"        <div class=\"col photo_col width_4\">\n" + 
"            <div class=\"photo_preview photo_preview_4\">\n" + 
"                <a href=\"/show/");// line 217, japidviews\Application\photo\UserViews.html
		p(photo.idPhoto);// line 220, japidviews\Application\photo\UserViews.html
		p("_");// line 220, japidviews\Application\photo\UserViews.html
		p(photo.idUser);// line 220, japidviews\Application\photo\UserViews.html
		p("?from=");// line 220, japidviews\Application\photo\UserViews.html
		p(path);// line 220, japidviews\Application\photo\UserViews.html
		p("\" target=\"photo_view\"><img\n" + 
"                        src=\"");// line 220, japidviews\Application\photo\UserViews.html
		p(Path.getJpegDownloadPath(photo.idPhoto,1));// line 221, japidviews\Application\photo\UserViews.html
		p("\"/></a>\n" + 
"\n" + 
"                <div class=\"caption\">\n" + 
"                    <div class=\"title\">\n" + 
"                        <a href=\"/show/");// line 221, japidviews\Application\photo\UserViews.html
		p(photo.idPhoto);// line 225, japidviews\Application\photo\UserViews.html
		p("_");// line 225, japidviews\Application\photo\UserViews.html
		p(photo.idUser);// line 225, japidviews\Application\photo\UserViews.html
		p("?feature=");// line 225, japidviews\Application\photo\UserViews.html
		p(path);// line 225, japidviews\Application\photo\UserViews.html
		p("\" target=\"photo_view\">");// line 225, japidviews\Application\photo\UserViews.html
		p(photo.title);// line 225, japidviews\Application\photo\UserViews.html
		p("</a>\n" + 
"                    </div>\n" + 
"                    <div class=\"score\">\n" + 
"                        ");// line 225, japidviews\Application\photo\UserViews.html
		p(photo.sscore);// line 228, japidviews\Application\photo\UserViews.html
		p("\n" + 
"                    </div>\n" + 
"                </div>\n" + 
"\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        ");// line 228, japidviews\Application\photo\UserViews.html
		}// line 234, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"    </div>\n" + 
"    <div class=\" paging\">\n" + 
"        <div class=\"col col_16 pager pagination-right\">\n" + 
"            <ul>\n" + 
"                <li>\n" + 
"                    <a href=\"");// line 234, japidviews\Application\photo\UserViews.html
		p(pagePath);// line 241, japidviews\Application\photo\UserViews.html
		p("/");// line 241, japidviews\Application\photo\UserViews.html
		p((pageNum-1<=0)?1:(pageNum-1));// line 241, japidviews\Application\photo\UserViews.html
		p("\">Prev</a>\n" + 
"                </li>\n" + 
"                ");// line 241, japidviews\Application\photo\UserViews.html
		if(pageNum>=2){// line 243, japidviews\Application\photo\UserViews.html
		p("\n" + 
"                <li>\n" + 
"                    <a href=\"");// line 243, japidviews\Application\photo\UserViews.html
		p(pagePath);// line 245, japidviews\Application\photo\UserViews.html
		p("/1\">First</a>\n" + 
"                </li>\n" + 
"                ");// line 245, japidviews\Application\photo\UserViews.html
		}// line 247, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"                <!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n" + 
"                <li><a href=\"#\">2</a></li>\n" + 
"                <li><a href=\"#\">3</a></li>\n" + 
"                <li><a href=\"#\">4</a></li>\n" + 
"                <li><a href=\"#\">5</a></li>-->\n" + 
"                ");// line 247, japidviews\Application\photo\UserViews.html
		if(photos.size()>=20){// line 254, japidviews\Application\photo\UserViews.html
		p("\n" + 
"                <li>\n" + 
"                    <a href=\"");// line 254, japidviews\Application\photo\UserViews.html
		p(pagePath);// line 256, japidviews\Application\photo\UserViews.html
		p("/");// line 256, japidviews\Application\photo\UserViews.html
		p(photos.size()<20?pageNum:(pageNum+1));// line 256, japidviews\Application\photo\UserViews.html
		p("\">Next</a>\n" + 
"                </li>\n" + 
"                ");// line 256, japidviews\Application\photo\UserViews.html
		}// line 258, japidviews\Application\photo\UserViews.html
		p("\n" + 
"\n" + 
"            </ul>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"</div>\n" + 
"\n");// line 258, japidviews\Application\photo\UserViews.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Your Page");;
	}
	@Override protected void css() {
		// line 9, japidviews\Application\photo\UserViews.html
		p(" <script src=\"");// line 9, japidviews\Application\photo\UserViews.html
		p(lookupStatic("/public/app/follow.js"));// line 10, japidviews\Application\photo\UserViews.html
		p("\"></script>\n" + 
" ");// line 10, japidviews\Application\photo\UserViews.html
		;
	}
	@Override protected void header() {
		p( "Yours");;
	}
}