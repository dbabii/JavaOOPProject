package Classwork.Lessons1_2.Person.oop;

/**
 * Created on 026 26.06.17.
 */
public class Person {

    private final String name; //field
    private final int age;

    public Person(String name, int age){
        checkAge (age);

        this.name = name;
        this.age = age;
    }

    private boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }

    private void checkAge(int age) {
        if (!isAge(age)){
            throw new IllegalArgumentException("Wrong age: " + age);
        }
    }

    public Person (String name){
        this.name = name;
        this.age = 0;
    }

    public Person() {
        this("Unnamed");
    }

    public String say() {
        if (age == 0) {
            return "Hellp, I'm " + name;
        }
        return "Hello, I'm " + name + ", " +
                age + " years old.";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
