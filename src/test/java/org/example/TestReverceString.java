package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestReverceString {

    @Test
    void reverseString() {
        String input = "make install";
        String expectedOutput = "llatsni ekam";
        assertEquals(expectedOutput, Main.reverseString());
    }
}