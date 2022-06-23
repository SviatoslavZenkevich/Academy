package by.academy.lesson4;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {

        int proizvedenieChisel = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i < n; i++) {
            proizvedenieChisel = proizvedenieChisel * i;

        }
        System.out.println("Proizvedenie chisel ot 1 do " + n + "=" + proizvedenieChisel);
    }
}
