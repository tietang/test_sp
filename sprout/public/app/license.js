/**
 * User: Tietang
 * Date: 13-9-6
 * Time: 下午9:48
 */

$(function () {
    var licenseLastValue = $("#licenseLastValue").val();


    $(":radio").click(function () {
        var $this = $(this);
        var licenseKey = "by";
        var checkedValue = [];
        $("input:checked").each(function (j) {
            var val = $(this).val();
            if (val == "nc") {
                checkedValue[0] = val;
            }
            if (val == "nd" || val == "sa") {
                checkedValue[1] = val;
            }
        });
        for (var a in checkedValue) {
            licenseKey += "-" + checkedValue[a];
        }
        License.displayLicenseImage(licenseKey, "cc");
        License.displayLicenseText(licenseKey, "cctxt");

    });
});
