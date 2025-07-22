package com.example.invoicesort.service.businesses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void addPartner_shouldAddPartnerAndDisplayProperly() {
        Company company = new Company("asd", 123, "BG123", "viktor", "asd", "Bulgaria");
        Partner partner = new Partner("asd", 123, "BG123", "viktor", "asd", "Bulgaria");
        company.addPartner(partner);
        assertEquals("asd", partner.getName());
    }

    @Test
    void removePartner() {
        Company company = new Company("asd", 123, "BG123", "viktor", "asd", "Bulgaria");
    }

    @Test
    void displayPartners() {
        Company company = new Company("asd", 123, "BG123", "viktor", "asd", "Bulgaria");
    }
}