$(function () {
    var equipmentForm = $("#equipmentForm");
    equipmentForm.find("#camera").click(function () {
        equipmentForm.find("#equipmentForms").append(tmpl("camera_tml", {
            index: 0
        }));
    });
    equipmentForm.find("#lens").click(function () {
        equipmentForm.find("#equipmentForms").append(tmpl("lens_tml", {
            index: 0
        }));
    });
    equipmentForm.find("#tripod").click(function () {
        equipmentForm.find("#equipmentForms").append(tmpl("tripod_tml", {
            index: 0
        }));
    });
    equipmentForm.find("#filter").click(function () {
        equipmentForm.find("#equipmentForms").append(tmpl("filter_tml", {
            index: 0
        }));
    });
    equipmentForm.find(".delete").click(function () {
        var $this = $(this);
        var id = $this.attr("data-id");
        var cb = function () {
            $this.parent().parent().remove();
        }
        if (id) {
            $.delete("/settings/camera/{id}/delete".replace("{id}", id), cb);
        } else {
            cb();
        }


    });
});
