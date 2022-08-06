package by.academy.homework.homework4.Task2;

public class Body {

    public Body (){
        super();
    }

    public class Heart {

        public Heart () {

        }

        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (i % 100 == 0) {
                    System.out.println(i);
                    System.out.println("Knock-knock-knocking on heaven's door.");
                }
            }
        }
    }

    public class Lungs {

        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (i % 50 == 0 && i % 100 != 0) {
                    System.out.println(i);
                    System.out.println("Breathe in");
                }
                if (i % 100 == 0) {
                    System.out.println(i);
                    System.out.println("Breathe out");
                }
            }
        }
    }


}
