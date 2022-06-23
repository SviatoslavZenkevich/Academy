package by.academy.homework1;
// Zenkevich Sviatoslav
// group 111-22
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the type of variable: ");
        String type = scan.nextLine();


        switch (type) {
            case "int":
                System.out.println("Enter the value of the variable: ");
                int var = scan.nextInt();
                System.out.println("Ostatok ot delenija na 2 raven: " + var % 2);
                break;
            case "double":
                System.out.println("Enter the value of the variable: ");
                double var1 = scan.nextDouble();
                System.out.println("70% ot chisla ravno: " + var1 * 70 / 100);
                break;
            case "float":
                System.out.println("Enter the value of the variable: ");
                float var2 = scan.nextFloat();
                System.out.println("Kvadrat chisla raven: " + var2 * var2);
                break;
            case "char":
                System.out.println("Enter the value of the variable: ");
                char var3 = scan.next().charAt(0);
                System.out.println("Kod simvola: " + (int)var3);
                break;
            case "String":
                System.out.println("Enter the value of the variable: ");
                String var4 = scan.nextLine();
                System.out.println("Hello " + var4);
                break;
            default:
                System.out.println("Unsupported type");
        }
        scan.close();

    }
}
