//version: 0.9.37
package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/Application/photo/you.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class you extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/you.html";
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


	public you() {
	super((StringBuilder)null);
	initHeaders();
	}
	public you(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public you(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.you.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/Application/photo/you.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new you().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, japidviews\Application\photo\you.html

p("\n" + 
"\n" + 
"<ul class=\"dropdown-menu\">\n" + 
"	<li>\n" + 
"		<a href=\"/settings/profile\"><i class=\"icon-pencil\"></i>Setting</a>\n" + 
"	</li>\n" + 
"	<li>\n" + 
"		<a href=\"/account\"><i class=\"icon-trash\"></i> Account</a>\n" + 
"	</li>\n" + 
"	<li>\n" + 
"		<a href=\"/profile\"><i class=\"icon-ban-circle\"></i>Profile</a>\n" + 
"	</li>\n" + 
"	<li class=\"divider\"></li>\n" + 
"	<li>\n" + 
"		<a href=\"/store\"><i class=\"i\"></i> Store</a>\n" + 
"	</li>\n" + 
"	<li class=\"divider\"></li>\n" + 
"	<li>\n" + 
"		<a href=\"/logout\"><i class=\"i\"></i> Logout</a>\n" + 
"	</li>\n" + 
"</ul>");// line 3, japidviews\Application\photo\you.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Home Page");;
	}
	@Override protected void header() {
		p( "Show");;
	}
}