//验证是否为空
function checkEmpty(str){
	if(str==="" ||str==null || str===undefined){
		return false;
	}else{
		return true;
	}
}

//判断是否是手机号
function isMobile(str){
	let re=/^1[3578]\d{9}$/;
	return re.test(str) ;
}

//验证email
function isEmail(str){
    let reg = /^(\w)+(\.\w+)*@(\w)+((\.\w+)+)$/;
    return reg.test(str);
}

//判断是否是中英文
function isCnAndEn(str){
	let re=/^([\u4E00-\uFA29]*[a-z]*[A-Z]*)+$/;
	return re.test(str) ;
}

//判断是否全是中文
function isCn(str){
	let re=/^([\u4E00-\uFA29]*)+$/;
	return re.test(str) ;
}

//验证输入金额格式（非负数）
function checkAmount(str){
	let re = /^[+]{0,1}(\d+)$|^[+]{0,1}(\d+\.\d+)$/;
	return re.test(str) ;
}

//验证输入数字（正数）
function checkNumber(str){
	let regu = /^[+]{0,1}(\d+)$/; //let reg = /^[1-9]\d*$/;
	return regu.test(str) ;
}
//验证输入数字大于0的整数（正数）
function greatThanZero(str){
	let reg = /^[1-9]\d*$/;
	return reg.test(str) ;
}
//验证输入数字大于0的整数（正数）或0
function greatThanZeroLing(str){
	let reg = /^[0-9]\d*$/;
	return reg.test(str) ;
}
//验证大于等于0的数包括小数
function checkfloat(str){
	let reg =/^[0-9]\d*(\.\d+)?$/;
	return reg.test(str);
}
//判断时间或者年龄输入前后大小验证（前者小于后者）
function checkSize(first,second){
	if(!first){
		return;
	}
	if(!second){
		return;
	}
	if(first>second){
		return false;
	}else {
		return true;
	}
}

//验证银行卡号
function checkYhkh(str){
	let regu = /^\d{19}$/g;
	return regu.test(str) ;
}
//字符串与本机当前日期比较 yyyy-dd-mm
function dateCompare(str){
	str = str.replace(/-/g,"/");
	let strDate = new Date(str);
	let nowDate = new Date();
	return nowDate > strDate;
}

//验证  以字母开头，其后可为字母、数字、_@#$ 长度为1-30
function checkMmgz(str){
	let re=/^[A-Za-z][\w#@\$]{0,30}$/;
	return re.test(str);
}

//验证数字,正数且最多两位小数
function checkJine2(str){
	return /^(^[1-9](\d+)?(\.\d{1,2})?$)|(^0$)|(^\d\.\d{1,2}$)$/.test(str);
}

//验证是否是数字是否满足  maxvalue：数值最大值 maxlegth-最大小数位数
function floatValid(value,maxvalue,maxlegth){
	 if (isNaN(value)) {
         return false;
     }
	let len=0; // 小数点长度
	if(value.indexOf(".")>-1){
		len=value.substr(value.indexOf(".")+1).length;
	}
	if (parseFloat(value) > maxvalue || len > maxlegth) {
	    return false;
	}

	return true;
}
//验证是否是数字      正数（包括正小数）/负数（包括负小数）/0  都可以    去除这种情况：99.
function checkDigit(str){
	let lastchar=str.substring(str.length-1);
	if(lastchar=="."){
		return false;
	}
	return !isNaN(str);
}