package com.qmall.apple.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class ShopCart implements Serializable {
	private Integer id;

	private String goodsId;

	private Integer customerId;

	private Integer quantity;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date dateTime;

	private Integer status;

	private ShopGoods goods;

	public ShopGoods getGoods() {
		return goods;
	}

	public void setGoods(ShopGoods goods) {
		this.goods = goods;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId == null ? null : goodsId.trim();
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}