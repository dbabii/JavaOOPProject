package Classwork.Lessons1_2.DynamicArray.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 026 26.06.17.
 */
public class ProcDynamicArray {

    public static void main(String[] args) {
        int[] elems = readClientElems();
        System.out.println(Arrays.toString(elems));
        System.out.println("Bye");
    }

    private static int[] readClientElems() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[3];
        int size = 0;

        int n = readElem(scanner);
        while (n != 0){
            if (size == elems.length) {
                elems = Arrays.copyOf(elems, elems.length*2);
            }
            elems[size] = n;
            size++;

            n = readElem(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    private static int readElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next();

            System.out.println("Wrong elem");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }

    private static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length+1);
        newElems[newElems.length - 1] = n;
        return newElems;
    }
}
