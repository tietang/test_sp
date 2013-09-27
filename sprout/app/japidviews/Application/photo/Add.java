package japidviews.Application.photo;

import static cn.bran.play.JapidPlayAdapter.getMessage;
//
// NOTE: This file was generated from: japidviews/Application/photo/Add.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Add extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Add.html";
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


	public Add() {
		super(null);
	}
	public Add(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Add.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/photo/Add.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Add().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\photo\Add.html
p("\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"	<div class=\"col photo_col width_4\">\n" + 
"		<a href=\"/upload\"  >\n" + 
"		<div class=\"photo_preview photo_preview_4 \">\n" + 
"			");// line 3, japidviews\Application\photo\Add.html
		;p(getMessage("add.upload"));// line 10, japidviews\Application\photo\Add.html
		p("		</div></a>\n" + 
"	</div>\n" + 
"	<div class=\"col photo_col width_4\">\n" + 
"		<a href=\"/story\"  >\n" + 
"		<div class=\"photo_preview photo_preview_4 \">\n" + 
"			");// line 10, japidviews\Application\photo\Add.html
		;p(getMessage("add.story"));// line 16, japidviews\Application\photo\Add.html
		p("		</div> </a>\n" + 
"	</div>\n" + 
"	<div class=\"col photo_col width_4\">\n" + 
"		<a href=\"/blink\"   >\n" + 
"		<div class=\"photo_preview photo_preview_4 \">\n" + 
"			");// line 16, japidviews\Application\photo\Add.html
		;p(getMessage("add.blink"));// line 22, japidviews\Application\photo\Add.html
		p("		</div> </a>\n" + 
"	</div>\n" + 
"	<div class=\"col photo_col width_4\">\n" + 
"		<a href=\"/photo/manage\"  >\n" + 
"		<div class=\"photo_preview photo_preview_4 \">\n" + 
"			");// line 22, japidviews\Application\photo\Add.html
		;p(getMessage("add.manage"));// line 28, japidviews\Application\photo\Add.html
		p("		</div> </a>\n" + 
"	</div>\n" + 
"</div>");// line 28, japidviews\Application\photo\Add.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Home Page");;
	}
	@Override protected void header() {
		p( "Index");;
	}
}