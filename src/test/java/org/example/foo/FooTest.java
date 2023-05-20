package org.example.foo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void get() {
        int i = Foo.get();
        assertEquals(1, i);
    }
}