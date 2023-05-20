package org.example.bar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {

    @Test
    void get() {
        int i = Bar.get();
        assertEquals(2, i);
    }
}