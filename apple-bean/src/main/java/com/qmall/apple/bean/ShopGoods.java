package com.qmall.apple.bean;

public class ShopGoods {
    private String gid;

    private String gname;

    private String gimage;

    private Float gprice;

    private Integer gtype;

    private String gdesc;

    private Float gdiscount;

    private Integer isdelete;

    private Integer glabel;

    private Integer gsex;

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