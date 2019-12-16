//JS精确计算器

//加法函数，用来得到精确的加法结果
//说明：javascript的加法结果会有误差，在两个浮点数相加的时候会比较明显。这个函数返回较为精确的加法结果。
//调用：accAdd(arg1,arg2)
//返回值：arg1加上arg2的精确结果
function accAdd(arg1, arg2) {
    var r1, r2, m;
    try {r1 = arg1.toString().split(".")[1].length;} catch (e) {r1 = 0;}
    try {r2 = arg2.toString().split(".")[1].length;} catch (e) {r2 = 0;}
    m = Math.pow(10, Math.max(r1, r2));
    return (arg1 * m + arg2 * m) / m;
}
//给Number类型增加一个jia方法，，使用时直接用 num1.jia(num2) 即可完成计算。
Number.prototype.jia = function (arg) {
    return accAdd(arg, this);
};


//减法函数
function Subtr(arg1, arg2) {
    var r1, r2, m, n;
    try {r1 = arg1.toString().split(".")[1].length;}
    catch (e) {r1 = 0;}
    try {r2 = arg2.toString().split(".")[1].length;}
    catch (e) {r2 = 0;}
    m = Math.pow(10, Math.max(r1, r2));
    //last modify by deeka
    //动态控制精度长度
    n = (r1 >= r2) ? r1 : r2;
    return ((arg1 * m - arg2 * m) / m).toFixed(n);
}

//给Number类型增加一个jian方法，，使用时直接用 num1.jian(num2) 即可完成计算。
Number.prototype.jian = function (arg) {
    return Subtr(this, arg);
};


//乘法函数，用来得到精确的乘法结果
//说明：javascript的乘法结果会有误差，在两个浮点数相乘的时候会比较明显。这个函数返回较为精确的乘法结果。
//调用：accMul(arg1,arg2)
//返回值：arg1乘以arg2的精确结果
function accMul(arg1, arg2) {
    var m = 0, s1 = arg1.toString(), s2 = arg2.toString();
    try {m += s1.split(".")[1].length;} catch (e) {}
    try {m += s2.split(".")[1].length;} catch (e) {}
    return Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m);
}
//给Number类型增加一个cheng方法，使用时直接用 num1.cheng(num2) 即可完成计算。
Number.prototype.cheng = function (arg) {
    return accMul(arg, this);
};


//除法函数，用来得到精确的除法结果
//说明：javascript的除法结果会有误差，在两个浮点数相除的时候会比较明显。这个函数返回较为精确的除法结果。
//调用：accDiv(arg1,arg2)
//返回值：arg1除以arg2的精确结果
function accDiv(arg1, arg2) {
    var t1 = 0, t2 = 0, r1, r2;
    try {t1 = arg1.toString().split(".")[1].length;} catch (e) {}
    try {t2 = arg2.toString().split(".")[1].length;} catch (e) {}
    with (Math) {
        r1 = Number(arg1.toString().replace(".", ""));
        r2 = Number(arg2.toString().replace(".", ""));
        return (r1 / r2) * pow(10, t2 - t1);
    }
}
//给Number类型增加一个chu方法，，使用时直接用 num1.chu(num2) 即可完成计算。
Number.prototype.chu = function (arg) {
    return accDiv(this, arg);
};




/*
加法示例（其它的都类似）
 function calculate() {
     //数字1
     var num1 = 10;
     //数字2
     var num2 = 5;
     //计算 num1 + num2
     alert(num1.add(num2));
 }

 除法可以精确位数  加.toFixed()  下面为精确到2位数
 num1.chu(num2).toFixed(2)

 3.chu(2).toFixed(0) = 2
 3.chu(2).toFixed(1) = 1.5
 3.chu(2).toFixed(2) = 1.50

 */
