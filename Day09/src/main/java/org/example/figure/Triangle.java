package org.example.figure;

public class Triangle extends Figure {

    private double lengthSideOne;
    private double lengthSideTwo;
    private double lengthSideThree;

    public Triangle(String color, double lengthSideOne, double lengthSideTwo, double lengthSideThree) {
        super(color);
        this.lengthSideOne = lengthSideOne;
        this.lengthSideTwo = lengthSideTwo;
        this.lengthSideThree = lengthSideThree;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - lengthSideOne) * (halfPerimeter - lengthSideTwo) * (halfPerimeter - lengthSideThree));
    }

    @Override
    public double perimeter() {
        return lengthSideOne + lengthSideTwo + lengthSideThree;
    }
}
