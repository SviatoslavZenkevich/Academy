package by.academy.homework.homework5.Task5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    //  Задача 5. Можно писать все в main. Не нужно создавать новых классов.
//		Имеется текст. Следует составить для него частотный словарь:
//		Создать Map<Character, Integer> для символов,
//   в который мы заносим символ и его количество.
    public static void main(String[] args) {


    Map<Character, Integer> charDictionary = new HashMap<>();
    String text = "Contains classes related to developing beans -- components based on the JavaBeans™ architecture. A few of the classes are used by beans while they run in an application. For example, the event classes are used by beans that fire property and vetoable change events";

    char[] textToArray = text.toCharArray();

		for (char c : textToArray) {
        int count = 1;
        if (charDictionary.get(c) != null) {
            count = charDictionary.get(c) + 1;
        }
        charDictionary.put(c, count);
    }
        System.out.println(charDictionary);
        }
}

