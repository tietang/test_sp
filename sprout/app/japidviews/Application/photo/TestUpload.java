package japidviews.Application.photo;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/Application/photo/TestUpload.html
// Change to this file will be lost next time the template file is compiled.
//

public class TestUpload extends japidviews._layouts.EmptyLayout
{
	public static final String sourceTemplate = "japidviews/Application/photo/TestUpload.html";
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

	public TestUpload() {
		super(null);
	}

	public TestUpload(StringBuilder out) {
		super(out);
	}

	/* based on https://github.com/branaway/Japid/issues/12
	 */
	public static final String[] argNames = new String[] {/* args of the template*/"paths", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List", };
	public static final Object[] argDefaults = new Object[] { null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.TestUpload.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
	////// end of named args stuff

	private List paths; // line 2

	public cn.bran.japid.template.RenderResult render(List paths) {
		this.paths = paths;
		long t = -1;
		try {
			super.layout();
		} catch (RuntimeException e) {
			super.handleException(e);
		} // line 2
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners, sourceTemplate);
	}

	@Override
	protected void doLayout() {
		beginDoLayout(sourceTemplate);
		//------
		p("<div class=\"grid_row\">\n"
				+
				"	<div class=\"col col_16\">\n"
				+
				"		<form id=\"multipleDemo\" enctype=\"multipart/form-data\">\n"
				+
				"			<div id=\"multiple\"></div>\n"
				+
				"			<button type=\"button\" onClick=\"document.getElementById('agileUploaderSWF').submit();\" class=\"btn btn-small btn-info\">\n"
				+
				"				Submit\n"
				+
				"			</button>\n"
				+
				"	\n"
				+
				"		<div id=\"files\">\n"
				+
				"			<table class=\"table table-striped center \" id=\"content\"\n"
				+
				"			style=\"display: \">\n"
				+
				"				<thead>\n"
				+
				"					<tr>\n"
				+
				"						<td colspan=\"3\" class=\"non-border span12\">\n"
				+
				"						<div id=\"progress\"\n"
				+
				"						class=\"progress progress-success progress-striped\">\n"
				+
				"							<div class=\"bar\"></div>\n"
				+
				"						</div></td>\n"
				+
				"					</tr>\n"
				+
				"				</thead>\n"
				+
				"				<tbody data-target=\"#modal-gallery\" data-toggle=\"modal-gallery\"\n"
				+
				"				class=\"files\">\n"
				+
				"					<tr>\n"
				+
				"						<td class=\"right_line span6\">\n"
				+
				"						<div class=\" magin_left\">\n"
				+
				"							<div id=\"preview\"></div>\n"
				+
				"							<br />\n"
				+
				"							<p>\n"
				+
				"								file name: <span id=\"name\"></span>\n"
				+
				"							</p>\n"
				+
				"							<p>\n"
				+
				"								source size: <span id=\"size\"></span>\n"
				+
				"							</p>\n"
				+
				"						</div></td>\n"
				+
				"						<td class=\"right_line span3\">\n"
				+
				"						<div class=\" magin_left\">\n"
				+
				"							<div class=\"block\">\n"
				+
				"								<label for=\"title1\">Title</label>\n"
				+
				"								<input type=\"text\"\n"
				+
				"								placeholder=\"title\" maxlength=\"100\" id=\"title1\" value=\"\"\n"
				+
				"								name=\"title\" class=\" input-width \">\n"
				+
				"								<input\n"
				+
				"								type=\"hidden\" placeholder=\"ID\" maxlength=\"100\" id=\"id1\"\n"
				+
				"								value=\"\" name=\"id\" class=\" input-width \">\n"
				+
				"							</div>\n"
				+
				"							<div class=\"block\">\n"
				+
				"								<label for=\"desc1\">Description</label>\n"
				+
				"								<textarea class=\" input-width \" id=\"desc1\"\n"
				+
				"										placeholder=\"Description\" name=\"desc\"></textarea>\n"
				+
				"							</div>\n"
				+
				"							<div class=\"block\">\n"
				+
				"								<select name=\"category\" id=\"category1\"\n"
				+
				"								class=\"category select-width\">\n"
				+
				"									<optgroup label=\"Category\"></optgroup>\n"
				+
				"									<option value=\"10\">Abstract</option>\n"
				+
				"									<option value=\"11\">Animals</option>\n"
				+
				"									<option value=\"5\">Black and White</option>\n"
				+
				"									<option value=\"1\">Celebrities</option>\n"
				+
				"									<option value=\"9\">City and Architecture</option>\n"
				+
				"									<option value=\"15\">Commercial</option>\n"
				+
				"									<option value=\"16\">Concert</option>\n"
				+
				"									<option value=\"20\">Family</option>\n"
				+
				"									<option value=\"14\">Fashion</option>\n"
				+
				"									<option value=\"2\">Film</option>\n"
				+
				"									<option value=\"24\">Fine Art</option>\n"
				+
				"									<option value=\"23\">Food</option>\n"
				+
				"									<option value=\"3\">Journalism</option>\n"
				+
				"									<option value=\"8\">Landscapes</option>\n"
				+
				"									<option value=\"12\">Macro</option>\n"
				+
				"									<option value=\"18\">Nature</option>\n"
				+
				"									<option value=\"4\">Nude</option>\n"
				+
				"									<option value=\"7\">People</option>\n"
				+
				"									<option value=\"19\">Performing Arts</option>\n"
				+
				"									<option value=\"17\">Sport</option>\n"
				+
				"									<option value=\"6\">Still Life</option>\n"
				+
				"									<option value=\"21\">Street</option>\n"
				+
				"									<option value=\"26\">Transportation</option>\n"
				+
				"									<option value=\"13\">Travel</option>\n"
				+
				"									<option value=\"22\">Underwater</option>\n"
				+
				"									<option value=\"27\">Urban Exploration</option>\n"
				+
				"									<option value=\"25\">Wedding</option>\n"
				+
				"									<option selected=\"selected\" value=\"0\">Uncategorized</option>\n"
				+
				"								</select>\n"
				+
				"							</div>\n"
				+
				"							<div class=\"block\">\n"
				+
				"								<label for=\"tags1\">Tags</label>\n"
				+
				"								<textarea rows=\"\" cols=\"\" placeholder=\"Tags (divide by comma)\"\n"
				+
				"										class=\"tags\" name=\"tags\" id=\"tags1\"></textarea>\n"
				+
				"							</div>\n"
				+
				"							<div class=\"checkbox\">\n"
				+
				"								<label for=\"adult1\">\n"
				+
				"									<input type=\"checkbox\" value=\"1\"\n"
				+
				"									id=\"adult1\" name=\"adult\">\n"
				+
				"									For adult content?</label>\n"
				+
				"							</div>\n"
				+
				"							<div class=\"checkbox\">\n"
				+
				"								<label for=\"copyright1\">\n"
				+
				"									<input type=\"checkbox\"\n"
				+
				"									value=\"1\" id=\"copyright1\" name=\"copyright\" checked=\"checked\">\n"
				+
				"									Owns\n"
				+
				"									the copyright?</label>\n"
				+
				"							</div>\n"
				+
				"						</div></td>\n"
				+
				"						<td class=\"span3\">\n"
				+
				"						<div class=\" magin_left\">\n"
				+
				"							<div class=\"inline input-prepend\">\n"
				+
				"								<span class=\"add-on\"><span class=\" span1 left\">Camera </span></span>\n"
				+
				"								<input type=\"text\" placeholder=\"Camera\" value=\"\"\n"
				+
				"								class=\"Camera\" id=\"camera1\" name=\"camera\">\n"
				+
				"								<input\n"
				+
				"								type=\"hidden\" placeholder=\"Make\" value=\"\" class=\"make\"\n"
				+
				"								id=\"make1\" name=\"make\">\n"
				+
				"							</div>\n"
				+
				"							<div class=\"inline input-prepend\">\n"
				+
				"								<span class=\"add-on\"><span class=\" span1 left\">Lens</span> </span>\n"
				+
				"								<input type=\"text\" placeholder=\"Lens\" value=\"\" class=\"lens\"\n"
				+
				"								id=\"lens1\" name=\"lens\">\n"
				+
				"							</div>\n"
				+
				"							<div class=\"inline input-prepend\">\n"
				+
				"								<span class=\"add-on\"><span class=\" span1 left\">Focus </span></span>\n"
				+
				"								<input type=\"text\" placeholder=\"Focal Length\" value=\"\"\n"
				+
				"								class=\"focal-length\" id=\"focus1\" name=\"focus\">\n"
				+
				"							</div>\n"
				+
				"							<div class=\"inline input-prepend\">\n"
				+
				"								<span class=\"add-on \"><span class=\" span1 left\">Shutter </span></span>\n"
				+
				"								<input type=\"text\" placeholder=\"Shutter Speed\" value=\"\"\n"
				+
				"								class=\"shutter-speed\" id=\"shutter1\" name=\"shutter\">\n"
				+
				"							</div>\n"
				+
				"							<div class=\"inline input-prepend\">\n"
				+
				"								<span class=\"add-on\"><span class=\" span1 left\">Aperture</span></span>\n"
				+
				"								<input type=\"text\" placeholder=\"Aperture\" value=\"\"\n"
				+
				"								class=\"aperture\" id=\"aperture1\" name=\"aperture\">\n"
				+
				"							</div>\n"
				+
				"							<div class=\"inline input-prepend last\">\n"
				+
				"								<span class=\"add-on\"><span class=\" span1 left\">ISO </span></span>\n"
				+
				"								<input type=\"text\" placeholder=\"ISO/Film\" value=\"\" class=\"iso\"\n"
				+
				"								id=\"iso1\" name=\"iso\">\n"
				+
				"							</div>\n"
				+
				"							<div class=\"inline input-prepend last\">\n"
				+
				"								<span class=\"add-on\"><span class=\" span1 left\">EV</span></span>\n"
				+
				"								<input type=\"text\" placeholder=\"Exposure Compensation\" value=\"\"\n"
				+
				"								class=\"iso\" id=\"ev1\" name=\"ev\">\n"
				+
				"							</div>\n"
				+
				"							<div class=\"inline input-prepend\">\n"
				+
				"								<span class=\"add-on\"><span class=\" span1 left\"> Taken </span></span>\n"
				+
				"								<input type=\"hidden\" value=\"\" id=\"taken_at1\"\n"
				+
				"								name=\"taken_at\">\n"
				+
				"								<input type=\"text\"\n"
				+
				"								placeholder=\"Date Taken\" value=\"\" class=\"date\"\n"
				+
				"								id=\"taken_at_display1\">\n"
				+
				"							</div>\n"
				+
				"						</div></td>\n"
				+
				"					</tr>\n"
				+
				"					<tr class=\"template-upload fade in\">\n"
				+
				"						<td colspan=\"2\"></td>\n"
				+
				"						<td><span class=\"start\" id=\"start\"> </span><!-- 			 <span class=\"cancel\" id=\"Cancel\">\n"
				+
				"\n"
				+
				"						<button class=\"btn btn-warning\">\n"
				+
				"						<i class=\"icon-ban-circle icon-white\"></i> <span>Cancel</span>\n"
				+
				"						</button>\n" +
				"\n" +
				"						</span> --></td>\n" +
				"					</tr>\n" +
				"				</tbody>\n" +
				"			</table>\n" +
				"		</div>\n" +
				"	</form>\n" +
				"	</div>\n" +
				"	<div class=\"onerow\">\n" +
				"		");// line 145
		for (Object path : paths) {// line 315
			p("		<div class=\"col2\">\n" +
					"			<img src=\"");// line 315
			p(path);// line 317
			p("\"  />\n" +
					"		</div>\n" +
					"		");// line 317
		}// line 319
		p("	</div>\n"
				+
				"</div>\n"
				+
				"\n"
				+
				"<style type=\"text/css\">\n"
				+
				"    #preview {\n"
				+
				"        width: 100px;\n"
				+
				"        height: 100px;\n"
				+
				"        border: 1px solid #000;\n"
				+
				"        overflow: hidden;\n"
				+
				"    }\n"
				+
				"    #imghead {\n"
				+
				"        filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=image);\n"
				+
				"    }\n"
				+
				"</style>\n"
				+
				"<script type=\"text/javascript\">\n"
				+
				"	function previewImage(file) {\n"
				+
				"		var MAXWIDTH = 100;\n"
				+
				"		var MAXHEIGHT = 100;\n"
				+
				"		var div = document.getElementById('preview');\n"
				+
				"		if (file.files && file.files[0]) {\n"
				+
				"			div.innerHTML = '<img id=imghead>';\n"
				+
				"			var img = document.getElementById('imghead');\n"
				+
				"			img.onload = function() {\n"
				+
				"				var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);\n"
				+
				"				img.width = rect.width;\n"
				+
				"				img.height = rect.height;\n"
				+
				"				img.style.marginLeft = rect.left + 'px';\n"
				+
				"				img.style.marginTop = rect.top + 'px';\n"
				+
				"			}\n"
				+
				"			var reader = new FileReader();\n"
				+
				"			reader.onload = function(evt) {\n"
				+
				"				img.src = evt.target.result;\n"
				+
				"			}\n"
				+
				"			reader.readAsDataURL(file.files[0]);\n"
				+
				"		} else {\n"
				+
				"			var sFilter = 'filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\"';\n"
				+
				"			file.select();\n"
				+
				"			var src = document.selection.createRange().text;\n"
				+
				"			div.innerHTML = '<img id=imghead>';\n"
				+
				"			var img = document.getElementById('imghead');\n"
				+
				"			img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;\n"
				+
				"			var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);\n"
				+
				"			status = ('rect:' + rect.top + ',' + rect.left + ',' + rect.width + ',' + rect.height);\n"
				+
				"			div.innerHTML = \"<div id=divhead style='width:\" + rect.width + \"px;height:\" + rect.height + \"px;margin-top:\" + rect.top + \"px;margin-left:\" + rect.left + \"px;\" + sFilter + src + \"\\\"'></div>\";\n"
				+
				"		}\n"
				+
				"	}\n"
				+
				"\n"
				+
				"	function clacImgZoomParam(maxWidth, maxHeight, width, height) {\n"
				+
				"		var param = {\n"
				+
				"			top : 0,\n"
				+
				"			left : 0,\n"
				+
				"			width : width,\n"
				+
				"			height : height\n"
				+
				"		};\n"
				+
				"		if (width > maxWidth || height > maxHeight) {\n"
				+
				"			rateWidth = width / maxWidth;\n"
				+
				"			rateHeight = height / maxHeight;\n"
				+
				"\n"
				+
				"			if (rateWidth > rateHeight) {\n"
				+
				"				param.width = maxWidth;\n"
				+
				"				param.height = Math.round(height / rateWidth);\n"
				+
				"			} else {\n"
				+
				"				param.width = Math.round(width / rateHeight);\n"
				+
				"				param.height = maxHeight;\n"
				+
				"			}\n"
				+
				"		}\n"
				+
				"\n"
				+
				"		param.left = Math.round((maxWidth - param.width) / 2);\n"
				+
				"		param.top = Math.round((maxHeight - param.height) / 2);\n"
				+
				"		return param;\n"
				+
				"	}\n"
				+
				"</script>     \n"
				+
				"\n"
				+
				"<div id=\"preview\">\n"
				+
				"    <img id=\"imghead\" width=100 height=100 border=0 src='../images/head01_big.jpg'>\n"
				+
				"</div>\n"
				+
				"    <br/>     \n"
				+
				"    <input type=\"file\" onchange=\"previewImage(this)\" />     \n"
				+
				"   \n");// line 319

		endDoLayout(sourceTemplate);
	}

	@Override
	protected void title() {
		p("Sprucy Upload Page");
		;
	}

	@Override
	protected void css() {
		p("<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 4
		p(lookupStatic("/public/styles/grid1200.css"));// line 5
		p("\">\n" +
				"		<link rel=\"stylesheet\" media=\"screen\" href=\"");// line 5
		p(lookupStatic("/public/basic/css/fluid20.css"));// line 6
		p("\">\n" +
				"<script src=\"");// line 6
		p(lookupStatic("/public/agile-uploader-3.0/jquery-1.4.min.js"));// line 7
		p("\"></script>\n" +
				"<script src=\"");// line 7
		p(lookupStatic("/public/agile-uploader-3.0/swfobject.js"));// line 8
		p("\"></script>\n" +
				"<!--<script src=\"");// line 8
		p(lookupStatic("/public/agile-uploader-3.0/swfobject.js"));// line 9
		p("\"></script>-->\n" +
				"<script src=\"");// line 9
		p(lookupStatic("/public/agile-uploader-3.0/agile-uploader-3.1.1.js"));// line 10
		p("\"></script>\n" +
				"<link type=\"text/css\" rel=\"stylesheet\" href=\"");// line 10
		p(lookupStatic("/public/agile-uploader-3.0/agile-uploader.css"));// line 11
		p("\" />\n" +
				"<script src=\"");// line 11
		p(lookupStatic("/public/js/exif.js"));// line 12
		p("\"></script>\n" +
				"<script src=\"");// line 12
		p(lookupStatic("/public/app/ExifUtils.js"));// line 13
		p("\"></script>\n"
				+
				"<script type=\"text/javascript\">\n"
				+
				"	(function(){\n"
				+
				" 　　var setRemoveCallback =function(){\n"
				+
				" 　　__flash__removeCallback =function(instance, name){\n"
				+
				" 　　　　　　if (instance){\n"
				+
				"			 	instance[name] =null;\n"
				+
				"			}\n"
				+
				" };\n"
				+
				" window.setTimeout(setRemoveCallback, 10);\n"
				+
				" };\n"
				+
				"setRemoveCallback();\n"
				+
				"})();\n"
				+
				"\n"
				+
				"	function prepareExif(exif) {\n"
				+
				"		var a = eval('(' + exif + ')');\n"
				+
				"		\n"
				+
				"		var format = \"yyyy-MM-dd hh:mm:ss\";\n"
				+
				"		// a.DateTimeDigitized = Date.parse(a.DateTimeDigitized);\n"
				+
				"		// a.DateTimeOriginal = Date.parse(a.DateTimeOriginal);\n"
				+
				"		// a.DateTime = Date.parse(a.DateTime);\n"
				+
				"		if (a) {\n"
				+
				"			var g = \"\";\n"
				+
				"			//typeof a.ExposureTime != \"undefined\" && (a.ExposureTime < 1 ? g = \"1/\" + 1 / a.ExposureTime : g = Math.floor(a.ExposureTime));\n"
				+
				"			var h = \"\", j = \"\";\n"
				+
				"			\n"
				+
				"			//typeof a.DateTimeOriginal != \"undefined\" ? h = a.DateTimeOriginal : typeof a.DateTimeDigitized != \"undefined\" && ( h = a.DateTimeDigitized), h != \"\" && ( h = ExifUtils.takenDate(h), j = ExifUtils.takenDateToHuman(h));\n"
				+
				"\n"
				+
				"			var ev = \"\";\n"
				+
				"\n"
				+
				"			var eb = a.ExposureBiasValue;\n"
				+
				"			ev = eb;\n"
				+
				"			// if ( typeof eb != \"undefined\") {\n"
				+
				"			// ev = eb < 0 ? \"-\" : \"+\";\n"
				+
				"			// if (eb == 0) {\n"
				+
				"			// ev = \"0\";\n"
				+
				"			// } else if (eb >= 1 || eb <= -1) {\n"
				+
				"			// ev += Math.floor(eb);\n"
				+
				"			// } else {\n"
				+
				"			// ev += \"1/\" + Math.abs(1 / eb);\n"
				+
				"			// }\n"
				+
				"			// }\n"
				+
				"\n"
				+
				"			a.MakerNote = [];\n"
				+
				"			a.UserComment = [];\n"
				+
				"			data = a;\n"
				+
				"			data.ExposureTime2 = g;\n"
				+
				"			data.DateTimeOriginal2 = h;\n"
				+
				"			data.DateTimeOriginal3 = j;\n"
				+
				"			data.ev = ev;\n"
				+
				"\n"
				+
				"			data.FocalLength2 = ExifUtils.toNumber(a.FocalLength);\n"
				+
				"			data.iso = a.ISOSpeedRatings;\n"
				+
				"			data.FNumber2 = ExifUtils.toNumber(a.FNumber);\n"
				+
				"			data.ExposureTime2 = ExifUtils.toHumanFraction(data.ExposureTime);\n"
				+
				"			data.ev = ExifUtils.toZero(a.ExposureBiasValue);\n"
				+
				"			data.ExposureBias2 = ExifUtils.toZero(a.ExposureBiasValue);\n"
				+
				"			//data.ColorSpace2 = ExifUtils.colorSpaceHuman(data.ColorSpace);\n"
				+
				"			console.info(a);\n"
				+
				"			data.WhiteBalance2 = EXIF.StringValues.WhiteBalance[data.WhiteBalance];\n"
				+
				"			data.Flash2 = EXIF.StringValues.Flash[data.Flash];\n"
				+
				"			data.MeteringMode2 = EXIF.StringValues.MeteringMode[data.MeteringMode];\n"
				+
				"\n"
				+
				"			return data;\n"
				+
				"\n"
				+
				"		}\n"
				+
				"\n"
				+
				"		return {};\n"
				+
				"	}\n"
				+
				"\n"
				+
				"	function toForm(exif, event) {\n"
				+
				"		var data = prepareExif(exif);\n"
				+
				"		console.log(data);\n"
				+
				"		var tempIndex = 1;\n"
				+
				"		//var fileName=event.file.fileName;\n"
				+
				"		//var index = fileName.lastIndexOf(\".\");\n"
				+
				"		//$(\"#title\" + tempIndex).val(fileName.substring(0, index));\n"
				+
				"\n"
				+
				"		//\n"
				+
				"		$(\"#taken_at\" + tempIndex).val(data.DateTimeOriginal2);\n"
				+
				"		$(\"#taken_at_display\" + tempIndex).val(data.DateTimeOriginal2);\n"
				+
				"		$(\"#make\" + tempIndex).val(data.Make);\n"
				+
				"		$(\"#camera\" + tempIndex).val(data.Model);\n"
				+
				"		$(\"#focus\" + tempIndex).val(data.FocalLength2);\n"
				+
				"		$(\"#iso\" + tempIndex).val(data.iso);\n"
				+
				"		$(\"#lens\" + tempIndex).val($.trim(data.LensModel));\n"
				+
				"		$(\"#shutter\" + tempIndex).val(data.ExposureTime2);\n"
				+
				"		$(\"#aperture\" + tempIndex).val(data.FNumber2);\n"
				+
				"		$(\"#ev\" + tempIndex).val(data.ev);\n"
				+
				"		//\n"
				+
				"		$(\"#desc\" + tempIndex).val(\"\");\n"
				+
				"		$(\"#tags\" + tempIndex).val(\"\");\n"
				+
				"		$(\"#category1\" + tempIndex).val(0);\n"
				+
				"		//data.WhiteBalance2;\n"
				+
				"		//data.Software;\n"
				+
				"		//data.Flash2\n"
				+
				"		//data.ColorSpace2\n"
				+
				"		//data.MeteringMode2 测光模式\n"
				+
				"		$(\"#content\").css(\"display\", \"block\");\n"
				+
				"	}\n"
				+
				"\n"
				+
				"	$(function() {\n"
				+
				"\n"
				+
				"		$('#multiple').agileUploader({\n"
				+
				"			flashSrc : '/public/agile-uploader-3.0/agile-uploader.swf',\n"
				+
				"			submitRedirect : '/public/agile-uploader-3.0/results.php',\n"
				+
				"			removeIcon : '/public/agile-uploader-3.0/trash-icon.png',\n"
				+
				"			genericFileIcon : '/public/agile-uploader-3.0/file-icon.png',\n"
				+
				"			submitRedirect : '/agile/upload',\n"
				+
				"			formId : 'multipleDemo',\n"
				+
				"			max_height : 1024,\n"
				+
				"			max_width : 1024,\n"
				+
				"			preview_max_height : 100,\n"
				+
				"			preview_max_width : 100,\n"
				+
				"			flashVars : {\n"
				+
				"				button_up : '/public/agile-uploader-3.0/add-file.png',\n"
				+
				"				button_over : '/public/agile-uploader-3.0/add-file.png',\n"
				+
				"				button_down : '/public/agile-uploader-3.0/add-file.png',\n"
				+
				"				firebug : true,\n" +
				"				form_action : '/agile/upload/done',\n" +
				"				file_limit : 3,\n" +
				"				max_post_size : (1000 * 1024),\n" +
				"				exif_enable : true\n" +
				"			},\n" +
				"			exif_callback : function(exif, event) {\n" +
				"				\n" +
				"				toForm(exif, event);\n" +
				"			}\n" +
				"		});\n" +
				"	});\n" +
				"\n" +
				"</script>\n");// line 13
		;
	}
}
