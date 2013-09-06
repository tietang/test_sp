package japidviews.Application.profile;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;
import fengfei.fir.model.PhotoShow;
import java.util.*;
import fengfei.ucm.entity.photo.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static japidviews._javatags.Pic.*;
import japidviews._layouts.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/profile/Dir.html
// Change to this file will be lost next time the template file is compiled.
//

public class Dir extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/Dir.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

	// - add implicit fields with Play

	final Request request = Request.current();
	final Response response = Response.current();
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(
			validation);
	final play.Play _play = new play.Play();

	// - end of implicit fields with Play 

	public Dir() {
		super(null);
	}

	public Dir(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"photoSets", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Dir.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private List<PhotoSet> photoSets; // line 5

	public cn.bran.japid.template.RenderResult render(List<PhotoSet> photoSets) {
		this.photoSets = photoSets;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 5
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<pre style=\"display: none\">\n" +
				"	\n");// line 1
		p("\n"
				+
				"</pre>\n"
				+
				"<div class=\"row-fluid \" >\n"
				+
				"	<div>\n"
				+
				"		<form class=\"form-inline\">\n"
				+
				"			<input name=\"set\" id=\"set1\"  type=\"text\" placeholder=\"Set Name\" class=\"span9\"/>\n"
				+
				"\n"
				+
				"			<input name=\"idSet\" id=\"idSet1\"  type=\"hidden\" placeholder=\"Set Name\"  />\n"
				+
				"\n"
				+
				"			<button type=\"button\" class=\"btn\"   onclick=\"addPhotoSetEvent();\" id=\"SetSaveButton\">\n"
				+
				"				Save\n"
				+
				"			</button>\n"
				+
				"			<button type=\"button\" class=\"btn\"  onclick=\"deletePhotoSetEvent();\">\n"
				+
				"				Delete\n"
				+
				"			</button>\n"
				+
				"			<button type=\"button\" class=\"btn\"  onclick=\"resetPhotoSet();\">\n"
				+
				"				Reset\n" +
				"			</button>\n" +
				"		</form>\n" +
				"	</div>\n" +
				"	<div class=\"manage_nav \">\n" +
				"	 \n" +
				"		");// line 5
		final ErrorMessage _ErrorMessage0 = new ErrorMessage(getOut());
		_ErrorMessage0.setActionRunners(getActionRunners()).setOut(getOut());
		_ErrorMessage0.render(); // line 28// line 28
		p("		<table class=\"table table-hover\" >\n" +
				"			<thead>\n" +
				"				<tr>\n" +
				"					<th>Name</th><th>Action</th>\n" +
				"				</tr>\n" +
				"			</thead>\n" +
				"			<tbody>\n" +
				"				");// line 28
		if (photoSets != null) {
			int index = 0;// line 36
			for (PhotoSet set : photoSets) {// line 37
				p("				<tr>\n" +
						"					<td  id=\"edit_td");// line 37
				p(index);// line 39
				p("\" onclick=\"setPhotoSetValue(this)\" id_set=\"");// line 39
				p(set.idSet);// line 39
				p("\" name_set=\"");// line 39
				p(set.name);// line 39
				p("\">");// line 39
				p(set.name);// line 39
				p("</td>\n"
						+
						"					<td>\n"
						+
						"					<button type=\"button\" onclick=\"setPhotoSetValue(document.getElementById('edit_td");// line 39
				p(index);// line 41
				p("'))\" class=\"btn btn-primary btn-small\">\n"
						+
						"						Edit\n"
						+
						"					</button>\n"
						+
						"					<button type=\"button\" onclick=\"onDeletePhotoSet('");// line 41
				p(set.name);// line 44
				p("',");// line 44
				p(set.idSet);// line 44
				p(")\" class=\"btn btn-danger btn-small\">\n" +
						"						Delete\n" +
						"					</button></td>\n" +
						"				</tr>\n" +
						"\n" +
						"				");// line 44
				index++;
			}// line 49
		}// line 50
		p("			</tbody>\n" +
				"		</table>\n" +
				"\n" +
				"	</div>\n" +
				"</div>\n");// line 50

		endDoLayout(sourceTemplate);
	}

}
