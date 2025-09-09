package org.example;

import com.google.gson.Gson;

public final class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Person original = new Person("Blake", "James", 36);

        String json = gson.toJson(original);
        System.out.println("JSON: " + json);

        Person fromJson = gson.fromJson(json, Person.class);

        System.out.println("Are the objects equal? " + original.equals(fromJson));
        System.out.println("Original: " + original);
        System.out.println("From JSON: " + fromJson);
    }
}
