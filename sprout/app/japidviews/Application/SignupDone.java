package japidviews.Application;

import fengfei.ucm.entity.profile.UserPwd;
//
// NOTE: This file was generated from: japidviews/Application/SignupDone.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class SignupDone extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/SignupDone.html";
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


	public SignupDone() {
		super(null);
	}
	public SignupDone(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"up",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"UserPwd",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.SignupDone.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private UserPwd up; // line 3, japidviews/Application/SignupDone.html
	public cn.bran.japid.template.RenderResult render(UserPwd up) {
		this.up = up;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 3, japidviews/Application/SignupDone.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(UserPwd up) {
		return new SignupDone().render(up);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\SignupDone.html
// line 6, japidviews\Application\SignupDone.html
		p("<p class=\"line10\"></p><p class=\"line10\"></p>\n" + 
"<div class=\"grid_row signupx\">\n" + 
"	<div class=\"col col_4\" >\n" + 
"		<p  ></p>\n" + 
"	</div>\n" + 
"	<div class=\"col col_8\" >\n" + 
"\n" + 
"		<div id=\"login\"   class=\"cardx\"   >\n" + 
"			<h5>Hi, ");// line 8, japidviews\Application\SignupDone.html
		p(up.userName);// line 17, japidviews\Application\SignupDone.html
		p("</h5>\n" + 
"			<p>\n" + 
"				Your email address: ");// line 17, japidviews\Application\SignupDone.html
		p(up.email);// line 19, japidviews\Application\SignupDone.html
		p("			</p>\n" + 
"			<p>\n" + 
"				Register sucess! Check your email to verify email address.\n" + 
"			</p>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div class=\"col col_4\" >\n" + 
"		<p></p>\n" + 
"	</div>\n" + 
"</div>");// line 19, japidviews\Application\SignupDone.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy Log in Page");;
	}
	@Override protected void css() {
		// line 6, japidviews\Application\SignupDone.html
;
	}
	@Override protected void header() {
		p(" Log in ");;
	}
}