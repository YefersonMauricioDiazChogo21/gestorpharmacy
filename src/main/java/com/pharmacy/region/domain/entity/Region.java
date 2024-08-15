package com.pharmacy.region.domain.entity;

public class Region {
    private String codereg;
    private String nameregion;
    private String codecountry;
    
    public Region() {
    }

    public Region(String codereg, String nameregion, String codecountry) {
        this.codereg = codereg;
        this.nameregion = nameregion;
        this.codecountry = codecountry;
    }

    public String getCodereg() {
        return codereg;
    }

    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }

    public String getNameregion() {
        return nameregion;
    }

    public void setNameregion(String nameregion) {
        this.nameregion = nameregion;
    }

    public String getCodecountry() {
        return codecountry;
    }

    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }

    
}
