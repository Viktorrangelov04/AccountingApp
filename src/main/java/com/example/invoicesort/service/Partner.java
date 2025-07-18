package com.example.invoicesort.service;

public class Partner {
    private String partnerName;
    private int partnerEik;
    private String partnerVAT;
    private String MOL;
    private String address;
    private String country;

    public Partner(String partnerName, int partnerEik, String partnerVAT, String MOL, String address, String country) {
        this.partnerName = partnerName;
        this.partnerEik = partnerEik;
        this.partnerVAT = partnerVAT;
        this.MOL = MOL;
        this.address = address;
        this.country = country;
    }

    public Partner() {}
    public String getPartnerName() {
        return partnerName;
    }
    public int getPartnerEik() {
        return partnerEik;
    }
    public String getPartnerVAT() {
        return partnerVAT;
    }
    public String getMOL() {
        return MOL;
    }
    public String getAddress() {
        return address;
    }
    public String getCountry() {
        return country;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
    public void setPartnerEik(int partnerEik) {
        this.partnerEik = partnerEik;
    }
    public void setPartnerVAT(String partnerVAT) {
        this.partnerVAT = partnerVAT;
    }
    public void setMOL(String MOL) {
        this.MOL = MOL;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
