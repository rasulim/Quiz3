package Polymorphism;

abstract class Employee {
    String name;
    int hoursWorked;

    Employee(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    abstract double calculateSalary();
}

