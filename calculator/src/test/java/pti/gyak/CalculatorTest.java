package pti.gyak;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testResult() {
        assertEquals(11.0, (new Calculator()).enter(10).enter(Operation.ADD).enter(1).getResult());
    }

    @Test
    public void testHistory() {
        assertEquals("10 + 1 = 11", (new Calculator()).enter(10).enter(Operation.ADD).enter(1).getHistory());
    }

    @Test
    public void testSubstract() {
        assertEquals(5.0, (new Calculator()).enter(10).enter(Operation.SUBSTRACT).enter(5).getResult());
    }

    @Test
    public void testMultiply() {
        assertEquals(50.0, (new Calculator()).enter(10).enter(Operation.MULTIPLY).enter(5).getResult());
    }

    @Test
    public void testRemainder() {
        assertEquals(2.0, (new Calculator()).enter(11).enter(Operation.REMAINDER).enter(3).getResult());
    }

    @Test
    public void testPower() {
        assertEquals(100.0, (new Calculator()).enter(10).enter(Operation.POWER).enter(2).getResult());
    }

    @Test
    public void testClear() {
        assertEquals(0, (new Calculator()).enter(10).enter(Operation.CLEAR).enter(5).enter(Operation.CLEAR).getResult());
    }
}