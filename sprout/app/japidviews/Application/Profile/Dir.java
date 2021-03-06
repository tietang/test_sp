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
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/profile/Dir.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Dir extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/Dir.html";
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


	public Dir() {
	super((StringBuilder)null);
	initHeaders();
	}
	public Dir(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public Dir(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"photoSets",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Dir.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<PhotoSet> photoSets; // line 5, japidviews/Application/profile/Dir.html
	public cn.bran.japid.template.RenderResult render(List<PhotoSet> photoSets) {
		this.photoSets = photoSets;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 5, japidviews/Application/profile/Dir.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(List<PhotoSet> photoSets) {
		return new Dir().render(photoSets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
p("<pre style=\"display: none\">\n" + 
"	\n");// line 1, japidviews\Application\profile\Dir.html

p("\n" + 
"\n" + 
"</pre>\n" + 
"<div class=\"row-fluid \" >\n" + 
"	<div>\n" + 
"		<form class=\"form-inline\">\n" + 
"			<input name=\"set\" id=\"set1\"  type=\"text\" placeholder=\"Set Name\" class=\"span9\"/>\n" + 
"\n" + 
"			<input name=\"idSet\" id=\"idSet1\"  type=\"hidden\" placeholder=\"Set Name\"  />\n" + 
"\n" + 
"			<button type=\"button\" class=\"btn\"   onclick=\"addPhotoSetEvent();\" id=\"SetSaveButton\">\n" + 
"				Save\n" + 
"			</button>\n" + 
"			<button type=\"button\" class=\"btn\"  onclick=\"deletePhotoSetEvent();\">\n" + 
"				Delete\n" + 
"			</button>\n" + 
"			<button type=\"button\" class=\"btn\"  onclick=\"resetPhotoSet();\">\n" + 
"				Reset\n" + 
"			</button>\n" + 
"		</form>\n" + 
"	</div>\n" + 
"	<div class=\"manage_nav \">\n" + 
"	 \n" + 
"		");// line 5, japidviews\Application\profile\Dir.html
		new ErrorMessage(Dir.this).render(); // line 28, japidviews\Application\profile\Dir.html// line 28, japidviews\Application\profile\Dir.html
		p("\n" + 
"		<table class=\"table table-hover\" >\n" + 
"			<thead>\n" + 
"				<tr>\n" + 
"					<th>Name</th><th>Action</th>\n" + 
"				</tr>\n" + 
"			</thead>\n" + 
"			<tbody>\n" + 
"				");// line 28, japidviews\Application\profile\Dir.html
		if(photoSets!=null){int index=0;// line 36, japidviews\Application\profile\Dir.html

				for(PhotoSet set:photoSets){// line 37, japidviews\Application\profile\Dir.html
		p("\n" + 
"				<tr>\n" + 
"					<td  id=\"edit_td");// line 37, japidviews\Application\profile\Dir.html
		p(index);// line 39, japidviews\Application\profile\Dir.html
		p("\" onclick=\"setPhotoSetValue(this)\" id_set=\"");// line 39, japidviews\Application\profile\Dir.html
		p(set.idSet);// line 39, japidviews\Application\profile\Dir.html
		p("\" name_set=\"");// line 39, japidviews\Application\profile\Dir.html
		p(set.name);// line 39, japidviews\Application\profile\Dir.html
		p("\">");// line 39, japidviews\Application\profile\Dir.html
		p(set.name);// line 39, japidviews\Application\profile\Dir.html
		p("</td>\n" + 
"					<td>\n" + 
"					<button type=\"button\" onclick=\"setPhotoSetValue(document.getElementById('edit_td");// line 39, japidviews\Application\profile\Dir.html
		p(index);// line 41, japidviews\Application\profile\Dir.html
		p("'))\" class=\"btn btn-primary btn-small\">\n" + 
"						Edit\n" + 
"					</button>\n" + 
"					<button type=\"button\" onclick=\"onDeletePhotoSet('");// line 41, japidviews\Application\profile\Dir.html
		p(set.name);// line 44, japidviews\Application\profile\Dir.html
		p("',");// line 44, japidviews\Application\profile\Dir.html
		p(set.idSet);// line 44, japidviews\Application\profile\Dir.html
		p(")\" class=\"btn btn-danger btn-small\">\n" + 
"						Delete\n" + 
"					</button></td>\n" + 
"				</tr>\n" + 
"\n" + 
"				");// line 44, japidviews\Application\profile\Dir.html
		index++;}// line 49, japidviews\Application\profile\Dir.html

				}// line 50, japidviews\Application\profile\Dir.html
		p("\n" + 
"			</tbody>\n" + 
"		</table>\n" + 
"\n" + 
"	</div>\n" + 
"</div>");// line 50, japidviews\Application\profile\Dir.html
		
		endDoLayout(sourceTemplate);
	}

}