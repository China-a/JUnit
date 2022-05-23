package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationTest {

    @Test
    void vacation() {
        assertEquals("Hi, I'd like to visit Tokyo Japan", Vacation.vacation("I'd like to visit ", "Tokyo", " Japan"));
    }
}
