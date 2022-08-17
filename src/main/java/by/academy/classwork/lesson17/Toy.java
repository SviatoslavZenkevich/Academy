package by.academy.classwork.lesson17;

import java.util.Objects;

//Создайте HashMap, содержащий пары значений  -
//        имя игрушки и объект игрушки (класс Toy).
//        Перебрать и распечатать пары значений - entrySet().
//        Перебрать и распечатать набор из имен продуктов  - keySet().
//        Перебрать и распечатать значения продуктов - values().
//        Для каждого перебора создать свой метод.
public class Toy {
    String name;
    double weight;
    String color;
    public Toy () {
        super();
    }

    public Toy (String name, double weight, String color) {
        this.name=name;
        this.weight=weight;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Toy{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Double.compare(toy.weight, weight) == 0 && Objects.equals(name, toy.name) && Objects.equals(color, toy.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, color);
    }
}
