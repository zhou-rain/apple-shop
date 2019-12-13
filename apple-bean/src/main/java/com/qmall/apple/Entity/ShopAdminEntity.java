package com.qmall.apple.Entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * 管理员实体类
 */
public class ShopAdminEntity implements Serializable {
    private Integer aid;

    private String aname;

    private String aacount;

    private String apass;

    private Short astatus;

    private String aphone;

	private Set<ShopRoleEntity> roles; //一个用户下面所有的角色信息

	public Set<ShopRoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<ShopRoleEntity> roles) {
		this.roles = roles;
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