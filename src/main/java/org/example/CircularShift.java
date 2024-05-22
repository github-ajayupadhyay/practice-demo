package org.example;

public class CircularShift {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        int shiftBy = 1; // Specify the number of positions to shift

        // Display the original array
        System.out.println("Original array: ");
        displayArray(array);

        // Perform circular shift
        circularShift(array, shiftBy);

        // Display the array after circular shift
        System.out.println("Array after circular shift by " + shiftBy + " position(s): ");
        displayArray(array);
    }

    // Method to perform circular shift on an array
    private static void circularShift(int[] arr, int shiftBy) {
        int length = arr.length;
        int[] temp = new int[length];

        // Calculate the effective shift using modulo to handle overflow
        int effectiveShift = shiftBy % length;

        for (int i = 0; i < length; i++) {
            int newPosition = (i + effectiveShift) % length;
            temp[newPosition] = arr[i];
        }

        // Copy the elements back to the original array
        System.arraycopy(temp, 0, arr, 0, length);
    }

    // Method to display the elements of an array
    private static void displayArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

