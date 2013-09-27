(function ($) {

    $.fn.picker = function (options) {
        var opts = $.extend({}, $.fn.picker.defaults, options);
        var values = [];
        var that = this;
        this.values = function (vals) {
            if (vals) {
                that.each(function (index) {
                    var $this = $(this);
                    var o = $.meta ? $.extend({}, opts, $this.data()) : opts;
                    var value = $this.attr("value");
                    var isPicked = false;
                    for (var i in vals) {
                        if (value && value == vals[i]) {
                            isPicked = true;
                        }
                    }
                    if (isPicked) {
                        pickTarget($this, o, index);
                    } else {
                        unpickTarget($this, o, index);
                    }
                });
                return that;
            } else {
                var vs = [];
                that.each(function (index) {
                    var $this = $(this);
                    var o = $.meta ? $.extend({}, opts, $this.data()) : opts;
                    var picked = $this.attr("picked");
                    if (picked && picked == "true") {
                        var value = $this.attr("value");
                        vs.push(value);
                    }
                });
                return vs.toString();
            }
        }


        this.pickAll = function () {
            that.each(function (index) {
                var $this = $(this);
                var o = $.meta ? $.extend({}, opts, $this.data()) : opts;
                pickTarget($this, o, index);
            });
        }
        this.unpickAll = function () {
            that.each(function (index) {
                var $this = $(this);
                var o = $.meta ? $.extend({}, opts, $this.data()) : opts;
                unpickTarget($this, o, index);
            });
        }

        this.each(function (index) {
            var $this = $(this);
            var o = $.meta ? $.extend({}, opts, $this.data()) : opts;
            $this.click(function () {

                var picked = $this.attr("picked");
                if (picked && picked == "true") {
                    unpickTarget($this, o, index);
                } else {
                    pickTarget($this, o, index)
                }
                console.log(that.values() + "");
            });
        });
        return this;
    };
    $.fn.pickerValues = function () {
        var that = this;
        var vs = [];
        that.each(function (index) {
            var $this = $(this);
            var picked = $this.attr("picked");
            if (picked && picked == "true") {
                var value = $this.attr("value");
                vs.push(value);
            }
        });
        return vs.toString();
    }
    $.fn.picker.defaults = {
        pickedClass: 'picked',
        unpickedClass: "unpicked"
    };

    var unpickTarget = function (thisObj, o, index) {
        thisObj.attr("picked", false).addClass(o.unpickedClass).removeClass(o.pickedClass);
    }
    var pickTarget = function (thisObj, o, index) {
        thisObj.attr("picked", true).addClass(o.pickedClass).removeClass(o.unpickedClass);
    }

})(jQuery);
