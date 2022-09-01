package by.academy.homework.homework7.Task1;

import java.util.List;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {



        Stream<Long> longs = (Stream<Long>) Stream.generate(() -> new Random().nextLong(100))
                .limit(100)
                .map((x) -> x * Math.PI - 20)
                .filter(x -> x < 100)
                .sorted()
                .skip(3)
                .collect(Collectors.toMap(x->x, y -> "Number " + y, (s, a) -> s + ", " + a));

        System.out.println("Map:" + longs);
    }
}
