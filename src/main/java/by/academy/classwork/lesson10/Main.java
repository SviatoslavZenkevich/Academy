package by.academy.classwork.lesson10;

public class Main {
    public static void main(String[] args) {

        VisaGold v1= new VisaGold("Ad", "USER123456789", 1200, "12/24", "yellow");

        System.out.println(v1.spendMoney(15));
        System.out.println("Deneg na karte: "+ v1.cashBack());
    }
}
