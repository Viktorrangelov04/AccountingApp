package com.example.invoicesort.service.reports;

import java.math.BigDecimal;

public class VatReport {
    private BigDecimal totalAmount;
    private BigDecimal vatAmount;

    public VatReport(){
        this.totalAmount = BigDecimal.ZERO;
        this.vatAmount = BigDecimal.ZERO;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
    public BigDecimal getVatAmount() {
        return vatAmount;
    }
    public void setVatAmount(BigDecimal vatAmount) {
        this.vatAmount = vatAmount;
    }
}
