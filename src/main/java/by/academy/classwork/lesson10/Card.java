package by.academy.classwork.lesson10;

import java.util.Objects;

public class Card extends BankAccount {
    protected String expirationDate;

    public Card() {
        super();
    }

    public Card(String userName, String iban, double money, String expirationDate) {
        super(userName, iban, money);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Card card = (Card) o;
        return Objects.equals(expirationDate, card.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expirationDate);
    }

    @Override
    public String toString() {
        return "Card{" +
                "expirationDate='" + expirationDate + '\'' +
                '}';
    }
    public double spendMoney(double cashFlow) {
        return money - cashFlow;
    }

}
