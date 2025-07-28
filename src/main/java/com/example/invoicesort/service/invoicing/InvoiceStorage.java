package com.example.invoicesort.service.invoicing;

import com.example.invoicesort.service.businesses.Company;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InvoiceStorage {
    private Company company;
    private final String INVOICE_FOLDER;
    private final String INVOICE_COUNTER;
    private int lastInvoiceNumber;

    public InvoiceStorage(Company company) {
        this.company = company;
        this.INVOICE_FOLDER = "invoices/" + company.getName() + "/";
        this.INVOICE_COUNTER = INVOICE_FOLDER + "INVOICE_COUNTER";
    }

    public int getLastInvoiceNumber() {
        return lastInvoiceNumber;
    }
    public Company getCompany() {
        return company;
    }

    public void loadCounter(){
        try{
            Path path = Path.of(INVOICE_FOLDER);
            if (Files.exists(path)){
                lastInvoiceNumber= Integer.parseInt(Files.readString(path).trim());
            }
        }catch (IOException e){
            System.out.println("Could not load invoice counter. Defaulting to 0.");
            lastInvoiceNumber = 0;
        }
    }

    public void saveCounter(){
        try{
            Files.createDirectories(Path.of(INVOICE_FOLDER));
            Files.writeString(Path.of(INVOICE_COUNTER), String.valueOf(lastInvoiceNumber));
        }catch (IOException e){
            System.out.println("Failed to save receipt counter: " + e.getMessage());
        }
    }

    public int getNextInvoiceNumber(){
        lastInvoiceNumber++;
        saveCounter();
        return lastInvoiceNumber;
    }

    public void saveInvoice(Invoice invoice, int counter) throws IOException {
        Files.createDirectories(Path.of(INVOICE_FOLDER));
        ObjectMapper mapper = new ObjectMapper();
        File invoiceFile = new File(INVOICE_FOLDER, "invoice" + counter + ".json");
        mapper.writeValue(invoiceFile, invoice);
    }

    public Invoice loadInvoice(int counter) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File invoiceFile = new File(INVOICE_FOLDER, "invoice" + counter + ".json");
        return mapper.readValue(invoiceFile, Invoice.class);
    }
}
