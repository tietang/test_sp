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
// NOTE: This file was generated from: japidviews/Application/profile/PhotoOrganize.html
// Change to this file will be lost next time the template file is compiled.
//

public class PhotoOrganize extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/profile/PhotoOrganize.html";
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

	public PhotoOrganize() {
		super(null);
	}

	public PhotoOrganize(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"photoSets", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<PhotoSet>", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.PhotoOrganize.class);

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
				"			<input name=\"set\" id=\"set1\"  type=\"text\" placeholder=\"Set Name\" class=\"span10\"/>\n"
				+
				"			<input name=\"idSet\" id=\"idSet1\"  type=\"hidden\" placeholder=\"Set Name\"  />\n"
				+
				"			<button type=\"button\" class=\"btn\"   onclick=\"addPhotoSetEvent();\">\n"
				+
				"				Save\n"
				+
				"			</button>\n"
				+
				"			<button type=\"button\" class=\"btn\"  onclick=\"deletePhotoSetEvent();\">\n"
				+
				"				Delete\n" +
				"			</button>\n" +
				"		</form>\n" +
				"	</div>\n" +
				"	<div class=\"manage_nav \">\n" +
				"		<div>\n" +
				"			");// line 5
		p(flash.get("error"));// line 23
		p("		</div>\n" +
				"		<table class=\"table table-hover\" >\n" +
				"			<thead>\n" +
				"				<tr>\n" +
				"					<th>Name</th>\n" +
				"				</tr>\n" +
				"			</thead>\n" +
				"			<tbody>\n" +
				"				");// line 23
		if (photoSets != null) {// line 32
			for (PhotoSet set : photoSets) {// line 33
				p("				<tr>\n" +
						"					<td onclick=\"setPhotoSetValue(this)\" id_set=\"");// line 33
				p(set.idSet);// line 35
				p("\" name_set=\"");// line 35
				p(set.name);// line 35
				p("\">");// line 35
				p(set.name);// line 35
				p("</td>\n" +
						"				</tr>\n" +
						"\n" +
						"				");// line 35
			}// line 38
		}// line 39
		p("			</tbody>\n" +
				"		</table>\n" +
				"\n" +
				"	</div>\n" +
				"</div>\n");// line 39

		endDoLayout(sourceTemplate);
	}

}
