package by.academy.classwork.lesson13;
//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы -
// sum, multiply, divide, subtraction.
// Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.

import com.sun.jdi.DoubleValue;


public class Сalculator {


    public static <T extends Number, V extends Number> Double sum(T x, V y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number, V extends Number> Double multiply(T x, V y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number, V extends Number> Double divide(T x, V y) {
        return x.doubleValue() / y.doubleValue();
    }

    public static <T extends Number, V extends Number> Double subtraction (T x, V y) {
        return x.doubleValue() - y.doubleValue();
    }
}
