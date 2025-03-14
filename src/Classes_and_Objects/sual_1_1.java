package Classes_and_Objects;
// Bir Person sinfi yaradın. Aşağıdakı xüsusiyyətləri olsun:
// -  name və age sahələri
// -  Konstruktor ilə bu dəyərləri təyin edin
// -  introduce() metodu ilə "Salam, mənim adım [name] və mən [age] yaşındayam" çap edilsin.
// -  introduce() metodunu çağıraraq nəticəni test edin.

public class sual_1_1 {
    public static void main(String[] args) {
        Person person = new Person("Rasul", 33);
        person.introduce();
    }
}