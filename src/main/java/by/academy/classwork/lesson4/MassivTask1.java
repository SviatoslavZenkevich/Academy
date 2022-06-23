package by.academy.classwork.lesson4;

import java.util.Arrays;
import java.util.Random;

public class MassivTask1 {
    public static void main(String[] args) {
        int values[] = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(values));
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }
}
