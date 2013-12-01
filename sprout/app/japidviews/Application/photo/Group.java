package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.User;
import java.util.Set;import fengfei.ucm.entity.photo.*;import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
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
// NOTE: This file was generated from: japidviews/Application/photo/Group.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Group extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Group.html";
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


	public Group() {
		super(null);
	}
	public Group(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Group.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 0, japidviews/Application/photo/Group.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Group().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\Group.html
// line 8, japidviews\Application\photo\Group.html
		p("</pre>\n" + 
"\n" + 
"\n" + 
"<div class=\"grid_row yours\">\n" + 
"	<div class=\"col col_4\">\n" + 
"		<div class=\"row card \"  >\n" + 
"			<div class=\"col-lg-6 first\">\n" + 
"			</div>\n" + 
"			<div class=\"col-lg-6\">\n" + 
"				<div class=\" \">\n" + 
"					<div>\n" + 
"					</div>\n" + 
"					<div>\n" + 
"					</div>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"col-lg-12 first\" >\n" + 
"				<div class=\"line10 hr1\"></div>\n" + 
"				<div class=\"line10\"></div>\n" + 
"				个人介绍\n" + 
"			</div>\n" + 
"		</div>\n" + 
"\n" + 
"		 \n" + 
"	</div>\n" + 
"	<div class=\"col col_12 yours\">\n" + 
"		 \n" + 
"\n" + 
"	\n" + 
"\n" + 
"	</div>\n" + 
"</div>\n" + 
"\n");// line 9, japidviews\Application\photo\Group.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Your Page");;
	}
	@Override protected void css() {
		// line 8, japidviews\Application\photo\Group.html
;
	}
	@Override protected void header() {
		p( "Yours");;
	}
}