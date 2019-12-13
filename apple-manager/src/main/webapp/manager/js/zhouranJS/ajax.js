/*
 *ajax参数
 *
 * */
let userId = getUserId();
let token = getToken();

let ajaxData ={
    //删除管理员
	 data101:{
	     "userId":userId,//每次请求都需要带上用户ID
         "token":token,//每次请求必须带上令牌
         "status":"" //用户状态
     },
     //编辑管理员
     data102:{
         "userId":userId,//每次请求都需要带上用户ID
         "token":token,//每次请求必须带上令牌
	     "aid":""   //用户id
     },
    //获取所有员工列表
     data103:{
         "userId":userId,//每次请求都需要带上用户ID
         "token":token//每次请求必须带上令牌
     },
     data104:{
     },
     data105:{

    }

	//end dpp
};


//服务器地址
const serverUrl ="http://localhost:8080/manager"; //本地;
//const serverUrl ='';  //服务器地址


//ajax请求
function getJSON(url,param,callFun){
	$.ajax({
        url : serverUrl+url,
        type : 'POST',
        data:  param,
        success	: callFun,
        error : function(e){}
      },"json");
}


/**文件上传的ajax
 *
 * 设置form表单的头：
 *<form action="" method="post" id="updateform" enctype="multipart/form-data">
 *  设置要上传的文件input框的 name="upload_file"
 *
 * @param url       请求地址
 * @param param    const param = new FormData($("#updateform")[0]);
 * @param callFun   回调函数
 */
function fileUpLoad(url,param,callFun) {
    $.ajax({
        url : serverUrl+url,
        type: "POST",
        processData:false,//告诉ajax不要处理和编码这些数据，直接提交
        contentType:false,//不使用默认的内容类型
        data:param,
        success:callFun,
        error:function (e) {}
    },"json")
}


