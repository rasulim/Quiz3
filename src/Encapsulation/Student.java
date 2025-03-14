package Encapsulation;

public class Student {
    private String name;
    private int grade;

    public Student(String name) {
        this.name = name;
        this.grade = -1;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Yanlış qiymət!");
        }
    }

    public int getGrade() {
        return this.grade;
    }

    public String getName() {
        return this.name;
    }
}
