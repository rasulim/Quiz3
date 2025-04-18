package Static_Members;
// -  Student sinfi yaradın.
// -  totalStudents adlı statik dəyişən olsun.
// -  Hər dəfə yeni tələbə yaradıldıqda totalStudents bir vahid artsın.
// -  Neçə tələbə yaradıldığını çap edin.

public class sual_5_1 {

    public static void main(String[] args) {

        Student student1 = new Student("Ramal", 30);
        Student student2 = new Student("Rana", 28);
        Student student3 = new Student("Haydar", 25);

        Student.displayTotalStudents();
    }
}
