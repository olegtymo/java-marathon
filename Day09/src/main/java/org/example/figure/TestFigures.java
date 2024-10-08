package org.example.figure;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        System.out.println(
                calculateRedPerimeter(figures)
        );
        System.out.println(
                calculateRedArea(figures)
        );
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double res = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equalsIgnoreCase("red")) {
                res += figure.perimeter();
            }
        }
        return res;
    }

    public static double calculateRedArea(Figure[] figures) {
        double res = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equalsIgnoreCase("red")) {
                res += figure.area();
            }
        }
        return res;
    }
}
