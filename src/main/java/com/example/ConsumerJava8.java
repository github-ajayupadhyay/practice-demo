package com.example;

import java.util.function.Consumer;

public class ConsumerJava8 {
    public static void main(String[] args){
    Consumer<String> str = str1 -> System.out.println(str1);
    str.accept("Saket");
    /* We have used accept() method to get the value of the String Object */
    }
}
