package japidviews.Application;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.ucm.entity.profile.User;
import fengfei.fir.model.PhotoShow;
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
// NOTE: This file was generated from: japidviews/Application/Search.html
// Change to this file will be lost next time the template file is compiled.
//

public class Search extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/Search.html";
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

	public Search() {
		super(null);
	}

	public Search(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"type", "pagePath", "rs", "pageNum", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"int", "String", "Object", "int", };
	public static final Object[] argDefaults = new Object[] { null, null, null,
			null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Search.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private int type; // line 5
	private String pagePath; // line 5
	private Object rs; // line 5
	private int pageNum; // line 5

	public cn.bran.japid.template.RenderResult render(int type,
			String pagePath, Object rs, int pageNum) {
		this.type = type;
		this.pagePath = pagePath;
		this.rs = rs;
		this.pageNum = pageNum;
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
<<<<<<< HEAD
		//------
		p("<pre style=\"display: none\">\n");// line 1
		p("	\n"
				+
				"</pre>\n"
				+
				"\n"
				+
				"\n"
				+
				"\n"
				+
				"\n"
				+
				"\n"
				+
				"\n"
				+
				"<div class=\"grid_row\">\n"
				+
				"\n"
				+
				"	<div class=\"col col_16\">\n"
				+
				"		<form accept-charset=\"UTF-8\" action=\"/search\" method=\"get\" class=\"form-inline\">\n"
				+
				"\n"
				+
				"			<select class=\"selectpicker input-small span1\" id=\"type\" name=\"t\" >\n"
				+
				"				<option value=\"photos\">Photos</option>\n"
				+
				"				<option value=\"photo_tags\" class=\"suboption\">Photo Tags</option>\n"
				+
				"				<!--\n"
				+
				"				<option value=\"stories\">Stories</option>\n"
				+
				"				<option value=\"story_tags\" class=\"suboption\">Story Tags</option>--->\n"
				+
				"				<option value=\"users\" >Users</option>\n" +
				"			</select>\n" +
				"\n" +
				"			");// line 7
		String skey = params.get("c");// line 29
		Byte key = (byte) 0;// line 30
		if (skey != null) {
			key = Byte.parseByte(skey);
		}// line 31
		p("\n"
				+
				"			<select class=\"selectpicker  span2\" id=\"category\" name=\"c\" onchange=\"form.submit();\">\n"
				+
				"				");// line 31
		final Map2SelectOptions _Map2SelectOptions2 = new Map2SelectOptions(
				getOut());
		_Map2SelectOptions2.setActionRunners(getActionRunners()).setOut(
				getOut());
		_Map2SelectOptions2.render(fengfei.spruce.cache.CategoryCache.getAll(),
				key); // line 34// line 34
		p("			</select>\n"
				+
				"\n"
				+
				"			<select  class=\"selectpicker  span2\"  id=\"photos_sort\" name=\"o\" onchange=\"form.submit();\">\n"
				+
				"				<option value=\"votes\" selected=\"selected\">Sort by Votes</option>\n"
				+
				"				<option value=\"date\">Sort by Date</option>\n" +
				"				<option value=\"name\">Sort by Name</option>\n" +
				"			</select>\n" +
				"			<script type=\"application/javascript\">\n" +
				"				var typeValue = '");// line 34
		p(params.get("t"));// line 43
		p("';\n"
				+
				"				$(\"#type\").val(typeValue);\n"
				+
				"				function search_type_change() {\n"
				+
				"					if (this.value == \"users\") {\n"
				+
				"						$(\"#category\").attr(\"disabled\", \"disabled\");\n"
				+
				"					} else {\n"
				+
				"						$(\"#category\").removeAttr(\"disabled\");\n"
				+
				"					}\n"
				+
				"					//$(this).parent(\"form\").submit()\n"
				+
				"				}\n"
				+
				"\n"
				+
				"\n"
				+
				"				$(document).ready(function() {\n"
				+
				"					$(\"select#type\").change(search_type_change);\n"
				+
				"					if(typeValue!=''){\n"
				+
				"					$(\"select#type\").trigger(\"change\");\n"
				+
				"					}\n"
				+
				"					\n"
				+
				"				})\n"
				+
				"			</script>\n"
				+
				"			<div class=\"input-append pull-right\">\n"
				+
				"				<input class=\"input-xxlarge\"   autofocus=\"autofocus\" id=\"search-box\" name=\"q\" placeholder=\"Search for people, photos or tags...\" type=\"text\" value=\"");// line 43
		p(params.get("q"));// line 64
		p("\" />\n" +
				"\n" +
				"				<button class=\"btn\" type=\"submit\">\n" +
				"					<i class=\"icon-search\"></i>\n" +
				"				</button>\n" +
				"			</div>\n" +
				"		</form>\n" +
				"\n" +
				"	</div>\n" +
				"\n" +
				"</div>\n" +
				"\n");// line 64
		if (type == 0) {// line 76
			List<PhotoShow> photos = (List<PhotoShow>) rs;// line 77
			final japidviews.Application.photo.PhotoView _japidviews_Application_photo_PhotoView3 = new japidviews.Application.photo.PhotoView(
					getOut());
			_japidviews_Application_photo_PhotoView3.setActionRunners(
					getActionRunners()).setOut(getOut());
			_japidviews_Application_photo_PhotoView3.render(pagePath, photos,
					pageNum); // line 78// line 78
		} else {// line 79
			List<User> users = (List<User>) rs;// line 80
			final UsersCard _UsersCard4 = new UsersCard(getOut());
			_UsersCard4.setActionRunners(getActionRunners()).setOut(getOut());
			_UsersCard4.render(pagePath, users, pageNum); // line 81// line 81

		}// line 83

=======
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\Search.html

p("	\n" + 
"</pre>\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"grid_row\">\n" + 
"\n" + 
"	<div class=\"col col_16\">\n" + 
"		<form accept-charset=\"UTF-8\" action=\"/search\" method=\"get\" class=\"form-inline\">\n" + 
"\n" + 
"			<select class=\"selectpicker input-small span1\" id=\"type\" name=\"t\" >\n" + 
"				<option value=\"photos\">Photos</option>\n" + 
"				<option value=\"photo_tags\" class=\"suboption\">Photo Tags</option>\n" + 
"				<!--\n" + 
"				<option value=\"stories\">Stories</option>\n" + 
"				<option value=\"story_tags\" class=\"suboption\">Story Tags</option>--->\n" + 
"				<option value=\"users\" >Users</option>\n" + 
"			</select>\n" + 
"\n" + 
"			");// line 7, japidviews\Application\Search.html
		String skey=params.get("c");// line 29, japidviews\Application\Search.html

			Byte key=(byte)0;// line 30, japidviews\Application\Search.html

			if(skey!=null) {key=Byte.parseByte(skey);}// line 31, japidviews\Application\Search.html
		p("\n" + 
"\n" + 
"			<select class=\"selectpicker  span2\" id=\"category\" name=\"c\" onchange=\"form.submit();\">\n" + 
"				");// line 31, japidviews\Application\Search.html
		final CategorySelectOptions _CategorySelectOptions2 = new CategorySelectOptions(getOut()); _CategorySelectOptions2.setActionRunners(getActionRunners()).setOut(getOut()); _CategorySelectOptions2.render(fengfei.spruce.cache.SimpleCache.categories,key); // line 34, japidviews\Application\Search.html// line 34, japidviews\Application\Search.html
		p("\n" + 
"			</select>\n" + 
"\n" + 
"			<select  class=\"selectpicker  span2\"  id=\"photos_sort\" name=\"o\" onchange=\"form.submit();\">\n" + 
"				<option value=\"votes\" selected=\"selected\">Sort by Votes</option>\n" + 
"				<option value=\"date\">Sort by Date</option>\n" + 
"				<option value=\"name\">Sort by Name</option>\n" + 
"			</select>\n" + 
"			<script type=\"application/javascript\">\n" + 
"				var typeValue = '");// line 34, japidviews\Application\Search.html
		p(params.get("t"));// line 43, japidviews\Application\Search.html
		p("';\n" + 
"				$(\"#type\").val(typeValue);\n" + 
"				function search_type_change() {\n" + 
"					if (this.value == \"users\") {\n" + 
"						$(\"#category\").attr(\"disabled\", \"disabled\");\n" + 
"					} else {\n" + 
"						$(\"#category\").removeAttr(\"disabled\");\n" + 
"					}\n" + 
"					//$(this).parent(\"form\").submit()\n" + 
"				}\n" + 
"\n" + 
"\n" + 
"				$(document).ready(function() {\n" + 
"					$(\"select#type\").change(search_type_change);\n" + 
"					if(typeValue!=''){\n" + 
"					$(\"select#type\").trigger(\"change\");\n" + 
"					}\n" + 
"					\n" + 
"				})\n" + 
"			</script>\n" + 
"			<div class=\"input-append pull-right\">\n" + 
"				<input class=\"input-xxlarge\"   autofocus=\"autofocus\" id=\"search-box\" name=\"q\" placeholder=\"Search for people, photos or tags...\" type=\"text\" value=\"");// line 43, japidviews\Application\Search.html
		p(params.get("q"));// line 64, japidviews\Application\Search.html
		p("\" />\n" + 
"\n" + 
"				<button class=\"btn\" type=\"submit\">\n" + 
"					<i class=\"icon-search\"></i>\n" + 
"				</button>\n" + 
"			</div>\n" + 
"		</form>\n" + 
"\n" + 
"	</div>\n" + 
"\n" + 
"</div>\n" + 
"\n");// line 64, japidviews\Application\Search.html
		if(type==0){// line 76, japidviews\Application\Search.html

	List<PhotoShow>	photos=(List<PhotoShow>)rs;// line 77, japidviews\Application\Search.html

		final japidviews.Application.photo.PhotoView _japidviews_Application_photo_PhotoView3 = new japidviews.Application.photo.PhotoView(getOut()); _japidviews_Application_photo_PhotoView3.setActionRunners(getActionRunners()).setOut(getOut()); _japidviews_Application_photo_PhotoView3.render(pagePath,photos,pageNum); // line 78, japidviews\Application\Search.html// line 78, japidviews\Application\Search.html

}else{// line 79, japidviews\Application\Search.html

	List<User>	users=(List<User>)rs;// line 80, japidviews\Application\Search.html

	final UsersCard _UsersCard4 = new UsersCard(getOut()); _UsersCard4.setActionRunners(getActionRunners()).setOut(getOut()); _UsersCard4.render(pagePath,users,pageNum); // line 81, japidviews\Application\Search.html// line 81, japidviews\Application\Search.html
		p("\n" + 
"\n");// line 81, japidviews\Application\Search.html
		}// line 83, japidviews\Application\Search.html
		p("\n");// line 83, japidviews\Application\Search.html
		
>>>>>>> c4b85573d6a4acd632da842373367b248a70c20e
		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy Search Page");
		;
	}

	@Override
	protected void header() {
		p("Search");
		;
	}
}
