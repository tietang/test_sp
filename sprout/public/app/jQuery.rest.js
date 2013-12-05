jQuery.delete = function (url, opts) {
    var options = {};
    options = $.extend(options || {}, {
        async: false,
        type: 'DELETE',
        dataType: 'text',
        url: url,
        statusCode: {
            0: requestTimeout
        }
    });
    $.post()
    return jQuery.ajax(options);
}


