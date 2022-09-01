package by.academy.homework.homework7;

import by.academy.homework.homework7.Task3.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class TestDivision extends Assert {
    private int valueA;
    private int valueB;
    private int expected;

    public TestDivision(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }
    @Parameterized.Parameters (name = "{index}: division {0} and {1} = {2}")
    public static Iterable<Integer[]> dataForTest() {
        return Arrays.asList(
                new Integer[][]{
                        {4, 2, 2},
                        {12, 3, 4},
                        {18, 3, 6},
                        {40, 5, 8},
                        {500, 20, 25}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.division(valueA, valueB));
    }

}
