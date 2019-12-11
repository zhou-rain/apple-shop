let queryUrl;//列表url
let queryParam = {};//搜索条件
let pageSize = 5;//页面尺寸
let pageNum;//当前页码


$(function () {
    initTHead(); //初始化表头
    initFunBtn();//初始化功能按钮
    toPage(1);
});

//初始化搜索条件
function prepParam() {
    let keyword = $(".hd .keyword").val();
    queryParam.pageSize = pageSize;
    queryParam.keyword = keyword;
}

//带条件翻页
function toPage(pageNum) {
    prepParam();//初始化搜索条件
    queryParam.pageNum = pageNum;
    getJSON(queryUrl, queryParam, callback_toPage)
}

function callback_toPage(result) {
    console.log(result);
    $(".tablebd tbody").empty();
    $("#page").empty();
    $(check_all_box).prop("checked", false);

    let pageInfo = result.extend.list;
    pageNum = pageInfo.pageNum;

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
function initTFoot(pageInfo) {
    $("#page").paging({
        pageNum: pageInfo.pageNum, // 当前页面
        totalNum: pageInfo.pages, // 总页码
        totalList: pageInfo.total, // 记录总数量
        callback: function (result) { //返回点击导航条的数字
            toPage(result);
        }
    });
}

//搜索按钮class或者id
let search_btn = ".hd .search";
//点击搜索
$(search_btn).click(function () {
    toPage(1);
});



let check_all_box = "#all";//全选按钮的id
let check_each_box = ".check_each";    //每一项的小checkbox

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
let delete_all_btn = "#delete_all_btn"; //批量删除按钮
let delete_each_btn = ".delete_each_btn"; //单个删除的按钮
//删除按钮和checkbox设置data-id


let delurl; //删除地址（每个页面自己重新赋值即可）
let delparam = {};//要删除的参数
//记得定义删除后的回调函数  function callback_delete(result){}


//单个删除
$(document).on("click", delete_each_btn, function () {
    let dataId = $(this).data("id");
    deleteByIds(dataId);
});

//批量删除方法
$(document).on("click", delete_all_btn, function () {
    let dataIds = getSelectedIds();
    deleteByIds(dataIds);
});


//获取被选中的ID
function getSelectedIds() {
    let dataIds = "";
    $(delete_each_btn).filter(":checked").each(function () {
        dataIds += $(this).data("id") + ",";
    });
    return dataIds;
}

// 传入id批量删除
function deleteByIds(dataIds) {
    if (dataIds === "" || dataIds === null) {
        alert("请选择要删除的按钮");
        return;
    }
    if (confirm("确认删除吗?")) {
        delparam.ids = dataIds;
        getJSON(delurl, delparam, callback_delete);
    }
}



