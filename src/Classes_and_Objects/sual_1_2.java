package Classes_and_Objects;
// Bir Book sinfi yaradın. Sahələri:
// -  title, author, year
// -  displayDetails() metodu kitabın adını, müəllifini və ilini çap etməlidir.
// -  Bir neçə Book obyekti yaradıb məlumatlarını çap edin.

public class sual_1_2 {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Ali", 1995);
        Book book2 = new Book("C+", "Azer", 2020);
        Book book3 = new Book("Delphi", "Ramal", 2025);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
