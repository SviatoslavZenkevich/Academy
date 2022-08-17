package by.academy.classwork.lesson5;

import java.util.Locale;

public class StringZadacha1 {

    public static void main(String[] args) {
  

String str = "I like Java!!!";

        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring (str.indexOf("Java"),str.indexOf("Java")+4));

    }
}
