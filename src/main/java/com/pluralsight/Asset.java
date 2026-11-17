package com.pluralsight;

import java.math.BigDecimal;

public class Asset {

    private String description;
    private String dateAcquried;
    private BigDecimal originalCost;

    public Asset(String description, String dateAcquried, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquried = dateAcquried;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquried() {
        return dateAcquried;
    }

    public void setDateAcquried(String dateAcquried) {
        this.dateAcquried = dateAcquried;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }
}