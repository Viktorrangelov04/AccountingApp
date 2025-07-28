package com.example.invoicesort.service.invoicing;

import com.example.invoicesort.storage.InvoiceStorage;
import com.example.invoicesort.service.businesses.CompanyManager;
import java.io.IOException;

public class SaveInvoice {
    private Invoice invoice;
    private CompanyManager companyManager;

    public void saveInvoice(Invoice invoice) throws IOException {
        CompanyManager companyManager = new CompanyManager();
        InvoiceStorage storage = companyManager.getActiveCompany().getInvoiceStorage();
        storage.loadCounter();
        int counter = storage.getNextInvoiceNumber();
        invoice.setCounter(counter);

        storage.saveInvoice(invoice, counter);
    }

    public Invoice getInvoice(int counter) throws IOException {
        CompanyManager companyManager = new CompanyManager();
        InvoiceStorage storage = companyManager.getActiveCompany().getInvoiceStorage();
        storage.loadCounter();
        if(counter<=0 && counter>storage.getLastInvoiceNumber()){
            System.out.println("invalid invoice number");
        }else{
            storage.loadInvoice(counter);
        }
        return invoice;
    }
}
