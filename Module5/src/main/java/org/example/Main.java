package org.example;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.setColor("Red");
        tesla.setModel("Model X");
        tesla.setManufacturedYear(2015);
        System.out.println("Tesla:" + " " + tesla.getModel() + " " + tesla.getManufacturedYear() + " " + tesla.getColor() );

        Motorbike BMW = new Motorbike(2020,"Green", "HT-1");
        System.out.println("BMW:" + " " + BMW.getModel() + " " + BMW.getManufacturedYear() + " " + BMW.getColor() );

    }
}
