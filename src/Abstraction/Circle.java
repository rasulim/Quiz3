package Abstraction;

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

