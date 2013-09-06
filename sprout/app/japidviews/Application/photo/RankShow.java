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
// NOTE: This file was generated from: japidviews/Application/photo/RankShow.html
// Change to this file will be lost next time the template file is compiled.
//

public class RankShow extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/RankShow.html";
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

	public RankShow() {
		super(null);
	}

	public RankShow(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"rank", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Rank", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.RankShow.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private Rank rank; // line 4

	public cn.bran.japid.template.RenderResult render(Rank rank) {
		this.rank = rank;
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
				"<div id=\"rankShow\">\n" +
				"	<div class=\"row-fluid stat  border-bottom\">\n" +
				"		<div class=\"span5 \" title=\"");// line 4
		;
		p(getMessage("pluse.alt"));// line 8
		p("\">\n" +
				"\n" +
				"			<div class=\"photo_score_stats\">\n" +
				"				<strong>");// line 8
		try {
			p(rank.sscore);
		} catch (NullPointerException npe) {
		}// line 11
		p("</strong>\n" +
				"			</div>\n" +
				"		</div>\n" +
				"		<div class=\"span7 \">\n" +
				"			<div class=\"photo_stats border-left\">\n" +
				"				<ul>\n" +
				"\n" +
				"					<li title=\"");// line 11
		;
		p(getMessage("view.num"));// line 18
		p("\">\n" +
				"						<strong class=\"key\">");// line 18
		try {
			p(rank.view);
		} catch (NullPointerException npe) {
		}// line 19
		p("</strong><small class=\"value\">");// line 19
		;
		p(getMessage("view"));// line 19
		p("</small>\n" +
				"					</li>\n" +
				"\n" +
				"					<li  title=\"");// line 19
		;
		p(getMessage("vote.num"));// line 22
		p("\" >\n" +
				"						<strong\n" +
				"						class=\"key\">");// line 22
		try {
			p(rank.vote);
		} catch (NullPointerException npe) {
		}// line 24
		p("</strong><small class=\"value\">");// line 24
		;
		p(getMessage("view"));// line 24
		p("</small>\n" +
				"					</li>\n" +
				"\n" +
				"					<li  title=\"");// line 24
		;
		p(getMessage("favorite.num"));// line 27
		p("\" >\n" +
				"						<strong\n" +
				"						class=\"key\">");// line 27
		try {
			p(rank.favorite);
		} catch (NullPointerException npe) {
		}// line 29
		p("</strong><small class=\"value\">");// line 29
		;
		p(getMessage("favorite"));// line 29
		p("</small>\n" +
				"					</li>\n" +
				"\n" +
				"				</ul>\n" +
				"			</div>\n" +
				"		</div>\n" +
				"\n" +
				"	</div>\n" +
				"	<div class=\"row-fluid stat shadow\">\n" +
				"		<div class=\"span5\">\n" +
				"			<div class=\"photo_max_stats\">\n" +
				"				<strong>");// line 29
		try {
			p(rank.sMaxScore);
		} catch (NullPointerException npe) {
		}// line 40
		p("</strong>\n" +
				"			</div>\n" +
				"		</div>\n" +
				"		<div class=\"span7 \">\n" +
				"			<div class=\"photo_stats  border-left\">\n" +
				"				<ul class=\"stats\">\n" +
				"					<li>\n" +
				"						<small class=\"faded\">");// line 40
		;
		p(getMessage("highest.pulse"));// line 47
		p("</small>\n" +
				"					</li>\n" +
				"					<li>\n" +
				"						<small class=\"faded\">");// line 47
		try {
			p(rank.sMaxAt);
		} catch (NullPointerException npe) {
		}// line 50
		p("</small>\n" +
				"					</li>\n" +
				"				</ul>\n" +
				"			</div>\n" +
				"		</div>\n" +
				"	</div>\n" +
				"</div>\n");// line 50

		endDoLayout(sourceTemplate);
	}

}
