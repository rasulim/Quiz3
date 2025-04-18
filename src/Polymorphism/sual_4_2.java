package Polymorphism;
// -  Employee sinfi yaradın və calculateSalary() metodu olsun.
// -  FullTimeEmployee və PartTimeEmployee siniflərini yaradıb calculateSalary() metodunu fərqli formada implement edin.
// -  Hər iki tip işçi üçün maaşı hesablayıb çap edin.

public class sual_4_2 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Rasul", 175, 3000.00);
        System.out.println(fullTimeEmployee.name + "'un Əmək haqqı: " + fullTimeEmployee.calculateSalary());

        Employee partTimeEmployee = new PartTimeEmployee("Rasul", 100, 15.00);
        System.out.println(partTimeEmployee.name + "'un Əmək haqqı: " + partTimeEmployee.calculateSalary());
    }
}
