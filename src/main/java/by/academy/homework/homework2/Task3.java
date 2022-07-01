package by.academy.homework.homework2;

import java.util.Scanner;
//ввести 2 слова, состоящие из четного числа букв.
// Получить слово состоящее из первой половины первого слова и второй половины второго слова.

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word: ");
        String word1 = scan.nextLine();

        System.out.println("Enter your second word: ");
        String word2 = scan.nextLine();

        String part1 = word1.substring(0, word1.length() / 2);
        String part2 = word2.substring(word1.length() / 2);

        System.out.println("New word: " + part1+part2);
        scan.close();
    }
}
