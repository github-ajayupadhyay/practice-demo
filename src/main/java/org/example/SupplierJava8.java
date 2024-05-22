package org.example;

import java.util.function.Supplier;

public class SupplierJava8 {
    public static void main(String[] args) {
        Supplier<String> str = () -> "Saket";
        System.out.println(str.get());
        /* We have used get() method to retrieve the value of String object str. */
    }
}
