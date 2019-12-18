package com.qmall.apple.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopOrder {
    private String oid; //订单id

    private Integer aid; //用户id

    private Integer addressid; //用户地址

    private Integer ostatus;//状态  1:未支付;2:已支付3:已发货;4:超时失效
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date odate; //订单时间

    private Float ototal; //总价

    private Integer isdelete; //删除0 可见1

    //商品详情集合
    private List<ShopOrderDetail> orderDetails = new ArrayList<>();

	public List<ShopOrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<ShopOrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getOstatus() {
        return ostatus;
    }

    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public Float getOtotal() {
        return ototal;
    }

    public void setOtotal(Float ototal) {
        this.ototal = ototal;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}