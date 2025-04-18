package Inheritance;
// -  Vehicle sinfi yaradın (brand və speed sahələri olsun).
// -  displayInfo() metodu markanı və sürəti çap etsin.
// -  Car sinfi Vehicle-dən irs alsın və numberOfDoors əlavə olunsun.
// -  Car obyektləri yaradıb məlumatlarını çap edin.

public class sual_3_1 {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 180, 4);
        Car car2 = new Car("BMW", 220, 2);

        System.out.println("Car 1 Info:");
        car1.displayInfo();

        System.out.println("\nCar 2 Info:");
        car2.displayInfo();
    }
}