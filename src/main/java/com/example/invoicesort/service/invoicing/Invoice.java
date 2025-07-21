package com.example.invoicesort.service.invoicing;

import com.example.invoicesort.service.businesses.Partner;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private int counter;
    private int invoiceNumber;
    private LocalDate invoiceDate;
    private Partner partner;
    private TransactionType transactionType;
    private VATReturnType vatReturnType;
    private LocalDate exportDate;
    private BigDecimal baseAmount;
    private BigDecimal vatAmount;
    private BigDecimal totalAmount;

    public Invoice(int invoiceNumber, LocalDate invoiceDate, Partner partner, TransactionType transactionType, VATReturnType vatReturnType, LocalDate exportDate, BigDecimal baseAmount, BigDecimal vatAmount, BigDecimal totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.partner = partner;
        this.transactionType = transactionType;
        this.vatReturnType = vatReturnType;
        this.exportDate = exportDate;
        this.baseAmount = BigDecimal.ZERO;
        this.vatAmount = BigDecimal.ZERO;
        this.totalAmount = totalAmount;
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
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }
    public BigDecimal getVatAmount() {
        return vatAmount;
    }
    public BigDecimal getTotalAmount() {
        return totalAmount;
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
    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }
    public void setVatAmount(BigDecimal vatAmount) {
        this.vatAmount = vatAmount;
    }
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void printInvoice(){
        System.out.println("Invoice Number: " + this.invoiceNumber + "\n" + "Date:" + this.invoiceDate
                + "\n" +"partner:" + this.partner + "\n" + "invoiceType:" +  "transactionType:" + this.transactionType + "\n" + "VATReturnType:" + this.vatReturnType);
    }
}
