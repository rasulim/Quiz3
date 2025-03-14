package Encapsulation;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percent) {
        if (percent > 0) {
            this.salary += this.salary * (percent / 100);
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }
}
