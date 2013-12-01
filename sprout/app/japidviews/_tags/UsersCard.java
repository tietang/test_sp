package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.User;
import java.util.Set;import fengfei.ucm.entity.photo.*;import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import static japidviews._javatags.Pic.*;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/_tags/UsersCard.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class UsersCard extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/_tags/UsersCard.html";
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


	public UsersCard() {
		super(null);
	}
	public UsersCard(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"pagePath", "users", "pageNum",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<User>", "int",  };
	public static final Object[] argDefaults= new Object[] {null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.UsersCard.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String pagePath; // line 4, japidviews/_tags/UsersCard.html
	private List<User> users; // line 4, japidviews/_tags/UsersCard.html
	private int pageNum; // line 4, japidviews/_tags/UsersCard.html
	public cn.bran.japid.template.RenderResult render(String pagePath,List<User> users,int pageNum) {
		this.pagePath = pagePath;
		this.users = users;
		this.pageNum = pageNum;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 4, japidviews/_tags/UsersCard.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String pagePath,List<User> users,int pageNum) {
		return new UsersCard().render(pagePath, users, pageNum);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\_tags\UsersCard.html
p("</pre>\n" + 
"\n" + 
"\n" + 
"<div class=\"grid_row yours\">\n");// line 4, japidviews\_tags\UsersCard.html
		for(User user:users){// line 9, japidviews\_tags\UsersCard.html
		p("	<div class=\"col col_4\">\n" + 
"		<div class=\"row card\"  >\n" + 
"			<div class=\"col-lg-6 first\">\n" + 
"				<img width=\"95\" height=\"95\" class=\"img-rounded\"\n" + 
"				src=\"");// line 9, japidviews\_tags\UsersCard.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(user.idUser));// line 14, japidviews\_tags\UsersCard.html
		p("\">\n" + 
"			</div>\n" + 
"			<div class=\"col-lg-6 photo_stats\">\n" + 
"				<ul >\n" + 
"					<li title=\"Views\">\n" + 
"						<small class=\"key\" >Views</small><strong class=\"value\">");// line 14, japidviews\_tags\UsersCard.html
		p(user.view);// line 19, japidviews\_tags\UsersCard.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"Votes\">\n" + 
"						<small class=\"key\">Votes</small><strong class=\"value\">");// line 19, japidviews\_tags\UsersCard.html
		p(user.vote);// line 22, japidviews\_tags\UsersCard.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"Favorites\">\n" + 
"						<small class=\"key\">Favorites</small><strong class=\"value\">");// line 22, japidviews\_tags\UsersCard.html
		p(user.favorite);// line 25, japidviews\_tags\UsersCard.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"comments\">\n" + 
"						<small class=\"key\">Comments</small><strong class=\"value\">");// line 25, japidviews\_tags\UsersCard.html
		p(user.comment);// line 28, japidviews\_tags\UsersCard.html
		p("</strong>\n" + 
"					</li>\n" + 
"\n" + 
"				</ul>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n");// line 28, japidviews\_tags\UsersCard.html
		}// line 36, japidviews\_tags\UsersCard.html
		p("</div>\n" + 
"\n");// line 36, japidviews\_tags\UsersCard.html
		
		endDoLayout(sourceTemplate);
	}

}