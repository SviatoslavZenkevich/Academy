package by.academy.homework.homework2;
//Ввести n слов с консоли.
// Найти слово, в котором число различных символов минимально.
// Если таких слов несколько, найти первое из них.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        int letterCount = 128;
        int minWord = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int n = scan.nextInt();
        String[] arr = new String[n];
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your word N " + (i + 1) + ": ");
            arr[i] = scan.nextLine();

        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            StringBuilder shortWord = new StringBuilder(arr[i]);
            for (int j = 0; j < shortWord.length(); j++) {
                for (int k = j + 1; k < shortWord.length(); k++) {
                    if (shortWord.charAt(k) == shortWord.charAt(j)) {
                        shortWord.deleteCharAt(k);
                        k--;
                    }
                }
            }
            if (shortWord.length() < letterCount) {
                minWord = i;
                letterCount = shortWord.length();
            }
        }
        System.out.println(arr[minWord]);


        scan.close();
    }
}

