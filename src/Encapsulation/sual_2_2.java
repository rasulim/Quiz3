package Encapsulation;
//  Bir Employee sinfi yaradın.
// -  name, salary sahələri olsun.
// -  increaseSalary(double percent) metodu maaşı faizlə artırsın.
// -  getSalary() metodu cari maaşı qaytarsın.
// -  Maaş artırıldıqdan sonra yeni dəyəri çap edin.

public class sual_2_2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Rasul", 2000);

        System.out.println(employee1.getName() + " - əvvəlki maaş: " + employee1.getSalary());

        employee1.increaseSalary(10);
        System.out.println(employee1.getName() + " - yeni maaş: " + employee1.getSalary());
    }
}