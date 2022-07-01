package by.academy.homework.homework2;
//Ввести две строки с консоли.
// Определить, является ли одна строка перестановкой символов другой строки.
// Учитываем регистр. Не использовать сортировку :)

import java.util.Scanner;

public class Task1 {

    static int sum1;
    static int sum2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word N 1: ");
        String word1 = scan.nextLine();
        System.out.println("Enter your word N 2: ");
        String word2 = scan.nextLine();

        if (word1.length() != word2.length()) {
            System.out.println("Slova ne ravni");
        } else {
            int[] symbols = new int[128];
            char[] array = word1.toCharArray();
            ;


            for (char c : array) {
                symbols[c]++;
            }


            for (int i = 0; i < word2.length(); i++) {
                int c = (int) word2.charAt(i);

                if (--symbols[c] < 0) {
                    System.out.println("Slova ne ravni");

                }
                System.out.println("Slova ravni");
                break;
            }

        }
        scan.close();

    }

}