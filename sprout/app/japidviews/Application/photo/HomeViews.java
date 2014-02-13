//version: 0.9.37
package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.Set;
import japidviews.Application.photo.PhotoView;
import fengfei.ucm.entity.photo.Refresh;import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
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
// NOTE: This file was generated from: japidviews/Application/photo/HomeViews.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class HomeViews extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/HomeViews.html";
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


	public HomeViews() {
	super((StringBuilder)null);
	initHeaders();
	}
	public HomeViews(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public HomeViews(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"pathTitle", "pagePath", "photos", "pageNum",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map<String, String>", "String", "List<? extends PhotoShow>", "int",  };
	public static final Object[] argDefaults= new Object[] {null,null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.HomeViews.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Map<String, String> pathTitle; // line 5, japidviews/Application/photo/HomeViews.html
	private String pagePath; // line 5, japidviews/Application/photo/HomeViews.html
	private List<? extends PhotoShow> photos; // line 5, japidviews/Application/photo/HomeViews.html
	private int pageNum; // line 5, japidviews/Application/photo/HomeViews.html
	public cn.bran.japid.template.RenderResult render(Map<String, String> pathTitle,String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		this.pathTitle = pathTitle;
		this.pagePath = pagePath;
		this.photos = photos;
		this.pageNum = pageNum;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 5, japidviews/Application/photo/HomeViews.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(Map<String, String> pathTitle,String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		return new HomeViews().render(pathTitle, pagePath, photos, pageNum);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, japidviews\Application\photo\HomeViews.html

// line 8, japidviews\Application\photo\HomeViews.html
new HomeNav(HomeViews.this).render(pagePath,pathTitle); // line 12, japidviews\Application\photo\HomeViews.html// line 12, japidviews\Application\photo\HomeViews.html

new PhotoView(HomeViews.this).render(pagePath,photos,pageNum); // line 13, japidviews\Application\photo\HomeViews.html// line 13, japidviews\Application\photo\HomeViews.html
		;// line 13, japidviews\Application\photo\HomeViews.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Home Page");;
	}
	@Override protected void css() {
		// line 8, japidviews\Application\photo\HomeViews.html
		p("<!---->\n" + 
"<link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 8, japidviews\Application\photo\HomeViews.html
		p(lookupStatic("/public/styles/photo.css"));// line 10, japidviews\Application\photo\HomeViews.html
		p("\"/>\n");// line 10, japidviews\Application\photo\HomeViews.html
		;
	}
	@Override protected void header() {
		p( "Show");;
	}
}