$(function () {
    if (window.bootbox)
        bootbox.setLocale("zh_CN");
    var selectpicker = $('.selectpicker');
    if (selectpicker)
        selectpicker.selectpicker();
    //
    $("#loginForm").submit(function () {

        var uid = $('#email').val();
        var pwd = $('#pwd').val();

        if (uid == '') {
            alert("Please type email!");
            return false;
        }
        if (pwd == '') {
            alert("Please type password!");
            return false;
        }
        var pwdmd5 = window.md5(pwd);
        $('#pwd').val(pwdmd5);
        $(this).ajaxSubmit({
            dataType: "json",
            success: function (responseText, statusText, xhr, $form) {
                alert('status: ' + statusText + '\n\nresponseText: \n' + responseText.username + '\n\nThe output div should have already been updated with the responseText.');
                window.location.reload();
            }
        });

        return false;
    });

    $("#onlyCategory1").change(function () {
        var c = $(this).val();
    });
});

function notify(text, type) {
    if (!type) {
        type = "info";
    }
    $.bootstrapGrowl(text, {
        ele: 'body', // which element to append to
        type: type, // (null, 'info', 'error', 'success')
        offset: {
            from: 'bottom',
            amount: 80
        }, // 'top', or 'bottom'
        align: 'right', // ('left', 'right', or 'center')
        width: 250, // (integer, or 'auto')
        delay: 4000,
        allow_dismiss: true,
        stackup_spacing: 10 // spacing between consecutively stacked growls.
    });
}

var gmap = false;
function initializeEditMap() {
    if (gmap) {
        return;
    }
    gmap = new fengfei.GMapV3(document.getElementById("map_canvas"));

    //
    gmap.gmenu = new contextMenu({
        map: gmap.map
    });
    gmap.gmenu.addItem('Mark Here', function (map, latLng) {
        gmap.markMarkerAndPanTo(latLng);
        $("#GPSOrigin" + gmap.tempIndex).val(1);
    });

    //gmenu.addSep();

    gmap.gmenu.addItem('Center Here', function (map, latLng) {
        gmap.panTo(latLng);
    });
    //gmenu.addSep();

    gmap.gmenu.addItem('Reset', function (map, latLng) {
        gmap.reset(function (latLng) {
            $("#GPSOrigin" + gmap.tempIndex).val("");
        });

    });

}
var License = {
    displayLicenseImage: function (licenseKey, containerId) {

        var container = $("#" + containerId);
        container.empty();
        var cc = ["cc"].concat(licenseKey.split("-"));
        for (var a in cc) {
            var img = $('<img >'); //Equivalent: $(document.createElement('img'))
            img.attr('src', imgSrc.replace("{0}", cc[a]));
            //img.addClass("img");
            img.appendTo(container);
        }
    },

    displayLicenseText: function (licenseKey, containerId) {
        var container = $("#" + containerId);
        container.empty();
        var cc = licenseKey.split("-");
        var txt = "";
        for (var a in cc) {
            txt += " " + i18n.License.Cc[cc[a]];
        }
        txt += " 3.0";
        console.log(txt);
        var a = $("<a/>");
        var link = licenseKey;
        var href = "http://creativecommons.org/licenses/{0}/3.0/cn/";
        a.attr("href", href.replace("{0}", link));
        a.attr("target", "_target");
        a.text(txt).appendTo(container);
    }


}

