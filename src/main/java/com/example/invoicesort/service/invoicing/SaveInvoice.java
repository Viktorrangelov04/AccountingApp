package com.example.invoicesort.service.invoicing;

import com.example.invoicesort.storage.InvoiceStorage;

import java.io.IOException;

public class SaveInvoice {
    private Invoice invoice;

    public void saveInvoice(Invoice invoice) throws IOException {
        InvoiceStorage storage = new InvoiceStorage();
        storage.loadCounter();
        int counter = storage.getNextInvoiceNumber();
        invoice.setCounter(counter);

        storage.saveInvoice(invoice, counter);
    }

    public Invoice getInvoice(int counter) throws IOException {
        InvoiceStorage storage = new InvoiceStorage();
        storage.loadCounter();
        if(counter<=0 && counter>storage.getLastInvoiceNumber()){
            System.out.println("invalid invoice number");
        }else{
            storage.loadInvoice(counter);
        }
        return invoice;
    }
}
