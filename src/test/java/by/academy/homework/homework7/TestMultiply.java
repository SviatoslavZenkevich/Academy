package by.academy.homework.homework7;

import by.academy.homework.homework7.Task3.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class TestMultiply extends Assert{
    private int valueA;
    private int valueB;
    private int expected;

    public TestMultiply(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }
        @Parameterized.Parameters (name = "{index}: multiply {0} and {1} = {2}")
        public static Iterable<Integer[]> dataForTest() {
            return Arrays.asList(
                    new Integer[][]{
                            {4, 2, 8},
                            {4, 3, 12},
                            {6, 3, 18},
                            {8, 5, 40},
                            {25, 20, 500}});
        }

        @Test
        public void paramTest() {
            assertEquals(expected, Calculator.multiply(valueA, valueB));
        }
}
