package pti.gyak;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {

    @Test
    public void testBalAg() {
        Simple simple = new Simple();
        assertEquals(354, simple.func(354, 400, 300));
    }

    @Test
    public void testJobbAg() {
        Simple simple = new Simple();
        assertEquals(-698, simple.func(698, 500, 300));
    }

    @Test
    public void testDefault() {
        Simple simple = new Simple();
        assertEquals(200, simple.func(111, 500, 200));
    }
}