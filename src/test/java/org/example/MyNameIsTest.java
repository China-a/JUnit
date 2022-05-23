package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNameIsTest {

    @Test
    void myNameIs() {
        assertEquals("My name is", MyNameIs.myNameIs());
    }
}