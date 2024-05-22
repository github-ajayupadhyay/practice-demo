package org.example;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);
    }

    // Method to print Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        // Print the first two terms
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

