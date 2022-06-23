package by.academy.homework1;
// Zenkevich Sviatoslav
// group 111-22

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 10: ");
        short a = scan.nextShort();
        System.out.println("Tablica umnozhenija na " + a +":");
        short k = 1;
        while (k < 11) {
            System.out.println(a + "x" + k + "=" + (a * k));
            k++;
        }

    }
}
