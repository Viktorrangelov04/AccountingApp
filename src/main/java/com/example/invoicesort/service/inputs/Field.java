package com.example.invoicesort.service.inputs;

import com.example.invoicesort.service.accounts.Account;
import com.example.invoicesort.service.businesses.CompanyManager;

import java.math.BigDecimal;
public class Field {
    private BigDecimal amount;
    private Account account;
    private final CompanyManager companyManager;

    public Field(BigDecimal price, String code, CompanyManager companyManager) {
        this.amount = price;
        this.companyManager = companyManager;
        this.account = companyManager.getActiveCompany().getChartOfAccounts().getAccountByCode(code);

    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

}
