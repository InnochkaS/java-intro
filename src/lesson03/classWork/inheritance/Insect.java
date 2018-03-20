package lesson03.classWork.inheritance;

public class Insect {
    int size;
    String color;

    public Insect (int size, String color){
        this.size = size;
        this.color = color;
    }

    public void move () {
        System.out.println("Move");
    }

    public void attack () {
        move ();
        System.out.println("Attack");
    }


}
