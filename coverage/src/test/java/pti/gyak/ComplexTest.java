package pti.gyak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexTest {

    @Test
    public void testBalAg() {
        Complex complex = new Complex();
        assertEquals(354, complex.func(354, 400, 300));
    }

    @Test
    public void testJobAlg() {
        Complex complex = new Complex();
        assertEquals(-698, complex.func(698, 400, 300));
    }

    @Test
    public void testMinB() {
        Complex complex = new Complex();
        assertEquals(123, complex.func(111, 123, 456));
    }

    @Test
    public void testMinC() {
        Complex complex = new Complex();
        assertEquals(123, complex.func(111, 456, 123));
    }
}