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
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/_tags/PhotoNav.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class PhotoNav extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/PhotoNav.html";
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


	public PhotoNav() {
		super(null);
	}
	public PhotoNav(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"item", "pathTitle",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "Map<String, String>",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.PhotoNav.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String item; // line 2, japidviews/_tags/PhotoNav.html
	private Map<String, String> pathTitle; // line 2, japidviews/_tags/PhotoNav.html
	public cn.bran.japid.template.RenderResult render(String item,Map<String, String> pathTitle) {
		this.item = item;
		this.pathTitle = pathTitle;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 2, japidviews/_tags/PhotoNav.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String item,Map<String, String> pathTitle) {
		return new PhotoNav().render(item, pathTitle);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_tags\PhotoNav.html

Map  ms=new HashMap();// line 3, japidviews\_tags\PhotoNav.html

ms.put(item," class=\"active\" ");// line 4, japidviews\_tags\PhotoNav.html

System.out.println(ms);// line 5, japidviews\_tags\PhotoNav.html

String qs= request.querystring;// line 6, japidviews\_tags\PhotoNav.html

String qString="";// line 7, japidviews\_tags\PhotoNav.html

if(qs!=null && !"".equals(qs)){// line 8, japidviews\_tags\PhotoNav.html

qString="?"+qs;// line 9, japidviews\_tags\PhotoNav.html

}// line 10, japidviews\_tags\PhotoNav.html
		p("\n" + 
"<div class=\"grid_row  photo_nav\" >\n" + 
"	<div class=\"col col_13\">\n" + 
"\n" + 
"		<ul class=\"nav nav-pills\">\n" + 
"			<li ");// line 10, japidviews\_tags\PhotoNav.html
		p(ms.get("/pop"));// line 15, japidviews\_tags\PhotoNav.html
		p(">\n" + 
"				<a href=\"/popular");// line 15, japidviews\_tags\PhotoNav.html
		p(qString);// line 16, japidviews\_tags\PhotoNav.html
		p("\">");// line 16, japidviews\_tags\PhotoNav.html
		;p(getMessage("pop"));// line 16, japidviews\_tags\PhotoNav.html
		p("</a>\n" + 
"			</li>\n" + 
"			<li  ");// line 16, japidviews\_tags\PhotoNav.html
		p(ms.get("/last"));// line 18, japidviews\_tags\PhotoNav.html
		p(">\n" + 
"				<a href=\"/last");// line 18, japidviews\_tags\PhotoNav.html
		p(qString);// line 19, japidviews\_tags\PhotoNav.html
		p("\">");// line 19, japidviews\_tags\PhotoNav.html
		;p(getMessage("last"));// line 19, japidviews\_tags\PhotoNav.html
		p("</a>\n" + 
"			</li>\n" + 
"			<li  ");// line 19, japidviews\_tags\PhotoNav.html
		p(ms.get("/choice"));// line 21, japidviews\_tags\PhotoNav.html
		p(">\n" + 
"				<a href=\"/choice");// line 21, japidviews\_tags\PhotoNav.html
		p(qString);// line 22, japidviews\_tags\PhotoNav.html
		p("\">");// line 22, japidviews\_tags\PhotoNav.html
		;p(getMessage("choice"));// line 22, japidviews\_tags\PhotoNav.html
		p("</a>\n" + 
"			</li>\n" + 
"			<li  ");// line 22, japidviews\_tags\PhotoNav.html
		p(ms.get("/upcoming"));// line 24, japidviews\_tags\PhotoNav.html
		p(">\n" + 
"				<a href=\"/upcoming");// line 24, japidviews\_tags\PhotoNav.html
		p(qString);// line 25, japidviews\_tags\PhotoNav.html
		p("\">");// line 25, japidviews\_tags\PhotoNav.html
		;p(getMessage("upcoming"));// line 25, japidviews\_tags\PhotoNav.html
		p("</a>\n" + 
"			</li>\n" + 
"\n" + 
"<!--			<li  ");// line 25, japidviews\_tags\PhotoNav.html
		p(ms.get("/category"));// line 28, japidviews\_tags\PhotoNav.html
		p(">\n" + 
"				<a href=\"/category");// line 28, japidviews\_tags\PhotoNav.html
		p(qString);// line 29, japidviews\_tags\PhotoNav.html
		p("\">");// line 29, japidviews\_tags\PhotoNav.html
		;p(getMessage("category"));// line 29, japidviews\_tags\PhotoNav.html
		p("</a>\n" + 
"			</li>-->\n" + 
"		</ul>\n" + 
"\n" + 
"	</div>\n" + 
"	<div class=\"col col_3 col_right\">\n" + 
"		<div class=\"row-fluid\">\n" + 
"			");// line 29, japidviews\_tags\PhotoNav.html
		Map kv1=fengfei.spruce.cache.SimpleCache.categories;// line 36, japidviews\_tags\PhotoNav.html

			Map kv= new LinkedHashMap();kv.put((Byte)null,i18n("all"));// line 37, japidviews\_tags\PhotoNav.html

			kv.putAll(kv1);// line 38, japidviews\_tags\PhotoNav.html

			String skey=params.get("c");// line 39, japidviews\_tags\PhotoNav.html

			Byte key=null;// line 40, japidviews\_tags\PhotoNav.html

			if(skey!=null) {key=Byte.parseByte(skey);}// line 41, japidviews\_tags\PhotoNav.html

			Object value=kv.get(key);// line 42, japidviews\_tags\PhotoNav.html

			if(fengfei.spruce.utils.Browser.isIE67(request)){// line 43, japidviews\_tags\PhotoNav.html
		p("			<div class=\" span12\" >\n" + 
"				<select name=\"category\" id=\"onlyCategoryIe\" class=\"span12\">\n" + 
"					<option value=\"");// line 43, japidviews\_tags\PhotoNav.html
		p(key);// line 46, japidviews\_tags\PhotoNav.html
		p("\">");// line 46, japidviews\_tags\PhotoNav.html
		p(value);// line 46, japidviews\_tags\PhotoNav.html
		p("</option>\n" + 
"					");// line 46, japidviews\_tags\PhotoNav.html
		final CategorySelectOptions _CategorySelectOptions0 = new CategorySelectOptions(getOut()); _CategorySelectOptions0.setActionRunners(getActionRunners()).setOut(getOut()); _CategorySelectOptions0.render(fengfei.spruce.cache.SimpleCache.categories,key); // line 47, japidviews\_tags\PhotoNav.html// line 47, japidviews\_tags\PhotoNav.html
		p("\n" + 
"				</select>\n" + 
"			</div>\n" + 
"			");// line 47, japidviews\_tags\PhotoNav.html
		}else{// line 50, japidviews\_tags\PhotoNav.html
		p("\n" + 
"\n" + 
"			<div class=\"btn-group bootstrap-select span12\" >\n" + 
"				<button type=\"button\" class=\"btn dropdown-toggle btn-inverse span12\" data-toggle=\"dropdown\" data-id=\"onlyCategory1\">\n" + 
"					<div class=\"filter-option pull-left\">\n" + 
"						");// line 50, japidviews\_tags\PhotoNav.html
		p(value);// line 55, japidviews\_tags\PhotoNav.html
		p("\n" + 
"					</div>\n" + 
"					&nbsp;<div class=\"caret\"></div>\n" + 
"				</button>\n" + 
"				<div class=\"dropdown-menu open\" style=\"max-height: 537px; overflow: hidden; min-height: 92px;\">\n" + 
"					<ul class=\"dropdown-menu inner\" role=\"menu\" style=\"max-height: 525px; overflow-y: auto;\">\n" + 
"						");// line 55, japidviews\_tags\PhotoNav.html
		final CategoryMenus _CategoryMenus1 = new CategoryMenus(getOut()); _CategoryMenus1.setActionRunners(getActionRunners()).setOut(getOut()); _CategoryMenus1.render(kv,key); // line 61, japidviews\_tags\PhotoNav.html// line 61, japidviews\_tags\PhotoNav.html
		p("\n" + 
"					</ul>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"\n" + 
"			");// line 61, japidviews\_tags\PhotoNav.html
		}// line 66, japidviews\_tags\PhotoNav.html
		p("\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div class=\"col col_16  hr\"></div>\n" + 
"</div>");// line 66, japidviews\_tags\PhotoNav.html
		
		endDoLayout(sourceTemplate);
	}

}