package Classwork.Lessons1_2.Person.proc;

/**
 * Created on 026 26.06.17.
 */
public class ProcPersonRunner {

    public static void main(String[] args) {
        ProcPerson p = new ProcPerson();
        p.name = "John";
        p.age = 25;

        String message = personInfo(p);
        System.out.println(message);
    }

    private static String personInfo(ProcPerson person) {
        return "Helo, I'm " + person.name + ", " +
                person.age + " years old.";
    }
}
