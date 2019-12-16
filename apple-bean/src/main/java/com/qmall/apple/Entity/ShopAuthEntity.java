package com.qmall.apple.Entity;

import java.io.Serializable;

/**
 * 具体的权限
 */
public class ShopAuthEntity implements Serializable {
    private Integer auid;

    private String auname;

    private String aupath;

    private Short autype;

    private Integer aupid;

    public Integer getAuid() {
        return auid;
    }

    public void setAuid(Integer auid) {
        this.auid = auid;
    }

    public String getAuname() {
        return auname;
    }

    public void setAuname(String auname) {
        this.auname = auname == null ? null : auname.trim();
    }

    public String getAupath() {
        return aupath;
    }

    public void setAupath(String aupath) {
        this.aupath = aupath == null ? null : aupath.trim();
    }

    public Short getAutype() {
        return autype;
    }

    public void setAutype(Short autype) {
        this.autype = autype;
    }

    public Integer getAupid() {
        return aupid;
    }

    public void setAupid(Integer aupid) {
        this.aupid = aupid;
    }

	@Override
	public String toString() {
		return "ShopAuthEntity{" +
				"auid=" + auid +
				", auname='" + auname + '\'' +
				", aupath='" + aupath + '\'' +
				", autype=" + autype +
				", aupid=" + aupid +
				'}';
	}
}