package com.example;

import java.util.function.Predicate;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "radar";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Use a Predicate to check if the string is a palindrome
        Predicate<String> predicate = s -> new StringBuilder(s).reverse().toString().equals(s);

        return predicate.test(cleanStr);
    }
}
