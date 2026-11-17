package com.pluralsight;

import java.math.BigDecimal;

public abstract class Asset {

    private String description;
    private String dateAcquired;
    private BigDecimal originalCost;

    // Constructor
    public Asset(String description,
                 String dateAcquired,
                 BigDecimal originalCost) {

        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    // Abstract method
    public abstract BigDecimal getValue();
}
