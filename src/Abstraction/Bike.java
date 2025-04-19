package Abstraction;

class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " velosiped ayaqla firladaraq başlayır.");
    }

    @Override
    void stop() {
        System.out.println(brand + " velosiped əl əyləcindən istifadə edərək dayanır.");
    }
}
