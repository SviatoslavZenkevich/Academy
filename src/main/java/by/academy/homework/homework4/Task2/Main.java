package by.academy.homework.homework4.Task2;

public class Main {
    public static void main(String[] args) {
        Body body=new Body();
        Body.Heart heart = body.new Heart();
        Body.Lungs lungs = body.new Lungs();
        heart.live();
        lungs.live();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. And I believe that you are free, and life has only begun.");
    }
}
