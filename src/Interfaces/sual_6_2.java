package Interfaces;
// -  Movable adlı interfeys yaradın (move() metodu olsun).
// -  Car və Robot sinifləri bu interfeysi implement etsin.
// -  Hər iki obyekt üçün move() metodunu çağırıb nəticəni görsədin.

public class sual_6_2 {
    public static void main(String[] args) {
        Movable myCar = new Car();
        Movable myRobot = new Robot();

        myCar.move();
        myRobot.move();
    }
}


