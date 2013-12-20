package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.photo.*;import fengfei.fir.utils.Path;import java.util.*;import java.util.Map.Entry;
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
// NOTE: This file was generated from: japidviews/Application/photo/RankShow2.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class RankShow2 extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/RankShow2.html";
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


	public RankShow2() {
		super(null);
	}
	public RankShow2(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"rank",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Rank",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.RankShow2.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Rank rank; // line 4, japidviews/Application/photo/RankShow2.html
	public cn.bran.japid.template.RenderResult render(Rank rank) {
		this.rank = rank;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 4, japidviews/Application/photo/RankShow2.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Rank rank) {
		return new RankShow2().render(rank);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\RankShow2.html
 
p(" \n" + 
"</pre>\n" + 
"<div id=\"rankShow\">\n" + 
"	<div class=\"row-fluid stat  border-bottom\">\n" + 
"		<div class=\"span5 \" title=\"");// line 4, japidviews\Application\photo\RankShow2.html
		;p(getMessage("pluse.alt"));// line 8, japidviews\Application\photo\RankShow2.html
		p("\">\n" + 
"\n" + 
"			<div class=\"photo_score_stats\">\n" + 
"				<strong>");// line 8, japidviews\Application\photo\RankShow2.html
		try { p(rank.sscore); } catch (NullPointerException npe) {}// line 11, japidviews\Application\photo\RankShow2.html
		p("</strong>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"		<div class=\"span7 \">\n" + 
"			<div class=\"photo_stats border-left\">\n" + 
"				<ul>\n" + 
"\n" + 
"					<li title=\"");// line 11, japidviews\Application\photo\RankShow2.html
		;p(getMessage("view.num"));// line 18, japidviews\Application\photo\RankShow2.html
		p("\">\n" + 
"						<strong class=\"key\">");// line 18, japidviews\Application\photo\RankShow2.html
		try { p(rank.view); } catch (NullPointerException npe) {}// line 19, japidviews\Application\photo\RankShow2.html
		p("</strong><small class=\"value\">");// line 19, japidviews\Application\photo\RankShow2.html
		;p(getMessage("view"));// line 19, japidviews\Application\photo\RankShow2.html
		p("</small>\n" + 
"					</li>\n" + 
"\n" + 
"					<li  title=\"");// line 19, japidviews\Application\photo\RankShow2.html
		;p(getMessage("vote.num"));// line 22, japidviews\Application\photo\RankShow2.html
		p("\" >\n" + 
"						<strong\n" + 
"						class=\"key\">");// line 22, japidviews\Application\photo\RankShow2.html
		try { p(rank.vote); } catch (NullPointerException npe) {}// line 24, japidviews\Application\photo\RankShow2.html
		p("</strong><small class=\"value\">");// line 24, japidviews\Application\photo\RankShow2.html
		;p(getMessage("view"));// line 24, japidviews\Application\photo\RankShow2.html
		p("</small>\n" + 
"					</li>\n" + 
"\n" + 
"					<li  title=\"");// line 24, japidviews\Application\photo\RankShow2.html
		;p(getMessage("favorite.num"));// line 27, japidviews\Application\photo\RankShow2.html
		p("\" >\n" + 
"						<strong\n" + 
"						class=\"key\">");// line 27, japidviews\Application\photo\RankShow2.html
		try { p(rank.favorite); } catch (NullPointerException npe) {}// line 29, japidviews\Application\photo\RankShow2.html
		p("</strong><small class=\"value\">");// line 29, japidviews\Application\photo\RankShow2.html
		;p(getMessage("favorite"));// line 29, japidviews\Application\photo\RankShow2.html
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
"				<strong>");// line 29, japidviews\Application\photo\RankShow2.html
		try { p(rank.sMaxScore); } catch (NullPointerException npe) {}// line 40, japidviews\Application\photo\RankShow2.html
		p("</strong>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"		<div class=\"span7 \">\n" + 
"			<div class=\"photo_stats  border-left\">\n" + 
"				<ul class=\"stats\">\n" + 
"					<li>\n" + 
"						<small class=\"faded\">");// line 40, japidviews\Application\photo\RankShow2.html
		;p(getMessage("highest.pulse"));// line 47, japidviews\Application\photo\RankShow2.html
		p("</small>\n" + 
"					</li>\n" + 
"					<li>\n" + 
"						<small class=\"faded\">");// line 47, japidviews\Application\photo\RankShow2.html
		try { p(rank.sMaxAt); } catch (NullPointerException npe) {}// line 50, japidviews\Application\photo\RankShow2.html
		p("</small>\n" + 
"					</li>\n" + 
"				</ul>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"</div>");// line 50, japidviews\Application\photo\RankShow2.html
		
		endDoLayout(sourceTemplate);
	}

}