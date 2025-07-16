package com.example.invoicesort;

import com.example.invoicesort.service.Invoice;
import com.example.invoicesort.service.Partner;
import com.example.invoicesort.service.TransactionType;
import com.example.invoicesort.service.VATReturnType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class main {
    public static void main(String[] args) {
        Partner kremen = new Partner("kremen", 123, "BG123", "Pesho Peshov", "asd", "Bulgaria");
        Invoice invoice  = new Invoice(1,
                LocalDate.of(2025, 7, 16), kremen,
                TransactionType.PURCHASE, VATReturnType.FULL,
                LocalDate.of(2025, 7, 16), new BigDecimal("100"),
                new BigDecimal("20"), new BigDecimal("120"));

        invoice.printInvoice();
    }
}
