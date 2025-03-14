package Encapsulation;
//  Bir Student sinfi yaradın.
// -  name və grade sahələri olsun.
// -  setGrade(int grade) metodu ilə qiyməti təyin edin (yalnız 0-100 aralığında qəbul etsin).
// -  getGrade() metodu ilə qiyməti qaytarsın.
// -  Yanlış qiymət daxil edilərsə, "Yanlış qiymət!" mesajı verilsin.

public class sual_2_1 {
    public static void main(String[] args) {
        Student student1 = new Student("Rasul");

        student1.setGrade(95);
        System.out.println(student1.getName() + " qiyməti: " + student1.getGrade());

        student1.setGrade(94);
        System.out.println(student1.getName() + " qiyməti: " + student1.getGrade());
    }
}