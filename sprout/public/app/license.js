/**
 * User: Tietang
 * Date: 13-9-6
 * Time: 下午9:48
 */
var imgSrc = "/public/images/cc/{0}.png";
$(function () {


    $(":radio").click(function () {
        var $this = $(this);
        var cc = [], cctxt = [];
        var i = 0;
        cc[i++] = "cc";
        cc[i++] = "by";
        cctxt[0] = "署名";
        $("input:checked").each(function (j) {
            var val = $(this).val();
            if (val == "nc") {
                cc[3] = val;
                cctxt[1] = "非商业使用";
            }
            if (val == "nd" || val == "sa") {
                cc[4] = val;
                if (val == "nd") {
                    cctxt[2] = "禁止演绎";
                }
                if (val == "sa") {
                    cctxt[2] = "相同方式共享";
                }

            }
        });
        $("#cc").empty();
        for (var a in cc) {
            var img = $('<img >'); //Equivalent: $(document.createElement('img'))
            img.attr('src', imgSrc.replace("{0}", cc[a]));
            //img.addClass("img");
            img.appendTo('#cc');
        }
        $("#cctxt").empty();
        var txt = "";
        for (var a in cctxt) {
            txt += "-" + cctxt[a];
        }
        txt += " 3.0";
        var a = $("<a/>");
        var link = "";
        for (var j = 1; j <= cc.length; j++) {
            if (cc[j])
                link += "-" + cc[j];
        }
        console.log(link);
        var href = "http://creativecommons.org/licenses/{0}/3.0/cn/";
        a.attr("href", href.replace("{0}", link.substr(1)));
        a.attr("target", "_target");
        a.text(txt.substr(1)).appendTo('#cctxt');

    });
});

