//

package by.academy.homework.homework1;

public class Cat {
    int age;
    String nickname;
    double money;
    char initials;
    Boolean isHomeAnimal;

    public void grow() {
        age++;
    }

    public void sleep() {

        System.out.println("Cat sleep");
    }

    public void eat() {
        System.out.println("Cat eat");
    }

    public void walk() {
        System.out.println("Cat walk");
    }

    public Cat() {
    }

    public Cat(String nickname) {
        this.nickname = nickname;

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = nickname.charAt(0);
    }

    public boolean getIsHomeAnimal() {
        return isHomeAnimal;
    }

    public void setIsHomeAnimal(boolean isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }


        public static void main(String[] args) {
            Cat cat1 = new Cat();
            Cat cat2 = new Cat("Barsik");
            cat2.eat();
            cat2.sleep();
            cat2.walk();

            cat1.grow();
            cat1.grow();
            cat1.grow();

            System.out.println(cat1.age);
        }
    }
