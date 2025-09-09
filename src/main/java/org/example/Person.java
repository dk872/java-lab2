package org.example;

import java.util.Objects;

public final class Person {
    private final String lastName;
    private final String firstName;
    private final int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = (lastName == null) ? "" : lastName;
        this.firstName = (firstName == null) ? "" : firstName;
        this.age = Math.max(age, 0);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person other = (Person) obj;

        return age == other.age &&
                Objects.equals(lastName, other.lastName) &&
                Objects.equals(firstName, other.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, age);
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", " + age;
    }
}
