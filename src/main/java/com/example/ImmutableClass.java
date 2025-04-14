package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final List<String> colors; // Example of mutable object

    // Constructor to initialize immutable fields
    public ImmutableClass(int id, String name, List<String> colors) {
        this.id = id;
        this.name = name;
        this.colors = new ArrayList<>(colors); // Perform deep copy to ensure immutability
    }

    // Getter methods for immutable fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Return an unmodifiable view of the colors list to maintain immutability
    public List<String> getColors() {
        return Collections.unmodifiableList(colors);
    }
}

