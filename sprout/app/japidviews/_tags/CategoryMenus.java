package japidviews._tags;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//
// NOTE: This file was generated from: japidviews/_tags/CategoryMenus.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class CategoryMenus extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/CategoryMenus.html";
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


	public CategoryMenus() {
		super(null);
	}
	public CategoryMenus(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"map", "defaultKey",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map", "Byte",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.CategoryMenus.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Map map; // line 2, japidviews/_tags/CategoryMenus.html
	private Byte defaultKey; // line 2, japidviews/_tags/CategoryMenus.html
	public cn.bran.japid.template.RenderResult render(Map map,Byte defaultKey) {
		this.map = map;
		this.defaultKey = defaultKey;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2, japidviews/_tags/CategoryMenus.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Map map,Byte defaultKey) {
		return new CategoryMenus().render(map, defaultKey);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_tags\CategoryMenus.html
Map kv=new LinkedHashMap(map);// line 3, japidviews\_tags\CategoryMenus.html
//kv.remove((byte)0);// line 4, japidviews\_tags\CategoryMenus.html
if(kv==null) kv=new LinkedHashMap();// line 5, japidviews\_tags\CategoryMenus.html
Set  sets = kv.entrySet();// line 6, japidviews\_tags\CategoryMenus.html

for (Object obj : sets) {// line 8, japidviews\_tags\CategoryMenus.html
Entry entry=(Entry)obj;// line 9, japidviews\_tags\CategoryMenus.html
Byte key=(Byte)entry.getKey();// line 10, japidviews\_tags\CategoryMenus.html
Object value=entry.getValue();// line 11, japidviews\_tags\CategoryMenus.html
if(key==null){// line 12, japidviews\_tags\CategoryMenus.html
		p("<li><a tabindex=\"-1\" href=\"");// line 12, japidviews\_tags\CategoryMenus.html
		p(request.path);// line 13, japidviews\_tags\CategoryMenus.html
		p("\">");// line 13, japidviews\_tags\CategoryMenus.html
		p(value);// line 13, japidviews\_tags\CategoryMenus.html
		p("</a></li>\n");// line 13, japidviews\_tags\CategoryMenus.html
		}else if(key<0){// line 14, japidviews\_tags\CategoryMenus.html
		p("<li class=\"divider\">");// line 14, japidviews\_tags\CategoryMenus.html
		p(value);// line 15, japidviews\_tags\CategoryMenus.html
		p("</li>\n");// line 15, japidviews\_tags\CategoryMenus.html
		}else{// line 16, japidviews\_tags\CategoryMenus.html
if(key.equals(defaultKey)){// line 17, japidviews\_tags\CategoryMenus.html
		p("<li><a tabindex=\"-1\" href=\"");// line 17, japidviews\_tags\CategoryMenus.html
		p(request.path);// line 18, japidviews\_tags\CategoryMenus.html
		p("?c=");// line 18, japidviews\_tags\CategoryMenus.html
		p(key);// line 18, japidviews\_tags\CategoryMenus.html
		p("\">");// line 18, japidviews\_tags\CategoryMenus.html
		p(value);// line 18, japidviews\_tags\CategoryMenus.html
		p("</a></li>\n");// line 18, japidviews\_tags\CategoryMenus.html
		}else{// line 19, japidviews\_tags\CategoryMenus.html
		p("<li><a tabindex=\"-1\" href=\"");// line 19, japidviews\_tags\CategoryMenus.html
		p(request.path);// line 20, japidviews\_tags\CategoryMenus.html
		p("?c=");// line 20, japidviews\_tags\CategoryMenus.html
		p(key);// line 20, japidviews\_tags\CategoryMenus.html
		p("\">");// line 20, japidviews\_tags\CategoryMenus.html
		p(value);// line 20, japidviews\_tags\CategoryMenus.html
		p("</a></li>\n");// line 20, japidviews\_tags\CategoryMenus.html
		}// line 21, japidviews\_tags\CategoryMenus.html
}// line 22, japidviews\_tags\CategoryMenus.html

}// line 24, japidviews\_tags\CategoryMenus.html
		p("\n");// line 24, japidviews\_tags\CategoryMenus.html
		
		endDoLayout(sourceTemplate);
	}

}