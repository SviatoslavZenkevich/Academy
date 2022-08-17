package by.academy.homework.homework2.homework3;

import java.io.Serializable;
import java.util.Objects;
@Producer (country = "Spain", founderFullName = "Torres", startYear = 1870)
public class Wine extends Product implements Serializable {
    int age;
    String color;


    public Wine(String name, double price, double quantity, int age, String color) {
        super(name, price, quantity);
        this.age = age;
        this.color = color;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wine vine = (Wine) o;
        return age == vine.age && Objects.equals(color, vine.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", age=");
        builder.append(age);
        builder.append(", color=");
        builder.append(color);
        builder.append("]");
        return builder.toString();
    }


    @Override
    @Producer(country = "Spain", founderFullName = "Torres", startYear = 1870)
    public double discount() {
        if (age > 0 && age < 10 && color == "white") {
            return 0.85;
        }
        if (age > 0 && age < 10 && color == "red") {
            return 0.9;
        }
        if (age > 10 && color == "white") {
            return 1.2;
        }
        if (age > 10 && color == "red") {
            return 1.15;
        } else
            return 1;
    }
}
