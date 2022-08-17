package by.academy.classwork.lesson10;

import java.util.Objects;

public class BankAccount {
    protected String iban;
    protected String userName;

    protected double money;
//    public Product() {
//        super();
//    }

    //    protected Product(String name, double price, double quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
    public BankAccount() {
        super();
    }

    protected BankAccount(String userName, String iban, double money) {
        this.userName = userName;
        this.iban = iban;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.money, money) == 0 && Objects.equals(iban, that.iban) && Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, userName, money);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "iban='" + iban + '\'' +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }

}
