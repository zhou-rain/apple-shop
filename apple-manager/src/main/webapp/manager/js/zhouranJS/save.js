/* ****************保存********************* */
var saveParam={}; //额外的保存信息
var saveUrl = ""; //保存信息对应url


//传入需要序列化表单的jq对象 进行保存
function save(form) {
    if(form.find("input[type='file']").length>0){
        //有fileinput框
        let formdata = new FormData(form[0]);
        //遍历saveParam，将里面的值自动加入formdata传入后台
        for(let key in saveParam){
            formdata.append(key,saveParam[key]);
        }
        fileUpLoad(saveUrl,formdata,callback_save);
    }else {
        //没有fileinput框
        let formJson = form.serializeObject()
        let result = Object.assign(saveParam, formJson);
        getJSON(saveUrl,result,callback_save);
    }
}

//将表单序列化成json对象
$.fn.serializeObject = function() {
    let o = {};
    let a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [ o[this.name] ];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};
