let queryUrl;//列表url
let queryParam = {};//搜索条件
let pageSize = 8;//页面尺寸
let pageNum;//当前页码


$(function () {
    initTHead(); //初始化表头
    initFunBtn();//初始化功能按钮
    toPage(1);
});

//<搜索框>
let search_form = $("#search_form");
//带条件翻页
function toPage(pageNum) {
    recorePageNum(pageNum);
    queryParam.pageSize = pageSize;
    queryParam.pageNum = pageNum;
    let search_form_param = search_form.serializeObject();//拼接查询条件
    let result = Object.assign(queryParam, search_form_param);
    getJSON(queryUrl, result, callback_toPage)
}

function callback_toPage(result) {
    console.log(result);
    $(".layui-table tbody").empty();
    $(".page").empty();
    $(check_all_box).prop("checked", false);

    let pageInfo = result.extend.pageInfo;
    pageNum = pageInfo.pageNum;
    $("#total").text(pageInfo.total);

    //构建表格体
    if (pageInfo.list != null) {
        $.each(pageInfo.list, function (index, item) {
            initTBody(index, item);//index表示索引，item每一项
        });
    }

    //构建底部导航
    //如果总页数比当前 页面尺寸pageSize小的话，就不用构建了
    if (pageInfo.total > pageSize) {
        initTFoot(pageInfo);
    }

}


//构建底部导航条
function initTFoot(pageinfo) {
    let str = '';
    if(pageinfo.hasPreviousPage === false){
        str += "<a class='disabled'>首页</a>";
        str += "<a class='disabled'>&lt;&lt;</a>";
    }else {
        str += "<a class='prev' href='javascript:;' onclick='toPage(1)'>首页</a>";
        str += "<a class='prev' href='javascript:;' onclick='toPage("+pageinfo.prePage+")'>&lt;&lt;</a>";
    }
    $.each(pageinfo.navigatepageNums,function (index,obj) {
        if(obj === pageinfo.pageNum){
            str += "<span class='current'>"+obj+"</span>";
        }else {
            str += "<a class='num' href='javascript:;' onclick='toPage("+obj+")' >"+obj+"</a>";
        }
    });
    if(pageinfo.hasNextPage === false){
        str += "<a class='disabled'>&gt;&gt;</a>";
        str += "<a class='disabled'>末页</a>";
    }else {
        str += "<a class='next' href='javascript:;' onclick='toPage("+pageinfo.nextPage+")'>&gt;&gt;</a>";
        str += "<a class='next' href='javascript:;' onclick='toPage("+pageinfo.pages+")'>末页</a>";
    }
    $(".page").append(str);
}

//点击搜索
$("#sreach_btn").click(function () {
    toPage(1);
});







let check_all_box = "#check_all_box";//<<全选按钮的>>
let check_each_box = ".check_each";    //<<每一项的小checkbox>>

// 全选按钮的控制
$(document).on("click", check_all_box, function () {
    $(check_each_box).prop("checked", $(this).prop("checked"));
});

$(document).on("click", check_each_box, function () {
    // 小按钮总数量
    let len = $(check_each_box).length;
    // 选中的小按钮数量
    let checked = $(check_each_box).filter(":checked").length;
    // 小按钮点满后，全选按钮也要点满
    $(check_all_box).prop("checked", checked === len);
});






/* ****************删除********************* */
//删除按钮和checkbox设置data-id
let delete_all_btn = "#delete_all_btn"; //<<批量删除按钮>>
let delurl; //删除地址
let delparam = {};//要删除的参数


//单个删除
function member_del(obj,id){
    deleteByIds(id);
}

//批量删除方法
$(document).on("click", delete_all_btn, function () {
    let dataIds = getSelectedIds();
    deleteByIds(dataIds);
});


//获取被选中的ID
function getSelectedIds() {
    let dataIds = "";
    $(check_each_box).filter(":checked").each(function () {
        dataIds += $(this).data("id") + ",";
    });
    return dataIds;
}

// 传入id批量删除
function deleteByIds(dataIds) {
    if (dataIds === "" || dataIds === null) {
        layer.msg('请选择要删除的按钮',{icon:7,time:1000});
        return;
    }

    layer.confirm('确认要删除吗？',function(){
        delparam.ids = dataIds;
        getJSON(delurl, delparam, callback_delete);
    });
}

function callback_delete(result) {
    let ret = result.extend.ret;
    if(ret=="ok"){
        layer.msg('已删除!',{icon:1,time:1000});
        toPage(1);
    }else{
        layer.msg('系统出错，请刷新或联系管理员!',{icon:2,time:1000});
    }
}



/*
1绿色勾
2红色叉叉
3黄色问号
4灰色锁
7黄色感叹号

5红色哭脸
6绿色笑脸
 */

