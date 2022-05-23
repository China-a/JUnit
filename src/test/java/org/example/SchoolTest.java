package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {


    @Test
    void getTotalMoneyEarned() {
        assertEquals(25000, School.getTotalMoneyEarned());
    }


    @Test
    void getTotalMoneySpent() {

        assertEquals(155, School.getTotalMoneySpent());

    }


}