package by.academy.homework.homework7.Task2;
//Вывести с помощью рефлексии все поля и методы, сначала через
//        getMethod("name")
//        getMethods()
//        getField("name")
//        getFields()
//        а затем через
//        getDeclaredMethod("name")
//        getDeclaredMethods()
//        getDeclaredField("name")
//        getDeclaredFields()
//        Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field).
//Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {

        Person person = new Person();
        User user = new User("Petr", "Ivanov", 23, "12-12-1985", "PetjaIvanov", "Pi1987", "Pi1987@gmail.com");
        Class<Person> personClass = Person.class;
        Class<User> userClass = User.class;
        //        getMethod("name")
        Method method = userClass.getMethod("getEmail");

        //        getMethods()
        Method[] methods = userClass.getMethods();
        for (Method m1 : methods) {
            System.out.println(m1);
        }
        System.out.println();

        //        getField("name")
        Field field = userClass.getField("email");

        //        getFields()
        Field[] fields = userClass.getFields();
        for (Field f1 : fields) {
            System.out.println(f1);
        }
        System.out.println();

        //        getDeclaredMethod("name")
        Method declaredMethod = userClass.getDeclaredMethod("getLogin");

        //        getDeclaredMethods()
        Method[] declaredMethods = userClass.getDeclaredMethods();
        for (Method m2 : declaredMethods) {
            System.out.println(m2);
        }
        System.out.println();

        //        getDeclaredField("name")
        Field field1 = userClass.getDeclaredField("login");

        //        getDeclaredFields()
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field f2 : declaredFields) {
            System.out.println(f2);
        }
        System.out.println();
//        Просетать все значения через Reflection. (set метод класса Field).
//        Вывести значения полей через Reflection. (get метод класса Field).
        try {
            Field firstNameField = personClass.getDeclaredField("firstName");
            firstNameField.setAccessible(true);
            firstNameField.set(user, "Zaur");
            System.out.println(firstNameField.get(user));

            Field lastNameField = personClass.getDeclaredField("lastName");
            lastNameField.setAccessible(true);
            lastNameField.set(user, "Petrov");
            System.out.println(lastNameField.get(user));

            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(user, 45);
            System.out.println(ageField.get(user));

            Field dateOfBirthField = userClass.getField("dateOfBirth");
            dateOfBirthField.setAccessible(true);
            dateOfBirthField.set(user, "12-12-1987");
            System.out.println(dateOfBirthField.get(user));

            Field loginField = userClass.getDeclaredField("login");
            loginField.setAccessible(true);
            loginField.set(user, "PIvan");
            System.out.println(loginField.get(user));

            Field passwordField = userClass.getDeclaredField("password");
            passwordField.setAccessible(true);
            passwordField.set(user, "Piiiiii1987");
            System.out.println(passwordField.get(user));

            Field emailField = userClass.getDeclaredField("email");
            emailField.setAccessible(true);
            emailField.set(user, "PiIv87@gmail.com");
            System.out.println(emailField.get(user));


        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();

            // Вызвать toString через invoke.
            try {
                Method methodPrintUserInfo = userClass.getMethod("toString");
                methodPrintUserInfo.setAccessible(true);
              methodPrintUserInfo.invoke(user);


            } catch (InvocationTargetException ex) {
                throw new RuntimeException(ex);
            } catch (IllegalAccessException ex) {
                throw new RuntimeException(ex);
            }

        }
    }
}
