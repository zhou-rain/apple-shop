/**
 * 通用工具类
 *
 */



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


//翻页记录页码
function recorePageNum(pageNum) {
    sessionStorage.setItem("pageNum",pageNum);
}
//修改 回调函数时使用
function getPageNum() {
    return sessionStorage.getItem("pageNum");
}



/**
 * 为空校验函数校验undefined、null以及空字符串等
 */
function isNotEmpty(obj){
    let result = true;
    /*进行校验*/
    switch (obj) {
        case undefined:
        case  null:
            result = false;
            break;
    }
    if(result){
        if(obj.replace(/\s+/g,"") === ""){//空字符串校验
            result = false;
        }
    }
    return result;
}

function isEmpty(obj) {
    return !isNotEmpty(obj);
}


/**
 * 将字符串加密
 */
function encodeStr(str) {
    return window.encodeURIComponent(str);
}


/**
 * 字符串解密
 */
function decodeStr(str) {
    return window.decodeURIComponent(str);
}









