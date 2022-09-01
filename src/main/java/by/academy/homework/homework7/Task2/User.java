package by.academy.homework.homework7.Task2;
//b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
//c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User.

import java.time.LocalDate;
import java.util.Objects;

public class User extends Person {
    private String login;
    protected String password;
    public String email;

    public User() {
        super();
    }

    public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password, String email) {
        super();
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, email);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

   private void printUserInfo() {
        System.out.println("[ " + getFirstName() + ", " + getLastName()
                + ", " + getAge() + ", " + getDateOfBirth()
                + ", " + getLogin() + ", " + getEmail() + ", " +
                password.replaceAll(password, "*".repeat(password.length())) + " ]");
    }
}
