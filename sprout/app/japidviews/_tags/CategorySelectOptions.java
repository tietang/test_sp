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
// NOTE: This file was generated from: japidviews/_tags/CategorySelectOptions.html
// Change to this file will be lost next time the template file is compiled.
//
<<<<<<< HEAD:sprout/app/japidviews/_tags/Map2SelectOptions.java

public class Map2SelectOptions extends cn.bran.play.JapidTemplateBase
=======
@cn.bran.play.NoEnhance
public class CategorySelectOptions extends cn.bran.play.JapidTemplateBase
>>>>>>> c4b85573d6a4acd632da842373367b248a70c20e:sprout/app/japidviews/_tags/CategorySelectOptions.java
{
	public static final String sourceTemplate = "japidviews/_tags/CategorySelectOptions.html";
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

	public CategorySelectOptions() {
		super(null);
	}
<<<<<<< HEAD:sprout/app/japidviews/_tags/Map2SelectOptions.java

	public Map2SelectOptions(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"kv", "defaultKey", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"Map", "Byte", };
	public static final Object[] argDefaults = new Object[] { null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.Map2SelectOptions.class);
=======
	public CategorySelectOptions(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"kv", "defaultKey",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map", "Byte",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.CategorySelectOptions.class);
>>>>>>> c4b85573d6a4acd632da842373367b248a70c20e:sprout/app/japidviews/_tags/CategorySelectOptions.java

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private Map kv; // line 2
	private Byte defaultKey; // line 2

<<<<<<< HEAD:sprout/app/japidviews/_tags/Map2SelectOptions.java
	public cn.bran.japid.template.RenderResult render(Map kv, Byte defaultKey) {
		this.kv = kv;
		this.defaultKey = defaultKey;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 2
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		if (kv == null)
			kv = new HashMap();// line 3
		Set sets = kv.entrySet();// line 4
		for (Object obj : sets) {// line 5
			Entry entry = (Entry) obj;// line 6
			Byte key = (Byte) entry.getKey();// line 7
			Object value = entry.getValue();// line 8
			if (key < 0) {// line 9
				p("<!--<optgroup label=\"     \"></optgroup>-->\n" +
						"<option data-divider=\"true\"></option>\n");// line 9
			} else {// line 12
				if (key.equals(defaultKey)) {// line 13
					p("<option selected=\"selected\" value=\"");// line 13
					p(key);// line 14
					p("\">");// line 14
					p(value);// line 14
					p("</option>\n");// line 14
				} else {// line 15
					p("<option value=\"");// line 15
					p(key);// line 16
					p("\">");// line 16
					p(value);// line 16
					p("</option>\n");// line 16
				}// line 17
			}// line 18

		}// line 20
		p("\n");// line 20

=======
	private Map kv; // line 2, japidviews/_tags/CategorySelectOptions.html
	private Byte defaultKey; // line 2, japidviews/_tags/CategorySelectOptions.html
	public cn.bran.japid.template.RenderResult render(Map kv,Byte defaultKey) {
		this.kv = kv;
		this.defaultKey = defaultKey;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2, japidviews/_tags/CategorySelectOptions.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Map kv,Byte defaultKey) {
		return new CategorySelectOptions().render(kv, defaultKey);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_tags\CategorySelectOptions.html
if(kv==null) kv=new HashMap();// line 3, japidviews\_tags\CategorySelectOptions.html
Set  sets = kv.entrySet();// line 4, japidviews\_tags\CategorySelectOptions.html
for (Object obj : sets) {// line 5, japidviews\_tags\CategorySelectOptions.html
Entry entry=(Entry)obj;// line 6, japidviews\_tags\CategorySelectOptions.html
Byte key=(Byte)entry.getKey();// line 7, japidviews\_tags\CategorySelectOptions.html
Object value=entry.getValue();// line 8, japidviews\_tags\CategorySelectOptions.html
if(key<0){// line 9, japidviews\_tags\CategorySelectOptions.html
		p("<!--<optgroup label=\"     \"></optgroup>-->\n" + 
"<option data-divider=\"true\"></option>\n");// line 9, japidviews\_tags\CategorySelectOptions.html
		}else{// line 12, japidviews\_tags\CategorySelectOptions.html
if(key.equals(defaultKey)){// line 13, japidviews\_tags\CategorySelectOptions.html
		p("<option selected=\"selected\" value=\"");// line 13, japidviews\_tags\CategorySelectOptions.html
		p(key);// line 14, japidviews\_tags\CategorySelectOptions.html
		p("\">");// line 14, japidviews\_tags\CategorySelectOptions.html
		p(value);// line 14, japidviews\_tags\CategorySelectOptions.html
		p("</option>\n");// line 14, japidviews\_tags\CategorySelectOptions.html
		}else{// line 15, japidviews\_tags\CategorySelectOptions.html
		p("<option value=\"");// line 15, japidviews\_tags\CategorySelectOptions.html
		p(key);// line 16, japidviews\_tags\CategorySelectOptions.html
		p("\">");// line 16, japidviews\_tags\CategorySelectOptions.html
		p(value);// line 16, japidviews\_tags\CategorySelectOptions.html
		p("</option>\n");// line 16, japidviews\_tags\CategorySelectOptions.html
		}// line 17, japidviews\_tags\CategorySelectOptions.html
}// line 18, japidviews\_tags\CategorySelectOptions.html

}// line 20, japidviews\_tags\CategorySelectOptions.html
		p("\n");// line 20, japidviews\_tags\CategorySelectOptions.html
		
>>>>>>> c4b85573d6a4acd632da842373367b248a70c20e:sprout/app/japidviews/_tags/CategorySelectOptions.java
		endDoLayout(sourceTemplate);
	}

}
