$(document).ready(function(){

    var date = new Date();
    date.setTime(1000*60*30);//应该是一个动态的,以后台的计数为标准
    $("#showtime").text("30:00");
    setInterval(function(){
        var str;

        date.setTime(date.getTime()-1000);

        str = date.getMinutes() + ":" + (date.getSeconds()<10 ? '0'+date.getSeconds() : date.getSeconds());

        $("#showtime").text(str);

    }, 1000);


});