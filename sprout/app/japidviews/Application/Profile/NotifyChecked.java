//version: 0.9.35
package japidviews.Application.profile;

//
// NOTE: This file was generated from: japidviews/Application/profile/NotifyChecked.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class NotifyChecked extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/NotifyChecked.html";
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


	public NotifyChecked() {
		super(null);
	}
	public NotifyChecked(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"checks", "index",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"boolean[]", "int",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.NotifyChecked.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private boolean[] checks; // line 2, japidviews/Application/profile/NotifyChecked.html
	private int index; // line 2, japidviews/Application/profile/NotifyChecked.html
	public cn.bran.japid.template.RenderResult render(boolean[] checks,int index) {
		this.checks = checks;
		this.index = index;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 2, japidviews/Application/profile/NotifyChecked.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(boolean[] checks,int index) {
		return new NotifyChecked().render(checks, index);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\profile\NotifyChecked.html

if(checks[index-1]){// line 3, japidviews\Application\profile\NotifyChecked.html
		p("checked");// line 3, japidviews\Application\profile\NotifyChecked.html
		}// line 3, japidviews\Application\profile\NotifyChecked.html
		;// line 3, japidviews\Application\profile\NotifyChecked.html
		
		endDoLayout(sourceTemplate);
	}

}