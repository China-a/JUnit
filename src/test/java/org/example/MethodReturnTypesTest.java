package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodReturnTypesTest {

    @Test
    void stringTxt() {
        assertEquals("String of text", MethodReturnTypes.StringTxt());
    }

    @Test
    void number() {
        assertEquals(5, MethodReturnTypes.Number());
    }

    @Test
    void trueOrFalse() {
        assertEquals(false, MethodReturnTypes.TrueOrFalse());

    }
}