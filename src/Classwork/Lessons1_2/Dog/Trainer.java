package Classwork.Lessons1_2.Dog;

import java.util.ArrayList;

/**
 * Created on 026 26.06.17.
 */
public class Trainer {
    private String name;
    private final ArrayList<Dog> dogs = new ArrayList<>();

    public Trainer (String name) {
        this.name = name;
    }

    public void trainDog(Dog dog) {
        dogs.add(dog);
    }

    public void giveCommand() {
        for (Dog dog : dogs) {
            dog.bark();
        }
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", dogs=" + dogs +
                '}';
    }
}
