package com.example.invoicesort.service.invoicing;

import com.example.invoicesort.service.businesses.Partner;
import com.example.invoicesort.service.inputs.Field;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private int counter;
    private int invoiceNumber;
    private LocalDate invoiceDate;
    private Partner partner;
    private TransactionType transactionType;
    private VATReturnType vatReturnType;
    private LocalDate exportDate;
    private List<Field> fields;
    private BigDecimal totalAmount;
    private boolean paid;

    public Invoice(int invoiceNumber, LocalDate invoiceDate, Partner partner, TransactionType transactionType, VATReturnType vatReturnType, LocalDate exportDate, BigDecimal totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.partner = partner;
        this.transactionType = transactionType;
        this.vatReturnType = vatReturnType;
        this.exportDate = exportDate;
        this.fields = new ArrayList<>();
        this.totalAmount = totalAmount;
        this.paid = false;
    }

    public int getCounter() {
        return counter;
    }
    public int getInvoiceNumber() {
        return invoiceNumber;
    }
    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }
    public Partner getPartner() {
        return partner;
    }
    public TransactionType getTransactionType() {
        return transactionType;
    }
    public VATReturnType getVatReturnType() {
        return vatReturnType;
    }
    public LocalDate getExportDate() {
        return exportDate;
    }
    public List<Field> getFields() {
        return fields;
    }
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
    public boolean isPaid() {
        return paid;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    public void setPartner(Partner partner) {
        this.partner = partner;
    }
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    public void setVATReturnType(VATReturnType vatReturnType) {
        this.vatReturnType = vatReturnType;
    }
    public void setExportDate(LocalDate exportDate) {
        this.exportDate = exportDate;
    }
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    public void printInvoice(){
        System.out.println("Invoice Number: " + this.invoiceNumber + "\n" + "Date:" + this.invoiceDate
                + "\n" +"partner:" + this.partner + "\n" + "invoiceType:" +  "transactionType:" + this.transactionType + "\n" + "VATReturnType:" + this.vatReturnType);
    }
}
