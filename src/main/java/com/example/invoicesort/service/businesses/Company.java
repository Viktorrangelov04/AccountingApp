package com.example.invoicesort.service.businesses;

import com.example.invoicesort.service.accounts.ChartOfAccounts;
import com.example.invoicesort.service.templates.Template;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String businessName;
    private int businessEik;
    private String vatNumber;
    private String country;
    private String city;
    private String address;
    private List<Partner> partners;
    private List<Template> templates;
    private ChartOfAccounts chartOfAccounts;

    public Company(String businessName, int businessEik, String vatNumber, String country, String city, String address) {
        this.businessName = businessName;
        this.businessEik = businessEik;
        this.vatNumber = vatNumber;
        this.country = country;
        this.city = city;
        this.address = address;
        this.partners = new ArrayList<>();
    }

    public String getBusinessName() {
        return businessName;
    }
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    public int getBusinessEik() {
        return businessEik;
    }
    public void setBusinessEik(int businessEik) {
        this.businessEik = businessEik;
    }
    public String getVatNumber() {
        return vatNumber;
    }
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<Partner> getPartners() {
        return partners;
    }

    public ChartOfAccounts getChartOfAccounts() {
        return chartOfAccounts;
    }

    public void addPartner(Partner partner) {
        this.partners.add(partner);
    }

    public void removePartner(Partner partner) {
        this.partners.remove(partner);
    }

    public void displayPartners(){
        for (Partner partner : this.partners){
            System.out.println(partner.getName());
        }
    }
}
