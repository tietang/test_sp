package japidviews._layouts;

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
// NOTE: This file was generated from: japidviews/_layouts/EmptyLayout.html
// Change to this file will be lost next time the template file is compiled.
//

public abstract class EmptyLayout extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_layouts/EmptyLayout.html";
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

	public EmptyLayout() {
		super(null);
	}

	public EmptyLayout(StringBuilder out) {
		super(out);
	}

	@Override
	public void layout() {
		beginDoLayout(sourceTemplate);
		p("<!DOCTYPE html>\n");// line 1
		p("<html>\n" +
				"	<head>\n" +
				"		<meta charset=\"UTF-8\">\n" +
				"		<title>");// line 2
		title();
		p("</title>\n" +
				"		<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 6
		p(lookupStatic("/public/bootstrap/css/bootstrap.min.css"));// line 7
		p("\">\n" +
				"		");// line 7
		css();
		p("	</head>\n" +
				"\n" +
				"	<body>\n" +
				"\n" +
				"		<div class=\"page-header\">\n" +
				"			<h3>");// line 8
		header();
		p("</h3>\n" +
				"		</div>\n" +
				"		");// line 14
		doLayout();// line 16
		p("\n" +
				"	</body>\n" +
				"</html>\n");// line 16
		endDoLayout(sourceTemplate);
	}

	protected void title() {
	};

	protected void header() {
	};

	protected void css() {
	};

	protected abstract void doLayout();
}
