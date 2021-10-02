package edu.example.algorithms;

import java.util.Arrays;
import java.util.Random;

/***
 * trying out simple insertion sort on integer array in ascending/descending order.
 * later this can be made generic
 */
public class InsertionSortSimple {

    public static void main(String[] args) {
        var sortAsc = shouldSortAsc();
        System.out.println("shouldSortAsc = " + sortAsc);
        var array = new int[]{5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(array));
        if (sortAsc) {
            sortAsc(array);
        } else {
            sortDesc(array);
        }
        System.out.println(Arrays.toString(array));
    }

    private static boolean shouldSortAsc() {
        //if even, then asc, else desc
        return new Random().nextInt(2) % 2 == 0;
    }

    //assumption that array size is more than 1 :)
    private static void sortAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            var currentNumber = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentNumber) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentNumber;
        }
    }

    private static void sortDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            var current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

}
