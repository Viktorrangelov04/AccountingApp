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

    }
}
