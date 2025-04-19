package Abstraction;
// Bir Shape abstrakt sinfi yaradın. Bu sinifdə:
// -  calculateArea() adında abstrakt metod olsun.
// -  displayInfo() metodu olsun, bu metod sahəni çap etsin.

// Bu sinifdən Circle və Rectangle siniflərini törədin və calculateArea() metodunu override edin.
// Tələb: Circle və Rectangle obyektləri yaradıb onların sahəsini hesablayan və çap edən bir main metodu yazın.

public class sual_7_2 {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        circle.calculateArea();
        System.out.print("Circle ");
        circle.displayInfo();

        Shape rectangle = new Rectangle(4, 6);
        rectangle.calculateArea();
        System.out.print("Rectangle ");
        rectangle.displayInfo();
    }
}