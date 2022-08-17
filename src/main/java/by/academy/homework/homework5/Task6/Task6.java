package by.academy.homework.homework5.Task6;
//Задача 6.
//        Попробовать добавить в массив int на 8 элементов 10 чисел.
//        Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
//        "Array is to small, expand the array".

public class Task6 {
    public static void main(String[] args) {
        double array[] = new double [8];
        try {
            for (int i = 0; i < 10; i++) {
                array[i] = Math.random();
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array is to small, expand the array");
        }
    }
}
