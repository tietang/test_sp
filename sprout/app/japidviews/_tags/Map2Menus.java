package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.*; import java.util.Map.Entry;
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
// NOTE: This file was generated from: japidviews/_tags/Map2Menus.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Map2Menus extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/Map2Menus.html";
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


	public Map2Menus() {
		super(null);
	}
	public Map2Menus(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"map", "defaultKey",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map", "Byte",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.Map2Menus.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Map map; // line 2, japidviews/_tags/Map2Menus.html
	private Byte defaultKey; // line 2, japidviews/_tags/Map2Menus.html
	public cn.bran.japid.template.RenderResult render(Map map,Byte defaultKey) {
		this.map = map;
		this.defaultKey = defaultKey;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2, japidviews/_tags/Map2Menus.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Map map,Byte defaultKey) {
		return new Map2Menus().render(map, defaultKey);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_tags\Map2Menus.html
Map kv=new LinkedHashMap(map);// line 3, japidviews\_tags\Map2Menus.html
//kv.remove((byte)0);// line 4, japidviews\_tags\Map2Menus.html
if(kv==null) kv=new LinkedHashMap();// line 5, japidviews\_tags\Map2Menus.html
Set  sets = kv.entrySet();// line 6, japidviews\_tags\Map2Menus.html

for (Object obj : sets) {// line 8, japidviews\_tags\Map2Menus.html
Entry entry=(Entry)obj;// line 9, japidviews\_tags\Map2Menus.html
Byte key=(Byte)entry.getKey();// line 10, japidviews\_tags\Map2Menus.html
Object value=entry.getValue();// line 11, japidviews\_tags\Map2Menus.html
if(key==null){// line 12, japidviews\_tags\Map2Menus.html
		p("<li><a tabindex=\"-1\" href=\"");// line 12, japidviews\_tags\Map2Menus.html
		p(request.path);// line 13, japidviews\_tags\Map2Menus.html
		p("\">");// line 13, japidviews\_tags\Map2Menus.html
		p(value);// line 13, japidviews\_tags\Map2Menus.html
		p("</a></li>\n");// line 13, japidviews\_tags\Map2Menus.html
		}else if(key<0){// line 14, japidviews\_tags\Map2Menus.html
		p("<li class=\"divider\">");// line 14, japidviews\_tags\Map2Menus.html
		p(value);// line 15, japidviews\_tags\Map2Menus.html
		p("</li>\n");// line 15, japidviews\_tags\Map2Menus.html
		}else{// line 16, japidviews\_tags\Map2Menus.html
if(key.equals(defaultKey)){// line 17, japidviews\_tags\Map2Menus.html
		p("<li><a tabindex=\"-1\" href=\"");// line 17, japidviews\_tags\Map2Menus.html
		p(request.path);// line 18, japidviews\_tags\Map2Menus.html
		p("?c=");// line 18, japidviews\_tags\Map2Menus.html
		p(key);// line 18, japidviews\_tags\Map2Menus.html
		p("\">");// line 18, japidviews\_tags\Map2Menus.html
		p(value);// line 18, japidviews\_tags\Map2Menus.html
		p("</a></li>\n");// line 18, japidviews\_tags\Map2Menus.html
		}else{// line 19, japidviews\_tags\Map2Menus.html
		p("<li><a tabindex=\"-1\" href=\"");// line 19, japidviews\_tags\Map2Menus.html
		p(request.path);// line 20, japidviews\_tags\Map2Menus.html
		p("?c=");// line 20, japidviews\_tags\Map2Menus.html
		p(key);// line 20, japidviews\_tags\Map2Menus.html
		p("\">");// line 20, japidviews\_tags\Map2Menus.html
		p(value);// line 20, japidviews\_tags\Map2Menus.html
		p("</a></li>\n");// line 20, japidviews\_tags\Map2Menus.html
		}// line 21, japidviews\_tags\Map2Menus.html
}// line 22, japidviews\_tags\Map2Menus.html

}// line 24, japidviews\_tags\Map2Menus.html
		p("\n");// line 24, japidviews\_tags\Map2Menus.html
		
		endDoLayout(sourceTemplate);
	}

}