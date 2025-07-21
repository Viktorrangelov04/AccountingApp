package com.example.invoicesort.service.businesses;

public class Partner {
    private String Name;
    private int Eik;
    private String VAT;
    private String MOL;
    private String address;
    private String country;

    public Partner(String Name, int Eik, String VAT, String MOL, String address, String country) {
        this.Name = Name;
        this.Eik = Eik;
        this.VAT = VAT;
        this.MOL = MOL;
        this.address = address;
        this.country = country;
    }

    public Partner() {}
    public String getName() {
        return Name;
    }
    public int getEik() {
        return Eik;
    }
    public String getVAT() {
        return VAT;
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

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setEik(int Eik) {
        this.Eik = Eik;
    }
    public void setVAT(String VAT) {
        this.VAT = VAT;
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
