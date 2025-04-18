package Inheritance;
// -  Animal sinfi yaradın (name və age sahələri olsun).
// -  makeSound() metodu olsun.
// -  Dog və Cat siniflərini yaradın və makeSound() metodunu fərqli formada ("Hav hav!", "Miyav miyav!") implement edin.
// -  Dog və Cat obyektləri yaradıb səslərini çağırın.


public class sual_3_2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 3);
        Cat cat = new Cat("Mimi", 2);

        dog.makeSound();
        cat.makeSound();
    }
}