package com.qmall.apple.Entity;

public class ShopShiroEntity {
    private Integer sid;

    private String sname;

    private String sfilter;

    private Integer sindex;

    private Integer sstatus;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSfilter() {
        return sfilter;
    }

    public void setSfilter(String sfilter) {
        this.sfilter = sfilter == null ? null : sfilter.trim();
    }

    public Integer getSindex() {
        return sindex;
    }

    public void setSindex(Integer sindex) {
        this.sindex = sindex;
    }

    public Integer getSstatus() {
        return sstatus;
    }

    public void setSstatus(Integer sstatus) {
        this.sstatus = sstatus;
    }
}