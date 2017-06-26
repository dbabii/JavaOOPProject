package Classwork.Lessons1_2.Person.oop;

/**
 * Created on 026 26.06.17.
 */
public class oopPersonRunner {

    public static void main(String[] args) {
        Person bob = new Person("Bob", 25);

        String message = bob.say();
        System.out.println(message);
    }
}
