//version: 0.9.35
package japidviews._tags;

import fengfei.ucm.entity.photo.PhotoSet;

import java.util.List;
//
// NOTE: This file was generated from: japidviews/_tags/ManageMenu.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class ManageMenu extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/ManageMenu.html";
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


	public ManageMenu() {
		super(null);
	}
	public ManageMenu(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"sets",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.ManageMenu.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<PhotoSet> sets; // line 4, japidviews/_tags/ManageMenu.html
	public cn.bran.japid.template.RenderResult render(List<PhotoSet> sets) {
		this.sets = sets;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 4, japidviews/_tags/ManageMenu.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(List<PhotoSet> sets) {
		return new ManageMenu().render(sets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\_tags\ManageMenu.html

p("\n" + 
"</pre>\n" + 
"\n" + 
"\n" + 
"<ul class=\"nav nav-list\">\n" + 
"	<li>\n" + 
"		<h4>Photos</h4>\n" + 
"	</li>\n" + 
"	<li >\n" + 
"		<a href=\"/photo/manage/all\">所有</a>\n" + 
"	</li>\n" + 
"	<li>\n" + 
"		<a href=\"/photo/manage/public\">发布的</a>\n" + 
"	</li>\n" + 
"	<li>\n" + 
"		<h4>Sets</h4>\n" + 
"	</li>\n" + 
"	");// line 4, japidviews\_tags\ManageMenu.html
		if(sets!=null){// line 21, japidviews\_tags\ManageMenu.html

	for(PhotoSet set:sets){// line 22, japidviews\_tags\ManageMenu.html
		p("\n" + 
"	<li }>\n" + 
"		<a href=\"");// line 22, japidviews\_tags\ManageMenu.html
		p(set.idSet);// line 24, japidviews\_tags\ManageMenu.html
		p("\">");// line 24, japidviews\_tags\ManageMenu.html
		p(set.name);// line 24, japidviews\_tags\ManageMenu.html
		p("</a>\n" + 
"	</li>\n" + 
"	");// line 24, japidviews\_tags\ManageMenu.html
		}// line 26, japidviews\_tags\ManageMenu.html

	}// line 27, japidviews\_tags\ManageMenu.html
		p("\n" + 
"\n" + 
"</ul>\n");// line 27, japidviews\_tags\ManageMenu.html
		
		endDoLayout(sourceTemplate);
	}

}