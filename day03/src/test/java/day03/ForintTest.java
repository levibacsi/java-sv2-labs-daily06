package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForintTest {

    @Test
    void rounder() {
        Forint forint = new Forint();
        assertEquals(10, forint.rounder(10));
        assertEquals(10, forint.rounder(11));
        assertEquals(10, forint.rounder(12));
        assertEquals(15, forint.rounder(13));
        assertEquals(15, forint.rounder(14));
        assertEquals(15, forint.rounder(15));
        assertEquals(15, forint.rounder(16));
        assertEquals(15, forint.rounder(17));
        assertEquals(20, forint.rounder(18));
        assertEquals(20, forint.rounder(19));
    }
}