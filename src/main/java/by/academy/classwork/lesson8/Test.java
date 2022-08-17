package by.academy.classwork.lesson8;

import static by.academy.classwork.lesson8.Phone.sendMessage;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setModel("Nokia");
        phone1.setNumber("1234567");
        phone1.setWeight(100.25);

        Phone phone2 = new Phone();
        phone2.setModel("Iphone");
        phone2.setNumber("2345678");
        phone2.setWeight(150.44);

        Phone phone3 = new Phone();
        phone3.setModel("Siemens");
        phone3.setNumber("3456789");
        phone3.setWeight(99.99);

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " "+ phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " "+ phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " "+ phone3.getWeight());

        phone1.receiveCall("Victor");
        phone2.receiveCall("Petr");
        phone3.receiveCall("Masha");

        sendMessage (1234, 2345, 6789, 3456);

    }
}
