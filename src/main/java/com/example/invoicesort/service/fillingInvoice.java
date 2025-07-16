package com.example.invoicesort.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public class fillingInvoice {
    private int invoiceNumber;
    private LocalDate invoiceDate;
    private String partner;
    private int invoiceType;
    private TransactionType transactionType;
    private VATReturnType vatReturnType;
    private LocalDate exportDate;
    private BigDecimal baseAmount;
    private BigDecimal vatAmount;

    public fillingInvoice(int invoiceNumber, LocalDate invoiceDate, String partner, TransactionType transactionType, VATReturnType vatReturnType, LocalDate exportDate,  BigDecimal baseAmount, BigDecimal vatAmount) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.partner = partner;
        this.transactionType = transactionType;
        this.vatReturnType = vatReturnType;
        this.exportDate = exportDate;
        this.baseAmount = BigDecimal.ZERO;
        this.vatAmount = BigDecimal.ZERO;
    }

    public void printInvoice(){
        System.out.println("Invoice Number: " + this.invoiceNumber + "\n" + "Date:" + this.invoiceDate
                + "\n" +"partner:" + this.partner + "\n" + "invoiceType:" + this.invoiceType
                + "\n" + "transactionType:" + this.transactionType + "\n" + "VATReturnType:" + this.vatReturnType);
    }
}
