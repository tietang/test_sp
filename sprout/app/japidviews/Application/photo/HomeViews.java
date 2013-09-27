package japidviews.Application.photo;

import fengfei.fir.model.PhotoShow;
import japidviews._tags.HomeNav;

import java.util.List;
import java.util.Map;

import static cn.bran.play.JapidPlayAdapter.lookupStatic;
//
// NOTE: This file was generated from: japidviews/Application/photo/HomeViews.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class HomeViews extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/HomeViews.html";
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


	public HomeViews() {
		super(null);
	}
	public HomeViews(StringBuilder out) {
		super(out);
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
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 5, japidviews/Application/photo/HomeViews.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Map<String, String> pathTitle,String pagePath,List<? extends PhotoShow> photos,int pageNum) {
		return new HomeViews().render(pathTitle, pagePath, photos, pageNum);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\photo\HomeViews.html
// line 8, japidviews\Application\photo\HomeViews.html
final HomeNav _HomeNav3 = new HomeNav(getOut()); _HomeNav3.setActionRunners(getActionRunners()).setOut(getOut()); _HomeNav3.render(pagePath,pathTitle); // line 12, japidviews\Application\photo\HomeViews.html// line 12, japidviews\Application\photo\HomeViews.html
final PhotoView _PhotoView4 = new PhotoView(getOut()); _PhotoView4.setActionRunners(getActionRunners()).setOut(getOut()); _PhotoView4.render(pagePath,photos,pageNum); // line 13, japidviews\Application\photo\HomeViews.html// line 13, japidviews\Application\photo\HomeViews.html
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