package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testAddNumbers() {
        assertEquals(14021, Main.addNumbers(13910, 111));
        assertEquals(15, Main.addNumbers(10, 5));
        assertEquals(-10, Main.addNumbers(-3, -7));
        assertEquals(15, Main.addNumbers(20, -5));
        assertEquals(5, Main.addNumbers(0, 5));
    }
}
