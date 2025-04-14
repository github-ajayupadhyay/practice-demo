package com.example;

public class SplitSecondHalfArray {
    public static void main(String args[]){
        int [] array = {1,2,3,4,5,6,7,8,9};
        int midpoint = array.length/2;
        System.out.println("Elements of the second half of the array:");
        for (int i = midpoint; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Elements of the first half of the array:");
        for (int i = 0; i < midpoint; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
