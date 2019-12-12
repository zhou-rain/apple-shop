package com.qmall.apple.bean;

public class ShopAdmin {
    private Integer aid;

    private String aname;

    private String aacount;

    private String apass;

    private Short astatus;

    private String aphone;

	private boolean islogin = false; //当前用户是否登录

	public boolean isIslogin() {
		return islogin;
	}

	public void setIslogin(boolean islogin) {
		this.islogin = islogin;
	}

	public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAacount() {
        return aacount;
    }

    public void setAacount(String aacount) {
        this.aacount = aacount == null ? null : aacount.trim();
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass == null ? null : apass.trim();
    }

    public Short getAstatus() {
        return astatus;
    }

    public void setAstatus(Short astatus) {
        this.astatus = astatus;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }
}