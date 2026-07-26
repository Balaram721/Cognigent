package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertArrayEquals;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);
        // Assert true
        assertTrue(5 > 3);
        // Assert false
        assertFalse(5 < 3);
        // Assert null
        assertNull(null);
        // Assert not null
        assertNotNull(new Object());
    }

    @Test
    public void testAssertionsDemoClass() {
        AssertionsDemo demo = new AssertionsDemo();

        // Assert equals with double/int calculation
        assertEquals(10, demo.add(4, 6));

        // Assert true & false
        assertTrue(demo.isEven(4));
        assertFalse(demo.isEven(5));

        // Assert null & not null
        assertNull(demo.getGreeting(null));
        assertNotNull(demo.getGreeting("World"));

        // Assert array equality
        int[] expectedPrimes = {2, 3, 5, 7, 11};
        assertArrayEquals(expectedPrimes, demo.getPrimeNumbers());

        // Assert reference comparison
        String str1 = "JUnit";
        String str2 = str1;
        String str3 = new String("JUnit");
        assertSame(str1, str2);
        assertNotSame(str1, str3);
    }
}
