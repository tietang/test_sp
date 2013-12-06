//version: 0.9.37
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
// NOTE: This file was generated from: japidviews/_tags/LicenseSelectOptions.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class LicenseSelectOptions extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/LicenseSelectOptions.html";
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


	public LicenseSelectOptions() {
	super((StringBuilder)null);
	initHeaders();
	}
	public LicenseSelectOptions(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public LicenseSelectOptions(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"kv", "defaultKey",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map", "String",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.LicenseSelectOptions.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Map kv; // line 2, japidviews/_tags/LicenseSelectOptions.html
	private String defaultKey; // line 2, japidviews/_tags/LicenseSelectOptions.html
	public cn.bran.japid.template.RenderResult render(Map kv,String defaultKey) {
		this.kv = kv;
		this.defaultKey = defaultKey;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 2, japidviews/_tags/LicenseSelectOptions.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(Map kv,String defaultKey) {
		return new LicenseSelectOptions().render(kv, defaultKey);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, japidviews\_tags\LicenseSelectOptions.html

if(kv==null) kv=new HashMap();// line 3, japidviews\_tags\LicenseSelectOptions.html

Set  sets = kv.entrySet();// line 4, japidviews\_tags\LicenseSelectOptions.html

for (Object obj : sets) {// line 5, japidviews\_tags\LicenseSelectOptions.html

Entry entry=(Entry)obj;// line 6, japidviews\_tags\LicenseSelectOptions.html

String key=(String)entry.getKey();// line 7, japidviews\_tags\LicenseSelectOptions.html

Object value=entry.getValue();// line 8, japidviews\_tags\LicenseSelectOptions.html
		p("\n" + 
"\n");// line 8, japidviews\_tags\LicenseSelectOptions.html
		if(key.equals(defaultKey)){// line 10, japidviews\_tags\LicenseSelectOptions.html
		p("\n" + 
"<option selected=\"selected\" value=\"");// line 10, japidviews\_tags\LicenseSelectOptions.html
		p(key);// line 11, japidviews\_tags\LicenseSelectOptions.html
		p("\">");// line 11, japidviews\_tags\LicenseSelectOptions.html
		p(value);// line 11, japidviews\_tags\LicenseSelectOptions.html
		p("</option>\n");// line 11, japidviews\_tags\LicenseSelectOptions.html
		}else{// line 12, japidviews\_tags\LicenseSelectOptions.html
		p("\n" + 
"<option value=\"");// line 12, japidviews\_tags\LicenseSelectOptions.html
		p(key);// line 13, japidviews\_tags\LicenseSelectOptions.html
		p("\">");// line 13, japidviews\_tags\LicenseSelectOptions.html
		p(value);// line 13, japidviews\_tags\LicenseSelectOptions.html
		p("</option>\n");// line 13, japidviews\_tags\LicenseSelectOptions.html
		}// line 14, japidviews\_tags\LicenseSelectOptions.html
		p("\n" + 
"\n");// line 14, japidviews\_tags\LicenseSelectOptions.html
		}// line 16, japidviews\_tags\LicenseSelectOptions.html
		p("\n" + 
"\n");// line 16, japidviews\_tags\LicenseSelectOptions.html
		
		endDoLayout(sourceTemplate);
	}

}