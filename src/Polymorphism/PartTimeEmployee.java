package Polymorphism;

class PartTimeEmployee extends Employee {
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked);
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
