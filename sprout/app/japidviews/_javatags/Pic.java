//version: 0.9.35
package japidviews._javatags;

//
// NOTE: This file was generated from: japidviews/_javatags/Pic.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Pic extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_javatags/Pic.html";
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


	public Pic() {
		super(null);
	}
	public Pic(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"path",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._javatags.Pic.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	{ setHasDoBody(); }
	private String path; // line 1, japidviews/_javatags/Pic.html
public cn.bran.japid.template.RenderResult render(DoBody body, cn.bran.japid.compiler.NamedArgRuntime... named) {
    Object[] args = buildArgs(named, body);
    try {return runRenderer(args);} catch(RuntimeException e) {handleException(e); throw e;} // line 1, japidviews/_javatags/Pic.html
}

	private DoBody body;
public static interface DoBody {
		void render();
		void setBuffer(StringBuilder sb);
		void resetBuffer();
}
 String renderBody() {
		StringBuilder sb = new StringBuilder();
		if (body != null){
			body.setBuffer(sb);
			body.render();
			body.resetBuffer();
		}
		return sb.toString();
	}
	public cn.bran.japid.template.RenderResult render(String path, DoBody body) {
		this.body = body;
		this.path = path;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 1, japidviews/_javatags/Pic.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}
	public cn.bran.japid.template.RenderResult render(String path) {
		this.path = path;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 1, japidviews/_javatags/Pic.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String path) {
		return new Pic().render(path);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_javatags\Pic.html
		p("\n" + 
"\n" + 
"<img alt=\"\" src=\"");// line 1, japidviews\_javatags\Pic.html
		p(path);// line 4, japidviews\_javatags\Pic.html
		p("\">\n");// line 4, japidviews\_javatags\Pic.html
		if (body != null){ body.setBuffer(getOut()); body.render(); body.resetBuffer();}// line 5, japidviews\_javatags\Pic.html
		;// line 5, japidviews\_javatags\Pic.html
		
		endDoLayout(sourceTemplate);
	}

}