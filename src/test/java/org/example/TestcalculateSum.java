package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestcalculateSum {

    @Test
    void calculateSum() {
        double expectedSum = 0.6101121094474383;
        double actualSum = Main.calculateSum();
        assertEquals(expectedSum, Main.calculateSum());
    }
}