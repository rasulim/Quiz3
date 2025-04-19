package Abstraction;

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " maşın açarla başlayır.");
    }

    @Override
    void stop() {
        System.out.println(brand + " maşın əyləclə dayanır.");
    }
}