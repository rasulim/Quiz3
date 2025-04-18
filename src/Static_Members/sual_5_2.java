package Static_Members;
// -  MathUtils adlı sinif yaradın.
// -  static int square(int number) metodu verilsin və kvadratını qaytarsın.
// -  static int cube(int number) metodu verilsin və kubunu qaytarsın.
// -  Fərqli ədədlər üçün kvadrat və kub dəyərlərini çap edin.

public class sual_5_2 {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 4;
        int number3 = 5;

        System.out.println("Square of " + number1 + " is: " + MathUtils.square(number1));
        System.out.println("Cube of " + number1 + " is: " + MathUtils.cube(number1));

        System.out.println("Square of " + number2 + " is: " + MathUtils.square(number2));
        System.out.println("Cube of " + number2 + " is: " + MathUtils.cube(number2));

        System.out.println("Square of " + number3 + " is: " + MathUtils.square(number3));
        System.out.println("Cube of " + number3 + " is: " + MathUtils.cube(number3));
    }
}
