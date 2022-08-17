package by.academy.homework.homework2.homework3;

import java.util.Objects;

public class Meat extends Product {

    String sort;
    double weight;

    public Meat(String name, double price, double quantity, String sort, double weight) {
        super(name, price, quantity);
        this.sort = sort;
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Meat meat = (Meat) o;
        return Double.compare(meat.weight, weight) == 0 && Objects.equals(sort, meat.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sort, weight);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", sort=");
        builder.append(sort);
        builder.append(", weight=");
        builder.append(weight);
        builder.append("]");
        return builder.toString();
    }


    @Override
    public double discount() {
        if (weight > 1000 && sort == "Ribeye") {
            return 0.95;
        }
        if (weight > 1000 && sort == "NewYorkStrip") {
            return 0.9;
        }
        if (weight > 1000 && sort == "T-bone") {
            return 0.85;
        } else
            return 1;
    }
}

