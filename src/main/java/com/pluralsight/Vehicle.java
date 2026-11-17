package com.pluralsight;
import java.math.BigDecimal;
import java.time.Year;
public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {

        int vehicleAge = Year.now().getValue() - year;
        BigDecimal value = getOriginalCost();

        if (vehicleAge <= 3) {
            value = value.multiply(BigDecimal.valueOf(0.97));
        }

        else if (vehicleAge <= 6) {
            value = value.multiply(BigDecimal.valueOf(0.94));
        }

        else if (vehicleAge <= 10) {
            value = value.multiply(BigDecimal.valueOf(0.92));
        }

        else {
            value = value.subtract(BigDecimal.valueOf(1000));
        }

        if (odometer > 100000 &&
                !makeModel.toLowerCase().contains("honda") &&
                !makeModel.toLowerCase().contains("toyota")) {
            value = value.multiply(BigDecimal.valueOf(.75));
        }

        return value;
    }
}