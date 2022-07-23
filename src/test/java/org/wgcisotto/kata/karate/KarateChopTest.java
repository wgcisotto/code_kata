package org.wgcisotto.kata.karate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.wgcisotto.kata.karate.KarateChop.chop;

class KarateChopTest {

    @Test
    void chopTest() {
        assertEquals(-1, chop(3, new int[]{}));
        assertEquals(-1, chop(3, new int[] {1}));
        assertEquals(0,  chop(1, new int[] {1}));

        assertEquals(0,  chop(1, new int[] {1, 3, 5}));
        assertEquals(1,  chop(3, new int[] {1, 3, 5}));
        assertEquals(2,  chop(5, new int[] {1, 3, 5}));
        assertEquals(-1, chop(0, new int[] {1, 3, 5}));
        assertEquals(-1, chop(2, new int[] {1, 3, 5}));
        assertEquals(-1, chop(4, new int[] {1, 3, 5}));
        assertEquals(-1, chop(6, new int[] {1, 3, 5}));
  
        assertEquals(0,  chop(1, new int[] {1, 3, 5, 7}));
        assertEquals(1,  chop(3, new int[] {1, 3, 5, 7}));
        assertEquals(2,  chop(5, new int[] {1, 3, 5, 7}));
        assertEquals(3,  chop(7, new int[] {1, 3, 5, 7}));
        assertEquals(-1, chop(0, new int[] {1, 3, 5, 7}));
        assertEquals(-1, chop(2, new int[] {1, 3, 5, 7}));
        assertEquals(-1, chop(4, new int[] {1, 3, 5, 7}));
        assertEquals(-1, chop(6, new int[] {1, 3, 5, 7}));
        assertEquals(-1, chop(8, new int[] {1, 3, 5, 7}));
    }
}