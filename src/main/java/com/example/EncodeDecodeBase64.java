package com.example;

public class EncodeDecodeBase64 {
    public static void main(String[] args) {
        String originalString = "Hello World!"; // Original string to encode
        String base64String = java.util.Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Base64 encoded string: " + base64String);

        // Decoding the Base64 string
        byte[] decodedBytes = java.util.Base64.getDecoder().decode(base64String);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);
    }
}
