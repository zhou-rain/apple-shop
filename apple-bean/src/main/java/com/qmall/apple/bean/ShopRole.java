package com.qmall.apple.bean;

public class ShopRole {
    private Integer rid;

    private String rname;

    private String rdesc;

    private Integer rstatue;

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