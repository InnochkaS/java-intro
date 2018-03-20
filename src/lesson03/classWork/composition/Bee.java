package lesson03.classWork.composition;

public class Bee extends Insect implements Attack {
    private Attack attack;

    public Bee (int size, String color, Attack attack) {
        super(size, color);
        this.attack = attack;
    }


    public void move () {
        attack.move();
           }

    public void attack() {
        attack.attack();
    }

    public static void main(String[] args) {

        Bee bee1 = new Bee(12, "red", new AttackImpl("fly1", "sting") ) ;

        AttackImpl impl1 = new AttackImpl("run1", "eat"); //class object was created
        Bee bee2 = new Bee( 10, "yellow", impl1);

        bee1.attack(); //move includeed in  attack
        bee2.move();
        bee2.attack();
    }
}
