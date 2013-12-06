//version: 0.9.37
package japidviews.Application.profile;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
import java.util.*;import fengfei.ucm.entity.photo.*;import japidviews.Application.photo.*;
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
// NOTE: This file was generated from: japidviews/Application/profile/PhotoEdit.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class PhotoEdit extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/PhotoEdit.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
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


	public PhotoEdit() {
	super((StringBuilder)null);
	initHeaders();
	}
	public PhotoEdit(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public PhotoEdit(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"photo", "photoSets",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Photo", "List<PhotoSet>",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.PhotoEdit.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Photo photo; // line 6, japidviews/Application/profile/PhotoEdit.html
	private List<PhotoSet> photoSets; // line 6, japidviews/Application/profile/PhotoEdit.html
	public cn.bran.japid.template.RenderResult render(Photo photo,List<PhotoSet> photoSets) {
		this.photo = photo;
		this.photoSets = photoSets;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 6, japidviews/Application/profile/PhotoEdit.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(Photo photo,List<PhotoSet> photoSets) {
		return new PhotoEdit().render(photo, photoSets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
p("<pre style=\"display: none\">\n" + 
"	\n");// line 1, japidviews\Application\profile\PhotoEdit.html

// line 7, japidviews\Application\profile\PhotoEdit.html
		p("</pre>\n" + 
"<form id=\"photoEditForm\" action=\"/edit/done\" method=\"post\" enctype=\"multipart/form-data\"  >\n" + 
"	<div class=\"grid_row upload \">\n" + 
"		<div class=\"col col_16\">\n" + 
"\n" + 
"			<div>\n" + 
"\n" + 
"				<table class=\"table table-striped  exif_table img_shadow exif\" id=\"content\" >\n" + 
"					<tbody >\n" + 
"						");// line 16, japidviews\Application\profile\PhotoEdit.html
		new UploadForm(PhotoEdit.this).render(photo,photoSets); // line 26, japidviews\Application\profile\PhotoEdit.html// line 26, japidviews\Application\profile\PhotoEdit.html
		p("\n" + 
"\n" + 
"						<tr>\n" + 
"							<td colspan=\"2\">");// line 26, japidviews\Application\profile\PhotoEdit.html
		String msg=(String)flash.get("msg");// line 29, japidviews\Application\profile\PhotoEdit.html

							if( msg!=null){// line 30, japidviews\Application\profile\PhotoEdit.html
		p("\n" + 
"							<div class=\"alert ");// line 30, japidviews\Application\profile\PhotoEdit.html
		if("success".equals(msg)){// line 31, japidviews\Application\profile\PhotoEdit.html
		p("alert-success");// line 31, japidviews\Application\profile\PhotoEdit.html
		}else{// line 31, japidviews\Application\profile\PhotoEdit.html
		p("alert-error");// line 31, japidviews\Application\profile\PhotoEdit.html
		}// line 31, japidviews\Application\profile\PhotoEdit.html
		p("\">\n" + 
"								<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n" + 
"									&times;\n" + 
"								</button>\n" + 
"								");// line 31, japidviews\Application\profile\PhotoEdit.html
		p(msg);// line 35, japidviews\Application\profile\PhotoEdit.html
		p("\n" + 
"							</div> ");// line 35, japidviews\Application\profile\PhotoEdit.html
		}// line 36, japidviews\Application\profile\PhotoEdit.html
		p(" </td>\n" + 
"							<td>\n" + 
"							<button class=\"btn btn-success\" type=\"submit\" id=\"save_photo\">\n" + 
"								Save\n" + 
"							</button>\n" + 
"							<button class=\"btn btn-success\" type=\"button\" id=\"publish_photo\">\n" + 
"								Publish\n" + 
"							</button>\n" + 
"							<button class=\"btn btn-info\" onclick=\"window.close()\" type=\"button\"  >\n" + 
"								Close\n" + 
"							</button></td>\n" + 
"						</tr>\n" + 
"					</tbody>\n" + 
"				</table>\n" + 
"			</div>\n" + 
"\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"\n" + 
"</form>\n");// line 36, japidviews\Application\profile\PhotoEdit.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void css() {
		// line 7, japidviews\Application\profile\PhotoEdit.html
		p("<script src=\"");// line 7, japidviews\Application\profile\PhotoEdit.html
		p(lookupStatic("/public/bootstrap/bootstrap-tag.js"));// line 8, japidviews\Application\profile\PhotoEdit.html
		p("\"></script>\n" + 
"<link type=\"text/css\" href=\"");// line 8, japidviews\Application\profile\PhotoEdit.html
		p(lookupStatic("/public/bootstrap/bootstrap-tag.css"));// line 9, japidviews\Application\profile\PhotoEdit.html
		p("\"  rel=\"stylesheet\"/>\n" + 
"<script type=\"text/javascript\" src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDqPLY_onh61yMSw5KSVICJN-B5igbHCTs&sensor=false&language=zh-cn\"></script>\n" + 
"<script src=\"");// line 9, japidviews\Application\profile\PhotoEdit.html
		p(lookupStatic("/public/js/gmap/gmap-context-menu.js"));// line 11, japidviews\Application\profile\PhotoEdit.html
		p("\"></script>\n" + 
"<link type=\"text/css\" href=\"");// line 11, japidviews\Application\profile\PhotoEdit.html
		p(lookupStatic("/public/js/gmap/gmap-context-menu.css"));// line 12, japidviews\Application\profile\PhotoEdit.html
		p("\"  rel=\"stylesheet\"/>\n" + 
"<script src=\"");// line 12, japidviews\Application\profile\PhotoEdit.html
		p(lookupStatic("/public/app/map.js"));// line 13, japidviews\Application\profile\PhotoEdit.html
		p("\"></script>\n" + 
"<script src=\"");// line 13, japidviews\Application\profile\PhotoEdit.html
		p(lookupStatic("/public/app/photoEdit.js"));// line 14, japidviews\Application\profile\PhotoEdit.html
		p("\"></script>\n" + 
"<script type=\"text/javascript\">var _edit_photo = ");// line 14, japidviews\Application\profile\PhotoEdit.html
		p(fengfei.spruce.utils.WebUtils.toJSON(photo));// line 15, japidviews\Application\profile\PhotoEdit.html
		p(";</script>\n");// line 15, japidviews\Application\profile\PhotoEdit.html
		;
	}
}