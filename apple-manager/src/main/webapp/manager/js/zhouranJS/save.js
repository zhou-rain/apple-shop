/* ****************保存********************* */


//传入需要序列化表单的jq对象 进行保存
/**
 *  普通form表单
 *
 * @param saveUrl 保存地址
 * @param form  表单jq对象
 * @param saveParam  额外保存内容
 * @param callback_save 回调函数
 */
function save(saveUrl, form, saveParam, callback_save) {
    let formJson = form.serializeObject();
    let result = Object.assign(saveParam, formJson);
    console.log(result);

    getJSON(saveUrl, result, callback_save);

}

/**
 *  文件上传form表单
 *
 * @param saveUrl 保存地址
 * @param form  表单jq对象
 * @param saveParam  额外保存内容
 * @param callback_save 回调函数
 */
function saveFile(saveUrl, form, saveParam, callback_save) {
    //有fileinput框
    let formdata = new FormData(form[0]);
    //遍历saveParam，将里面的值自动加入formdata传入后台
    for (let key in saveParam) {
        formdata.append(key, saveParam[key]);
    }
    fileUpLoad(saveUrl, formdata, callback_save);
}


//将表单序列化成json对象
$.fn.serializeObject = function () {
    let o = {};
    let a = this.serializeArray();
    $.each(a, function () {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};
