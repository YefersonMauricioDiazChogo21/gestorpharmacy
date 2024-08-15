package com.pharmacy.activeprinciple.domain.entity;

public class ActivePrinciple {
    private int idap;
    private String nameap;

    public ActivePrinciple() {
    }
    
    public ActivePrinciple(int idap, String nameap) {
        this.idap = idap;
        this.nameap = nameap;
    }

    public int getIdap() {
        return idap;
    }

    public void setIdap(int idap) {
        this.idap = idap;
    }

    public String getNameap() {
        return nameap;
    }

    public void setNameap(String nameap) {
        this.nameap = nameap;
    }

}
