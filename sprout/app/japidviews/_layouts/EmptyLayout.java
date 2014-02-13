//version: 0.9.37
package japidviews._layouts;
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
// NOTE: This file was generated from: japidviews/_layouts/EmptyLayout.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class EmptyLayout extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/EmptyLayout.html";
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


	public EmptyLayout() {
	super((StringBuilder)null);
	initHeaders();
	}
	public EmptyLayout(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public EmptyLayout(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

	@Override public void layout() {
		beginDoLayout(sourceTemplate);
p("<!DOCTYPE html>\n");// line 1, japidviews\_layouts\EmptyLayout.html
		p("\n" + 
"<html>\n" + 
"	<head>\n" + 
"		<meta charset=\"UTF-8\">\n" + 
"		<title>");// line 2, japidviews\_layouts\EmptyLayout.html
		title();p("</title>\n" + 
"		<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 6, japidviews\_layouts\EmptyLayout.html
		p(lookupStatic("/public/bootstrap/css/bootstrap.min.css"));// line 7, japidviews\_layouts\EmptyLayout.html
		p("\">\n" + 
"		");// line 7, japidviews\_layouts\EmptyLayout.html
		css();p("\n" + 
"	</head>\n" + 
"\n" + 
"	<body>\n" + 
"\n" + 
"		<div class=\"page-header\">\n" + 
"			<h3>");// line 8, japidviews\_layouts\EmptyLayout.html
		header();p("</h3>\n" + 
"		</div>\n" + 
"		");// line 14, japidviews\_layouts\EmptyLayout.html
		doLayout();// line 16, japidviews\_layouts\EmptyLayout.html
		p("\n" + 
"\n" + 
"	</body>\n" + 
"</html>\n");// line 16, japidviews\_layouts\EmptyLayout.html
		
		endDoLayout(sourceTemplate);
	}

	 protected void title() {};
	 protected void header() {};
	 protected void css() {};

	protected abstract void doLayout();
}