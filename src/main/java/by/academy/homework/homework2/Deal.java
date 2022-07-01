package by.academy.homework.homework2;

import java.util.Scanner;

public class Deal {


    public static void main(String[] args) {
        int cardsForPlayer = 5;
        int players;

        String[] suits = {"Bubej", "Pik", "4ervej", "tref"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dama", "Korol", "Tuz"};
        int allCards = suits.length * rank.length;
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter number of Players: ");
        players = scan.nextInt();

        if (players <= 0) {
            System.out.println("Igrokov slishkom malo");
        } else if (cardsForPlayer * players >= allCards) {
            System.out.println("Igrokov slishkom mnogo");
        }
        String[] deck = new String[allCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        for (int i = 0; i < allCards; i++) {
                int shuffling = i + (int) (Math.random() * (allCards - i));
            String str = deck[shuffling];
            deck[shuffling] = deck[i];
            deck[i]= str;
        }
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);
                if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
        scan.close();
    }

}