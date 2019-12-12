package com.qmall.apple.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * 角色的实体类
 */
public class ShopRoleEntity implements Serializable {

    private Integer rid;

    private String rname;

    private String rdesc;

	private List<ShopAuthEntity> auths; //该角色下的具体权限

	public List<ShopAuthEntity> getAuths() {
		return auths;
	}

	public void setAuths(List<ShopAuthEntity> auths) {
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

}