package japidviews.Application.error;

//
// NOTE: This file was generated from: japidviews/Application/error/E404.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class E404 extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/error/E404.html";
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


	public E404() {
		super(null);
	}
	public E404(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.error.E404.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/error/E404.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new E404().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\error\E404.html

p("\n" + 
"<div class=\"grid_row\">\n" + 
"	<div class=\"col col_16\">\n" + 
"		<div class=\"alert\">\n" + 
"			<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n" + 
"				×\n" + 
"			</button>\n" + 
"			<strong>Warning!</strong> 404 Error!\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"</div>\n" + 
"\n");// line 2, japidviews\Application\error\E404.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "404");;
	}
	@Override protected void header() {
		p( "404");;
	}
}