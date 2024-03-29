package by.academy.homework.homework7.Task2;
//a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    protected int age;
    public String dateOfBirth;

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, int age, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.age=age;
        this.dateOfBirth=dateOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
