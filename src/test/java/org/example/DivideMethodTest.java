package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {

    @Test
    void divide() {
        Integer num1 = 10;
        Integer num2 = 5;
        Integer expected = 2;
        assertEquals(expected, DivideMethod.divide(num1,num2));
    }
}