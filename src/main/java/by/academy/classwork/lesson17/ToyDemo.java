package by.academy.classwork.lesson17;

import java.util.HashMap;
import java.util.Map;
//Создайте HashMap, содержащий пары значений  -
//        имя игрушки и объект игрушки (класс Toy).
//        Перебрать и распечатать пары значений - entrySet().
//        Перебрать и распечатать набор из имен продуктов  - keySet().
//        Перебрать и распечатать значения продуктов - values().
//        Для каждого перебора создать свой метод.
public class ToyDemo {
    public static void main(String[] args) {
        HashMap<String, Toy> toys = new HashMap<>();

        Toy toy1 = new Toy("Lego", 100, "red");
        Toy toy2 = new Toy("Barbi", 200, "black");
        Toy toy3 = new Toy("Car", 300, "orange");

        toys.put("Lego", toy1);
       toys.put("Barbi", toy2);
        toys.put("Car", toy3);
        
printKeyAndValue(toys);
printKey(toys);
printValue(toys);

    }
    public static void printKeyAndValue(Map<String, Toy> toys) {
        for (String key : toys.keySet()) {
            System.out.println(key);

        }
    }
    public static void printValue(Map<String, Toy> toys) {
        for (Toy value : toys.values()) {
            System.out.println(value);
        }
    }

    public static void printKey(Map<String, Toy> toys) {
        for (HashMap.Entry<String, Toy> e : toys.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
