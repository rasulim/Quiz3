package Polymorphism;
// -  Shape abstrakt sinfi yaradın.
// -  calculateArea() metodunu abstrakt olaraq təyin edin.
// -  Circle və Rectangle siniflərini yaradıb, calculateArea() metodunu fərqli formada implement edin.
// -  Circle və Rectangle obyektləri yaradıb sahələrini hesablayın.

public class sual_4_1 {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
