package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @Test
    void sum() {
        Double num1 = 3.0;
        Double num2 = 3.0;
        Double num3 = 6.0;
        Double expected = 12.0;
        assertEquals(expected, AverageMethod.Sum(num1,num2,num3));
//        System.out.println(AverageMethod.Sum(num1,num2,num3));
    }

    @Test
    void average() {
        Double num1 = 3.0;
        Double num2 = 3.0;
        Double num3 = 6.0;
        Double expected = 4.0;
        assertEquals(expected, AverageMethod.Average(num1,num2,num3));
        System.out.println(AverageMethod.Average(num1,num2,num3));
    }
}