package japidviews.Application;

import static cn.bran.play.JapidPlayAdapter.flash;
//
// NOTE: This file was generated from: japidviews/Application/Login1.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Login1 extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/Login1.html";
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


	public Login1() {
		super(null);
	}
	public Login1(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Login1.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/Login1.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Login1().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\Login1.html
 // line 1, japidviews\Application\Login1.html
		p("<div id=\"login\" class=\"grid_row login\">\n" + 
"	<div class=\"col col_16\">\n" + 
"\n" + 
"		<div class=\"row-fluid\">\n" + 
"\n" + 
"			<div class=\"span6\">\n" + 
"				<h3>Login to your account</h3>\n" + 
"				<div class=\"control-group\">\n" + 
"					<div class=\"controls\">\n" + 
"						<div id=\"wb_connect_btn\" class=\"btn\"></div>\n" + 
"						<script type=\"text/javascript\">\n" + 
"							WB2.anyWhere(function(W) {\n" + 
"								W.widget.connectButton({\n" + 
"									id : \"wb_connect_btn\",\n" + 
"									type : '4,2',\n" + 
"									callback : {\n" + 
"										login : function(o) {\n" + 
"											alert(o.screen_name)\n" + 
"										},\n" + 
"										logout : function() {\n" + 
"											alert('logout');\n" + 
"										}\n" + 
"									}\n" + 
"								});\n" + 
"							});\n" + 
"						</script>\n" + 
"					</div>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"span6\">\n" + 
"\n" + 
"				<form class=\"form-horizontal\"  method=\"post\" action=\"/login");// line 9, japidviews\Application\Login1.html
		p(flash.get("cpage"));// line 41, japidviews\Application\Login1.html
		p("\">\n" + 
"					<div class=\"control-group\">\n" + 
"						No account yet? <a href=\"/signup\">Sign up</a>\n" + 
"					</div>\n" + 
"					");// line 41, japidviews\Application\Login1.html
		if(asBoolean(asBoolean(flash.get("error")))) {// line 45, japidviews\Application\Login1.html
		p("\n" + 
"\n" + 
"					<div class=\"alert alert-error control-group\">\n" + 
"						<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n" + 
"							&times;\n" + 
"						</button>\n" + 
"						");// line 45, japidviews\Application\Login1.html
		p(flash.get("error"));// line 51, japidviews\Application\Login1.html
		p("\n" + 
"					</div>\n" + 
"\n" + 
"					");// line 51, japidviews\Application\Login1.html
		}// line 54, japidviews\Application\Login1.html
		p("\n" + 
"					<div class=\"input_control_group\">\n" + 
"						Login with your username or email\n" + 
"					</div>\n" + 
"					<div class=\"input_control_group\">\n" + 
"						<input type=\"text\" name=\"email\" id=\"inputEmail\" placeholder=\"Email or Username\" value=\"");// line 54, japidviews\Application\Login1.html
		p(flash.get(" email"));// line 59, japidviews\Application\Login1.html
		p("\"/>\n" + 
"					</div>\n" + 
"					<div class=\"input_control_group\">\n" + 
"						<input type=\"password\" name=\"password\" id=\"inputPassword\" placeholder=\"Password\" />\n" + 
"					</div>\n" + 
"					<div class=\"input_control_group\">\n" + 
"						<small class=\"left terms\"><a href=\"/recover\" target=\"_\">Can't access your account?</a></small>\n" + 
"						<button type=\"submit\" class=\"btn\">\n" + 
"							Login\n" + 
"						</button>\n" + 
"					</div>\n" + 
"\n" + 
"				</form>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"\n" + 
"</div>");// line 59, japidviews\Application\Login1.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy Login Page");;
	}
	@Override protected void css() {
		// line 1, japidviews\Application\Login1.html
		p("<style type=\"text/css\">\n" + 
"    .input_control_group {\n" + 
"        margin-bottom: 4px;\n" + 
"    }\n" + 
"\n" + 
"</style>\n" + 
"<script src=\"http://tjs.sjs.sinajs.cn/open/api/js/wb.js?appkey=1166443256\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");// line 1, japidviews\Application\Login1.html
		;
	}
}