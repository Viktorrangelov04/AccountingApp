package com.example.invoicesort.service.invoicing;

import com.example.invoicesort.service.businesses.CompanyManager;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SaveInvoice {
    private Invoice invoice;
    private CompanyManager companyManager;

    public SaveInvoice(CompanyManager companyManager){
        this.companyManager = companyManager;
    }
    public void saveInvoice(Invoice invoice) throws IOException {
        InvoiceStorage storage = companyManager.getActiveCompany().getInvoiceStorage();
        storage.loadCounter();
        int counter = storage.getNextInvoiceNumber();
        invoice.setCounter(counter);

        storage.saveInvoice(invoice, counter);

    }






//    public Invoice getInvoice(int counter) throws IOException {
//        InvoiceStorage storage = companyManager.getActiveCompany().getInvoiceStorage();
//        storage.loadCounter();
//        if(counter<=0 || counter>storage.getLastInvoiceNumber()){
//            System.out.println("invalid invoice number");
//        }else{
//            storage.loadInvoice(counter);
//        }
//        return invoice;
//    }
}
