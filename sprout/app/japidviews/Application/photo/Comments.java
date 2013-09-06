package japidviews.Application.photo;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.photo.*;
import fengfei.fir.utils.Path;
import java.util.*;
import java.util.Map.Entry;
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
// NOTE: This file was generated from: japidviews/Application/photo/Comments.html
// Change to this file will be lost next time the template file is compiled.
//

public class Comments extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/Comments.html";
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

	public Comments() {
		super(null);
	}

	public Comments(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"comments", "pages", "cp", "ct", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"List<Comment>", "List<String>", "int", "int", };
	public static final Object[] argDefaults = new Object[] { null, null, null,
			null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Comments.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private List<Comment> comments; // line 4
	private List<String> pages; // line 4
	private int cp; // line 4
	private int ct; // line 4

	public cn.bran.japid.template.RenderResult render(List<Comment> comments,
			List<String> pages, int cp, int ct) {
		this.comments = comments;
		this.pages = pages;
		this.cp = cp;
		this.ct = ct;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 4
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<pre style=\"display: none\">\n");// line 1

		p(" \n" +
				"</pre>\n" +
				"\n" +
				"\n" +
				"<div>\n" +
				"	<ul class=\"media-list\" id=\"comments\">\n" +
				"		");// line 4
		for (Comment c : comments) {// line 10
			p("		<li class=\"media\">\n" +
					"			<a class=\"pull-left\" href=\"/to/");// line 10
			try {
				p(c.idUser);
			} catch (NullPointerException npe) {
			}// line 12
			p("\">\n" +
					"			<div class=\"media-object\"><img\n" +
					"				class=\" img-rounded head_photo_64\"\n" +
					"				src=\"");// line 12
			try {
				p(fengfei.spruce.utils.PhotoPathUtils
						.getUserPhotoDownloadPath(c.idUser));
			} catch (NullPointerException npe) {
			}// line 15
			p("\">\n" +
					"			</div> </a>\n" +
					"			<div class=\"media-body\">\n" +
					"				<div class=\"media-heading border-bottom\">\n" +
					"					<strong>");// line 15
			try {
				p(c.niceName);
			} catch (NullPointerException npe) {
			}// line 19
			p("</strong><small> about ");// line 19
			try {
				p(c.lostTime);
			} catch (NullPointerException npe) {
			}// line 19
			p("						ago</small>\n" +
					"				</div>\n" +
					"				<small>");// line 19
			try {
				p(c.content);
			} catch (NullPointerException npe) {
			}// line 22
			p("</small>\n" +
					"			</div>\n" +
					"		</li> ");// line 22
		}// line 24
		p("\n" +
				"	</ul>\n" +
				"\n" +
				"</div>\n" +
				"<div class=\"line6\"></div>\n");// line 24
		if (pages.size() > 1) {// line 30
			p("<div class=\"pagination pagination-centered\" id=\"pagination\">\n"
					+
					"	<input type=\"hidden\" name=\"cp\" id=\"cp\" value=\"");// line 30
			try {
				p(cp);
			} catch (NullPointerException npe) {
			}// line 32
			p("\" />\n" +
					"	<input type=\"hidden\" name=\"ct\" id=\"ct\" value=\"");// line 32
			try {
				p(ct);
			} catch (NullPointerException npe) {
			}// line 33
			p("\" />\n" +
					"	<ul>\n" +
					"		<li  ");// line 33
			try {
				p(cp == 1 ? "class=\"disabled\"" : "");
			} catch (NullPointerException npe) {
			}// line 35
			p(">\n" +
					"			<a href=\"javascript:void()\"  page=\"-1\" ");// line 35
			try {
				p(cp == 1 ? "disabled" : "");
			} catch (NullPointerException npe) {
			}// line 36
			p(">Prev</a>\n" +
					"		</li>\n" +
					"		");// line 36
			for (String page : pages) {
				int p = Integer.parseInt(page);// line 38
				p("		<li   ");// line 38
				try {
					p(cp == p ? "class=\"active\"" : "");
				} catch (NullPointerException npe) {
				}// line 39
				p(">\n" +
						"			<a  href=\"javascript:void()\" page=\"");// line 39
				try {
					p(p - cp);
				} catch (NullPointerException npe) {
				}// line 40
				p("\" ");// line 40
				try {
					p(cp == p ? "disabled" : "");
				} catch (NullPointerException npe) {
				}// line 40
				p(">");// line 40
				try {
					p(p);
				} catch (NullPointerException npe) {
				}// line 40
				p("</a>\n" +
						"		</li>\n" +
						"		");// line 40
			}// line 42
			p("		<li  ");// line 42
			try {
				p(cp == ct ? "class=\"disabled\"" : "");
			} catch (NullPointerException npe) {
			}// line 43
			p(">\n" +
					"			<a  href=\"javascript:void()\" page=\"1\" ");// line 43
			try {
				p(cp == ct ? "disabled" : "");
			} catch (NullPointerException npe) {
			}// line 44
			p(">Next</a>\n" +
					"		</li>\n" +
					"	</ul>\n" +
					"</div>\n");// line 44
		}// line 48
		p("</div>\n");// line 48

		endDoLayout(sourceTemplate);
	}

}
