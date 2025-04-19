package Abstraction;

abstract class Shape {
    double area;

    abstract void calculateArea();

    void displayInfo() {
        System.out.println("Area: " + area);
    }
}
