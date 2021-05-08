package com.company.Entities;

public class Oyuncu {

    private String isim;
    private String soyIsim;
    private int dogumYili;
    private String tcNo;

    public Oyuncu(String isim, String soyIsim, int dogumYili, String tcNo) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumYili = dogumYili;
        this.tcNo = tcNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
}
