package org.example;

public class Motorbike {
    private int manufacturedYear;
    private String color;
    private String model;

    public Motorbike(int manufacturedYear, String color, String model) {
        this.manufacturedYear = manufacturedYear;
        this.color = color;
        this.model = model;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
