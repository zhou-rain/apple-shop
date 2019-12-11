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
    return JSON.parse(userInfo);
}




/**
 * @return {string}
 */
function JsonToString(json) {
    return JSON.stringify(json);
}

/**
 * @return {json}
 */
function StringToJson(str) {
    return JSON.parse(str);
}




