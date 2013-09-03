window.locale = {
	"fileupload" : {
		"errors" : {
			"maxFileSize" : "File is too big",
			"minFileSize" : "File is too small",
			"acceptFileTypes" : "Filetype not allowed",
			"maxNumberOfFiles" : "Max number of files exceeded",
			"uploadedBytes" : "Uploaded bytes exceed file size",
			"emptyResult" : "Empty file upload result"
		},
		"error" : "Error",
		"start" : "Start",
		"cancel" : "Cancel",
		"destroy" : "Delete"
	}
};
var maxImageIndex = 1;
var exifs = [];
$(function() {
	'use strict';
	maxImageIndex = 1;
	exifs = [];
	$(document).bind('drop dragover', function(e) {
				e.preventDefault();
			});

	// Initialize the jQuery File Upload widget:
	$('#fileupload').fileupload();
	$('#fileupload').fileupload('option', {
		url : '/upload/done',
		maxFileSize : 5000000,
		limitMultiFileUploads : 10,
		acceptFileTypes : /(\.|\/)(gif|jpe?g|png)$/i,
		process : [{
			action : 'load',
			fileTypes : /^image\/(gif|jpeg|png)$/,
			maxFileSize : 20000000
				// 20MB
			}, {
			action : 'resize',
			maxWidth : 800,
			maxHeight : 800
		}, {
			action : 'save'
		}],
		done : function(e, data) {

			var index = data.imageIndex;
			var result = data.result[0];
			$("#id" + index).val(result.id);
			// alert(JSON.stringify(data,null,"\t"));
			$("#dd").val($("#dd").val() + "\n"
					+ JSON.stringify(result, null, "\t") + " " + index);

		},
		beforeAdd : function(e, data) {

			data.imageIndex = maxImageIndex;
			var files = data.files;
			// alert(files.length+" "+maxImageIndex);
			data.exifs = [];
			maxImageIndex += files.length;
			var tempIndex = maxImageIndex;

			if (window.FileReader && FileReader.prototype.readAsBinaryString) {
				for (var i = 0; i < files.length; i++) {
					var file = files[i];
					var fileReader = new FileReader();
					fileReader.onload = function(e) {
						var contents = e.target.result;
						// alert(contents);
						var oFile = new BinaryFile(contents);
						var a = EXIF.readFromBinaryFile(oFile);
						if (a) {
							var g = "";
							typeof a.ExposureTime != "undefined"
									&& (a.ExposureTime < 1 ? g = "1/" + 1
											/ a.ExposureTime : g = Math
											.floor(a.ExposureTime));
							var h = "", j = "";
							typeof a.DateTimeOriginal != "undefined"
									? h = a.DateTimeOriginal
									: typeof a.DateTimeDigitized != "undefined"
											&& (h = a.DateTimeDigitized), h != ""
									&& (h = ExifUtils.takenDate(h), j = ExifUtils
											.takenDateToHuman(h));

							a.ExposureTime2 = g;
							a.DateTimeOriginal2 = h;
							a.DateTimeOriginal3 = j;
							a.maxImageIndex = tempIndex;
							data.imageIndex = tempIndex;
							exifs[tempIndex - 1] = a;
							// alert(i + "," + a.Model + " " + oFile.getLength()
							// + " " + g + " " + h);
							// alert(JSON.stringify(a,null,"\t"));

							data.exifs[i] = a;
							data.formData = {
								DateTimeOriginal : a.DateTimeOriginal2,
								Model : a.Model ,
								Make : a.Make,
								FocalLength : a.FocalLength,
								iso : a.ISOSpeedRatings,
								FNumber : a.FNumber,
								ExposureTime : a.ExposureTime2,
								LensModel : a.LensModel 
							};
							//alert(JSON.stringify(data.formData, null, "\t"));
							// $("#taken_at"+tempIndex).val(h);
							// $("#taken_at_display"+tempIndex ).val(j);
							// $("#camera" +tempIndex).val(a.Model);
							// $("#focal"+tempIndex ).val(a.FocalLength);
							// $("#iso"+tempIndex ) .val(a.ISOSpeedRatings);
							// $("#shutter"+tempIndex ).val(g);
							// $("#aperture"+tempIndex ).val(a.FNumber);
							// $("#photo_description"+tempIndex
							// ).val(a.ImageDescription);
							// $("#photo_title"+tempIndex).val(a.ImageTitle);
							// $("#tags" +tempIndex).val(a.ImageKeywords);

						}
						tempIndex++;

					}

					fileReader.readAsBinaryString(file);

					// fileReader.readAsArrayBuffer (file);

				}
				// maxImageIndex++;
			}
		},
		afterAdd : function(e, data) {
			//			   
			for (var i = 0; i < data.exifs.length; i++) {
				var a = data.exifs[i];
				if (a) {
					var tempIndex = a.maxImageIndex;
					$("#title" + tempIndex).val(tempIndex);
					$("#taken_at" + tempIndex).val(a.DateTimeOriginal2);
					$("#taken_at_display" + tempIndex).val(a.DateTimeOriginal2);
					$("#camera" + tempIndex).val(a.Model);
					$("#focus" + tempIndex).val(a.FocalLength);
					$("#iso" + tempIndex).val(a.ISOSpeedRatings);
					$("#lens" + tempIndex).val($.trim(a.LensModel));
					$("#shutter" + tempIndex).val(a.ExposureTime2);
					$("#aperture" + tempIndex).val(a.FNumber);
					$("#photo_description" + tempIndex).val(a.ImageDescription);
					$("#photo_title" + tempIndex).val(a.ImageTitle);
					$("#tags" + tempIndex).val(a.ImageKeywords);
				}
				// alert(i + "," + a.Model+" "+a.maxImageIndex);

			}

		}
	});
	$("#edit").submit(function() {
				$.post("/upload/save", $("#edit").serialize(), function() {
							alert("saved.");
						}, "json");
				return false;
			});
});