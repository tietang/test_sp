package japidviews.Application.photo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;import fengfei.fir.model.PhotoShow;
import java.util.*;import fengfei.ucm.entity.photo.*;import fengfei.fir.utils.Path;
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
// NOTE: This file was generated from: japidviews/Application/photo/UploadForm.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class UploadForm extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/UploadForm.html";
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


	public UploadForm() {
		super(null);
	}
	public UploadForm(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"photo", "photoSets",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Photo", "List<PhotoSet>",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.UploadForm.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Photo photo; // line 4, japidviews/Application/photo/UploadForm.html
	private List<PhotoSet> photoSets; // line 4, japidviews/Application/photo/UploadForm.html
	public cn.bran.japid.template.RenderResult render(Photo photo,List<PhotoSet> photoSets) {
		this.photo = photo;
		this.photoSets = photoSets;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 4, japidviews/Application/photo/UploadForm.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(Photo photo,List<PhotoSet> photoSets) {
		return new UploadForm().render(photo, photoSets);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\UploadForm.html
p("</pre>\n" + 
"\n" + 
"\n" + 
"<tr>\n" + 
"    <td class=\"right_line  col_8\">\n" + 
"        <div class=\" magin_left\">\n" + 
"            <div id=\"preview\" class=\"preview img_shadow\">\n" + 
"                ");// line 4, japidviews\Application\photo\UploadForm.html
		if(photo!=null){// line 12, japidviews\Application\photo\UploadForm.html
		p("                <img src=\"");// line 12, japidviews\Application\photo\UploadForm.html
		p(Path.getJpegDownloadPath(photo.idPhoto,0));// line 13, japidviews\Application\photo\UploadForm.html
		p("\" class=\"rounded3 img_shadow\" alt=\"\">\n" + 
"                ");// line 13, japidviews\Application\photo\UploadForm.html
		}// line 14, japidviews\Application\photo\UploadForm.html
		p("\n" + 
"            </div>\n" + 
"            <p>\n" + 
"\n" + 
"            <div style=\"");// line 14, japidviews\Application\photo\UploadForm.html
		if(photo!=null){// line 19, japidviews\Application\photo\UploadForm.html
		p("display: none");// line 19, japidviews\Application\photo\UploadForm.html
		}// line 19, japidviews\Application\photo\UploadForm.html
		p("\">\n" + 
"                <div>\n" + 
"                    ");// line 19, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.file.name"));// line 21, japidviews\Application\photo\UploadForm.html
		p(" <span id=\"name\"></span>\n" + 
"                </div>\n" + 
"                <div>\n" + 
"                    ");// line 21, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.file.size"));// line 24, japidviews\Application\photo\UploadForm.html
		p(" <span id=\"size\"></span>\n" + 
"                </div>\n" + 
"\n" + 
"            </div>\n" + 
"            </p>\n" + 
"            <div class=\"alert alert-danger\" id=\"uploadError\" style=\"display: none\">\n" + 
"                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n" + 
"                    &times;\n" + 
"                </button>\n" + 
"                ");// line 24, japidviews\Application\photo\UploadForm.html
		;p(getMessage("upload.error"));// line 33, japidviews\Application\photo\UploadForm.html
		p("            </div>\n" + 
"\n" + 
"        </div>\n" + 
"    </td>\n" + 
"    <td class=\"right_line col_4\">\n" + 
"        <div class=\"  magin_left\">\n" + 
"            <div class=\"block\">\n" + 
"                <label for=\"title1\">");// line 33, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.title"));// line 41, japidviews\Application\photo\UploadForm.html
		p("</label>\n" + 
"                <input type=\"text\"\n" + 
"                       placeholder=\"");// line 41, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.title"));// line 43, japidviews\Application\photo\UploadForm.html
		p("\" maxlength=\"100\" id=\"title1\" value=\"\"\n" + 
"                       name=\"title\" class=\"form-control col-lg-4 \">\n" + 
"                <input type=\"hidden\" placeholder=\"ID\" maxlength=\"100\" id=\"id1\" value=\"\" name=\"id\">\n" + 
"                <input type=\"hidden\" placeholder=\"ID\" maxlength=\"100\" id=\"id_photo1\" value=\"\" name=\"id_photo\">\n" + 
"            </div>\n" + 
"            <div class=\"block\">\n" + 
"                <label for=\"desc1\">");// line 43, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.description"));// line 49, japidviews\Application\photo\UploadForm.html
		p("</label>\n" + 
"                <textarea class=\"form-control col-lg-4 \" id=\"desc1\" rows=\"8\" placeholder=\"");// line 49, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.description"));// line 50, japidviews\Application\photo\UploadForm.html
		p("\"\n" + 
"                          name=\"description\"></textarea>\n" + 
"            </div>\n" + 
"            <div class=\"block\">\n" + 
"                <select name=\"dir\" id=\"dir1\" data-style=\" btn-default \"\n" + 
"                        class=\"selectpicker category col-lg-12\">\n" + 
"                    <option value=\"0\">");// line 50, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.dir.no"));// line 56, japidviews\Application\photo\UploadForm.html
		p("</option>\n" + 
"                    ");// line 56, japidviews\Application\photo\UploadForm.html
		if(photoSets!=null){// line 57, japidviews\Application\photo\UploadForm.html
                    for(PhotoSet set:photoSets){// line 58, japidviews\Application\photo\UploadForm.html
		p("                    <option value=\"");// line 58, japidviews\Application\photo\UploadForm.html
		p(set.idSet);// line 59, japidviews\Application\photo\UploadForm.html
		p("\">");// line 59, japidviews\Application\photo\UploadForm.html
		p(set.name);// line 59, japidviews\Application\photo\UploadForm.html
		p("</option>\n" + 
"\n" + 
"                    ");// line 59, japidviews\Application\photo\UploadForm.html
		}// line 61, japidviews\Application\photo\UploadForm.html
                    }// line 62, japidviews\Application\photo\UploadForm.html
		p("                </select>\n" + 
"            </div>\n" + 
"\n" + 
"            <div class=\"block\">\n" + 
"                <select name=\"category\" id=\"category1\" data-style=\"btn-default \"\n" + 
"                        class=\"selectpicker category col-lg-12\">\n" + 
"                    ");// line 62, japidviews\Application\photo\UploadForm.html
		final CategorySelectOptions _CategorySelectOptions0 = new CategorySelectOptions(getOut()); _CategorySelectOptions0.setActionRunners(getActionRunners()).setOut(getOut()); _CategorySelectOptions0.render(fengfei.spruce.cache.SimpleCache.categories,(byte) 0); // line 69, japidviews\Application\photo\UploadForm.html// line 69, japidviews\Application\photo\UploadForm.html
		p("                </select>\n" + 
"            </div>\n" + 
"\n" + 
"            <div class=\"block\">\n" + 
"                <select name=\"license\" id=\"license1\" data-style=\"btn-default  \"\n" + 
"                        class=\"selectpicker license col-lg-12\">\n" + 
"                    ");// line 69, japidviews\Application\photo\UploadForm.html
		final LicenseSelectOptions _LicenseSelectOptions1 = new LicenseSelectOptions(getOut()); _LicenseSelectOptions1.setActionRunners(getActionRunners()).setOut(getOut()); _LicenseSelectOptions1.render(fengfei.spruce.cache.SimpleCache.licenses,"by"); // line 76, japidviews\Application\photo\UploadForm.html// line 76, japidviews\Application\photo\UploadForm.html
		p("                </select>\n" + 
"\n" + 
"                <p style=\"text-align: right\">\n" + 
"                    <a href=\"#\">About License</a>\n" + 
"                </p>\n" + 
"\n" + 
"                <p>\n" + 
"\n" + 
"                <div id=\"cc\" style=\"text-align: right\"></div>\n" + 
"                </p>\n" + 
"\n" + 
"            </div>\n" + 
"            <div class=\"block\">\n" + 
"                <input type=\"text\" placeholder=\"");// line 76, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.tags"));// line 90, japidviews\Application\photo\UploadForm.html
		p(" \" rows=\"6\" data-provide=\"tag\" data-caseInsensitive=\"true\"\n" + 
"                       class=\"form-control col-lg-4  \" name=\"tags\" id=\"tags1\"/>\n" + 
"            </div>\n" + 
"            <div class=\"checkbox\">\n" + 
"                <label for=\"adult1\">\n" + 
"                    <input type=\"checkbox\" value=\"1\"\n" + 
"                           id=\"adult1\" name=\"adult\">\n" + 
"                    ");// line 90, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.adult"));// line 97, japidviews\Application\photo\UploadForm.html
		p("</label>\n" + 
"            </div>\n" + 
"            <div class=\"checkbox\">\n" + 
"                <label for=\"copyright1\">\n" + 
"                    <input type=\"checkbox\"\n" + 
"                           value=\"1\" id=\"copyright1\" name=\"copyright\" checked=\"checked\">\n" + 
"                    ");// line 97, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.copyright"));// line 103, japidviews\Application\photo\UploadForm.html
		p("</label>\n" + 
"            </div>\n" + 
"            <div class=\"checkbox\">\n" + 
"                <label for=\"can_ps1\">\n" + 
"                    <input type=\"checkbox\"\n" + 
"                           value=\"1\" id=\"can_ps1\" name=\"can_ps\" checked=\"checked\">\n" + 
"                    ");// line 103, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.can.ps"));// line 109, japidviews\Application\photo\UploadForm.html
		p("</label>\n" + 
"            </div>\n" + 
"\n" + 
"            <input type=\"hidden\" value=\"\" id=\"WhiteBalance1\" name=\"WhiteBalance\">\n" + 
"\n" + 
"            <input type=\"hidden\" value=\"\" id=\"Software1\" name=\"Software\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"Flash1\" name=\"Flash\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"ColorSpace1\" name=\"ColorSpace\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"MeteringMode1\" name=\"MeteringMode\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"ExposureProgram1\" name=\"ExposureProgram\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"ExposureMode1\" name=\"ExposureMode\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"GPSLatitude1\" name=\"GPSLatitude\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"GPSLongitude1\" name=\"GPSLongitude\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"GPSAltitude1\" name=\"GPSAltitude\">\n" + 
"            <input type=\"hidden\" value=\"\" id=\"GPSOrigin1\" name=\"GPSOrigin\">\n" + 
"        </div>\n" + 
"    </td>\n" + 
"    <td class=\"col_4\">\n" + 
"        <div class=\" magin_left\">\n" + 
"            <div class=\"inline input-group\">\n" + 
"                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-head left\">");// line 109, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.camera"));// line 129, japidviews\Application\photo\UploadForm.html
		p("</span></span>\n" + 
"                <input type=\"text\" placeholder=\"");// line 129, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.camera"));// line 130, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\"\n" + 
"                       class=\"form-control Camera\" id=\"camera1\" name=\"camera\">\n" + 
"                <input\n" + 
"                        type=\"hidden\" placeholder=\"");// line 130, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.make"));// line 133, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\" class=\"form-control make\"\n" + 
"                        id=\"make1\" name=\"make\">\n" + 
"\n" + 
"            </div>\n" + 
"            <div class=\"inline input-group\">\n" + 
"                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-head left\">");// line 133, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.lens"));// line 138, japidviews\Application\photo\UploadForm.html
		p("</span> </span>\n" + 
"                <input type=\"text\" placeholder=\"");// line 138, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.lens"));// line 139, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\" class=\"form-control lens\"\n" + 
"                       id=\"lens1\" name=\"lens\">\n" + 
"            </div>\n" + 
"            <div class=\"inline input-group\">\n" + 
"                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-head left\">");// line 139, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.focus"));// line 143, japidviews\Application\photo\UploadForm.html
		p(" </span></span>\n" + 
"                <input type=\"text\" placeholder=\"");// line 143, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.focus.alt"));// line 144, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\"\n" + 
"                       class=\"form-control focal-length\" id=\"focus1\" name=\"focus\">\n" + 
"            </div>\n" + 
"            <div class=\"inline input-group\">\n" + 
"                <span class=\"input-group-addon \"><span class=\"glyphicon glyphicon-head left\">");// line 144, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.shutter"));// line 148, japidviews\Application\photo\UploadForm.html
		p(" </span></span>\n" + 
"                <input type=\"text\" placeholder=\"");// line 148, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.shutter.alt"));// line 149, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\"\n" + 
"                       class=\"form-control shutter-speed\" id=\"shutter1\" name=\"shutter\">\n" + 
"            </div>\n" + 
"            <div class=\"inline input-group\">\n" + 
"                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-head left\">");// line 149, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.aperture"));// line 153, japidviews\Application\photo\UploadForm.html
		p("</span></span>\n" + 
"                <input type=\"text\" placeholder=\"");// line 153, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.aperture"));// line 154, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\"\n" + 
"                       class=\"form-control aperture\" id=\"aperture1\" name=\"aperture\">\n" + 
"            </div>\n" + 
"            <div class=\"inline input-group last\">\n" + 
"                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-head left\">");// line 154, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.iso"));// line 158, japidviews\Application\photo\UploadForm.html
		p(" </span></span>\n" + 
"                <input type=\"text\" placeholder=\"");// line 158, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.iso.alt"));// line 159, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\" class=\"form-control iso\"\n" + 
"                       id=\"iso1\" name=\"iso\">\n" + 
"            </div>\n" + 
"            <div class=\"inline input-group last\">\n" + 
"                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-head left\">");// line 159, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.ev"));// line 163, japidviews\Application\photo\UploadForm.html
		p("</span></span>\n" + 
"                <input type=\"text\" placeholder=\"");// line 163, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.ev.alt"));// line 164, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\"\n" + 
"                       class=\"form-control iso\" id=\"ev1\" name=\"ev\">\n" + 
"            </div>\n" + 
"            <div class=\"inline input-group\">\n" + 
"                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-head left\"> ");// line 164, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.taken"));// line 168, japidviews\Application\photo\UploadForm.html
		p(" </span></span>\n" + 
"                <input type=\"hidden\" value=\"\" id=\"taken_at1\"\n" + 
"                       name=\"taken_at\">\n" + 
"                <input type=\"text\"\n" + 
"                       placeholder=\"");// line 168, japidviews\Application\photo\UploadForm.html
		;p(getMessage("photo.taken.alt"));// line 172, japidviews\Application\photo\UploadForm.html
		p("\" value=\"\" class=\"form-control date\"\n" + 
"                       id=\"taken_at_display1\">\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"        <div class=\"line4\"></div>\n" + 
"        <div id=\"map_canvas\" class=\"map_canvas img_shadow\"></div>\n" + 
"    </td>\n" + 
"</tr>\n");// line 172, japidviews\Application\photo\UploadForm.html
		
		endDoLayout(sourceTemplate);
	}

}