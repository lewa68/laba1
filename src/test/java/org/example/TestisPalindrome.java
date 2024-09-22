package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestisPalindrome {

    @Test
    void isPalindrome() {
        String input="racecar";
        boolean expected=true;
        boolean res=Main.isPalindrome(input);
        assertEquals(true, res);
    }
}