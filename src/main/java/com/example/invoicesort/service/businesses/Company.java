package com.example.invoicesort.service.businesses;

import com.example.invoicesort.service.accounts.ChartOfAccounts;
import com.example.invoicesort.service.invoicing.Invoice;
import com.example.invoicesort.service.templates.Template;
import com.example.invoicesort.service.invoicing.InvoiceStorage;
import com.example.invoicesort.service.templates.TemplateStorage;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int eik;
    private String vatNumber;
    private String country;
    private String city;
    private String address;
    private ChartOfAccounts chartOfAccounts;
    private List<Partner> partners;
    private List<Template> templates;
    private List<Invoice> invoices;
    private InvoiceStorage invoiceStorage;
    private TemplateStorage templateStorage;


    public Company(String name, int eik, String vatNumber, String country, String city, String address) {
        this.name = name;
        this.eik = eik;
        this.vatNumber = vatNumber;
        this.country = country;
        this.city = city;
        this.address = address;
        this.partners = new ArrayList<>();
        this.templates = new ArrayList<>();
        this.invoices = new ArrayList<>();
        this.invoiceStorage = new InvoiceStorage(this);
        this.templateStorage = new TemplateStorage(this);
    }

    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = Name;
    }
    public int getEik() {
        return eik;
    }
    public void setBusinessEik(int eik) {
        this.eik = eik;
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

    public InvoiceStorage getInvoiceStorage(){
        return invoiceStorage;
    }

    public TemplateStorage getTemplateStorage(){
        return templateStorage;
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
