//version: 0.9.35
package japidviews.Application.email;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/Application/email/RegisterVerify.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class RegisterVerify extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/email/RegisterVerify.html";
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


	public RegisterVerify() {
		super(null);
	}
	public RegisterVerify(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"name", "content",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "String",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.email.RegisterVerify.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String name; // line 3, japidviews/Application/email/RegisterVerify.html
	private String content; // line 3, japidviews/Application/email/RegisterVerify.html
	public cn.bran.japid.template.RenderResult render(String name,String content) {
		this.name = name;
		this.content = content;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 3, japidviews/Application/email/RegisterVerify.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String name,String content) {
		return new RegisterVerify().render(name, content);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<!DOCTYPE html>\n");// line 1, japidviews\Application\email\RegisterVerify.html

p("\n" + 
"<html>\n" + 
"	<head>\n" + 
"		<meta charset=\"UTF-8\">\n" + 
"		<title>Register Verify</title>\n" + 
"	</head>\n" + 
"\n" + 
"	<body>\n" + 
"\n" + 
"		<h1></h1>\n" + 
"		<p>");// line 3, japidviews\Application\email\RegisterVerify.html
		try { p(content); } catch (NullPointerException npe) {}// line 13, japidviews\Application\email\RegisterVerify.html
		p("</p>\n" + 
"		<div></div>\n" + 
"	</body>\n" + 
"</html>\n");// line 13, japidviews\Application\email\RegisterVerify.html
		
		endDoLayout(sourceTemplate);
	}

}