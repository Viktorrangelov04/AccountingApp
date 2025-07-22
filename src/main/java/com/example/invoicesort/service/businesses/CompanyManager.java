package com.example.invoicesort.service.businesses;

import org.springframework.stereotype.Component;

@Component
public class CompanyManager {
    private Company activeCompany;

    public Company getActiveCompany(){
        return activeCompany;
    }

    public void setActiveCompany(Company activeCompany){
        this.activeCompany = activeCompany;
    }
}
