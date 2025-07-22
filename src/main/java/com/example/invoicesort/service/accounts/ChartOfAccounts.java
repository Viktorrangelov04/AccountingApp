package com.example.invoicesort.service.accounts;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChartOfAccounts {
    private String CODES_PATH = "codes/chartOfAccounts.json";
    private List<Account> accounts;

    public ChartOfAccounts()throws IOException {
        this.accounts = loadAccounts();
    }

    private List<Account> loadAccounts() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(
                new File(CODES_PATH),
                new TypeReference<List<Account>>(){}
        );
    }
    public void printChartOfAccounts(List<Account> accounts){
        for(Account account : accounts){
            System.out.println(account);
        }
    }
    public Account getAccountByCode(String code){
        for(Account account : accounts){
            if(account.getCode().equals(code)){
                return account;
            }
        }
    }
}
