package com.qmall.apple.bean;

import java.io.Serializable;

/**
 * 订单详情
 */
public class ShopOrderDetail implements Serializable {
    private String odid; //详情id

    private String oid;	// 订单id

    private String gid; //商品id

    private Float odprice; //成交价

    private Integer odnumber; //数量

    private ShopGoods shopGoods; //对应商品类

	public ShopGoods getShopGoods() {
		return shopGoods;
	}

	public void setShopGoods(ShopGoods shopGoods) {
		this.shopGoods = shopGoods;
	}

	public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid == null ? null : odid.trim();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    public Float getOdprice() {
        return odprice;
    }

    public void setOdprice(Float odprice) {
        this.odprice = odprice;
    }

    public Integer getOdnumber() {
        return odnumber;
    }

    public void setOdnumber(Integer odnumber) {
        this.odnumber = odnumber;
    }
}