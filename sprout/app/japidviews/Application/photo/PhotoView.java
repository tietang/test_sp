//version: 0.9.37
package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
import java.util.Set;import fengfei.ucm.entity.photo.Refresh;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/photo/PhotoView.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class PhotoView extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/PhotoView.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
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


	public PhotoView() {
	super((StringBuilder)null);
	initHeaders();
	}
	public PhotoView(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public PhotoView(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"pagePath", "photos", "pageNum",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<? extends PhotoShow>", "int",  };
	public static final Object[] argDefaults= new Object[] {null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.PhotoView.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String pagePath; // line 3, japidviews/Application/photo/PhotoView.html
	private List<? extends PhotoShow> photos; // line 3, japidviews/Application/photo/PhotoView.html
	private int pageNum; // line 3, japidviews/Application/photo/PhotoView.html
	public cn.bran.japid.template.RenderResult render(String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		this.pagePath = pagePath;
		this.photos = photos;
		this.pageNum = pageNum;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 3, japidviews/Application/photo/PhotoView.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		return new PhotoView().render(pagePath, photos, pageNum);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, japidviews\Application\photo\PhotoView.html

p("\n" + 
"\n" + 
"<!--\n" + 
"<div class=\"alert\">\n" + 
"<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n" + 
"×\n" + 
"</button>\n" + 
"<strong>Warning!</strong> Best check yo self, you're not looking too\n" + 
"good.\n" + 
"</div>\n" + 
"-->\n");// line 3, japidviews\Application\photo\PhotoView.html
		if(photos==null){}else{// line 14, japidviews\Application\photo\PhotoView.html
		p("\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"	");// line 14, japidviews\Application\photo\PhotoView.html
		 for(PhotoShow photo : photos){// line 17, japidviews\Application\photo\PhotoView.html
		p("\n" + 
"	<div class=\"col photo_col width_4\">\n" + 
"		<div class=\"photo_preview photo_preview_4 \">\n" + 
"			<a href=\"/show/");// line 17, japidviews\Application\photo\PhotoView.html
		p(photo.idPhoto);// line 20, japidviews\Application\photo\PhotoView.html
		p("_");// line 20, japidviews\Application\photo\PhotoView.html
		p(photo.idUser);// line 20, japidviews\Application\photo\PhotoView.html
		p("?from=");// line 20, japidviews\Application\photo\PhotoView.html
		p(pagePath);// line 20, japidviews\Application\photo\PhotoView.html
		p("\" target=\"photo_view\" > <img src=\"");// line 20, japidviews\Application\photo\PhotoView.html
		p(Path.getJpegDownloadPath(photo.idPhoto,1));// line 20, japidviews\Application\photo\PhotoView.html
		p("\" class=\"rounded3\" /></a>\n" + 
"			<div class=\"caption\">\n" + 
"				<div class=\"title\">\n" + 
"					<a href=\"/show/");// line 20, japidviews\Application\photo\PhotoView.html
		p(photo.idPhoto);// line 23, japidviews\Application\photo\PhotoView.html
		p("_");// line 23, japidviews\Application\photo\PhotoView.html
		p(photo.idUser);// line 23, japidviews\Application\photo\PhotoView.html
		p("?feature=popular\" target=\"photo_view\" >");// line 23, japidviews\Application\photo\PhotoView.html
		p((photo.title==null || "".equals(photo.title.trim()))?"Untitled":photo.title);// line 23, japidviews\Application\photo\PhotoView.html
		p("</a>\n" + 
"				</div>\n" + 
"				<div class=\"info\">\n" + 
"					<a href=\"/to/");// line 23, japidviews\Application\photo\PhotoView.html
		p(photo.idUser);// line 26, japidviews\Application\photo\PhotoView.html
		p("\">");// line 26, japidviews\Application\photo\PhotoView.html
		p(photo.niceName);// line 26, japidviews\Application\photo\PhotoView.html
		p("</a>\n" + 
"				</div>\n" + 
"				<div class=\"score\">\n" + 
"					<a href=\"#\">");// line 26, japidviews\Application\photo\PhotoView.html
		p(photo.sscore);// line 29, japidviews\Application\photo\PhotoView.html
		p("</a>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	");// line 29, japidviews\Application\photo\PhotoView.html
		}// line 34, japidviews\Application\photo\PhotoView.html
		p("\n" + 
"\n" + 
"</div>\n" + 
"<div class=\"grid_row\">\n" + 
"	<div class=\"col col_16 pager  pagination-right\">\n" + 
"		<ul>\n" + 
"			<li>\n" + 
"				<a href=\"");// line 34, japidviews\Application\photo\PhotoView.html
		p(pagePath);// line 41, japidviews\Application\photo\PhotoView.html
		p("/");// line 41, japidviews\Application\photo\PhotoView.html
		p((pageNum-1<=0)?1:(pageNum-1));// line 41, japidviews\Application\photo\PhotoView.html
		p("\">Prev</a>\n" + 
"			</li>\n" + 
"			");// line 41, japidviews\Application\photo\PhotoView.html
		if(pageNum>=2){// line 43, japidviews\Application\photo\PhotoView.html
		p("\n" + 
"			<li >\n" + 
"				<a href=\"");// line 43, japidviews\Application\photo\PhotoView.html
		p(pagePath);// line 45, japidviews\Application\photo\PhotoView.html
		p("/1\">First</a>\n" + 
"			</li>");// line 45, japidviews\Application\photo\PhotoView.html
		}// line 46, japidviews\Application\photo\PhotoView.html
		p("\n" + 
"\n" + 
"			<!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n" + 
"			<li><a href=\"#\">2</a></li>\n" + 
"			<li><a href=\"#\">3</a></li>\n" + 
"			<li><a href=\"#\">4</a></li>\n" + 
"			<li><a href=\"#\">5</a></li>-->\n" + 
"			");// line 46, japidviews\Application\photo\PhotoView.html
		if(photos.size()>=20){// line 53, japidviews\Application\photo\PhotoView.html
		p("\n" + 
"			<li>\n" + 
"				<a href=\"");// line 53, japidviews\Application\photo\PhotoView.html
		p(pagePath);// line 55, japidviews\Application\photo\PhotoView.html
		p("/");// line 55, japidviews\Application\photo\PhotoView.html
		p(photos.size()<20?pageNum:(pageNum+1));// line 55, japidviews\Application\photo\PhotoView.html
		p("\" >Next</a>\n" + 
"			</li>");// line 55, japidviews\Application\photo\PhotoView.html
		}// line 56, japidviews\Application\photo\PhotoView.html
		p("\n" + 
"\n" + 
"		</ul>\n" + 
"	</div>\n" + 
"</div>\n");// line 56, japidviews\Application\photo\PhotoView.html
		}// line 61, japidviews\Application\photo\PhotoView.html
		;// line 61, japidviews\Application\photo\PhotoView.html
		
		endDoLayout(sourceTemplate);
	}

}