package japidviews.Application.profile;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/Application/profile/Account.html
// Change to this file will be lost next time the template file is compiled.
//

public class Account extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/Account.html";
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

	public Account() {
		super(null);
	}

	public Account(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/};
	public static final String[] argTypes = new String[] {/* arg types of the template*/};
	public static final Object[] argDefaults = new Object[] {};
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.Account.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}

	////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		}
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------

		p("\n" +
				"<div class=\"grid_row\">\n" +
				"\n" +
				"	<div class=\"col col_3 \">\n" +
				"		<div class=\"sidebar-nav \">\n" +
				"			");// line 7
		final SettingsMenu _SettingsMenu3 = new SettingsMenu(getOut());
		_SettingsMenu3.setActionRunners(getActionRunners()).setOut(getOut());
		_SettingsMenu3.render("Account"); // line 13// line 13
		p("		</div>\n" +
				"	</div>\n" +
				"	<div class=\"col col_13 \">\n" +
				"		<div class=\"row-fluid well profile_right\">\n" +
				"			<div class=\"span8  \">\n" +
				"\n" +
				"				<form class=\"form-horizontal\">\n" +
				"					<span id=\"qqLoginBtn\"></span>\n" +
				"					<script type=\"text/javascript\">\n" +
				"						QC.Login({\n" +
				"							btnId : \"qqLoginBtn\" //���밴ť�Ľڵ�id\n" +
				"						});\n" +
				"					</script>\n" +
				"\n" +
				"					<div id=\"wb_connect_btn\"></div>\n" +
				"					<script type=\"text/javascript\">\n" +
				"						WB2.anyWhere(function(W) {\n" +
				"							W.widget.connectButton({\n" +
				"								id : \"wb_connect_btn\",\n" +
				"								type : '3,2',\n" +
				"								callback : {\n" +
				"									login : function(o) {\n" +
				"										alert(o.screen_name)\n" +
				"									},\n" +
				"									logout : function() {\n" +
				"										alert('logout');\n" +
				"									}\n" +
				"								}\n" +
				"							});\n" +
				"						});\n" +
				"					</script>\n" +
				"\n" +
				"					<div class=\"control-group\">\n" +
				"						<div class=\"controls\">\n" +
				"							<button type=\"submit\" class=\"btn\">\n" +
				"								Save change\n" +
				"							</button>\n" +
				"						</div>\n" +
				"					</div>\n" +
				"\n" +
				"				</form>\n" +
				"\n" +
				"			</div>\n" +
				"			<div class=\"span5\"></div>\n" +
				"		</div>\n" +
				"\n" +
				"	</div>\n" +
				"</div>\n" +
				"\n");// line 13

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy Home Page");
		;
	}

	@Override
	protected void header() {
		p("Account");
		;
	}

	@Override
	protected void css() {
		p("<script src=\" http://tjs.sjs.sinajs.cn/open/api/js/wb.js?appkey=3168919025\" type=\"text/javascript\" charset=\"utf-8\"></script>\n"
				+
				"<script type=\"text/javascript\" src=\"http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js\" data-appid=\"APPID\" data-redirecturi=\"REDIRECTURI\" charset=\"utf-8\"></script>\n");// line 2
		;
	}
}
