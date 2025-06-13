package org.example.app_jax_rs.model;

public class Car {

    private int id;
    private String brand;
    private int yearManufacture;
    private String color;

    public Car() {
    }

    public Car(int id, String brand, int yearManufacture, String color) {
        this.id = id;
        this.brand = brand;
        this.yearManufacture = yearManufacture;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
