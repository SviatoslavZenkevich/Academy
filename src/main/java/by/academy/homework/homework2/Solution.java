package by.academy.homework.homework2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int pairs(int k, int[] arr) {
        int PairCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if ((arr[i] - arr[j]) == k) ;
                PairCount++;
            }
        }
        return PairCount;
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
            System.out.println(arr[i]);
        }
        int result = pairs(k, arr);
        System.out.println(result);
        scanner.close();
    }
}
