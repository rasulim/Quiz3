package Interfaces;

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Maşın yolda sürürlür.");
    }
}

