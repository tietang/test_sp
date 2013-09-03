package japidviews.Application.profile;
import java.util.*;

import fengfei.ucm.entity.photo.*;

//
// NOTE: This file was generated from: japidviews/Application/Profile/DirNav.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class DirNav extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/DirNav.html";
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


	public DirNav() {
		super(null);
	}
	public DirNav(StringBuilder out) {
		super(out);
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

	private List<PhotoSet> photoSets; // line 6, japidviews/Application/Profile/DirNav.html
	public cn.bran.japid.template.RenderResult render(List<PhotoSet> photoSets) {
		this.photoSets = photoSets;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 6, japidviews/Application/Profile/DirNav.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(List<PhotoSet> photoSets) {
		return new DirNav().render(photoSets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n" + 
"	\n");// line 1, japidviews\Application\Profile\DirNav.html

p("\n" + 
"</pre>\n");// line 6, japidviews\Application\Profile\DirNav.html
		if(photoSets!=null){// line 9, japidviews\Application\Profile\DirNav.html
for(PhotoSet set:photoSets){// line 10, japidviews\Application\Profile\DirNav.html
		p("<li class=\"setItem\" title=\"");// line 10, japidviews\Application\Profile\DirNav.html
		p(set.name);// line 11, japidviews\Application\Profile\DirNav.html
		p("\">\n" + 
"	<a href=\"javascript:void(0)\"  src=\"/photo/manage/set/");// line 11, japidviews\Application\Profile\DirNav.html
		p(set.idSet);// line 12, japidviews\Application\Profile\DirNav.html
		p("\">");// line 12, japidviews\Application\Profile\DirNav.html
		p(set.name);// line 12, japidviews\Application\Profile\DirNav.html
		p("</a>\n" + 
"</li>\n");// line 12, japidviews\Application\Profile\DirNav.html
		}// line 14, japidviews\Application\Profile\DirNav.html
}// line 15, japidviews\Application\Profile\DirNav.html
		;// line 15, japidviews\Application\Profile\DirNav.html
		
		endDoLayout(sourceTemplate);
	}

}