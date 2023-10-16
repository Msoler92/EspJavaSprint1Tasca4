package org.example.n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class YearTest {
    @Test
    void monthListIsSize12() {
        Year newYear = new Year();
        assertEquals(12, newYear.getMonthList().size());
    }

    @Test
    void monthListNotNull() {
        Year newYear = new Year();
        assertNotNull(newYear.getMonthList());
    }

    @Test
    void eightMonthInMonthListIsAugust() {
        Year newYear = new Year();
        assertEquals("August", newYear.getMonthList().get(7));
    }

}
