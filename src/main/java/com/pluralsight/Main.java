package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(
                new House(
                        "My House",
                        "11/24/2021",
                        new BigDecimal("362000"),
                        "2951 Chester Grove Rd",
                        1,
                        2100,
                        2800));

        assets.add(
                new House(
                        "Pocono Retreat",
                        "12/20/20235",
                        new BigDecimal("352000"),
                        "7269 Long Pine Dr",
                        2,
                        2400,
                        8700));

        assets.add(
                new Vehicle(
                        "Kevin's Car",
                        "05/04/2024",
                        new BigDecimal("8000"),
                        "Hyundai Sonata",
                        2017,
                        80000));

        assets.add(
                new Vehicle(
                        "Family Car",
                        "11/01/2026",
                        new BigDecimal("39000"),
                        "Volkswagen Atlas",
                        2025,
                        17000));

        for (Asset asset : assets) {

            System.out.println("-------------------------------");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());
        }
    }
}