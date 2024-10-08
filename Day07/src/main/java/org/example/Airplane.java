package org.example;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel = 0;

    public static void compareAirplanes(Airplane planeOne, Airplane planeTwo) {
        if (planeOne.getLength() > planeTwo.getLength()) {
            System.out.print("The plane one: ");
            planeOne.info();
            System.out.print(" is longer");
        } else if (planeOne.getLength() < planeTwo.getLength()) {
            System.out.print("The plane two: ");
            planeTwo.info();
            System.out.print(" is longer");
        } else {
            System.out.println("The planes have the same length");
        }
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.print("Producer: " + this.producer + ", Year: " + this.year + ", Length: " + this.length + ", Weight: " + this.weight + ", Fuel: " + this.fuel + ".");
    }

    public int getLength() {
        return length;
    }

    public void fillUp(int fuel) {
        this.fuel = fuel;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
