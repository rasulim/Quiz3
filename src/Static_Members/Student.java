package Static_Members;

class Student {
    static int totalStudents = 0;

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}
