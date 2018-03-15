package lesson2;

public class Person {

    String firstName;
    String secondName;
    int age;
    private static int count = 1;

    Person (String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName  = secondName;
        this.age = age;
        ++count;
    }

    void DoSomething ()

    {
        String end = "is doing smth.";

        System.out.println(firstName + " " + secondName + end);
    }

    static {
        System.out.println("First class loading.");
    }
    {
            System.out.println(count + "class loading.");
    }


    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", 10);
        Person person2 = new Person("Peter", "Petrov", 20);
        Person person3 = new Person("Peter", "Petrov", 20);

        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));


    }

    @Override
    public boolean equals(Object person1) {
        if (this == person1) return true;
        if (person1 == null || getClass() != person1.getClass()) return false;

        Person person2 = (Person) person1;

        if (age != person2.age) return false;
        if (!firstName.equals(person2.firstName)) return false;
        return secondName.equals(person2.secondName);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + age;
        return result;
    }
}

