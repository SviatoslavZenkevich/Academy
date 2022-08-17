package by.academy.homework.homework2.homework3;

import java.io.Serializable;
import java.util.Objects;

public abstract class Product implements Serializable {
    protected transient double price;
    protected String name;
    protected double quantity;
    protected boolean isTax;


    public Product() {
        super();
    }

    protected Product(String name,  double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean getIsTax() {
        return isTax;
    }

    public void setIsTax(boolean isTax) {
        this.isTax = isTax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.quantity, quantity) == 0 && isTax == product.isTax && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, quantity, isTax);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Product [name=");
        builder.append(name);
        builder.append(", price=");
        builder.append(price);
        builder.append(", quantity=");
        builder.append(quantity);
        builder.append("]");
        return builder.toString();
    }
    protected abstract double discount();

    public double calcPrice() {
                return price * quantity * discount();
    }

}
