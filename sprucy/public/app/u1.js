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
$(function() {
	'use strict';
	template.helper('_window', window);
	var render = template.compile("template1", $("#template-upload-form")
			.html());
	$(document).bind('drop dragover', function(e) {
		e.preventDefault();
	});
	$("#upload_btn").click(function() {

		// $('#fileupload').send();
		$('.start button').click();
	});
	var numIndex = 0;
	// Initialize the jQuery File Upload widget:
	$('#fileupload').fileupload({
		dataType : 'json',
		done : function(e, data) {
			$.each(data.result, function(index, file) {
				$('<p/>').text(file.name).appendTo($("#status"));
			});
			// $('#progress .ui-progressingbar').addClass('ui-progressedbar');

		},
		progressall : function(e, data) {
			var progress = parseInt(data.loaded / data.total * 100, 10);
			$('#progress .bar').css('width', progress + '%');
			$('#percentage').text(progress + '%');
		},
		add : function(e, data) {

			var html = render({
				o : data,
				index : numIndex
			});

			$("#upload_table").append(html);
			// tmpl("template-upload-form", data);
			var s = numIndex;
			$.each(data.files, function(index, file) {
				window.loadImage(file, function(img) {
					// document.body.appendChild(img);
					$("#preview_" + s + "_" + index).html(img);
					// alert("#preview_"+s+"_"+index);
				}, {
					maxWidth : 400,
					maxHeight : 300
				});
				$('<p/>').text("add: " + file.name).appendTo($("#status"));
			});
			numIndex++;
			$(this).fileupload('process', data).done(function() {
				data.submit();
			});

		},
		limitMultiFileUploads : 10,
		maxFileSize : 5000000,
		acceptFileTypes : /(\.|\/)(gif|jpe?g|png)$/i,
		process : [ {
			action : 'load',
			fileTypes : /^image\/(gif|jpeg|png)$/,
			maxFileSize : 1000000
		// 20MB
		}, {
			action : 'resize',
			maxWidth : 800,
			maxHeight : 600,
			minWidth : 400,
			minHeight : 300
		}, {
			action : 'save'
		} ]
	});

	$("#nsfw_radio").buttonset();
});
