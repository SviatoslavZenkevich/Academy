package by.academy.classwork.lesson8.homework3;

import java.text.ParseException;
import java.util.*;
import java.util.Calendar;

public class Application {
    public int numberOfProducts;

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateCheck date = new DateCheck();
        Calendar calendar = Calendar.getInstance();
        BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
        EmailValidator emailValidator = new EmailValidator();

        User seller = new User();
        User buyer = new User();

//        System.out.println("Enter seller's name: ");
//        String sellerName = sc.nextLine();
//        seller.setName(sellerName);
//
//        System.out.println("Enter seller's money: ");
//        double sellerMoney = sc.nextDouble();
//        sc.nextLine();
//        seller.setMoney(sellerMoney);
//
//        while (true) {
//            System.out.println("Enter seller's date of birth (dd/MM/yyyy or dd-MM-yyyy): ");
//            String sellerDateOfBirth = sc.nextLine();
//            if (date.dateCheck1(sellerDateOfBirth)) {
//                seller.setDateOfBirth(sellerDateOfBirth);
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                Date date1 = simpleDateFormat.parse(sellerDateOfBirth);
//                calendar.setTime(date1);
//                System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
//                System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
//                System.out.println("Year: " + calendar.get(Calendar.YEAR));
//                break;
////           Во втором варианте применил альтернативное решение, которое мне больше нравится и использует LocalDate из новой Java
////                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
////                LocalDate date2 = LocalDate.parse(sellerDateOfBirth, dateFormatter);
////                System.out.println("Day: " + date2.get(ChronoField.DAY_OF_MONTH));
////                System.out.println("Month: " + date2.get(ChronoField.MONTH_OF_YEAR));
////                System.out.println("Year: " + date2.get(ChronoField.YEAR));
////                break;
//            } else if (date.dateCheck2(sellerDateOfBirth)) {
//                seller.setDateOfBirth(sellerDateOfBirth);
//                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//                LocalDate date2 = LocalDate.parse(sellerDateOfBirth, dateFormatter);
//                System.out.println("Day: " + date2.get(ChronoField.DAY_OF_MONTH));
//                System.out.println("Month: " + date2.get(ChronoField.MONTH_OF_YEAR));
//                System.out.println("Year: " + date2.get(ChronoField.YEAR));
//                break;
//            } else {
//                System.out.println("You have entered the date in the wrong format. Please try again.");
//            }
//        }
//        while (true) {
//            System.out.println("Enter seller's email: ");
//            String sellerEmail = sc.nextLine();
//            //                Решение задачи № 9
//            if (emailValidator.validate(sellerEmail)) {
//                seller.setEmail(sellerEmail);
//                break;
//            } else {
//                System.out.println("You have entered wrong email. Please try again.");
//            }
//        }
//
//
//        while (true) {
//            System.out.println("Enter seller's phone number:");
//            String sellerPhoneNumber = sc.nextLine();
//            //                Решение задачи № 9
//            if (belarusPhoneValidator.validate(sellerPhoneNumber)) {
//                seller.setPhone(sellerPhoneNumber);
//                break;
//            } else {
//                System.out.println("You have entered wrong phone number. Please try again.");
//            }
//        }
//
//        System.out.println("Enter buyer's name: ");
//        String buyerName = sc.nextLine();
//        buyer.setName(buyerName);
//        sc.nextLine();
//
//
//        System.out.println("Enter buyer's money: ");
//        double buyerMoney = sc.nextDouble();
//        buyer.setMoney(buyerMoney);
//        sc.nextLine();
//
//        while (true) {
//            System.out.println("Enter buyer's date of birth (dd/MM/yyyy or dd-MM-yyyy): ");
//            String buyerDateOfBirth = sc.nextLine();
//            //                Решение задачи № 8
//            if (date.dateCheck1(buyerDateOfBirth)) {
//                buyer.setDateOfBirth(buyerDateOfBirth);
//                //                Решение задачи № 4
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                Date date1 = simpleDateFormat.parse(buyerDateOfBirth);
//                calendar.setTime(date1);
//                System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
//                System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
//                System.out.println("Year: " + calendar.get(Calendar.YEAR));
//                break;
////           Во втором варианте применил альтернативное решение, которое мне больше нравится и использует LocalDate из новой Java
//
//            } else if (date.dateCheck2(buyerDateOfBirth)) {
//                buyer.setDateOfBirth(buyerDateOfBirth);
//                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//                LocalDate date2 = LocalDate.parse(buyerDateOfBirth, dateFormatter);
//                System.out.println("Day: " + date2.get(ChronoField.DAY_OF_MONTH));
//                System.out.println("Month: " + date2.get(ChronoField.MONTH_OF_YEAR));
//                System.out.println("Year: " + date2.get(ChronoField.YEAR));
//                break;
//            } else {
//                System.out.println("You have entered the date in the wrong format. Please try again.");
//            }
//        }
//        while (true) {
//            System.out.println("Enter buyer's email: ");
//            String buyerEmail = sc.nextLine();
//            if (emailValidator.validate(buyerEmail)) {
//                buyer.setEmail(buyerEmail);
//                break;
//            } else {
//                System.out.println("You have entered wrong email. Please try again.");
//            }
//        }
//
//
//        while (true) {
//            System.out.println("Enter buyer's phone number:");
//            String buyerPhoneNumber = sc.nextLine();
//            if (belarusPhoneValidator.validate(buyerPhoneNumber)) {
//                seller.setPhone(buyerPhoneNumber);
//                break;
//            } else {
//                System.out.println("You have entered wrong phone number. Please try again.");
//            }
//        }


        int numberOfAllProducts = 4;
        Product[] storage = new Product[numberOfAllProducts];


        storage[0] = new Meat("Steak1", 20.99, 5, "Ribeye", 500);
        storage[1] = new Meat("Steak2", 15.99, 10, "NewYorkStrip", 1100);
        storage[2] = new Wine("Chardonnay", 31.99, 9, 9, "red");
        storage[3] = new Cheese("DorBlue", 39.99, 4, "France", 36);


        System.out.println("In our store you may buy: ");
        for (int i = 0; i < storage.length; i++) {
            System.out.println("Product N" + (i + 1) + " : " + storage[i]);
        }
        System.out.println("Enter the number of products you want to buy");
        int numberOfProducts = sc.nextInt();
        int basket[] = new int[numberOfProducts];
        Product[] products = new Product[numberOfProducts];

        System.out.println("To add products to your basket, select a product by its number");
        for (int k = 0; k < numberOfProducts; k++) {
            System.out.println("Enter product number " + (k + 1) + ":");
            basket[k] = sc.nextInt();
            while (basket[k] > storage.length) {
                System.out.println("There are no products with this number. Enter the number again.");
                System.out.println("Enter product number " + (k + 1) + ":");
                basket[k] = sc.nextInt();
            }
            continue;
        }
        for (int j = 0; j < basket.length; j++) {

            if (basket[j] == 1) {
                products[j] = storage[0];
                System.out.println("Enter the quantity of product number " + (j + 1) + ":");
                int productQuantity = sc.nextInt();
                products[j].quantity = productQuantity;


            } else if (basket[j] == 2) {
                products[j] = storage[1];
                System.out.println("Enter the quantity of product number " + (j + 1) + ":");
                int productQuantity = sc.nextInt();
                products[j].quantity = productQuantity;


            } else if ((basket[j] == 3)) {
                products[j] = storage[2];
                System.out.println("Enter the quantity of product number " + (j + 1) + ":");
                int productQuantity = sc.nextInt();
                products[j].quantity = productQuantity;


            } else {
                products[j] = storage[3];
                System.out.println("Enter the quantity of product number " + (j + 1) + ":");
                int productQuantity = sc.nextInt();
                products[j].quantity = productQuantity;
            }
        }
        System.out.println("You have the following products in your basket:");
        System.out.println(Arrays.toString(products));

        Deal deal = new Deal(seller, buyer, products);

            System.out.println("If you want to add a product to the basket, enter 1");
            System.out.println("If you want to to remove a product from the basket, enter 2");
            int i = sc.nextInt();
            sc.nextLine();

            switch (i) {
                case 1:

                    System.out.println("Enter the name of the product you wish to add:");
                    String prod1 = sc.nextLine();
                    System.out.print("Enter the quantity of product you wish to add:");
                    int prod1Quantity = sc.nextInt();

                    if (prod1.equals("Steak1")) {
                        Product product1 = new Meat("Steak1", 20.99, prod1Quantity, "Ribeye", 500);
                        deal.addProduct(product1);
                        break;
                    } else if (prod1.equals("Steak2")) {
                        Product product1 = new Meat("Steak2", 15.99, prod1Quantity, "NewYorkStrip", 1100);
                        deal.addProduct(product1);
                        break;
                    } else if (prod1.equals("Wine")) {
                        Product product1 = new Wine("Chardonnay", 31.99, prod1Quantity, 9, "red");
                        deal.addProduct(product1);
                        break;
                    } else if (prod1.equals("Cheese")) {
                        Product product1 = new Cheese("DorBlue", 39.99, prod1Quantity, "France", 36);
                        deal.addProduct(product1);
                        break;
                    } else {
                        System.out.println("There are no products with this name. Enter the name again.");
                    }
                case 2:
                    System.out.println("Enter the name of the product want to delete:");
                    String prod2 = sc.nextLine();
                    int index = deal.getProductIndex(prod2);
                    System.out.println(index);
                    deal.removeProduct(index);
                    break;

                    default:
                    System.out.println("You entered the wrong command.");
                        break;
            }



            seller.setMoney(seller.getMoney() + deal.fullPrice());
            buyer.setMoney(buyer.getMoney() - deal.fullPrice());

            deal.billPrint();
        }
    }



