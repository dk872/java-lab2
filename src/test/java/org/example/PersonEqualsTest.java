package org.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonEqualsTest {

    @Test
    public void testEquals() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    void nullLastNameBecomesEmptyString() {
        Person p = new Person(null, "Annabel", 30);
        assertEquals("", p.getLastName());
    }

    @Test
    void nullFirstNameBecomesEmptyString() {
        Person p = new Person("Witherspoon", null, 30);
        assertEquals("", p.getFirstName());
    }

    @Test
    void negativeAgeBecomesZero() {
        Person p = new Person("Barrymore", "Ernest", -15);
        assertEquals(0, p.getAge());
    }

    @Test
    void validValuesStayUnchanged() {
        Person p = new Person("Harrison", "John", 48);
        assertEquals("Harrison", p.getLastName());
        assertEquals("John", p.getFirstName());
        assertEquals(48, p.getAge());
    }
}
