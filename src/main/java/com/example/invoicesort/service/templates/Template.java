package com.example.invoicesort.service.templates;

import com.example.invoicesort.service.businesses.Partner;
import com.example.invoicesort.service.inputs.Field;
import com.example.invoicesort.service.invoicing.Invoice;
import com.example.invoicesort.service.invoicing.TransactionType;
import com.example.invoicesort.service.invoicing.VATReturnType;

import java.math.BigDecimal;
import java.util.List;

public class Template {
     private String name;
     private Partner partner;
     private TransactionType transactionType;
     private VATReturnType vatReturnType;
     private List<Field> fields;
     private BigDecimal totalPrice;

     public Template(String name, Partner partner, TransactionType transactionType, VATReturnType vatReturnType, List<Field> fields, BigDecimal totalPrice) {
         this.name = name;
         this.partner = partner;
         this.transactionType = transactionType;
         this.vatReturnType = vatReturnType;
         this.fields = fields;
         this.totalPrice = totalPrice;
     }

     public Template(){};

     public String getName() {
         return name;
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
     public List<Field> getFields() {
         return fields;
     }
     public BigDecimal getTotalPrice() {
         return totalPrice;
     }

     public void SaveTeplate(Invoice invoice, String name){
         Template template  = new Template(name, invoice.getPartner(), invoice.getTransactionType(), invoice.getVatReturnType(), invoice.getFields(), invoice.getTotalAmount());
     }
}
