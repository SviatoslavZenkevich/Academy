package by.academy.homework.homework4.Task3;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Objects;
//Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
//Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
//
//Содержит методы:
//1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен,
//нам нужно его расширить с помощью Arrays.copyOf)
//2) взятие по индексу get(int i)
//3) взятие последнего элемента getLast()
//4) взятие первого элемента getFirst()
//5) вывод размера массива
//6) вывод индекса последнего заполненого элемента (не путать с размерностью)
//7) удаление элемента по индексу (remove(int i)
//8) удаление элемента по значению (remove(T obj))


public class Task3<T> {
    private T[] array;
    private int size;
    private int index = 0;

    public Task3() {
        super();
        this.array = (T[]) new Object[16];
    }

    public Task3(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
    }

    void grow() {
        int newLength = (int) (array.length == 0 ? 1 : array.length * 1.5);
        T[] newArray = Arrays.copyOf(array, newLength);
        array = newArray;
    }

    public T getElement(int i) {
        return (T) array[i];
    }


    public T getLast() {
        return (T) array[array.length - 1];
    }

    public T getFirst() {
        return (T) array[0];
    }

    public int getSize() {
        return array.length;
    }

    public int getLastElement() {
        int lastElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                lastElement = i - 1;
            }
        }
        return lastElement;
    }

    public void remove(int i) {
        i = i - 1;
        T[] newArray = (T[]) (new Object[array.length - 1]);
        System.arraycopy(array, 0, newArray, 0, i);
        System.arraycopy(array, i + 1, newArray, i, array.length - i - 1);
        array = newArray;
    }

    public void remove(T obj) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (obj == array[i]) {
                index = i;
            }
        }
        T[] newArray = (T[]) (new Object[array.length - 1]);
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;

    }
}


