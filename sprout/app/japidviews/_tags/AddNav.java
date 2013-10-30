//version: 0.9.35
package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.*;
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
// NOTE: This file was generated from: japidviews/_tags/AddNav.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class AddNav extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/AddNav.html";
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


	public AddNav() {
		super(null);
	}
	public AddNav(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"item",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.AddNav.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String item; // line 2, japidviews/_tags/AddNav.html
	public cn.bran.japid.template.RenderResult render(String item) {
		this.item = item;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 2, japidviews/_tags/AddNav.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String item) {
		return new AddNav().render(item);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_tags\AddNav.html

Map  ms=new HashMap();// line 3, japidviews\_tags\AddNav.html

ms.put(item," class=\"active\" ");// line 4, japidviews\_tags\AddNav.html

System.out.println(ms);// line 5, japidviews\_tags\AddNav.html

String qs= request.querystring;// line 6, japidviews\_tags\AddNav.html

String qString="";// line 7, japidviews\_tags\AddNav.html

if(qs!=null && !"".equals(qs)){// line 8, japidviews\_tags\AddNav.html

qString="?"+qs;// line 9, japidviews\_tags\AddNav.html

}// line 10, japidviews\_tags\AddNav.html
		p("\n" + 
"<div class=\"grid_row  photo_nav\" >\n" + 
"	<div class=\"col col_13\">\n" + 
"\n" + 
"		<ul class=\"nav nav-pills\">\n" + 
"            <li  ");// line 10, japidviews\_tags\AddNav.html
		p(ms.get("upload"));// line 15, japidviews\_tags\AddNav.html
		p(">\n" + 
"            <a href=\"/upload");// line 15, japidviews\_tags\AddNav.html
		p(qString);// line 16, japidviews\_tags\AddNav.html
		p("\">");// line 16, japidviews\_tags\AddNav.html
		;p(getMessage("add.photo"));// line 16, japidviews\_tags\AddNav.html
		p("</a>\n" + 
"            </li>\n" + 
"            <li  ");// line 16, japidviews\_tags\AddNav.html
		p(ms.get("ps"));// line 18, japidviews\_tags\AddNav.html
		p(">\n" + 
"            <a href=\"/ps/upload");// line 18, japidviews\_tags\AddNav.html
		p(qString);// line 19, japidviews\_tags\AddNav.html
		p("\">");// line 19, japidviews\_tags\AddNav.html
		;p(getMessage("add.ps"));// line 19, japidviews\_tags\AddNav.html
		p("</a>\n" + 
"            </li>\n" + 
"			<li  ");// line 19, japidviews\_tags\AddNav.html
		p(ms.get("story"));// line 21, japidviews\_tags\AddNav.html
		p(">\n" + 
"				<a href=\"/story");// line 21, japidviews\_tags\AddNav.html
		p(qString);// line 22, japidviews\_tags\AddNav.html
		p("\">");// line 22, japidviews\_tags\AddNav.html
		;p(getMessage("add.story"));// line 22, japidviews\_tags\AddNav.html
		p("</a>\n" + 
"			</li>\n" + 
"			<li  ");// line 22, japidviews\_tags\AddNav.html
		p(ms.get("blink"));// line 24, japidviews\_tags\AddNav.html
		p(">\n" + 
"				<a href=\"/blink");// line 24, japidviews\_tags\AddNav.html
		p(qString);// line 25, japidviews\_tags\AddNav.html
		p("\">");// line 25, japidviews\_tags\AddNav.html
		;p(getMessage("add.blink"));// line 25, japidviews\_tags\AddNav.html
		p("</a>\n" + 
"			</li>\n" + 
"			<li  ");// line 25, japidviews\_tags\AddNav.html
		p(ms.get("manage"));// line 27, japidviews\_tags\AddNav.html
		p(">\n" + 
"				<a href=\"/photo/manage");// line 27, japidviews\_tags\AddNav.html
		p(qString);// line 28, japidviews\_tags\AddNav.html
		p("\">");// line 28, japidviews\_tags\AddNav.html
		;p(getMessage("add.manage"));// line 28, japidviews\_tags\AddNav.html
		p("</a>\n" + 
"			</li>\n" + 
"\n" + 
"		 \n" + 
"		</ul>\n" + 
"\n" + 
"	</div>\n" + 
" \n" + 
"	<div class=\"col col_16  hr\"></div>\n" + 
"</div>");// line 28, japidviews\_tags\AddNav.html
		
		endDoLayout(sourceTemplate);
	}

}