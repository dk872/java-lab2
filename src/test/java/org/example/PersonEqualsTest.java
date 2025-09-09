package org.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonEqualsTest {

    @Test
    public void testEquals() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    void nullLastNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person(null, "Annabel", 30);
        });
    }

    @Test
    void nullFirstNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person("Witherspoon", null, 30);
        });
    }

    @Test
    void emptyLastNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person("   ", "Annabel", 30);
        });
    }

    @Test
    void emptyFirstNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person("Witherspoon", "   ", 30);
        });
    }

    @Test
    void negativeAgeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person("Barrymore", "Ernest", -15);
        });
    }
}
