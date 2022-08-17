package by.academy.classwork.lesson8;
//1. Класс Phone.
//a) Создайте класс Phone, который содержит переменные number, model и weight.
//б) Создайте три экземпляра этого класса.
//в) Выведите на консоль значения их переменных.
//г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//ж) Добавить конструктор без параметров.
//з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
//и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//к) Создать метод sendMessageс аргументами переменнойx длины(varargs). Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
//л) Изменить класс Phone в соответствии с концепцией JavaBean.


import java.util.Objects;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        super();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.weight, weight) == 0 && Objects.equals(number, phone.number) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling" + " " + name + " " + getNumber());
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, String number, double weight) {
        this();
        this.weight = weight;
    }

    public void receiveCall(String name, String num) {
        System.out.println("Calling" + " " + name + " " + num);
    }

    static void sendMessage(int... array) {
        for (int a : array) {
            System.out.print(a + " ");
            System.out.println();
        }
    }

}

