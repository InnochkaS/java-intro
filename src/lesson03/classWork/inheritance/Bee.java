package lesson03.classWork.inheritance;

public class Bee extends Insect {
    public Bee (int size, String color) {
        super(size, color);
    }

    public void move() {
        outPutFly();
    }

    private void outPutFly() {
        System.out.println("Fly");
    }

//    @Override
//    public void attack() {
//        outPutFly();
//        super.attack();
//    }

    public static void main (String[] args) {
        Bee bee = new Bee (12, "yellow");
        bee.attack();

    }

}
