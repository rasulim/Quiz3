package İnheritance;
// -  Vehicle sinfi yaradın (brand və speed sahələri olsun).
// -  displayInfo() metodu markanı və sürəti çap etsin.
// -  Car sinfi Vehicle-dən irs alsın və numberOfDoors əlavə olunsun.
// -  Car obyektləri yaradıb məlumatlarını çap edin.

public class sual_3_1 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Juquli", 120);
        vehicle1.displayInfo();

        Car car1 = new Car("BMW", 150, 4);
        car1.displayInfo();
    }
}