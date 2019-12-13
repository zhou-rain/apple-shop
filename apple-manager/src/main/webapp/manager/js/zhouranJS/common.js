/**
 * 通用工具类
 *
 */
function getUserId(){
    return sessionStorage.getItem("userId");
}

function getToken(){
    return sessionStorage.getItem("token");
}



/**
 * 获取本页面url上的参数
 * @returns {string}
 */
function getUrlParam(name) {
    let result = window.location.search.match(new RegExp("[\?\&]" + name + "=([^\&]+)", "i"));
    if (result == null || result.length < 1) {
        return "";
    }
    return result[1];
}


/**
 * 获取ifram父级url上的参数 入参key
 * @returns {string}
 */
function getParentUrlParam(name){
    let result = window.parent.location.search.match(new RegExp("[\?\&]" + name + "=([^\&]+)", "i"));
    if (result == null || result.length < 1) {
        return "";
    }
    return result[1];
}


/**
 * 根据userId，从sessionStory中获取用户信息，返回json数据
 * @param userId
 */
function getUserFromSessionByUserId(userId) {
    let userInfo = sessionStorage.getItem(userId);
    //加密： window.encodeURIComponent(window.btoa(str));
    //解密： window.decodeURIComponent(window.atob(str));
    userInfo = window.decodeURIComponent(userInfo);
    return JSON.parse(userInfo);
}





/**
 * 将Json格式变成String字符串
 * @return {string}
 */
function JsonToString(json) {
    return JSON.stringify(json);
}

/**
 * 将String字符串变成json格式
 * @return {json}
 */
function StringToJson(str) {
    return JSON.parse(str);
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


/**
 * 判断某个集合内是否存在某个值   存在-true 不存在-false
 * @param arr 集合
 * @param value 值
 * @returns {boolean}
 */
function isInArray(arr,value){
    for(let i = 0; i < arr.length; i++){
        if(value === arr[i]){
            return true;
        }
    }
    return false;
}



function recorePageNum(pageNum) {
    sessionStorage.setItem("pageNum",pageNum);
}
function getPageNum() {
    return sessionStorage.getItem("pageNum");
}






