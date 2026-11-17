package com.pluralsight;

import java.math.BigDecimal;

public class House {

    private String address;
    private int condition;
    private  int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {

        super(description,dateAcquired, originalCost);

        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
public BigDecimal getValue()
    {

        double pricePerFoot;

        switch (condition) {
            case 1:
                pricePerFoot = 180;
                break;
            case 2:
                pricePerFoot = 130;
                break;
            case 3:
                pricePerFoot = 90;
                break;
            default:
                pricePerFoot = 80;
        }

        double value =
                (squareFoot * pricePerFoot)
                        + (lotSize * 0.25);
        return BigDecimal.valueOf(value);
    }
}


