package org.example;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    }

    // Public static method to provide access to the single instance of the class
    public static Singleton getInstance() {
        // Lazy initialization: Create the instance if it hasn't been created yet
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Methods of the singleton class can be defined here
}

