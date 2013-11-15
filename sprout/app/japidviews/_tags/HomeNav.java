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
// NOTE: This file was generated from: japidviews/_tags/HomeNav.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class HomeNav extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/HomeNav.html";
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


	public HomeNav() {
		super(null);
	}
	public HomeNav(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"item", "pathTitle",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "Map<String, String>",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.HomeNav.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String item; // line 2, japidviews/_tags/HomeNav.html
	private Map<String, String> pathTitle; // line 2, japidviews/_tags/HomeNav.html
	public cn.bran.japid.template.RenderResult render(String item,Map<String, String> pathTitle) {
		this.item = item;
		this.pathTitle = pathTitle;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 2, japidviews/_tags/HomeNav.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String item,Map<String, String> pathTitle) {
		return new HomeNav().render(item, pathTitle);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_tags\HomeNav.html

Map  ms=new HashMap();// line 3, japidviews\_tags\HomeNav.html

ms.put(item," class=\"active\" ");// line 4, japidviews\_tags\HomeNav.html

String qs= request.querystring;// line 5, japidviews\_tags\HomeNav.html

String qString="";// line 6, japidviews\_tags\HomeNav.html

if(qs!=null && !"".equals(qs)){// line 7, japidviews\_tags\HomeNav.html

qString="?"+qs;// line 8, japidviews\_tags\HomeNav.html

}// line 9, japidviews\_tags\HomeNav.html
		p("\n" + 
"<div class=\"grid_row  photo_nav\" >\n" + 
"	<div class=\"col col_13\">\n" + 
"\n" + 
"		<ul class=\"nav nav-pills\">\n" + 
"			<li  ");// line 9, japidviews\_tags\HomeNav.html
		p(ms.get("/flow"));// line 14, japidviews\_tags\HomeNav.html
		p(">\n" + 
"				<a href=\"/flow");// line 14, japidviews\_tags\HomeNav.html
		p(qString);// line 15, japidviews\_tags\HomeNav.html
		p("\">Flow</a>\n" + 
"			</li>\n" + 
"			<li  ");// line 15, japidviews\_tags\HomeNav.html
		p(ms.get("/fav"));// line 17, japidviews\_tags\HomeNav.html
		p(">\n" + 
"				<a href=\"/fav");// line 17, japidviews\_tags\HomeNav.html
		p(qString);// line 18, japidviews\_tags\HomeNav.html
		p("\">Favorites</a>\n" + 
"			</li>\n" + 
"			<li  ");// line 18, japidviews\_tags\HomeNav.html
		p(ms.get("/activity"));// line 20, japidviews\_tags\HomeNav.html
		p(">\n" + 
"				<a href=\"/activity");// line 20, japidviews\_tags\HomeNav.html
		p(qString);// line 21, japidviews\_tags\HomeNav.html
		p("\">Activity</a>\n" + 
"			</li>\n" + 
"\n" + 
"		</ul>\n" + 
"\n" + 
"	</div>\n" + 
"	<div class=\"col col_3 col_right\">\n" + 
"		<div class=\"row-fluid\">\n" + 
"			\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"	<div class=\"col col_16  hr\"></div>\n" + 
"</div>");// line 21, japidviews\_tags\HomeNav.html
		
		endDoLayout(sourceTemplate);
	}

}