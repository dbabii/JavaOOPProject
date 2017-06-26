package Classwork.Lessons1_2.DynamicArray.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Created on 026 26.06.17.
 */
public class DynamicArray {

    private int[] array;
    private int size = 0;
    private  final double growFactor;

    public DynamicArray(int initSize, double growFactor) {
        this.array = new int[initSize];
        this.growFactor = growFactor;
    }

    public void addLast (int elem) {
        if (size == array.length) {
            int newLength = (int)(array.length * growFactor);
            array = Arrays.copyOf(array, newLength);
        }
    }
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            int elem = array[i];
            joiner.add(String.valueOf(elem));
        }
        return joiner.toString();
    }
}
