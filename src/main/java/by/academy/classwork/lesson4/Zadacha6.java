package by.academy.classwork.lesson4;
import java.util.Scanner;
public class Zadacha6 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of years: ");
        int n = scan.nextInt();

        System.out.println("Enter a bank deposit amount: ");
        double summavclada= scan.nextDouble();

        for (int i = 1; i < n; i++) {
            summavclada = summavclada+ summavclada*13/100;
        }
        System.out.println("Summa vklada cherez " +n + " let ravna: " + summavclada);
        scan.close();
    }
}
