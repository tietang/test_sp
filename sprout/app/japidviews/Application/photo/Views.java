//version: 0.9.35
package japidviews.Application.photo;

import fengfei.fir.model.PhotoShow;
import japidviews._tags.PhotoNav;

import java.util.List;
import java.util.Map;

import static cn.bran.play.JapidPlayAdapter.i18n;
import static cn.bran.play.JapidPlayAdapter.lookupStatic;
//
// NOTE: This file was generated from: japidviews/Application/photo/Views.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Views extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Views.html";
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


	public Views() {
		super(null);
	}
	public Views(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"pathTitle", "pagePath", "photos", "pageNum",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map<String, String>", "String", "List<? extends PhotoShow>", "int",  };
	public static final Object[] argDefaults= new Object[] {null,null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Views.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Map<String, String> pathTitle; // line 4, japidviews/Application/photo/Views.html
	private String pagePath; // line 4, japidviews/Application/photo/Views.html
	private List<? extends PhotoShow> photos; // line 4, japidviews/Application/photo/Views.html
	private int pageNum; // line 4, japidviews/Application/photo/Views.html
	public cn.bran.japid.template.RenderResult render(Map<String, String> pathTitle,String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		this.pathTitle = pathTitle;
		this.pagePath = pagePath;
		this.photos = photos;
		this.pageNum = pageNum;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 4, japidviews/Application/photo/Views.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Map<String, String> pathTitle,String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		return new Views().render(pathTitle, pagePath, photos, pageNum);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\photo\Views.html

// line 7, japidviews\Application\photo\Views.html
final PhotoNav _PhotoNav3 = new PhotoNav(getOut()); _PhotoNav3.setActionRunners(getActionRunners()).setOut(getOut()); _PhotoNav3.render(pagePath,pathTitle); // line 11, japidviews\Application\photo\Views.html// line 11, japidviews\Application\photo\Views.html

final PhotoView _PhotoView4 = new PhotoView(getOut()); _PhotoView4.setActionRunners(getActionRunners()).setOut(getOut()); _PhotoView4.render(pagePath,photos,pageNum); // line 12, japidviews\Application\photo\Views.html// line 12, japidviews\Application\photo\Views.html
		;// line 12, japidviews\Application\photo\Views.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( pathTitle.get(pagePath)+" "+i18n("photo.nav.suffix"));;
	}
	@Override protected void css() {
		// line 7, japidviews\Application\photo\Views.html
		p("<!---->\n" + 
"<link rel=\"stylesheet\" type=\"text/css\" href=\"");// line 7, japidviews\Application\photo\Views.html
		p(lookupStatic("/public/styles/photo.css"));// line 9, japidviews\Application\photo\Views.html
		p("\"/>\n");// line 9, japidviews\Application\photo\Views.html
		;
	}
	@Override protected void header() {
		p( "Views");;
	}
}