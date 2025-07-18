package com.example.invoicesort.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ChartOfAccounts {
    private static String CODES_PATH = "codes/chartOfAccounts.json";
    public static List<Account> loadAccounts() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(
                new File(CODES_PATH),
                new TypeReference<List<Account>>(){}
        );
    }
    public static void printChartOfAccounts(List<Account> accounts){
        for(Account account : accounts){
            System.out.println(account);
        }
    }
}
