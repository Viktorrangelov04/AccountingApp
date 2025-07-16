package com.example.invoicesort;

import com.example.invoicesort.service.TransactionType;
import com.example.invoicesort.service.VATReturnType;
import com.example.invoicesort.service.fillingInvoice;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class main {
    public static void main(String[] args) {
        fillingInvoice invoice  = new fillingInvoice(1,
                LocalDate.of(2025, 7, 16), "kremen",
                TransactionType.PURCHASE, VATReturnType.FULL,
                LocalDate.of(2025, 7, 16), new BigDecimal("100"),
                new BigDecimal("100"));

        invoice.printInvoice();
    }
}
