$(function() {
    var equipmentForm=$("#equipmentForm");
    equipmentForm.find("#camera").click(function() {
        equipmentForm.find("#equipmentForms").append(tmpl("camera_tml", {
			index : 0
		}));
	});
    equipmentForm.find("#lens").click(function() {
        equipmentForm.find("#equipmentForms").append(tmpl("lens_tml", {
			index : 0
		}));
	});
    equipmentForm.find("#tripod").click(function() {
        equipmentForm.find("#equipmentForms").append(tmpl("tripod_tml", {
			index : 0
		}));
	});
    equipmentForm.find("#filter").click(function() {
        equipmentForm.find("#equipmentForms").append(tmpl("filter_tml", {
			index : 0
		}));
	});
});
