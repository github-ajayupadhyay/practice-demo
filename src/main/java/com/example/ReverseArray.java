package com.example;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Reverse the array using IntStream
        int[] reversedArray = reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] array) {
        return Arrays.stream(array)
                .map(i -> array[array.length - i])
                .toArray();
    }
}
