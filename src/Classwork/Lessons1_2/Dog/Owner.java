package Classwork.Lessons1_2.Dog;

/**
 * Created on 024 24.06.17.
 */
public class Owner {

    private final String name;
    private final Dog dog;

    public Owner (String name, Dog dog){
        this.name = name;
        this.dog = dog;
    }

    public void giveCommand (){
        dog.bark(10);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
