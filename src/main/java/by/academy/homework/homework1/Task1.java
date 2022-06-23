package by.academy.homework.homework1;
// Zenkevich Sviatoslav
// group 111-22

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Double cenaSoSkidcoj;
        Scanner pokupatel = new Scanner(System.in);
        System.out.println("Enter your purchase amount: ");
        Double summaPokupki = pokupatel.nextDouble();

        System.out.println("Enter your age: ");
        int vozrast = pokupatel.nextInt();


        if (summaPokupki < 100) {
            cenaSoSkidcoj = (summaPokupki - summaPokupki * 5 / 100);
        } else if (summaPokupki >= 100 && summaPokupki < 200) {
            cenaSoSkidcoj = (summaPokupki - summaPokupki * 7 / 100);
        } else if (summaPokupki >= 200 && summaPokupki < 300) {
            if (vozrast > 18)
                cenaSoSkidcoj = (summaPokupki - summaPokupki * (12 + 4) / 100);
            else
                cenaSoSkidcoj = (summaPokupki - summaPokupki * (12 - 3) / 100);
        } else if (summaPokupki >= 300 && summaPokupki < 400) {
            cenaSoSkidcoj = (summaPokupki - summaPokupki * 15 / 100);

        } else {

            cenaSoSkidcoj = (summaPokupki - summaPokupki * 20 / 100);
        }
        System.out.println("Your final price: " + cenaSoSkidcoj);
        pokupatel.close();
          }
}