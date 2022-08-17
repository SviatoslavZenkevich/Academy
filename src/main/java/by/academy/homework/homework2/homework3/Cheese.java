package by.academy.homework.homework2.homework3;

import java.io.Serializable;
import java.util.Objects;

public class Cheese extends Product implements Serializable {
    String manufacturer;
    int fat;

    public Cheese(String name, double price, double quantity, String manufacturer, int fat) {
        super(name, price, quantity);
        this.manufacturer = manufacturer;
        this.fat = fat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cheese сheese = (Cheese) o;
        return Objects.equals(manufacturer, сheese.manufacturer) && Objects.equals(fat, сheese.fat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, fat);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", manufacturer=");
        builder.append(manufacturer);
        builder.append(", fat=");
        builder.append(fat);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public double discount() {
        if (fat > 2 && fat < 35 && manufacturer == "Belarus") {
            return 0.8;
        }
        if (fat > 2 && fat < 35 && manufacturer == "Poland") {
            return 0.9;
        }
        if (fat > 35 && manufacturer == "France") {
            return 1.2;
        }
        if (fat > 35 && manufacturer == "Poland") {
            return 1.1;
        } else
            return 1;
    }
}
