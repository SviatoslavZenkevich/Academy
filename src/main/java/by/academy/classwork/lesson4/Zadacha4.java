package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {

        int polozhitChisla=0;
        int otrizatChisla=0;
        int nuli=0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Your number " + i + ": ");
            int num = scan.nextInt();

            if (num > 0) {
                polozhitChisla++;
            } else if (num < 0) {
                otrizatChisla++;
            } else
                nuli++;
        }
        System.out.println("Kolichestvo polozhitelnih chisel ravno "+ polozhitChisla);
        System.out.println("Kolichestvo otricatelnih chisel ravno "+ otrizatChisla);
        System.out.println("Kolichestvo nulej ravno "+ nuli);
        scan.close();
        }

    }

