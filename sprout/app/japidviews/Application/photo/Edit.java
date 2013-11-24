//version: 0.9.35
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
// NOTE: This file was generated from: japidviews/Application/photo/Edit.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Edit extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Edit.html";
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


	public Edit() {
		super(null);
	}
	public Edit(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"photo", "rank", "exif",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Photo", "Rank", "Map",  };
	public static final Object[] argDefaults= new Object[] {null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Edit.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Photo photo; // line 5, japidviews/Application/photo/Edit.html
	private Rank rank; // line 5, japidviews/Application/photo/Edit.html
	private Map exif; // line 5, japidviews/Application/photo/Edit.html
	public cn.bran.japid.template.RenderResult render(Photo photo,Rank rank,Map exif) {
		this.photo = photo;
		this.rank = rank;
		this.exif = exif;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 5, japidviews/Application/photo/Edit.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Photo photo,Rank rank,Map exif) {
		return new Edit().render(photo, rank, exif);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\Edit.html
 
p("\n" + 
"</pre>\n");// line 7, japidviews\Application\photo\Edit.html
		// line 9, japidviews\Application\photo\Edit.html
		p("<div class=\"page-header\">\n" + 
"\n" + 
"    <h4>");// line 24, japidviews\Application\photo\Edit.html
		try { p(photo.title); } catch (NullPointerException npe) {}// line 27, japidviews\Application\photo\Edit.html
		p("</h4>\n" + 
"</div>\n" + 
"<div class=\"row\">\n" + 
"\n" + 
"    <div class=\"col-md-9 \">\n" + 
"\n" + 
"        <div>\n" + 
"\n" + 
"            <img src=\"");// line 27, japidviews\Application\photo\Edit.html
		try { p(Path.getJpegDownloadPath(photo.idPhoto,0)); } catch (NullPointerException npe) {}// line 35, japidviews\Application\photo\Edit.html
		p("\" class=\"img-rounded0\" alt=\"\">\n" + 
"        </div>\n" + 
"        <div class=\"line6\"></div>\n" + 
"        <div class=\"row \">\n" + 
"            <div class=\"col-md-7\">\n" + 
"                <button class=\"btn btn-xs\" type=\"button\">\n" + 
"                    Edit\n" + 
"                </button>\n" + 
"            </div>\n" + 
"            <div class=\"col-md-5\">\n" + 
"                <!-- JiaThis Button BEGIN\n" + 
"                <div class=\"jiathis_style\">\n" + 
"                <a class=\"jiathis_button_qzone\"></a> <a class=\"jiathis_button_tsina\"></a> <a\n" + 
"                class=\"jiathis_button_tqq\"></a> <a class=\"jiathis_button_weixin\"></a> <a\n" + 
"                class=\"jiathis_button_renren\"></a> <a class=\"jiathis_button_xiaoyou\"></a> <a\n" + 
"                class=\"jiathis_button_tianya\"></a> <a class=\"jiathis_button_ishare\"></a> <a\n" + 
"                href=\"http://www.jiathis.com/share\" class=\"jiathis jiathis_txt jtico jtico_jiathis\"\n" + 
"                target=\"_blank\"></a> <a class=\"jiathis_counter_style\"></a>\n" + 
"                </div>\n" + 
"                <script type=\"text/javascript\"\n" + 
"                src=\"http://v3.jiathis.com/code/jia.js?uid=1363333029194573\" charset=\"utf-8\"></script> -->\n" + 
"                <!-- JiaThis Button END -->\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"line10\"></div>\n" + 
"        <div>\n" + 
"\n" + 
"            <input type=\"hidden\" name=\"id_photo\" id=\"id_photo\" value=\"");// line 35, japidviews\Application\photo\Edit.html
		try { p(photo.idPhoto); } catch (NullPointerException npe) {}// line 62, japidviews\Application\photo\Edit.html
		p("\"/>\n" + 
"        </div>\n" + 
"\n" + 
"        <div class=\"line10\"></div>\n" + 
"        <div id=\"comments_c\">\n" + 
"            loading comments...\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"    <!-- user info -->\n" + 
"    <div class=\"col-md-3 \">\n" + 
"        <div class=\"row stat \">\n" + 
"            <div class=\"col-md-6\">\n" + 
"                <img width=\"90\" height=\"90\" class=\"img-rounded\"\n" + 
"                     src=\"");// line 62, japidviews\Application\photo\Edit.html
		try { p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(photo.idUser)); } catch (NullPointerException npe) {}// line 76, japidviews\Application\photo\Edit.html
		p("\">\n" + 
"            </div>\n" + 
"            <div class=\"col-md-6\">\n" + 
"                <p>\n" + 
"                    ");// line 76, japidviews\Application\photo\Edit.html
		try { p(photo.user.niceName); } catch (NullPointerException npe) {}// line 80, japidviews\Application\photo\Edit.html
		p("\n" + 
"                </p>\n" + 
"\n" + 
"                <p>\n" + 
"                    <a href=\"/settings/profile\" class=\"btn btn-sm\">Edit Profile</a>\n" + 
"                </p>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        <div class=\"line6\"></div>\n" + 
"        ");// line 80, japidviews\Application\photo\Edit.html
		final RankShow _RankShow3 = new RankShow(getOut()); _RankShow3.setActionRunners(getActionRunners()).setOut(getOut()); _RankShow3.render(rank); // line 89, japidviews\Application\photo\Edit.html// line 89, japidviews\Application\photo\Edit.html
		p("\n" + 
"        <div class=\"line6\"></div>\n" + 
"\n" + 
"        <div class=\"line6\"></div>\n" + 
"        <div class=\"row border-bottom  \">\n" + 
"            <div class=\"col-md-12\">\n" + 
"                <div id=\"description\" class=\"photo_stats border-bottom\">\n" + 
"                    ");// line 89, japidviews\Application\photo\Edit.html
		try { p(photo.description); } catch (NullPointerException npe) {}// line 96, japidviews\Application\photo\Edit.html
		p("\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"col-md-12\">\n" + 
"                <div id=\"tags\" class=\"photo_stats border-bottom\">\n" + 
"                    <span>");// line 96, japidviews\Application\photo\Edit.html
		try { p(photo.tags); } catch (NullPointerException npe) {}// line 101, japidviews\Application\photo\Edit.html
		p("<i class=\" glyphicon glyphicon-tags\"></i>tags1 </span><span><i\n" + 
"                        class=\" glyphicon glyphicon-tags\"></i>tags2</span><span><i class=\" glyphicon glyphicon-tags\"></i>tags3</span>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"            <div class=\"col-md-12\">\n" + 
"                <div id=\"exif\" class=\" photo_stats \">\n" + 
"                    <ul class=\"stats exif\">\n" + 
"\n" + 
"                        ");// line 101, japidviews\Application\photo\Edit.html
		Set// line 109, japidviews\Application\photo\Edit.html
 <// line 109, japidviews\Application\photo\Edit.html
Entry>// line 109, japidviews\Application\photo\Edit.html
 sets = exif.entrySet();// line 109, japidviews\Application\photo\Edit.html
 for (Object obj : sets) {// line 109, japidviews\Application\photo\Edit.html
 Entry// line 109, japidviews\Application\photo\Edit.html

                        entry=(Entry)obj;// line 110, japidviews\Application\photo\Edit.html
		p("\n" + 
"                        <li>\n" + 
"                            <small>");// line 110, japidviews\Application\photo\Edit.html
		try { p(entry.getKey()); } catch (NullPointerException npe) {}// line 112, japidviews\Application\photo\Edit.html
		p("</small>\n" + 
"                            <strong class=\"faded\">");// line 112, japidviews\Application\photo\Edit.html
		try { p(entry.getValue()); } catch (NullPointerException npe) {}// line 113, japidviews\Application\photo\Edit.html
		p("</strong>\n" + 
"                        </li>\n" + 
"                        ");// line 113, japidviews\Application\photo\Edit.html
		}// line 115, japidviews\Application\photo\Edit.html
		p("\n" + 
"                    </ul>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"</div>\n" + 
"<script id=\"comments_tml\" type=\"text/x-tmpl\">\n" + 
"\n" + 
"    <li class=\"media\">\n" + 
"        <a class=\"pull-left\" href=\"#\">\n" + 
"            <img width=\"64\" height=\"64\" class=\"media-object\"/>\n" + 
"        </a>\n" + 
"\n" + 
"        <div class=\"media-body\">\n" + 
"            <h5 class=\"media-heading border-bottom\">{%=o.username%} 1 minutes ago</h5>\n" + 
"            <small>{%=o.content%}</small>\n" + 
"        </div>\n" + 
"    </li>\n" + 
"\n" + 
"</script>");// line 115, japidviews\Application\photo\Edit.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Show Page");;
	}
	@Override protected void css() {
		// line 9, japidviews\Application\photo\Edit.html
		p("<script src=\"");// line 9, japidviews\Application\photo\Edit.html
		p(lookupStatic("/public/blueimp/tmpl.min.js"));// line 10, japidviews\Application\photo\Edit.html
		p("\" type=\"text/javascript\"></script>\n" + 
"<script src=\"");// line 10, japidviews\Application\photo\Edit.html
		p(lookupStatic("/public/app/show.js"));// line 11, japidviews\Application\photo\Edit.html
		p("\"></script>\n" + 
"<script src=\"");// line 11, japidviews\Application\photo\Edit.html
		p(lookupStatic("/public/app/comment.js"));// line 12, japidviews\Application\photo\Edit.html
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
"</style>\n");// line 12, japidviews\Application\photo\Edit.html
		;
	}
	@Override protected void header() {
		p( "Show");;
	}
}