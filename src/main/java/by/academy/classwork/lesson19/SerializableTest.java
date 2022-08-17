package by.academy.classwork.lesson19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.academy.homework.homework2.homework3.Cheese;
import by.academy.homework.homework2.homework3.Product;
import by.academy.homework.homework2.homework3.Wine;

public class SerializableTest {
    public static void main(String[] args) {

Product p1 = new Cheese("Creamcheese", 11.99, 2, "Belarus", 12);
Product p2 = new Wine("Gewurztraminer", 20.99,99, 12, "white");
//        double price, double quantity, String manufacturer, int fat) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\io\\user.txt"));
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(p1);
            oos.writeObject(p2);


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("src\\io\\user.txt"));
             ObjectInputStream isu = new ObjectInputStream(br)) {
            Product prod1 = (Product) isu.readObject();
            Product prod2 = (Product) isu.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
