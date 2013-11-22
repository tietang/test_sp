//version: 0.9.35
package japidviews._tags;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//
// NOTE: This file was generated from: japidviews/_tags/CategorySelector.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class CategorySelector extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/CategorySelector.html";
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


	public CategorySelector() {
		super(null);
	}
	public CategorySelector(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"kv", "defaultKey",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Map", "Byte",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.CategorySelector.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Map kv; // line 2, japidviews/_tags/CategorySelector.html
	private Byte defaultKey; // line 2, japidviews/_tags/CategorySelector.html
	public cn.bran.japid.template.RenderResult render(Map kv,Byte defaultKey) {
		this.kv = kv;
		this.defaultKey = defaultKey;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 2, japidviews/_tags/CategorySelector.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Map kv,Byte defaultKey) {
		return new CategorySelector().render(kv, defaultKey);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\_tags\CategorySelector.html
if(kv==null) kv=new HashMap();// line 3, japidviews\_tags\CategorySelector.html
Set sets = kv.entrySet();// line 4, japidviews\_tags\CategorySelector.html
		p("<section>\n");// line 4, japidviews\_tags\CategorySelector.html
		for (Object obj : sets) {// line 6, japidviews\_tags\CategorySelector.html
    Entry entries=(Entry)obj;// line 7, japidviews\_tags\CategorySelector.html
    String title=(String)entries.getKey();// line 8, japidviews\_tags\CategorySelector.html
    Map mapValue=(Map)entries.getValue();// line 9, japidviews\_tags\CategorySelector.html
    Set values = mapValue.entrySet();// line 10, japidviews\_tags\CategorySelector.html
		p("    <h3 style=\"width:80px;float:left;text-align:right;\">");// line 10, japidviews\_tags\CategorySelector.html
		p(title);// line 11, japidviews\_tags\CategorySelector.html
		p("</h3>\n" + 
"    <ul class=\"tag_selector\">\n");// line 11, japidviews\_tags\CategorySelector.html
		    for(Object item:values){// line 13, japidviews\_tags\CategorySelector.html
       Entry entry=(Entry)item;// line 14, japidviews\_tags\CategorySelector.html
       Byte key=(Byte)entry.getKey();// line 15, japidviews\_tags\CategorySelector.html
       Object value=entry.getValue();// line 16, japidviews\_tags\CategorySelector.html
       if(key<0){// line 17, japidviews\_tags\CategorySelector.html
		p("<li data-divider=\"true\"></li>\n");// line 17, japidviews\_tags\CategorySelector.html
		       }else{// line 19, japidviews\_tags\CategorySelector.html
           if(key.equals(defaultKey)){// line 20, japidviews\_tags\CategorySelector.html
		p("<li selected=\"selected\"><a href=\"javascript:void(0)\" value=\"");// line 20, japidviews\_tags\CategorySelector.html
		p(key);// line 21, japidviews\_tags\CategorySelector.html
		p("\">");// line 21, japidviews\_tags\CategorySelector.html
		p(value);// line 21, japidviews\_tags\CategorySelector.html
		p("</a></li>\n");// line 21, japidviews\_tags\CategorySelector.html
		           }else{// line 22, japidviews\_tags\CategorySelector.html
		p("\n" + 
"<li><a href=\"javascript:void(0)\" value=\"");// line 22, japidviews\_tags\CategorySelector.html
		p(key);// line 23, japidviews\_tags\CategorySelector.html
		p("\">");// line 23, japidviews\_tags\CategorySelector.html
		p(value);// line 23, japidviews\_tags\CategorySelector.html
		p("</a></li>\n" + 
"\n");// line 23, japidviews\_tags\CategorySelector.html
		           }// line 25, japidviews\_tags\CategorySelector.html
       }// line 26, japidviews\_tags\CategorySelector.html
    }// line 27, japidviews\_tags\CategorySelector.html
		p("    </ul>\n" + 
"\n");// line 27, japidviews\_tags\CategorySelector.html
		}// line 30, japidviews\_tags\CategorySelector.html
		p("\n" + 
"</section>\n");// line 30, japidviews\_tags\CategorySelector.html
		
		endDoLayout(sourceTemplate);
	}

}