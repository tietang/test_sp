package japidviews.Application;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.UserPwd;
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
// NOTE: This file was generated from: japidviews/Application/SignupDone.html
// Change to this file will be lost next time the template file is compiled.
//

public class SignupDone extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/SignupDone.html";
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

	public SignupDone() {
		super(null);
	}

	public SignupDone(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"up", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"UserPwd", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.SignupDone.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private UserPwd up; // line 3

	public cn.bran.japid.template.RenderResult render(UserPwd up) {
		this.up = up;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 3
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<p class=\"line10\"></p><p class=\"line10\"></p>\n" +
				"<div class=\"grid_row signupx\">\n" +
				"	<div class=\"col col_4\" >\n" +
				"		<p  ></p>\n" +
				"	</div>\n" +
				"	<div class=\"col col_8\" >\n" +
				"\n" +
				"		<div id=\"login\"   class=\"cardx\"   >\n" +
				"			<h5>Hi, ");// line 8
		p(up.userName);// line 17
		p("</h5>\n" +
				"			<p>\n" +
				"				Your email address: ");// line 17
		p(up.email);// line 19
		p("			</p>\n"
				+
				"			<p>\n"
				+
				"				Register sucess! Check your email to verify email address.\n"
				+
				"			</p>\n" +
				"		</div>\n" +
				"	</div>\n" +
				"	<div class=\"col col_4\" >\n" +
				"		<p></p>\n" +
				"	</div>\n" +
				"</div>\n");// line 19

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy Log in Page");
		;
	}

	@Override
	protected void css() {
		;
	}

	@Override
	protected void header() {
		p(" Log in ");
		;
	}
}
