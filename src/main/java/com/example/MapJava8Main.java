package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapJava8Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        // Create a map where the name is the key and the age is the value
        Map<String, Integer> personMap = personList.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));

        // Print the map
        System.out.println("Person Map: " + personMap);
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
