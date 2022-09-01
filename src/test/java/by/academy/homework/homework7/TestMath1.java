package by.academy.homework.homework7;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static java.lang.Math.*;

public class TestMath1 extends Assert{
    private int valueA;
    private int valueB;
    private int expected;

    public TestMath1(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }
    @Parameterized.Parameters (name = "{index}: exponentiation {0} and {1} = {2}")
    public static Iterable<Integer[]> dataForTest() {
        return Arrays.asList(
                new Integer[][]{
                        {2, 2, 4},
                        {-2, 3, -8},
                        {2, 4, 16},
                        {-2, 5, -32},
                        {2, 6, 64}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Math.pow(valueA, valueB));
    }
}
