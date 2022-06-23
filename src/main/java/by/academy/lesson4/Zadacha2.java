package by.academy.lesson4;

import java.util.Scanner;

public class Zadacha2 {

        public static void main(String[] args) {

            int sum = 1;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number of integers: ");
            int n = scan.nextInt();
            scan.close();

            for (int i = 1; i < n; i++) {
                sum = sum + i;
            }
            System.out.println("Summa chisel ot 1 do " + n + "=" + sum);
        }
    }

