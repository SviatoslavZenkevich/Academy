package by.academy.classwork.lesson5;

import java.util.Arrays;

public class StringTask1 {
    public static void main(String[] args) {
        String s = "Для работы со строками в языке Java используются классы String, StringBuilder, StringBuffer";
        int i = 1;


        int array[] = new int[s.length()];


        while (i < s.length());{

            array[0] = s.indexOf('S');
            array[i] = s.indexOf('S', array[0] + 1);
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
