package by.academy.homework.homework4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Проверка работы методов из задачи 1
        CustomDate customDate = new CustomDate();
        System.out.println(customDate.getDate());
        System.out.println(customDate.dayOfWeek(customDate.getDate()));
        System.out.println(customDate.countDaysBetweenTwoDates());


    }
}
