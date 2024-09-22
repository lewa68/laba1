package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestFizzBuzz {

    @Test
    void fizzBuzz() {
        int n = 4;
        List<String> sequence = Main.fizzBuzz();
        List<String> expected = new  ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        assertEquals(expected, sequence);

        n = 5;
        expected.add("fizz");
        assertEquals(expected, Main.fizzBuzz());
    }

    @Test
    void sequenceNegativeSize() {
        int n = -2;
        List<String> sequence = Main.fizzBuzz();

        assertNull(sequence);
    }
}