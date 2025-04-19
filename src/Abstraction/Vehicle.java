package Abstraction;

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();
    abstract void stop();

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
