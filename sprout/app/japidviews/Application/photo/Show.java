package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.photo.*;import fengfei.fir.utils.Path;import java.util.*;import java.util.Map.Entry;
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
// NOTE: This file was generated from: japidviews/Application/photo/Show.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Show extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Show.html";
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


	public Show() {
		super(null);
	}
	public Show(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"photo", "rank", "exif", "isFollow", "isFavorite", "isVote",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Photo", "Rank", "Map", "boolean", "boolean", "boolean",  };
	public static final Object[] argDefaults= new Object[] {null,null,null,null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Show.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Photo photo; // line 4, japidviews/Application/photo/Show.html
	private Rank rank; // line 4, japidviews/Application/photo/Show.html
	private Map exif; // line 4, japidviews/Application/photo/Show.html
	private boolean isFollow; // line 4, japidviews/Application/photo/Show.html
	private boolean isFavorite; // line 4, japidviews/Application/photo/Show.html
	private boolean isVote; // line 4, japidviews/Application/photo/Show.html
	public cn.bran.japid.template.RenderResult render(Photo photo,Rank rank,Map exif,boolean isFollow,boolean isFavorite,boolean isVote) {
		this.photo = photo;
		this.rank = rank;
		this.exif = exif;
		this.isFollow = isFollow;
		this.isFavorite = isFavorite;
		this.isVote = isVote;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 4, japidviews/Application/photo/Show.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Photo photo,Rank rank,Map exif,boolean isFollow,boolean isFavorite,boolean isVote) {
		return new Show().render(photo, rank, exif, isFollow, isFavorite, isVote);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\photo\Show.html

// line 10, japidviews\Application\photo\Show.html
		p("<div class=\"grid_row show\">\n" + 
"\n" + 
"<div class=\"col col_16  \">\n" + 
"    <div class=\"row       \">\n" + 
"        <div class=\"col-lg-1\">\n" + 
"            <img class=\"img-rounded image_64\"\n" + 
"                 src=\"");// line 30, japidviews\Application\photo\Show.html
		try { p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(photo.idUser)); } catch (NullPointerException npe) {}// line 37, japidviews\Application\photo\Show.html
		p("\">\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-2\">\n" + 
"            <p>\n" + 
"                ");// line 37, japidviews\Application\photo\Show.html
		try { p(photo.user.niceName); } catch (NullPointerException npe) {}// line 41, japidviews\Application\photo\Show.html
		p("            </p>\n" + 
"\n" + 
"            <p>\n" + 
"                <button\n" + 
"                        class=\"follow_btn btn ");// line 41, japidviews\Application\photo\Show.html
		if(isFollow){// line 46, japidviews\Application\photo\Show.html
		p(" btn-success");// line 46, japidviews\Application\photo\Show.html
		}else{// line 46, japidviews\Application\photo\Show.html
		p("btn-info");// line 46, japidviews\Application\photo\Show.html
		}// line 46, japidviews\Application\photo\Show.html
		p(" btn-xs  \"\n" + 
"                        type=\"button\" id=\"follow\" toid=\"");// line 46, japidviews\Application\photo\Show.html
		try { p(photo.idUser); } catch (NullPointerException npe) {}// line 47, japidviews\Application\photo\Show.html
		p("\" isfollow=\"");// line 47, japidviews\Application\photo\Show.html
		try { p(isFollow); } catch (NullPointerException npe) {}// line 47, japidviews\Application\photo\Show.html
		p("\">\n" + 
"                    ");// line 47, japidviews\Application\photo\Show.html
		try { p(isFollow?i18n("following"):i18n("follow")); } catch (NullPointerException npe) {}// line 48, japidviews\Application\photo\Show.html
		p("                </button>\n" + 
"            </p>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-3\">\n" + 
"            <h4>");// line 48, japidviews\Application\photo\Show.html
		try { p((photo.title==null || "".equals(photo.title.trim()))?"Untitled":photo.title); } catch (NullPointerException npe) {}// line 53, japidviews\Application\photo\Show.html
		p("</h4>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-6\">\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"\n" + 
"</div>\n" + 
"<div class=\"col col_16  \">\n" + 
"    <div  class=\"center\">\n" + 
"        <img src=\"");// line 53, japidviews\Application\photo\Show.html
		try { p(Path.getJpegDownloadPath(photo.idPhoto,0)); } catch (NullPointerException npe) {}// line 63, japidviews\Application\photo\Show.html
		p("\" class=\"rounded3 img_shadow\" alt=\"\" />\n" + 
"    </div>\n" + 
"\n" + 
"</div>\n" + 
"\n" + 
"<div class=\"col col_12  \">\n" + 
"\n" + 
"    <div class=\"line6\"></div>\n" + 
"    <div class=\"row \">\n" + 
"        <div class=\"col-lg-7\">\n" + 
"            <button class=\"btn btn-default btn-xs\" type=\"button\">\n" + 
"                &nbsp;&nbsp; ");// line 63, japidviews\Application\photo\Show.html
		;p(getMessage("i.wanna.buy.photo"));// line 74, japidviews\Application\photo\Show.html
		p("&nbsp;&nbsp;\n" + 
"            </button>\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-5\">\n" + 
"            <!-- Baidu Button BEGIN -->\n" + 
"            <div id=\"bdshare\" class=\"bdshare_t bds_tools get-codes-bdshare\">\n" + 
"                <a class=\"bds_tsina\"></a>\n" + 
"                <a class=\"bds_qzone\"></a>\n" + 
"                <a class=\"bds_tqq\"></a>\n" + 
"                <a class=\"bds_douban\"></a>\n" + 
"                <a class=\"bds_tqf\"></a>\n" + 
"                <a class=\"bds_sqq\"></a>\n" + 
"                <a class=\"bds_renren\"></a>\n" + 
"                <a class=\"bds_twi\"></a>\n" + 
"                <a class=\"bds_fbook\"></a>\n" + 
"                <a class=\"bds_msn\"></a>\n" + 
"                <span class=\"bds_more\">&nbsp; ");// line 74, japidviews\Application\photo\Show.html
		;p(getMessage("more"));// line 90, japidviews\Application\photo\Show.html
		p("</span>\n" + 
"                <a class=\"shareCount\"></a>\n" + 
"            </div>\n" + 
"            <script type=\"text/javascript\" id=\"bdshare_js\" data=\"type=tools&amp;uid=0\"></script>\n" + 
"            <script type=\"text/javascript\" id=\"bdshell_js\"></script>\n" + 
"            <script type=\"text/javascript\">\n" + 
"                document.getElementById(\"bdshell_js\").src = \"http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=\" + Math.ceil(new Date() / 3600000)\n" + 
"            </script>\n" + 
"            <!-- Baidu Button END -->\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"line10\"></div>\n" + 
"    <div>\n" + 
"        <form class=\"form-horizontal\" id=\"photoCommentForm\" method=\"post\">\n" + 
"            ");// line 90, japidviews\Application\photo\Show.html
		if (session.get(Admin.SESSION_LOGIN_KEY) == null) {// line 104, japidviews\Application\photo\Show.html
		p("\n" + 
"            <div class=\"line10\"></div>\n" + 
"            <div class=\"line12\"></div>\n" + 
"            <a href=\"/login\">Login</a> or <a href=\"/signup\">Sign up</a> to comment.\n" + 
"            <div class=\"line10\"></div>\n" + 
"            <div class=\"line10\"></div>\n" + 
"            ");// line 104, japidviews\Application\photo\Show.html
		}else{// line 111, japidviews\Application\photo\Show.html
		p("            <textarea class=\"col_12 comment form-control\" rows=\"3\" cols=\"\" id=\"comment\" name=\"comment\"\n" + 
"                      placeholder=\"Add your comments...\"></textarea>\n" + 
"\n" + 
"            <div class=\"line3\"></div>\n" + 
"            <input type=\"hidden\" name=\"comment_count\" id=\"comment_count\"\n" + 
"                   value=\"");// line 111, japidviews\Application\photo\Show.html
		try { p(photo.commentCount); } catch (NullPointerException npe) {}// line 117, japidviews\Application\photo\Show.html
		p("\"/>\n" + 
"\n" + 
"            ");// line 117, japidviews\Application\photo\Show.html
		//if(!String.valueOf(photo.idUser).equals(session.get(Admin.SESSION_USER_ID_KEY))){// line 119, japidviews\Application\photo\Show.html
		p("            <button type=\"button\" id=\"comment_btn\" class=\"btn btn-info  btn-sm\">\n" + 
"                ");// line 119, japidviews\Application\photo\Show.html
		;p(getMessage("comment"));// line 121, japidviews\Application\photo\Show.html
		p("            </button>\n" + 
"            ");// line 121, japidviews\Application\photo\Show.html
		//}// line 123, japidviews\Application\photo\Show.html

            }// line 125, japidviews\Application\photo\Show.html
		p("            <input type=\"hidden\" name=\"id_photo\" id=\"id_photo_x\" value=\"");// line 125, japidviews\Application\photo\Show.html
		try { p(photo.idPhoto); } catch (NullPointerException npe) {}// line 126, japidviews\Application\photo\Show.html
		p("\"/>\n" + 
"            <input type=\"hidden\" name=\"niceName\" id=\"niceNameX\" value=\"");// line 126, japidviews\Application\photo\Show.html
		try { p(photo.user.niceName); } catch (NullPointerException npe) {}// line 127, japidviews\Application\photo\Show.html
		p("\"/>\n" + 
"            <input type=\"hidden\" name=\"photoIdUser\" id=\"photoIdUserX\" value=\"");// line 127, japidviews\Application\photo\Show.html
		try { p(photo.idUser); } catch (NullPointerException npe) {}// line 128, japidviews\Application\photo\Show.html
		p("\"/>\n" + 
"\n" + 
"            <input type=\"hidden\" name=\"category\" id=\"categoryx\" value=\"");// line 128, japidviews\Application\photo\Show.html
		try { p(photo.category); } catch (NullPointerException npe) {}// line 130, japidviews\Application\photo\Show.html
		p("\"/>\n" + 
"\n" + 
"            <input type=\"hidden\" name=\"id_user\" id=\"id_user\" value=\"");// line 130, japidviews\Application\photo\Show.html
		try { p(photo.idUser); } catch (NullPointerException npe) {}// line 132, japidviews\Application\photo\Show.html
		p("\"/>\n" + 
"            <input type=\"hidden\" name=\"id_photo\" id=\"id_photo\" value=\"");// line 132, japidviews\Application\photo\Show.html
		try { p(photo.idPhoto); } catch (NullPointerException npe) {}// line 133, japidviews\Application\photo\Show.html
		p("\"/>\n" + 
"        </form>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"line10\"></div>\n" + 
"    <div id=\"comments_c\">\n" + 
"        loading comments...\n" + 
"    </div>\n" + 
"\n" + 
"</div>\n" + 
"<!-- user info -->\n" + 
"<div class=\"col col_4 \">\n" + 
"    <div class=\"row stat left_rounded6 shadow \">\n" + 
"        <div class=\"col-lg-6\">\n" + 
"            <img width=\"90\" height=\"90\" class=\"img-rounded\"\n" + 
"                 src=\"");// line 133, japidviews\Application\photo\Show.html
		try { p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(photo.idUser)); } catch (NullPointerException npe) {}// line 148, japidviews\Application\photo\Show.html
		p("\">\n" + 
"        </div>\n" + 
"        <div class=\"col-lg-6\">\n" + 
"            <p>\n" + 
"                ");// line 148, japidviews\Application\photo\Show.html
		try { p(photo.user.niceName); } catch (NullPointerException npe) {}// line 152, japidviews\Application\photo\Show.html
		p("            </p>\n" + 
"\n" + 
"            <p>\n" + 
"                <button\n" + 
"                        class=\"follow_btn btn ");// line 152, japidviews\Application\photo\Show.html
		if(isFollow){// line 157, japidviews\Application\photo\Show.html
		p(" btn-success");// line 157, japidviews\Application\photo\Show.html
		}else{// line 157, japidviews\Application\photo\Show.html
		p("btn-info");// line 157, japidviews\Application\photo\Show.html
		}// line 157, japidviews\Application\photo\Show.html
		p(" btn-xs  \"\n" + 
"                        type=\"button\" id=\"follow\" toid=\"");// line 157, japidviews\Application\photo\Show.html
		try { p(photo.idUser); } catch (NullPointerException npe) {}// line 158, japidviews\Application\photo\Show.html
		p("\" isfollow=\"");// line 158, japidviews\Application\photo\Show.html
		try { p(isFollow); } catch (NullPointerException npe) {}// line 158, japidviews\Application\photo\Show.html
		p("\">\n" + 
"                    ");// line 158, japidviews\Application\photo\Show.html
		try { p(isFollow?i18n("following"):i18n("follow")); } catch (NullPointerException npe) {}// line 159, japidviews\Application\photo\Show.html
		p("                </button>\n" + 
"            </p>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"line6\"></div>\n" + 
"    ");// line 159, japidviews\Application\photo\Show.html
		final RankShow _RankShow5 = new RankShow(getOut()); _RankShow5.setActionRunners(getActionRunners()).setOut(getOut()); _RankShow5.render(rank); // line 165, japidviews\Application\photo\Show.html// line 165, japidviews\Application\photo\Show.html
		p("    <div class=\"line6\"></div>\n" + 
"\n" + 
"    <div class=\"row  \">\n" + 
"        <div class=\"btn-group  col-lg-12\" >\n" + 
"            <button id=\"vote_btn\"\n" + 
"                    class=\"btn btn-default  btn-sm  col-lg-10 pull-left ");// line 165, japidviews\Application\photo\Show.html
		if(isVote){// line 171, japidviews\Application\photo\Show.html
		p("disabled");// line 171, japidviews\Application\photo\Show.html
		}else{// line 171, japidviews\Application\photo\Show.html
		p(" btn-success ");// line 171, japidviews\Application\photo\Show.html
		}// line 171, japidviews\Application\photo\Show.html
		p("\"\n" + 
"                    type=\"button\"\n" + 
"                    isvote=\"");// line 171, japidviews\Application\photo\Show.html
		try { p(isVote); } catch (NullPointerException npe) {}// line 173, japidviews\Application\photo\Show.html
		p("\">\n" + 
"                ");// line 173, japidviews\Application\photo\Show.html
		if(isVote){// line 174, japidviews\Application\photo\Show.html
		;// line 174, japidviews\Application\photo\Show.html
		;p(getMessage("thank.vote"));// line 174, japidviews\Application\photo\Show.html
		;// line 174, japidviews\Application\photo\Show.html
		}else{// line 174, japidviews\Application\photo\Show.html
		;// line 174, japidviews\Application\photo\Show.html
		;p(getMessage("like"));// line 174, japidviews\Application\photo\Show.html
		;// line 174, japidviews\Application\photo\Show.html
		}// line 174, japidviews\Application\photo\Show.html
		p("            </button>\n" + 
"            <button id=\"favorite_btn\" title=\"");// line 174, japidviews\Application\photo\Show.html
		if(isFavorite){// line 176, japidviews\Application\photo\Show.html
		;// line 176, japidviews\Application\photo\Show.html
		;p(getMessage("favorite.cancel"));// line 176, japidviews\Application\photo\Show.html
		;// line 176, japidviews\Application\photo\Show.html
		}else{// line 176, japidviews\Application\photo\Show.html
		;// line 176, japidviews\Application\photo\Show.html
		;p(getMessage("favorite"));// line 176, japidviews\Application\photo\Show.html
		;// line 176, japidviews\Application\photo\Show.html
		}// line 176, japidviews\Application\photo\Show.html
		p("\"\n" + 
"                    class=\"btn btn-default  btn-sm  col-lg-2   pull-right  favorite ");// line 176, japidviews\Application\photo\Show.html
		if(isFavorite){// line 177, japidviews\Application\photo\Show.html
		p("favorited");// line 177, japidviews\Application\photo\Show.html
		}else{// line 177, japidviews\Application\photo\Show.html
		p("unfavorited");// line 177, japidviews\Application\photo\Show.html
		}// line 177, japidviews\Application\photo\Show.html
		p(" ico_favorite \" type=\"button\"\n" + 
"                    isfavorite=\"");// line 177, japidviews\Application\photo\Show.html
		try { p(isFavorite); } catch (NullPointerException npe) {}// line 178, japidviews\Application\photo\Show.html
		p("\">&nbsp;\n" + 
"            </button>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"line6\"></div>\n" + 
"    <div class=\"row border-bottom shadow rounded6\">\n" + 
"        ");// line 178, japidviews\Application\photo\Show.html
		if(photo.description!=null && !"".equals(photo.description)){// line 184, japidviews\Application\photo\Show.html
		p("        <div class=\"col-lg-12\">\n" + 
"            <div id=\"description\" class=\"photo_stats border-bottom\">\n" + 
"                ");// line 184, japidviews\Application\photo\Show.html
		try { p(photo.description); } catch (NullPointerException npe) {}// line 187, japidviews\Application\photo\Show.html
		p("            </div>\n" + 
"        </div>\n" + 
"\n" + 
"        ");// line 187, japidviews\Application\photo\Show.html
		}// line 191, japidviews\Application\photo\Show.html

        if(photo.tagList!=null){// line 193, japidviews\Application\photo\Show.html
		p("        <div class=\"col-lg-12\">\n" + 
"            <div id=\"tags\" class=\"photo_stats border-bottom\">\n" + 
"                ");// line 193, japidviews\Application\photo\Show.html
		for(String tag:photo.tagList){// line 196, japidviews\Application\photo\Show.html
		p("                <a class=\"badge tag\" href=\"javascript:void(0)\"> ");// line 196, japidviews\Application\photo\Show.html
		try { p(tag); } catch (NullPointerException npe) {}// line 197, japidviews\Application\photo\Show.html
		p(" </a>\n" + 
"                ");// line 197, japidviews\Application\photo\Show.html
		}// line 198, japidviews\Application\photo\Show.html
		p("            </div>\n" + 
"        </div>\n" + 
"\n" + 
"        ");// line 198, japidviews\Application\photo\Show.html
		}// line 202, japidviews\Application\photo\Show.html
		p("\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div id=\"exif\" class=\"exif_info \">\n" + 
"                <ul>\n" + 
"                    ");// line 202, japidviews\Application\photo\Show.html
		Set sets = exif.entrySet();// line 207, japidviews\Application\photo\Show.html
                    for (Object obj : sets) {// line 208, japidviews\Application\photo\Show.html
                    Entry entry=(Entry)obj;// line 209, japidviews\Application\photo\Show.html
                    String key=(String)entry.getKey();// line 210, japidviews\Application\photo\Show.html
                    String keyI18n=i18n(key);// line 211, japidviews\Application\photo\Show.html
		p("                    <li>\n" + 
"                        <small class=\"key\">");// line 211, japidviews\Application\photo\Show.html
		try { p(keyI18n); } catch (NullPointerException npe) {}// line 213, japidviews\Application\photo\Show.html
		p("</small>\n" + 
"                        <strong class=\"value\">");// line 213, japidviews\Application\photo\Show.html
		try { p(entry.getValue()); } catch (NullPointerException npe) {}// line 214, japidviews\Application\photo\Show.html
		p("</strong>\n" + 
"                    </li>\n" + 
"                    ");// line 214, japidviews\Application\photo\Show.html
		}// line 216, japidviews\Application\photo\Show.html
		p("                </ul>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"\n" + 
"    <div class=\"row border-bottom show_map\">\n" + 
"\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div id=\"map_show_canvas\" lat=\"");// line 216, japidviews\Application\photo\Show.html
		try { p(photo.GPSLatitude); } catch (NullPointerException npe) {}// line 225, japidviews\Application\photo\Show.html
		p("\" lng=\"");// line 225, japidviews\Application\photo\Show.html
		try { p(photo.GPSLongitude); } catch (NullPointerException npe) {}// line 225, japidviews\Application\photo\Show.html
		p("\"\n" + 
"                 class=\"show_map_canvas shadow rounded6\"></div>\n" + 
"        </div>\n" + 
"\n" + 
"        <div class=\"col-lg-12\">\n" + 
"            <div id=\"address\">\n" + 
"\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"</div>\n" + 
"<script id=\"comments_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"    <li class=\"media\"><a class=\"pull-left\" href=\"#\"> <img width=\"64\" height=\"64\"\n" + 
"                                                          class=\"media-object\">\n" + 
"    </a>\n" + 
"\n" + 
"        <div class=\"media-body\">\n" + 
"            <h5 class=\"media-heading border-bottom\">{%=o.username%} 1 minutes ago</h5>\n" + 
"            <small>{%=o.content%}</small>\n" + 
"\n" + 
"        </div>\n" + 
"    </li>\n" + 
"\n" + 
"</script>");// line 225, japidviews\Application\photo\Show.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( photo.title+" by "+photo.niceName);;
	}
	@Override protected void keywords() {
		p( photo.tags == null ? photo.title :  photo.tags);;
	}
	@Override protected void description() {
		p( photo.title+(photo.tags == null ? "" : (","+photo.tags)));;
	}
	@Override protected void css() {
		// line 10, japidviews\Application\photo\Show.html
		p("<script type=\"text/javascript\"\n" + 
"        src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDqPLY_onh61yMSw5KSVICJN-B5igbHCTs&sensor=false&language=zh-cn\"></script>\n" + 
"<script src=\"");// line 10, japidviews\Application\photo\Show.html
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 13, japidviews\Application\photo\Show.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 13, japidviews\Application\photo\Show.html
		p(lookupStatic("/public/app/map.js"));// line 14, japidviews\Application\photo\Show.html
		p("\"></script>\n" + 
"<script src=\"");// line 14, japidviews\Application\photo\Show.html
		p(lookupStatic("/public/app/show.js"));// line 15, japidviews\Application\photo\Show.html
		p("\"></script>\n" + 
"<script src=\"");// line 15, japidviews\Application\photo\Show.html
		p(lookupStatic("/public/app/follow.js"));// line 16, japidviews\Application\photo\Show.html
		p("\"></script>\n" + 
"<script src=\"");// line 16, japidviews\Application\photo\Show.html
		p(lookupStatic("/public/app/comment.js"));// line 17, japidviews\Application\photo\Show.html
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
"\n");// line 17, japidviews\Application\photo\Show.html
		;
	}
	@Override protected void header() {
		p( "Show");;
	}
}