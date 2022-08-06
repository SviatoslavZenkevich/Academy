package by.academy.homework.homework4.Task4;

import java.util.Iterator;

public class CustomArrayIterator <T> implements Iterator<T> {
    private T[] array;
    private int index;
    public CustomArrayIterator() {
        super();
    }
    public CustomArrayIterator(T[] array) {
        this.array=array;
    }

    @Override
    public boolean hasNext() {
        if (array == null || array.length <= index) {
            return false;
        }
        return array[index] != null;
    }

    @Override
    public T next() {
        return array[index++];
    }

}
