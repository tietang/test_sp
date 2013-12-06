//version: 0.9.37
package japidviews.Application.profile;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
import java.util.*;import fengfei.ucm.entity.photo.*;
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
// NOTE: This file was generated from: japidviews/Application/profile/DirNav.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class DirNav extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/DirNav.html";
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


	public DirNav() {
	super((StringBuilder)null);
	initHeaders();
	}
	public DirNav(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public DirNav(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"photoSets",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.DirNav.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<PhotoSet> photoSets; // line 6, japidviews/Application/profile/DirNav.html
	public cn.bran.japid.template.RenderResult render(List<PhotoSet> photoSets) {
		this.photoSets = photoSets;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 6, japidviews/Application/profile/DirNav.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(List<PhotoSet> photoSets) {
		return new DirNav().render(photoSets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
p("<pre style=\"display: none\">\n" + 
"	\n");// line 1, japidviews\Application\profile\DirNav.html

p("\n" + 
"\n");// line 4, japidviews\Application\profile\DirNav.html
		p("\n" + 
"\n" + 
"</pre>\n");// line 6, japidviews\Application\profile\DirNav.html
		if(photoSets!=null){// line 9, japidviews\Application\profile\DirNav.html

for(PhotoSet set:photoSets){// line 10, japidviews\Application\profile\DirNav.html
		p("\n" + 
"<li class=\"setItem\" title=\"");// line 10, japidviews\Application\profile\DirNav.html
		p(set.name);// line 11, japidviews\Application\profile\DirNav.html
		p("\">\n" + 
"	<a href=\"javascript:void(0)\"  src=\"/photo/manage/dir/");// line 11, japidviews\Application\profile\DirNav.html
		p(set.idSet);// line 12, japidviews\Application\profile\DirNav.html
		p("\">");// line 12, japidviews\Application\profile\DirNav.html
		p(set.name);// line 12, japidviews\Application\profile\DirNav.html
		p("</a>\n" + 
"</li>\n");// line 12, japidviews\Application\profile\DirNav.html
		}// line 14, japidviews\Application\profile\DirNav.html

}// line 15, japidviews\Application\profile\DirNav.html
		p("\n");// line 15, japidviews\Application\profile\DirNav.html
		
		endDoLayout(sourceTemplate);
	}

}