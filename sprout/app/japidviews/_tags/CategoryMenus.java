package japidviews._tags;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.*;
import java.util.Map.Entry;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static japidviews._javatags.Pic.*;
import japidviews._layouts.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/_tags/CategoryMenus.html
// Change to this file will be lost next time the template file is compiled.
//
<<<<<<< HEAD:sprout/app/japidviews/_tags/Map2Menus.java

public class Map2Menus extends cn.bran.play.JapidTemplateBase
=======
@cn.bran.play.NoEnhance
public class CategoryMenus extends cn.bran.play.JapidTemplateBase
>>>>>>> c4b85573d6a4acd632da842373367b248a70c20e:sprout/app/japidviews/_tags/CategoryMenus.java
{
	public static final String sourceTemplate = "japidviews/_tags/CategoryMenus.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

	// - add implicit fields with Play

	final Request request = Request.current();
	final Response response = Response.current();
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(
			validation);
	final play.Play _play = new play.Play();

	// - end of implicit fields with Play 

	public CategoryMenus() {
		super(null);
	}
<<<<<<< HEAD:sprout/app/japidviews/_tags/Map2Menus.java

	public Map2Menus(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"map", "defaultKey", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"Map", "Byte", };
	public static final Object[] argDefaults = new Object[] { null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.Map2Menus.class);
=======
	public CategoryMenus(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"map", "defaultKey",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map", "Byte",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.CategoryMenus.class);
>>>>>>> c4b85573d6a4acd632da842373367b248a70c20e:sprout/app/japidviews/_tags/CategoryMenus.java

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

<<<<<<< HEAD:sprout/app/japidviews/_tags/Map2Menus.java
	private Map map; // line 2
	private Byte defaultKey; // line 2

	public cn.bran.japid.template.RenderResult render(Map map, Byte defaultKey) {
		this.map = map;
		this.defaultKey = defaultKey;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 2
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
=======
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
>>>>>>> c4b85573d6a4acd632da842373367b248a70c20e:sprout/app/japidviews/_tags/CategoryMenus.java
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
<<<<<<< HEAD:sprout/app/japidviews/_tags/Map2Menus.java
		//------
		Map kv = new LinkedHashMap(map);// line 3
		//kv.remove((byte)0);// line 4
		if (kv == null)
			kv = new LinkedHashMap();// line 5
		Set sets = kv.entrySet();// line 6

		for (Object obj : sets) {// line 8
			Entry entry = (Entry) obj;// line 9
			Byte key = (Byte) entry.getKey();// line 10
			Object value = entry.getValue();// line 11
			if (key == null) {// line 12
				p("<li><a tabindex=\"-1\" href=\"");// line 12
				p(request.path);// line 13
				p("\">");// line 13
				p(value);// line 13
				p("</a></li>\n");// line 13
			} else if (key < 0) {// line 14
				p("<li class=\"divider\">");// line 14
				p(value);// line 15
				p("</li>\n");// line 15
			} else {// line 16
				if (key.equals(defaultKey)) {// line 17
					p("<li><a tabindex=\"-1\" href=\"");// line 17
					p(request.path);// line 18
					p("?c=");// line 18
					p(key);// line 18
					p("\">");// line 18
					p(value);// line 18
					p("</a></li>\n");// line 18
				} else {// line 19
					p("<li><a tabindex=\"-1\" href=\"");// line 19
					p(request.path);// line 20
					p("?c=");// line 20
					p(key);// line 20
					p("\">");// line 20
					p(value);// line 20
					p("</a></li>\n");// line 20
				}// line 21
			}// line 22

		}// line 24
		p("\n");// line 24

=======
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
		
>>>>>>> c4b85573d6a4acd632da842373367b248a70c20e:sprout/app/japidviews/_tags/CategoryMenus.java
		endDoLayout(sourceTemplate);
	}

}
