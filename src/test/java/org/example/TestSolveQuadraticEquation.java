package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSolveQuadraticEquation {

    @Test
    void solveQuadraticEquation() {
        String res= Main.solveQuadraticEquation(1,4,5);
        Assertions.assertEquals("There are no roots", res );
    }
}