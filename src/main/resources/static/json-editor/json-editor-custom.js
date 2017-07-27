JSONEditor.defaults.language = "cn";
JSONEditor.defaults.options.theme = 'bootstrap3';
JSONEditor.defaults.options.iconlib = "fontawesome4";
JSONEditor.defaults.options.show_errors = 'change';
JSONEditor.defaults.options.disable_properties = true;
JSONEditor.defaults.options.keep_oneof_values = false;
JSONEditor.defaults.options.template = 'lodash';
JSONEditor.defaults.templates.lodash = function () {
    if (!window._) return false;

    return {
        compile: function (template) {
            return function (context) {
                return window._.template(template)(context);
            };
        }
    };
};
JSONEditor.defaults.options.upload = function (type, file, cbs) {
    var fileReader = new FileReader(),
        image = new Image(),
        imageData,
        imageWidth,
        imageHeight,
        formData = new FormData();
    if (!file.type.startsWith('image')) {
        cbs.failure('只支持图片文件');
        return;
    }
    formData.append("file", file);
    image.onload = function () {
        imageWidth = this.naturalWidth;
        imageHeight = this.naturalHeight;
        formData.append('width', imageWidth);
        formData.append('height', imageHeight);
        FAN.ajaxWithOption(
            {
                url: '/admin/files/upload',
                type: "POST",
                data: formData,
                processData: false,  // 告诉jQuery不要去处理发送的数据
                contentType: false   // 告诉jQuery不要去设置Content-Type请求头
            },
            null,
            function (result) {
                cbs.success(result.fileName);
            },
            function (rs) {
                cbs.failure(rs.msg);
            });
    };
    fileReader.onload = function () {
        imageData = this.result;
        image.src = imageData;
    };
    fileReader.readAsDataURL(file);
};
