//version: 0.9.37
package japidviews.Application.profile;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import java.util.*;
import fengfei.ucm.entity.photo.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/profile/PhotoManage.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class PhotoManage extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/PhotoManage.html";
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


	public PhotoManage() {
	super((StringBuilder)null);
	initHeaders();
	}
	public PhotoManage(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public PhotoManage(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"sets",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.PhotoManage.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<PhotoSet> sets; // line 5, japidviews/Application/profile/PhotoManage.html
	public cn.bran.japid.template.RenderResult render(List<PhotoSet> sets) {
		this.sets = sets;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 5, japidviews/Application/profile/PhotoManage.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(List<PhotoSet> sets) {
		return new PhotoManage().render(sets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\profile\PhotoManage.html

// line 8, japidviews\Application\profile\PhotoManage.html
		p("</pre>\n" + 
"\n" + 
"\n" + 
"\n");// line 12, japidviews\Application\profile\PhotoManage.html
		new AddNav(PhotoManage.this).render("manage"); // line 17, japidviews\Application\profile\PhotoManage.html// line 17, japidviews\Application\profile\PhotoManage.html
		p("\n" + 
"<div class=\"grid_row manage\">\n" + 
"\n" + 
"	<div class=\"col col_2 \">\n" + 
"		<div class=\"manage_nav \">\n" + 
"\n" + 
"			<ul class=\"nav nav-list\" id=\"manage_menu\">\n" + 
"				<li>\n" + 
"					<h4>Photos</h4>\n" + 
"				</li>\n" + 
"				<li >\n" + 
"					<a href=\"javascript:void(0)\" src=\"/photo/manage/all\">");// line 17, japidviews\Application\profile\PhotoManage.html
		;p(getMessage("all"));// line 28, japidviews\Application\profile\PhotoManage.html
		p("</a>\n" + 
"				</li>\n" + 
"				<li>\n" + 
"					<a href=\"javascript:void(0)\"  src=\"/photo/manage/public\">");// line 28, japidviews\Application\profile\PhotoManage.html
		;p(getMessage("published"));// line 31, japidviews\Application\profile\PhotoManage.html
		p("</a>\n" + 
"				</li>\n" + 
"				<li>\n" + 
"					<a href=\"javascript:void(0)\"  src=\"/photo/manage/dir/all\"><h4>");// line 31, japidviews\Application\profile\PhotoManage.html
		;p(getMessage("sets"));// line 34, japidviews\Application\profile\PhotoManage.html
		p("</h4></a>\n" + 
"				</li>\n" + 
"				");// line 34, japidviews\Application\profile\PhotoManage.html
		new DirNav(PhotoManage.this).render(sets); // line 36, japidviews\Application\profile\PhotoManage.html// line 36, japidviews\Application\profile\PhotoManage.html
		p("\n" + 
"\n" + 
"			</ul>\n" + 
"\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	<div class=\"col col_14 \">\n" + 
"\n" + 
"		<div  id=\"manage_contaner\">\n" + 
"\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"</div>\n" + 
"\n" + 
"\n");// line 36, japidviews\Application\profile\PhotoManage.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Sprucy manage Page");;
	}
	@Override protected void css() {
		// line 8, japidviews\Application\profile\PhotoManage.html
		p("	<link type=\"text/css\" href=\"");// line 8, japidviews\Application\profile\PhotoManage.html
		p(lookupStatic("/public/styles/photo_top.css"));// line 9, japidviews\Application\profile\PhotoManage.html
		p("\" />\n" + 
"	<script type=\"text/javascript\" src=\"");// line 9, japidviews\Application\profile\PhotoManage.html
		p(lookupStatic("/public/bootstrap/bootbox.js"));// line 10, japidviews\Application\profile\PhotoManage.html
		p("\"></script>\n" + 
"	<script type=\"text/javascript\" src=\"");// line 10, japidviews\Application\profile\PhotoManage.html
		p(lookupStatic("/public/app/photoManage.js"));// line 11, japidviews\Application\profile\PhotoManage.html
		p("\"></script>\n");// line 11, japidviews\Application\profile\PhotoManage.html
		;
	}
	@Override protected void header() {
		p("");;
	}
}