package by.academy.classwork.lesson6;
//Дана строка “Versions:Java 5,Java 6,Java 7,Java 8,Java 12.”
//        Найти все подстроки"Java <X>"и распечатать их.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {
    public static void main(String[] args) {
       test("Versions:Java 5,Java 6,Java 7,Java 8,Java 12.");
    }

    public static void test(String testString) {
        Pattern pattern = Pattern.compile("Java\\s\\d+");
        Matcher matcher = pattern.matcher(testString);

        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }
}