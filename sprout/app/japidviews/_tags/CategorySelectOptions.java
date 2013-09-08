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
// NOTE: This file was generated from: japidviews/_tags/CategorySelectOptions.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class CategorySelectOptions extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/CategorySelectOptions.html";
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


	public CategorySelectOptions() {
		super(null);
	}
	public CategorySelectOptions(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"kv", "defaultKey",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map", "Byte",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.CategorySelectOptions.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

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
		
		endDoLayout(sourceTemplate);
	}

}