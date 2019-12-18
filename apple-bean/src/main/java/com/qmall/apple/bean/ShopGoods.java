package com.qmall.apple.bean;

import java.io.Serializable;

/**
 * 商品类别
 */
public class ShopGoods implements Serializable {
	private String gid;
	private String gname;
	private String gimage;
	private Float gprice;
	private String gdesc;
	private float gdiscount;  //折扣.  0.8 打八折
	private int isdelete; // 0 可用 1 已删除
	private int glabel = -1; // 1: 新品 2:热销 3:折扣
	private int gsex = -1;  // 0:女装; 1:男装 ; 2:童装;
	private int gtype;  // 商品类别; 商品类别表goods_type表的外键
	private ShopGoodsType goodsType;

	public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	}

	public void setGlabel(int glabel) {
		this.glabel = glabel;
	}

	public void setGsex(int gsex) {
		this.gsex = gsex;
	}

	public void setGtype(int gtype) {
		this.gtype = gtype;
	}

	public ShopGoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(ShopGoodsType goodsType) {
		this.goodsType = goodsType;
	}

	public void setGdiscount(float gdiscount) {
		this.gdiscount = gdiscount;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid == null ? null : gid.trim();
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname == null ? null : gname.trim();
	}

	public String getGimage() {
		return gimage;
	}

	public void setGimage(String gimage) {
		this.gimage = gimage == null ? null : gimage.trim();
	}

	public Float getGprice() {
		return gprice;
	}

	public void setGprice(Float gprice) {
		this.gprice = gprice;
	}

	public Integer getGtype() {
		return gtype;
	}

	public void setGtype(Integer gtype) {
		this.gtype = gtype;
	}

	public String getGdesc() {
		return gdesc;
	}

	public void setGdesc(String gdesc) {
		this.gdesc = gdesc == null ? null : gdesc.trim();
	}

	public Float getGdiscount() {
		return gdiscount;
	}

	public void setGdiscount(Float gdiscount) {
		this.gdiscount = gdiscount;
	}

	public Integer getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}

	public Integer getGlabel() {
		return glabel;
	}

	public void setGlabel(Integer glabel) {
		this.glabel = glabel;
	}

	public Integer getGsex() {
		return gsex;
	}

	public void setGsex(Integer gsex) {
		this.gsex = gsex;
	}
}