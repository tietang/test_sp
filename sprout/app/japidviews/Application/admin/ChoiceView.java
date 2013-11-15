//version: 0.9.35
package japidviews.Application.admin;
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
// NOTE: This file was generated from: japidviews/Application/admin/ChoiceView.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class ChoiceView extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/admin/ChoiceView.html";
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


	public ChoiceView() {
		super(null);
	}
	public ChoiceView(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"pagePath", "photos", "pageNum",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<? extends PhotoShow>", "int",  };
	public static final Object[] argDefaults= new Object[] {null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.admin.ChoiceView.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String pagePath; // line 4, japidviews/Application/admin/ChoiceView.html
	private List<? extends PhotoShow> photos; // line 4, japidviews/Application/admin/ChoiceView.html
	private int pageNum; // line 4, japidviews/Application/admin/ChoiceView.html
	public cn.bran.japid.template.RenderResult render(String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		this.pagePath = pagePath;
		this.photos = photos;
		this.pageNum = pageNum;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 4, japidviews/Application/admin/ChoiceView.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		return new ChoiceView().render(pagePath, photos, pageNum);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\admin\ChoiceView.html

// line 7, japidviews\Application\admin\ChoiceView.html
if(photos!=null){// line 11, japidviews\Application\admin\ChoiceView.html
		p("\n" + 
"<div class=\"grid_row choice\">\n" + 
"\n" + 
"    ");// line 11, japidviews\Application\admin\ChoiceView.html
		for(PhotoShow photo : photos){// line 14, japidviews\Application\admin\ChoiceView.html
		p("\n" + 
"    <div class=\"col photo_col width_2\">\n" + 
"        <div class=\"photo_preview photo_preview_2 \">\n" + 
"            <a href=\"javascript:void(0)\" src=\"/show/");// line 14, japidviews\Application\admin\ChoiceView.html
		p(photo.idPhoto);// line 17, japidviews\Application\admin\ChoiceView.html
		p("_");// line 17, japidviews\Application\admin\ChoiceView.html
		p(photo.idUser);// line 17, japidviews\Application\admin\ChoiceView.html
		p("?from=");// line 17, japidviews\Application\admin\ChoiceView.html
		p(pagePath);// line 17, japidviews\Application\admin\ChoiceView.html
		p("\"\n" + 
"               target=\"photo_view\"> <img\n" + 
"                    src=\"");// line 17, japidviews\Application\admin\ChoiceView.html
		p(Path.getJpegDownloadPath(photo.idPhoto,1));// line 19, japidviews\Application\admin\ChoiceView.html
		p("\" class=\"rounded3\"/></a>\n" + 
"\n" + 
"            <div class=\"caption\">\n" + 
"                <div class=\"title\">\n" + 
"                    <a href=\"javascript:void(0)\" src=\"/choiced/");// line 19, japidviews\Application\admin\ChoiceView.html
		p(photo.idPhoto);// line 23, japidviews\Application\admin\ChoiceView.html
		p("_");// line 23, japidviews\Application\admin\ChoiceView.html
		p(photo.idUser);// line 23, japidviews\Application\admin\ChoiceView.html
		p("?feature=popular\"\n" + 
"                       target=\"photo_view\">");// line 23, japidviews\Application\admin\ChoiceView.html
		;p(getMessage("editor.choice"));// line 24, japidviews\Application\admin\ChoiceView.html
		p("</a>\n" + 
"                </div>\n" + 
"                <div class=\"score\">\n" + 
"                    <a href=\"#\">");// line 24, japidviews\Application\admin\ChoiceView.html
		;p(getMessage("editor.view"));// line 27, japidviews\Application\admin\ChoiceView.html
		p("</a>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    ");// line 27, japidviews\Application\admin\ChoiceView.html
		}// line 32, japidviews\Application\admin\ChoiceView.html
		p("\n" + 
"\n" + 
"</div>\n" + 
"<div class=\"grid_row\">\n" + 
"    <div class=\"col col_16 pager  pagination-right\">\n" + 
"        <ul>\n" + 
"            <li>\n" + 
"                <a href=\"");// line 32, japidviews\Application\admin\ChoiceView.html
		p(pagePath);// line 39, japidviews\Application\admin\ChoiceView.html
		p("/");// line 39, japidviews\Application\admin\ChoiceView.html
		p((pageNum-1<=0)?1:(pageNum-1));// line 39, japidviews\Application\admin\ChoiceView.html
		p("\">Prev</a>\n" + 
"            </li>\n" + 
"            ");// line 39, japidviews\Application\admin\ChoiceView.html
		if(pageNum>=2){// line 41, japidviews\Application\admin\ChoiceView.html
		p("\n" + 
"            <li>\n" + 
"                <a href=\"");// line 41, japidviews\Application\admin\ChoiceView.html
		p(pagePath);// line 43, japidviews\Application\admin\ChoiceView.html
		p("/1\">First</a>\n" + 
"            </li>\n" + 
"            ");// line 43, japidviews\Application\admin\ChoiceView.html
		}// line 45, japidviews\Application\admin\ChoiceView.html
		p("\n" + 
"\n" + 
"            <!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n" + 
"            <li><a href=\"#\">2</a></li>\n" + 
"            <li><a href=\"#\">3</a></li>\n" + 
"            <li><a href=\"#\">4</a></li>\n" + 
"            <li><a href=\"#\">5</a></li>-->\n" + 
"            ");// line 45, japidviews\Application\admin\ChoiceView.html
		if(photos.size()>=20){// line 52, japidviews\Application\admin\ChoiceView.html
		p("\n" + 
"            <li>\n" + 
"                <a href=\"");// line 52, japidviews\Application\admin\ChoiceView.html
		p(pagePath);// line 54, japidviews\Application\admin\ChoiceView.html
		p("/");// line 54, japidviews\Application\admin\ChoiceView.html
		p(photos.size()<20?pageNum:(pageNum+1));// line 54, japidviews\Application\admin\ChoiceView.html
		p("\">Next</a>\n" + 
"            </li>\n" + 
"            ");// line 54, japidviews\Application\admin\ChoiceView.html
		}// line 56, japidviews\Application\admin\ChoiceView.html
		p("\n" + 
"\n" + 
"        </ul>\n" + 
"    </div>\n" + 
"</div>\n");// line 56, japidviews\Application\admin\ChoiceView.html
		}// line 61, japidviews\Application\admin\ChoiceView.html
		;// line 61, japidviews\Application\admin\ChoiceView.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( i18n("photo.nav.suffix"));;
	}
	@Override protected void css() {
		// line 7, japidviews\Application\admin\ChoiceView.html
		p("<!---->\n" + 
"<link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 7, japidviews\Application\admin\ChoiceView.html
		p(lookupStatic("/public/styles/photo.css"));// line 9, japidviews\Application\admin\ChoiceView.html
		p("\"/>\n");// line 9, japidviews\Application\admin\ChoiceView.html
		;
	}
	@Override protected void header() {
		p( "Views");;
	}
}