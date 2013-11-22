//version: 0.9.35
package japidviews.Application.photo;

import fengfei.ucm.entity.photo.Comment;

import java.util.List;
//
// NOTE: This file was generated from: japidviews/Application/photo/Comments.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Comments extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/Comments.html";
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


	public Comments() {
		super(null);
	}
	public Comments(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"comments", "pages", "cp", "ct",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<Comment>", "List<String>", "int", "int",  };
	public static final Object[] argDefaults= new Object[] {null,null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Comments.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<Comment> comments; // line 4, japidviews/Application/photo/Comments.html
	private List<String> pages; // line 4, japidviews/Application/photo/Comments.html
	private int cp; // line 4, japidviews/Application/photo/Comments.html
	private int ct; // line 4, japidviews/Application/photo/Comments.html
	public cn.bran.japid.template.RenderResult render(List<Comment> comments,List<String> pages,int cp,int ct) {
		this.comments = comments;
		this.pages = pages;
		this.cp = cp;
		this.ct = ct;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 4, japidviews/Application/photo/Comments.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(List<Comment> comments,List<String> pages,int cp,int ct) {
		return new Comments().render(comments, pages, cp, ct);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\Comments.html
 
p("\n" + 
"</pre>\n" + 
"\n" + 
"\n" + 
"<div>\n" + 
"    <ul class=\"media-list\" id=\"comments\">\n" + 
"        ");// line 4, japidviews\Application\photo\Comments.html
		for(Comment c:comments){// line 10, japidviews\Application\photo\Comments.html
		p("\n" + 
"        <li class=\"media\">\n" + 
"            <a class=\"pull-left\" href=\"/to/");// line 10, japidviews\Application\photo\Comments.html
		try { p(c.idUser); } catch (NullPointerException npe) {}// line 12, japidviews\Application\photo\Comments.html
		p("\">\n" + 
"                <div class=\"media-object\"><img\n" + 
"                        class=\" img-rounded image_64\"\n" + 
"                        src=\"");// line 12, japidviews\Application\photo\Comments.html
		try { p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(c.idUser)); } catch (NullPointerException npe) {}// line 15, japidviews\Application\photo\Comments.html
		p("\">\n" + 
"                </div>\n" + 
"            </a>\n" + 
"\n" + 
"            <div class=\"media-body\">\n" + 
"                <div class=\"media-heading border-bottom\">\n" + 
"                    <strong><a href=\"/to/");// line 15, japidviews\Application\photo\Comments.html
		try { p(c.idUser); } catch (NullPointerException npe) {}// line 21, japidviews\Application\photo\Comments.html
		p("\">");// line 21, japidviews\Application\photo\Comments.html
		try { p(c.niceName); } catch (NullPointerException npe) {}// line 21, japidviews\Application\photo\Comments.html
		p("</a></strong>\n" + 
"                    <small>  &nbsp;&nbsp;");// line 21, japidviews\Application\photo\Comments.html
		try { p(c.sinceTime); } catch (NullPointerException npe) {}// line 22, japidviews\Application\photo\Comments.html
		p("</small>\n" + 
"                </div>\n" + 
"                <small>");// line 22, japidviews\Application\photo\Comments.html
		try { p(c.content); } catch (NullPointerException npe) {}// line 24, japidviews\Application\photo\Comments.html
		p("</small>\n" + 
"            </div>\n" + 
"        </li>\n" + 
"        ");// line 24, japidviews\Application\photo\Comments.html
		}// line 27, japidviews\Application\photo\Comments.html
		p("\n" + 
"\n" + 
"    </ul>\n" + 
"\n" + 
"</div>\n" + 
"<div class=\"line6\"></div>\n");// line 27, japidviews\Application\photo\Comments.html
		if(pages.size()>1){// line 33, japidviews\Application\photo\Comments.html
		p("\n" + 
"<div class=\"pagination pagination-centered\" id=\"pagination\">\n" + 
"    <input type=\"hidden\" name=\"cp\" id=\"cp\" value=\"");// line 33, japidviews\Application\photo\Comments.html
		try { p(cp); } catch (NullPointerException npe) {}// line 35, japidviews\Application\photo\Comments.html
		p("\"/>\n" + 
"    <input type=\"hidden\" name=\"ct\" id=\"ct\" value=\"");// line 35, japidviews\Application\photo\Comments.html
		try { p(ct); } catch (NullPointerException npe) {}// line 36, japidviews\Application\photo\Comments.html
		p("\"/>\n" + 
"    <ul>\n" + 
"        <li\n" + 
"        ");// line 36, japidviews\Application\photo\Comments.html
		try { p(cp==1?"class=\"disabled\"":""); } catch (NullPointerException npe) {}// line 39, japidviews\Application\photo\Comments.html
		p(">\n" + 
"        <a href=\"javascript:void()\" page=\"-1\" ");// line 39, japidviews\Application\photo\Comments.html
		try { p(cp==1?"disabled":""); } catch (NullPointerException npe) {}// line 40, japidviews\Application\photo\Comments.html
		p(">Prev</a>\n" + 
"        </li>\n" + 
"        ");// line 40, japidviews\Application\photo\Comments.html
		for(String page: pages){int p=Integer.parseInt(page);// line 42, japidviews\Application\photo\Comments.html
		p("\n" + 
"        <li\n" + 
"        ");// line 42, japidviews\Application\photo\Comments.html
		try { p(cp==p?"class=\"active\"":""); } catch (NullPointerException npe) {}// line 44, japidviews\Application\photo\Comments.html
		p(">\n" + 
"        <a href=\"javascript:void()\" page=\"");// line 44, japidviews\Application\photo\Comments.html
		try { p(p-cp); } catch (NullPointerException npe) {}// line 45, japidviews\Application\photo\Comments.html
		p("\" ");// line 45, japidviews\Application\photo\Comments.html
		try { p(cp==p?"disabled":""); } catch (NullPointerException npe) {}// line 45, japidviews\Application\photo\Comments.html
		p(">");// line 45, japidviews\Application\photo\Comments.html
		try { p(p); } catch (NullPointerException npe) {}// line 45, japidviews\Application\photo\Comments.html
		p("</a>\n" + 
"        </li>\n" + 
"        ");// line 45, japidviews\Application\photo\Comments.html
		}// line 47, japidviews\Application\photo\Comments.html
		p("\n" + 
"        <li\n" + 
"        ");// line 47, japidviews\Application\photo\Comments.html
		try { p(cp==ct?"class=\"disabled\"":""); } catch (NullPointerException npe) {}// line 49, japidviews\Application\photo\Comments.html
		p(">\n" + 
"        <a href=\"javascript:void()\" page=\"1\" ");// line 49, japidviews\Application\photo\Comments.html
		try { p(cp==ct?"disabled":""); } catch (NullPointerException npe) {}// line 50, japidviews\Application\photo\Comments.html
		p(">Next</a>\n" + 
"        </li>\n" + 
"    </ul>\n" + 
"</div>\n");// line 50, japidviews\Application\photo\Comments.html
		}// line 54, japidviews\Application\photo\Comments.html
		p("\n" + 
"</div>\n");// line 54, japidviews\Application\photo\Comments.html
		
		endDoLayout(sourceTemplate);
	}

}