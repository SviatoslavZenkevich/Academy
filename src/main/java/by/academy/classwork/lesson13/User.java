package by.academy.classwork.lesson13;
//Создать класс User, содержащий private переменные login, password.
// Создать внутренний класс Query в классе User.
// Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение о том что пользователь
// с таким то логином и паролем отправил запрос.
// Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
// В методе main(): создать экземпляр класса User и вызвать метод createQuery();
// создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
// создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();

public class User {
    private String login;
    private String password;

    //    Task1
    public void createQuery() {
        Query query1 = new Query();
        query1.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.println("User with the same username and password sent a request");
        }
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.createQuery();

        user1.new Query().printToLog();
        new User().new Query().printToLog();

    }
}

    //    Task2
//    public void createQuery() {
//
//        class Query {
//            public void printToLog() {
//                System.out.println("User with the same username and password sent a request");
//            }
//        }
//        Query query1 = new Query();
//        query1.printToLog();
//    }
//
//
//
//    public static void main(String[] args) {
//        User user1 = new User();
//        user1.createQuery();
//
//        user1.new Query().printToLog();
//        new User().new Query().printToLog();
//    }
//}


