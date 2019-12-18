
$(function () {
    load_cart();
})

//加载购物车
function load_cart() {
    getJSON("/cart/query",{},function (result) {
        $("#cart_num").html(result.extend.calc.totalCount);
        $("#cart_price").html("¥"+result.extend.calc.totalMoney);
    })
}


/**
 * 加入购物车
 */
function addCart(gid) {
    getJSON("/cart/add",{"gid":gid},function (result) {
        if(result.code===100){
            alert("添加成功！");
            load_cart();
        }else {
            alert(result.extend.msg)
        }
    })
}