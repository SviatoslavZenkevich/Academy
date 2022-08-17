package by.academy.classwork.lesson6;

public class Task1 {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("ADC");
        sb.setCharAt(0, 'B');
        System.out.println(sb);
        sb.append("D");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(1, 2, "!!!");
        System.out.println(sb);
        sb.insert(1, "???");
        System.out.println(sb);
        sb.delete(1,4);
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);

        String s= sb.toString();

    }
}
