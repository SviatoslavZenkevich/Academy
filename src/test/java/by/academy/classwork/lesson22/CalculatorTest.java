package by.academy.classwork.lesson22;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        Assert.assertEquals(4.0, Calculator.sum(2, 2));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(4.0, Calculator.multiply(2, 2));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(1.0, Calculator.division(2, 2));
    }

    @Test(timeout = 100)
    public void testTimeout() {
        int i = 0;
        while (i < 999) {
            System.out.println("alalaa");
            i++;
        }

//        @Test (expected = ArithmeticException.class)
//            public void testExcpected() {
//                int i =1/0;
            }
        }

