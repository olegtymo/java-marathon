package org.example;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void info(){
        System.out.println("Producer: " + this.producer + ", Year: " + this.year + ", " + "Length: " + this.length + ", " + "Weight: " + this.weight + ", " + "Fuel: " + this.fuel + ".");
    }

    @Override
    public String toString() {
        System.out.println("Producer: " + this.producer + ", Year: " + this.year + ", " + "Length: " + this.length + ", " + "Weight: " + this.weight + ", " + "Fuel: " + this.fuel + ".");
        return "";
    }

    public void fillUp(int fuel){
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
