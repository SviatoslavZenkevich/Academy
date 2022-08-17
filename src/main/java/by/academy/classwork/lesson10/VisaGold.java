package by.academy.classwork.lesson10;

import java.util.Objects;

public class VisaGold extends Card{
    protected String color;

    public VisaGold() {
        super();
    }

    public VisaGold(String userName, String iban, double money, String expirationDate, String color) {
        super(userName, iban, money, expirationDate);
        this.color = color;
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
        if (!super.equals(o)) return false;
        VisaGold visaGold = (VisaGold) o;
        return Objects.equals(color, visaGold.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "VisaGold{" +
                "color='" + color + '\'' +
                '}';
    }


    public double cashBack() {
        if (money > 1000) {
            return money*1.05;
        } else
            return money;
    }

}
