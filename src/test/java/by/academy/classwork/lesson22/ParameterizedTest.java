package by.academy.classwork.lesson22;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedTest extends Assert {
    private int valueA;
    private int valueB;
    private int expected;

    public ParameterizedTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters (name = "{index}: division {0} and {1} = {2}")
    public static Iterable<Integer[]> dataForTest() {
        return Arrays.asList(
                new Integer[][]{
                        {3, 1, 3},
                        {4, 2, 2},
                        {6, 3, 2},
                        {8, 4, 2},
                        {25, 5, 5}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.division(valueA, valueB));
    }

}
