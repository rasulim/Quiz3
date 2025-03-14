package İnheritance;
// -  Animal sinfi yaradın (name və age sahələri olsun).
// -  makeSound() metodu olsun.
// -  Dog və Cat siniflərini yaradın və makeSound() metodunu fərqli formada ("Hav hav!", "Miyav miyav!") implement edin.
// -  Dog və Cat obyektləri yaradıb səslərini çağırın.


public class sual_3_2 {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex", 3);
        dog.makeSound();

        Animal cat = new Cat("Mia", 2);
        cat.makeSound();
    }
}