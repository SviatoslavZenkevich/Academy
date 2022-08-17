package by.academy.classwork.lesson17;

import java.util.*;

public class TaskSet {
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c", "d");
        List<String> list2 = List.of("d", "e", "f", "c");


        HashSet<String> union = new HashSet<>(list1);
        union.addAll(list2);

        for (String s: union) {
            System.out.println(s);
        }

        HashSet<String> intersect = new HashSet<>(list1);
        intersect.retainAll(list2);

        for (String s: intersect) {
            System.out.println(s);
        }

    }
}


