package com.example.invoicesort.service.templates;

import com.example.invoicesort.service.businesses.Partner;
import com.example.invoicesort.service.invoicing.Invoice;
import com.example.invoicesort.service.invoicing.TransactionType;
import com.example.invoicesort.service.invoicing.VATReturnType;

import java.math.BigDecimal;

public class Template {
     private String name;
     private Partner partner;
     private TransactionType transactionType;
     private VATReturnType vatReturnType;
     private BigDecimal baseAmount;
     private BigDecimal vatAmount;
     private BigDecimal totalPrice;



     public Template(String name, Partner partner, TransactionType transactionType, VATReturnType vatReturnType, BigDecimal baseAmount, BigDecimal vatAmount, BigDecimal totalPrice) {
         this.name = name;
         this.partner = partner;
         this.transactionType = transactionType;
         this.vatReturnType = vatReturnType;
         this.baseAmount = baseAmount;
         this.vatAmount = vatAmount;
         this.totalPrice = totalPrice;
     }

    public Template(){};

     public String getName() {
         return name;
     }
     public Partner getPartner() {
         return this.partner;
     }
     public TransactionType getTransactionType() {
         return this.transactionType;
     }
     public VATReturnType getVatReturnType() {
         return this.vatReturnType;
     }
     public BigDecimal getBaseAmount() {
         return this.baseAmount;
     }
     public BigDecimal getVatAmount() {
         return this.vatAmount;
     }
     public BigDecimal getTotalPrice() {
         return this.totalPrice;
     }

     public void SaveTeplate(Invoice invoice, String name){
         Template template  = new Template(name, invoice.getPartner(), invoice.getTransactionType(), invoice.getVatReturnType(), invoice.getBaseAmount(), invoice.getVatAmount(), invoice.getTotalAmount());

     }
}
