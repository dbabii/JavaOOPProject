package Classwork.Lessons1_2.DynamicArray.oop;

import java.util.Scanner;

/**
 * Created on 026 26.06.17.
 */
public class oopDynamicArrayEx {

    public static void main(String[] args) {
        DynamicArray elems = readClientElems();
        System.out.println(elems.toString());
        System.out.println("Bye");
    }

    private static DynamicArray readClientElems() {
        Scanner scanner = new Scanner(System.in);

        DynamicArray elems = new DynamicArray(30, 1.5);

        int n = readElem(scanner);
        while (n != 0) {
            elems.addLast(n);

            n = readElem(scanner);
        }
        return elems;
    }

    private static int readElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.nextInt(); //idle

            System.out.println("Illegal elem");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
