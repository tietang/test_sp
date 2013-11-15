//version: 0.9.35
package japidviews.Application.profile;
import java.util.*;

import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;

import static cn.bran.play.JapidPlayAdapter.*;

//
// NOTE: This file was generated from: japidviews/Application/profile/PhotoList.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class PhotoList extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/PhotoList.html";
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


	public PhotoList() {
		super(null);
	}
	public PhotoList(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"pagePath", "photos", "pageNum",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<? extends PhotoShow>", "int",  };
	public static final Object[] argDefaults= new Object[] {null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.PhotoList.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String pagePath; // line 3, japidviews/Application/profile/PhotoList.html
	private List<? extends PhotoShow> photos; // line 3, japidviews/Application/profile/PhotoList.html
	private int pageNum; // line 3, japidviews/Application/profile/PhotoList.html
	public cn.bran.japid.template.RenderResult render(String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		this.pagePath = pagePath;
		this.photos = photos;
		this.pageNum = pageNum;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 3, japidviews/Application/profile/PhotoList.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		return new PhotoList().render(pagePath, photos, pageNum);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\profile\PhotoList.html

p("\n" + 
"\n" + 
"<div class=\"grid_row previews\" >\n" + 
"	");// line 3, japidviews\Application\profile\PhotoList.html
		for(PhotoShow photo : photos){// line 6, japidviews\Application\profile\PhotoList.html

	String id="photo_id_"+photo.idPhoto;// line 7, japidviews\Application\profile\PhotoList.html
		p("\n" + 
"	<div class=\"col photo_col width_2\" id=\"");// line 7, japidviews\Application\profile\PhotoList.html
		p(id);// line 8, japidviews\Application\profile\PhotoList.html
		p("\">\n" + 
"		<div class=\"photo_preview photo_preview_2 \">\n" + 
"			<img src=\"");// line 8, japidviews\Application\profile\PhotoList.html
		p(Path.getJpegDownloadPath(photo.idPhoto,2));// line 10, japidviews\Application\profile\PhotoList.html
		p("\" class=\"rounded3\" />\n" + 
"			<div class=\"caption\">\n" + 
"				<div class=\"title\">\n" + 
"		<!--			<a href=\"/edit/");// line 10, japidviews\Application\profile\PhotoList.html
		p(photo.idPhoto);// line 13, japidviews\Application\profile\PhotoList.html
		p("\" target=\"photo_edit\" onclick=\"editPhoto(");// line 13, japidviews\Application\profile\PhotoList.html
		p(photo.idPhoto);// line 13, japidviews\Application\profile\PhotoList.html
		p(",");// line 13, japidviews\Application\profile\PhotoList.html
		p(photo.idUser);// line 13, japidviews\Application\profile\PhotoList.html
		p(")\" >");// line 13, japidviews\Application\profile\PhotoList.html
		;p(getMessage("edit"));// line 13, japidviews\Application\profile\PhotoList.html
		p("</a>-->\n" + 
"					<a href=\"javascript:void(0);\" target=\"photo_view\" onclick=\"editPhoto(");// line 13, japidviews\Application\profile\PhotoList.html
		p(photo.idPhoto);// line 14, japidviews\Application\profile\PhotoList.html
		p(",");// line 14, japidviews\Application\profile\PhotoList.html
		p(photo.idUser);// line 14, japidviews\Application\profile\PhotoList.html
		p(")\" >");// line 14, japidviews\Application\profile\PhotoList.html
		;p(getMessage("edit"));// line 14, japidviews\Application\profile\PhotoList.html
		p("</a>\n" + 
"				</div>\n" + 
"				<div class=\"score\">\n" + 
"					<a href=\"javascript:void(0);\" onclick=\"deletePhoto(");// line 14, japidviews\Application\profile\PhotoList.html
		p(photo.idPhoto);// line 17, japidviews\Application\profile\PhotoList.html
		p(",'");// line 17, japidviews\Application\profile\PhotoList.html
		p(id);// line 17, japidviews\Application\profile\PhotoList.html
		p("')\">");// line 17, japidviews\Application\profile\PhotoList.html
		;p(getMessage("delete"));// line 17, japidviews\Application\profile\PhotoList.html
		p("</a>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	");// line 17, japidviews\Application\profile\PhotoList.html
		}// line 22, japidviews\Application\profile\PhotoList.html
		p("\n" + 
"\n" + 
"</div>\n" + 
"<div class=\"grid_row previews\">\n" + 
"	<div class=\"col col_14 pager  pagination-right\">\n" + 
"		<ul>\n" + 
"			<li>\n" + 
"				<a href=\"");// line 22, japidviews\Application\profile\PhotoList.html
		p(pagePath);// line 29, japidviews\Application\profile\PhotoList.html
		p("/");// line 29, japidviews\Application\profile\PhotoList.html
		p((pageNum-1<=0)?1:(pageNum-1));// line 29, japidviews\Application\profile\PhotoList.html
		p("\">Prev</a>\n" + 
"			</li>\n" + 
"			");// line 29, japidviews\Application\profile\PhotoList.html
		if(pageNum>=2){// line 31, japidviews\Application\profile\PhotoList.html
		p("\n" + 
"			<li >\n" + 
"				<a href=\"");// line 31, japidviews\Application\profile\PhotoList.html
		p(pagePath);// line 33, japidviews\Application\profile\PhotoList.html
		p("/1\">First</a>\n" + 
"			</li>");// line 33, japidviews\Application\profile\PhotoList.html
		}// line 34, japidviews\Application\profile\PhotoList.html
		p("\n" + 
"\n" + 
"			<!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n" + 
"			<li><a href=\"#\">2</a></li>\n" + 
"			<li><a href=\"#\">3</a></li>\n" + 
"			<li><a href=\"#\">4</a></li>\n" + 
"			<li><a href=\"#\">5</a></li>-->\n" + 
"			");// line 34, japidviews\Application\profile\PhotoList.html
		if(photos.size()>=20){// line 41, japidviews\Application\profile\PhotoList.html
		p("\n" + 
"			<li>\n" + 
"				<a href=\"");// line 41, japidviews\Application\profile\PhotoList.html
		p(pagePath);// line 43, japidviews\Application\profile\PhotoList.html
		p("/");// line 43, japidviews\Application\profile\PhotoList.html
		p(photos.size()<20?pageNum:(pageNum+1));// line 43, japidviews\Application\profile\PhotoList.html
		p("\" >Next</a>\n" + 
"			</li>");// line 43, japidviews\Application\profile\PhotoList.html
		}// line 44, japidviews\Application\profile\PhotoList.html
		p("\n" + 
"\n" + 
"		</ul>\n" + 
"	</div>\n" + 
"</div>");// line 44, japidviews\Application\profile\PhotoList.html
		
		endDoLayout(sourceTemplate);
	}

}