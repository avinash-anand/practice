package edu.example.algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * simple linear search for unordered array of integer.
 * returns index of array(starting at 0 index) where found, else return -1
 * later can be generalised for any type
 */
public class LinearSearchSimple {

    public static void main(String[] args) {
        var array = new int[]{5, 2, 4, 6, 1, 3};
        System.out.println("array to search - " + Arrays.toString(array));
        var numberToSearch = randomIntForSearch();
        int index = linearSearch(array, numberToSearch);
        if (index != -1) {
            System.out.println(numberToSearch + " found at index " + index);
        } else {
            System.out.println(numberToSearch + " not found in array");
        }
    }

    private static int randomIntForSearch() {
        return new Random().nextInt(10);
    }

    private static int linearSearch(int[] array, int numberToSearch) {
        var index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                index = i;
                break;
            }
        }
        return index;
    }

}
