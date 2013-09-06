package japidviews.Application.profile;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import fengfei.fir.utils.Path;
import fengfei.fir.model.PhotoShow;
import java.util.*;
import fengfei.ucm.entity.photo.*;
import japidviews.Application.photo.*;
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
// NOTE: This file was generated from: japidviews/Application/profile/PhotoEdit.html
// Change to this file will be lost next time the template file is compiled.
//

public class PhotoEdit extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/PhotoEdit.html";
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

	public PhotoEdit() {
		super(null);
	}

	public PhotoEdit(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/
			"photo", "photoSets", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"Photo", "List<PhotoSet>", };
	public static final Object[] argDefaults = new Object[] { null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.PhotoEdit.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private Photo photo; // line 6
	private List<PhotoSet> photoSets; // line 6

	public cn.bran.japid.template.RenderResult render(Photo photo,
			List<PhotoSet> photoSets) {
		this.photo = photo;
		this.photoSets = photoSets;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 6
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<pre style=\"display: none\">\n" +
				"	\n");// line 1
		p("</pre>\n"
				+
				"<form id=\"fileuploadForm\" action=\"/edit/done\" method=\"post\" enctype=\"multipart/form-data\"  >\n"
				+
				"	<div class=\"grid_row upload \">\n"
				+
				"		<div class=\"col col_16\">\n"
				+
				"\n"
				+
				"			<div>\n"
				+
				"\n"
				+
				"				<table class=\"table table-striped  exif_table img_shadow exif\" id=\"content\" >\n"
				+
				"					<tbody >\n" +
				"						");// line 16
		final UploadForm _UploadForm1 = new UploadForm(getOut());
		_UploadForm1.setActionRunners(getActionRunners()).setOut(getOut());
		_UploadForm1.render(photo, photoSets); // line 26// line 26
		p("\n" +
				"						<tr>\n" +
				"							<td colspan=\"2\">");// line 26
		String msg = (String) flash.get("msg");// line 29
		if (msg != null) {// line 30
			p("							<div class=\"alert ");// line 30
			if ("success".equals(msg)) {// line 31
				p("alert-success");// line 31
			} else {// line 31
				p("alert-error");// line 31
			}// line 31
			p("\">\n"
					+
					"								<button type=\"button\" class=\"close\" data-dismiss=\"alert\">\n"
					+
					"									&times;\n" +
					"								</button>\n" +
					"								");// line 31
			p(msg);// line 35
			p("							</div> ");// line 35
		}// line 36
		p(" </td>\n"
				+
				"							<td>\n"
				+
				"							<button class=\"btn btn-success\" type=\"submit\" id=\"save_photo\">\n"
				+
				"								Save\n"
				+
				"							</button>\n"
				+
				"							<button class=\"btn btn-success\" type=\"button\" id=\"publish_photo\">\n"
				+
				"								Publish\n"
				+
				"							</button>\n"
				+
				"							<button class=\"btn btn-info\" onclick=\"window.close()\" type=\"button\"  >\n"
				+
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
				"</form>\n");// line 36

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void css() {
		p("<script src=\"");// line 7
		p(lookupStatic("/public/bootstrap/bootstrap-tag.js"));// line 8
		p("\"></script>\n" +
				"<link type=\"text/css\" href=\"");// line 8
		p(lookupStatic("/public/bootstrap/bootstrap-tag.css"));// line 9
		p("\"  rel=\"stylesheet\"/>\n"
				+
				"<script type=\"text/javascript\" src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDqPLY_onh61yMSw5KSVICJN-B5igbHCTs&sensor=false&language=zh-cn\"></script>\n"
				+
				"<script src=\"");// line 9
		p(lookupStatic("/public/js/gmap/gmap-context-menu.js"));// line 11
		p("\"></script>\n" +
				"<link type=\"text/css\" href=\"");// line 11
		p(lookupStatic("/public/js/gmap/gmap-context-menu.css"));// line 12
		p("\"  rel=\"stylesheet\"/>\n" +
				"<script src=\"");// line 12
		p(lookupStatic("/public/app/map.js"));// line 13
		p("\"></script>\n" +
				"<script src=\"");// line 13
		p(lookupStatic("/public/app/photoEdit.js"));// line 14
		p("\"></script>\n" +
				"<script type=\"text/javascript\">var photo = ");// line 14
		p(fengfei.spruce.utils.WebUtils.toJSON(photo));// line 15
		p(";</script>\n");// line 15
		;
	}
}
