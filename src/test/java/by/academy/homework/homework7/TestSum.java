package by.academy.homework.homework7;
import by.academy.homework.homework7.Task3.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class TestSum extends Assert{
    private int valueA;
    private int valueB;
    private int expected;

    public TestSum(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }
    @Parameterized.Parameters (name = "{index}: sum {0} and {1} = {2}")
    public static Iterable<Integer[]> dataForTest() {
        return Arrays.asList(
                new Integer[][]{
                        {4, 2, 6},
                        {4, 3, 7},
                        {6, 3, 9},
                        {8, 5, 13},
                        {25, 20, 45}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.sum(valueA, valueB));
    }

}

