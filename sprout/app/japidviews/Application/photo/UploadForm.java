package japidviews.Application.photo;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;
import fengfei.fir.model.PhotoShow;
import java.util.*;
import fengfei.ucm.entity.photo.*;
import fengfei.fir.utils.Path;
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
// NOTE: This file was generated from: japidviews/Application/photo/UploadForm.html
// Change to this file will be lost next time the template file is compiled.
//

public class UploadForm extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/photo/UploadForm.html";
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

	public UploadForm() {
		super(null);
	}

	public UploadForm(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"photo", "photoSets", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"Photo", "List<PhotoSet>", };
	public static final Object[] argDefaults = new Object[] { null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.UploadForm.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private Photo photo; // line 4
	private List<PhotoSet> photoSets; // line 4

	public cn.bran.japid.template.RenderResult render(Photo photo,
			List<PhotoSet> photoSets) {
		this.photo = photo;
		this.photoSets = photoSets;
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
		p("</pre>\n" +
				"\n" +
				"\n" +
				"\n" +
				"\n" +
				"<tr>\n" +
				"	<td class=\"right_line  col_8\">\n" +
				"	<div class=\" magin_left\">\n" +
				"		<div id=\"preview\" class=\"preview img_shadow\">\n" +
				"			");// line 4
		if (photo != null) {// line 14
			p("			<img src=\"");// line 14
			p(Path.getJpegDownloadPath(photo.idPhoto, 0));// line 15
			p("\" class=\"rounded3 img_shadow\" alt=\"\" >\n" +
					"			");// line 15
		}// line 16
		p("\n" +
				"		</div>\n" +
				"		<p>\n" +
				"			<div ");// line 16
		if (photo != null) {// line 20
			p("style=\"display: none\"");// line 20
		}// line 20
		p(">\n" +
				"				<div>\n" +
				"					");// line 20
		;
		p(getMessage("photo.file.name"));// line 22
		p("  <span id=\"name\"></span>\n" +
				"				</div>\n" +
				"				<div>\n" +
				"                    ");// line 22
		;
		p(getMessage("photo.file.size"));// line 25
		p(" <span id=\"size\"></span>\n"
				+
				"				</div>\n"
				+
				"\n"
				+
				"			</div>\n"
				+
				"		</p>\n"
				+
				"		<div class=\"alert alert-error\" id=\"uploadError\" style=\"display: none\" >\n"
				+
				"			<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n"
				+
				"				&times;\n" +
				"			</button>\n" +
				"			");// line 25
		;
		p(getMessage("upload.error"));// line 34
		p("		</div>\n" +
				"\n" +
				"	</div></td>\n" +
				"	<td class=\"right_line col_4\">\n" +
				"	<div class=\" magin_left\">\n" +
				"		<div class=\"block\">\n" +
				"			<label for=\"title1\">");// line 34
		;
		p(getMessage("photo.title"));// line 41
		p("</label>\n" +
				"			<input type=\"text\"\n" +
				"			placeholder=\"");// line 41
		;
		p(getMessage("photo.title"));// line 43
		p("\" maxlength=\"100\" id=\"title1\" value=\"\"\n"
				+
				"			name=\"title\" class=\" span4 \">\n"
				+
				"			<input	type=\"hidden\" placeholder=\"ID\" maxlength=\"100\" id=\"id1\"	 value=\"\" name=\"id\" >\n"
				+
				"			<input	type=\"hidden\" placeholder=\"ID\" maxlength=\"100\" id=\"id_photo1\" value=\"\" name=\"id_photo\" >\n"
				+
				"		</div>\n" +
				"		<div class=\"block\">\n" +
				"			<label for=\"desc1\">");// line 43
		;
		p(getMessage("photo.desc"));// line 49
		p("</label>\n"
				+
				"			<textarea class=\" span4 \" id=\"desc1\" rows=\"8\" placeholder=\"");// line 49
		;
		p(getMessage("photo.desc"));// line 50
		p("\" name=\"desc\"></textarea>\n" +
				"		</div>\n" +
				"		<div class=\"block\">\n" +
				"			<select name=\"dir\" id=\"dir1\"  data-style=\" \"\n" +
				"			class=\"selectpicker category span4\">\n" +
				"				<option value=\"0\">");// line 50
		;
		p(getMessage("photo.dir.no"));// line 55
		p("</option>\n" +
				"				");// line 55
		if (photoSets != null) {// line 56
			for (PhotoSet set : photoSets) {// line 57
				p("				<option value=\"");// line 57
				p(set.idSet);// line 58
				p("\">");// line 58
				p(set.name);// line 58
				p("</option>\n" +
						"\n" +
						"				");// line 58
			}// line 60
		}// line 61
		p("			</select>\n"
				+
				"		</div>\n"
				+
				"\n"
				+
				"		<div class=\"block\">\n"
				+
				"			<select name=\"category\" id=\"category1\"  data-style=\" \"\n"
				+
				"			class=\"selectpicker category span4\">\n" +
				"				");// line 61
		final Map2SelectOptions _Map2SelectOptions0 = new Map2SelectOptions(
				getOut());
		_Map2SelectOptions0.setActionRunners(getActionRunners()).setOut(
				getOut());
		_Map2SelectOptions0.render(fengfei.spruce.cache.CategoryCache.getAll(),
				(byte) 0); // line 68// line 68
		p("			</select>\n" +
				"		</div>\n" +
				"		<div class=\"block\">\n" +
				"			<label for=\"tags1\">Tags</label>\n" +
				"			<input type=\"text\"  placeholder=\"");// line 68
		;
		p(getMessage("photo.tags"));// line 73
		p(" \" rows=\"6\" data-provide=\"tag\" data-caseInsensitive=\"true\"\n"
				+
				"										class=\"span4  \" name=\"tags\" id=\"tags1\"/>\n" +
				"		</div>\n" +
				"		<div class=\"checkbox\">\n" +
				"			<label for=\"adult1\">\n" +
				"				<input type=\"checkbox\" value=\"1\"\n" +
				"				id=\"adult1\" name=\"adult\">\n" +
				"				");// line 73
		;
		p(getMessage("photo.adult"));// line 80
		p("</label>\n"
				+
				"		</div>\n"
				+
				"		<div class=\"checkbox\">\n"
				+
				"			<label for=\"copyright1\">\n"
				+
				"				<input type=\"checkbox\" \n"
				+
				"				value=\"1\" id=\"copyright1\" name=\"copyright\" checked=\"checked\">\n"
				+
				"				");// line 80
		;
		p(getMessage("photo.copyright"));// line 86
		p("</label>\n"
				+
				"		</div>\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"WhiteBalance1\" name=\"WhiteBalance\" >\n"
				+
				"\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"Software1\" name=\"Software\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"Flash1\" name=\"Flash\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"ColorSpace1\" name=\"ColorSpace\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"MeteringMode1\" name=\"MeteringMode\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"ExposureProgram1\" name=\"ExposureProgram\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"ExposureMode1\" name=\"ExposureMode\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"GPSLatitude1\" name=\"GPSLatitude\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"GPSLongitude1\" name=\"GPSLongitude\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"GPSAltitude1\" name=\"GPSAltitude\">\n"
				+
				"		<input type=\"hidden\"  value=\"\" id=\"GPSOrigin1\" name=\"GPSOrigin\">\n"
				+
				"	</div></td>\n" +
				"	<td class=\"col_4\">\n" +
				"	<div class=\" magin_left\">\n" +
				"		<div class=\"inline input-prepend\">\n" +
				"			<span class=\"add-on\"><span class=\"icon-head left\">");// line 86
		;
		p(getMessage("photo.camera"));// line 104
		p("</span></span>\n" +
				"			<input type=\"text\" placeholder=\"");// line 104
		;
		p(getMessage("photo.camera"));// line 105
		p("\" value=\"\"\n" +
				"			class=\"Camera\" id=\"camera1\" name=\"camera\">\n" +
				"			<input\n" +
				"			type=\"hidden\" placeholder=\"");// line 105
		;
		p(getMessage("photo.make"));// line 108
		p("\" value=\"\" class=\"make\"\n" +
				"			id=\"make1\" name=\"make\">\n" +
				"\n" +
				"		</div>\n" +
				"		<div class=\"inline input-prepend\">\n" +
				"			<span class=\"add-on\"><span class=\"icon-head left\">");// line 108
		;
		p(getMessage("photo.lens"));// line 113
		p("</span> </span>\n" +
				"			<input type=\"text\" placeholder=\"");// line 113
		;
		p(getMessage("photo.lens"));// line 114
		p("\" value=\"\" class=\"lens\"\n" +
				"			id=\"lens1\" name=\"lens\">\n" +
				"		</div>\n" +
				"		<div class=\"inline input-prepend\">\n" +
				"			<span class=\"add-on\"><span class=\"icon-head left\">");// line 114
		;
		p(getMessage("photo.focus"));// line 118
		p(" </span></span>\n" +
				"			<input type=\"text\" placeholder=\"");// line 118
		;
		p(getMessage("photo.focus.alt"));// line 119
		p("\" value=\"\"\n" +
				"			class=\"focal-length\" id=\"focus1\" name=\"focus\">\n" +
				"		</div>\n" +
				"		<div class=\"inline input-prepend\">\n" +
				"			<span class=\"add-on \"><span class=\"icon-head left\">");// line 119
		;
		p(getMessage("photo.shutter"));// line 123
		p(" </span></span>\n" +
				"			<input type=\"text\" placeholder=\"");// line 123
		;
		p(getMessage("photo.shutter.alt"));// line 124
		p("\" value=\"\"\n"
				+
				"			class=\"shutter-speed\" id=\"shutter1\" name=\"shutter\">\n"
				+
				"		</div>\n" +
				"		<div class=\"inline input-prepend\">\n" +
				"			<span class=\"add-on\"><span class=\"icon-head left\">");// line 124
		;
		p(getMessage("photo.aperture"));// line 128
		p("</span></span>\n" +
				"			<input type=\"text\" placeholder=\"");// line 128
		;
		p(getMessage("photo.aperture"));// line 129
		p("\" value=\"\"\n" +
				"			class=\"aperture\" id=\"aperture1\" name=\"aperture\">\n" +
				"		</div>\n" +
				"		<div class=\"inline input-prepend last\">\n" +
				"			<span class=\"add-on\"><span class=\"icon-head left\">");// line 129
		;
		p(getMessage("photo.iso"));// line 133
		p(" </span></span>\n" +
				"			<input type=\"text\" placeholder=\"");// line 133
		;
		p(getMessage("photo.iso.alt"));// line 134
		p("\" value=\"\" class=\"iso\"\n" +
				"			id=\"iso1\" name=\"iso\">\n" +
				"		</div>\n" +
				"		<div class=\"inline input-prepend last\">\n" +
				"			<span class=\"add-on\"><span class=\"icon-head left\">");// line 134
		;
		p(getMessage("photo.ev"));// line 138
		p("</span></span>\n" +
				"			<input type=\"text\" placeholder=\"");// line 138
		;
		p(getMessage("photo.ev.alt"));// line 139
		p("\" value=\"\"\n" +
				"			class=\"iso\" id=\"ev1\" name=\"ev\">\n" +
				"		</div>\n" +
				"		<div class=\"inline input-prepend\">\n" +
				"			<span class=\"add-on\"><span class=\"icon-head left\"> ");// line 139
		;
		p(getMessage("photo.taken"));// line 143
		p(" </span></span>\n" +
				"			<input type=\"hidden\" value=\"\" id=\"taken_at1\"\n" +
				"			name=\"taken_at\">\n" +
				"			<input type=\"text\"\n" +
				"			placeholder=\"");// line 143
		;
		p(getMessage("photo.taken.alt"));// line 147
		p("\" value=\"\" class=\"date\"\n"
				+
				"			id=\"taken_at_display1\">\n"
				+
				"		</div>\n"
				+
				"\n"
				+
				"	</div><div class=\"line4\"></div><div id=\"map_canvas\" class=\"map_canvas img_shadow\"></div></td>\n"
				+
				"</tr>\n" +
				"\n");// line 147

		endDoLayout(sourceTemplate);
	}

}
