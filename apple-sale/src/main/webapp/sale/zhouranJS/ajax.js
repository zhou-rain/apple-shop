/*
 *ajax参数
 *
 * */
let ajaxData ={
	 data101:{
         "status":"" //用户状态
     },
     //编辑管理员
     data102:{
	     "aid":""   //用户id
     },
     data103:{

     },
     data104:{
     },
     data105:{

    }

	//end dpp
};


//服务器地址
const serverUrl ="http://localhost:8081"; //本地;
//const serverUrl ='';  //服务器地址


//ajax请求
function getJSON(url,param,callFun){
    param.userId=1;
	$.ajax({
        url : serverUrl+url,
        type : 'POST',
        data:  param,
        traditional:true,
        success	: callFun
      },"json");
}




/**文件上传的ajax
 *
 * 设置form表单的头： enctype="multipart/form-data"
 *<form id="updateform" enctype="multipart/form-data">
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





