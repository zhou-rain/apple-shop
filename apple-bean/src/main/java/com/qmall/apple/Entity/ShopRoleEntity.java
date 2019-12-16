package com.qmall.apple.Entity;

import java.util.Set;

public class ShopRoleEntity {
    private Integer rid;

    private String rname;

    private String rdesc;

    private Integer rstatue;

	private Set<ShopAuthEntity> auths; //该角色下的具体权限

	public Set<ShopAuthEntity> getAuths() {
		return auths;
	}

	public void setAuths(Set<ShopAuthEntity> auths) {
		this.auths = auths;
	}

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc == null ? null : rdesc.trim();
    }

    public Integer getRstatue() {
        return rstatue;
    }

    public void setRstatue(Integer rstatue) {
        this.rstatue = rstatue;
    }
}