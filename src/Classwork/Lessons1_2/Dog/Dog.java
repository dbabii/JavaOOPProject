package Classwork.Lessons1_2.Dog;

/**
 * Created on 024 24.06.17.
 */
public class Dog {

    private final String name;
    private final String ownerName;

    public Dog (String name, String ownerName){
        this.name = name;
        this.ownerName = ownerName;
    }

    public Dog (String name){
        this(name, "street");
    }

    public void bark() {
        System.out.println("Gav, " + name);
    }

    public void bark (int count){
        for (int i = 0; i < count; i++) {
            bark();
        }
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
