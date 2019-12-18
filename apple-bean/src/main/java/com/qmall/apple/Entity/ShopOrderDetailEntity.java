package com.qmall.apple.Entity;

public class ShopOrderDetailEntity {
    private String odid;

    private String oid;

    private String gid;

    private Float odprice;

    private Integer odnumber;

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