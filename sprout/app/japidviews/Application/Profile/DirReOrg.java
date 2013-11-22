//version: 0.9.35
package japidviews.Application.profile;

import fengfei.ucm.entity.photo.PhotoSet;

import java.util.List;

import static cn.bran.play.JapidPlayAdapter.lookupStatic;

//
// NOTE: This file was generated from: japidviews/Application/profile/DirReOrg.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class DirReOrg extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/DirReOrg.html";
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


	public DirReOrg() {
		super(null);
	}
	public DirReOrg(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"photoSets",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.DirReOrg.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<PhotoSet> photoSets; // line 6, japidviews/Application/profile/DirReOrg.html
	public cn.bran.japid.template.RenderResult render(List<PhotoSet> photoSets) {
		this.photoSets = photoSets;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 6, japidviews/Application/profile/DirReOrg.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(List<PhotoSet> photoSets) {
		return new DirReOrg().render(photoSets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n" + 
"	\n");// line 1, japidviews\Application\profile\DirReOrg.html

// line 7, japidviews\Application\profile\DirReOrg.html
		p("</pre>\n" + 
"<div class=\"grid_row dir_org\" >\n" + 
"	<div class=\"col col_6\">\n" + 
"		<ul class=\"sortable nav nav-list\">\n" + 
"			");// line 10, japidviews\Application\profile\DirReOrg.html
		if(photoSets!=null){// line 15, japidviews\Application\profile\DirReOrg.html

			for(PhotoSet set:photoSets){// line 16, japidviews\Application\profile\DirReOrg.html
		p("\n" + 
"			<li class=\"setItem\" title=\"");// line 16, japidviews\Application\profile\DirReOrg.html
		p(set.name);// line 17, japidviews\Application\profile\DirReOrg.html
		p("\">\n" + 
"				<a href=\"javascript:void(0)\"  src=\"/photo/manage/dir/");// line 17, japidviews\Application\profile\DirReOrg.html
		p(set.idSet);// line 18, japidviews\Application\profile\DirReOrg.html
		p("\">");// line 18, japidviews\Application\profile\DirReOrg.html
		p(set.name);// line 18, japidviews\Application\profile\DirReOrg.html
		p("</a>\n" + 
"			</li>\n" + 
"			");// line 18, japidviews\Application\profile\DirReOrg.html
		}// line 20, japidviews\Application\profile\DirReOrg.html

			}// line 21, japidviews\Application\profile\DirReOrg.html
		p("\n" + 
"\n" + 
"		</ul>\n" + 
"	</div>\n" + 
"	<div class=\"col col_6 \">\n" + 
"\n" + 
"	</div>\n" + 
"</div>");// line 21, japidviews\Application\profile\DirReOrg.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void css() {
		// line 7, japidviews\Application\profile\DirReOrg.html
		p("	<script type=\"text/javascript\" src=\"");// line 7, japidviews\Application\profile\DirReOrg.html
		p(lookupStatic("/public/js/jquery-ui-1.10.3-core-interactions.js"));// line 8, japidviews\Application\profile\DirReOrg.html
		p("\"></script>\n" + 
"	<script type=\"text/javascript\" src=\"");// line 8, japidviews\Application\profile\DirReOrg.html
		p(lookupStatic("/public/app/dirOrg.js"));// line 9, japidviews\Application\profile\DirReOrg.html
		p("\"></script>\n");// line 9, japidviews\Application\profile\DirReOrg.html
		;
	}
}