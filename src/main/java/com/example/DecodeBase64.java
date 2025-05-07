package com.example;

public class DecodeBase64 {
    public static void main(String[] args) {
        String base64String = "SGVsbG8gV29ybGQh"; // Base64 encoded string
        byte[] decodedBytes = java.util.Base64.getDecoder().decode(base64String);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);
    }
}
