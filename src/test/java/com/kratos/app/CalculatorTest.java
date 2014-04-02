package com.kratos.app;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by FakeYou on 2-4-14.
 */
public class CalculatorTest extends TestCase {
    @Test
    public void testAdd() {
        assertEquals(Calculator.add(10, 5), 15.0);
    }

    @Test
    public void testSubtract() {
        assertEquals(Calculator.subtract(10, 5), 5.0);
    }

    @Test
    public void testMultiply() {
        assertEquals(Calculator.multiply(10, 5), 50.0);
    }

    @Test
    public void testDivide() {
        assertEquals(Calculator.divide(10, 5), 2.0);
    }
}
