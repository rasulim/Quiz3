package Polymorphism;

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int hoursWorked, double monthlySalary) {
        super(name, hoursWorked);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
