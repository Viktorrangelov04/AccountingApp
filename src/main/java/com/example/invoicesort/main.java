package com.example.invoicesort;

import com.example.invoicesort.service.accounts.Account;
import com.example.invoicesort.service.accounts.ChartOfAccounts;
import com.example.invoicesort.service.businesses.Partner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;


@SpringBootApplication
public class main {
    public static void main(String[] args) throws IOException {
       Partner kremen = new Partner("kremen", 123, "BG123", "Pesho Peshov", "asd", "Bulgaria");
       //Testing invoice printing
//                Invoice invoice  = new Invoice(1,
//                LocalDate.of(2025, 7, 16), kremen,
//                TransactionType.PURCHASE, VATReturnType.FULL,
//                LocalDate.of(2025, 7, 16), new BigDecimal("100"),
//                new BigDecimal("20"), new BigDecimal("120"));
//
//        invoice.printInvoice();

        //Testing template storage
//        Template template1 = new Template("template 1", kremen, TransactionType.PURCHASE, VATReturnType.FULL, new BigDecimal("100"), new BigDecimal("20"), new BigDecimal("120"));
//        Template template2 = new Template("template 2", kremen, TransactionType.PURCHASE, VATReturnType.FULL, new BigDecimal("100"), new BigDecimal("20"), new BigDecimal("120"));
//        Template template3 = new Template("template 3", kremen, TransactionType.PURCHASE, VATReturnType.FULL, new BigDecimal("100"), new BigDecimal("20"), new BigDecimal("120"));
//
//        TemplateDisplay display = new TemplateDisplay();
//        display.DisplayTemplates();
        //List<Account> accounts = ChartOfAccounts.loadAccounts();
        //printChartOfAccounts(accounts);
    }
}
