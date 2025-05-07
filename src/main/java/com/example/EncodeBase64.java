package com.example;

public class EncodeBase64 {
    public static void main(String[] args) {
        String originalString = "Hello World!"; // Original string to encode
        String base64String = java.util.Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Base64 encoded string: " + base64String);
    }
}
