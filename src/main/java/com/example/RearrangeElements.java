package com.example;

public class RearrangeElements {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1};

        rearrangeArray(arr);

        // Print the rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeArray(int[] arr) {
        int left = 0; // Pointer to track the leftmost index
        int right = arr.length - 1; // Pointer to track the rightmost index

        while (left < right) {
            // Move left pointer until we find a 1
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move right pointer until we find a 0
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // Swap arr[left] and arr[right] if left < right
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
