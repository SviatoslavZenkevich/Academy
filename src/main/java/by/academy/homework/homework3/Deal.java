package by.academy.homework.homework3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;


public class Deal {
    private LocalDateTime buyTime;
    private User seller;
    private User buyer;
    private int index = 0;
    Product[] products;
    //                Решение задачи № 7
    private LocalDate deadlineDate = LocalDate.now().plusDays(10);

    public Deal(User seller, User buyer, Product[] products) {
        super();
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.index = products.length;
    }

    private void grow() {
        int newLenght = (int) (products.length == 0 ? 1 : products.length * 1.5);
        Product[] newProducts = new Product[newLenght];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        products = newProducts;
    }

    public void addProduct(Product product) {
        if (index == products.length) {
            grow();
        }
        products[index++] = product;
    }

    public int getProductIndex(String deletingPoduct) {
        for (int i = 0; i < products.length; i++) {
            if (deletingPoduct.equals(products[i].name)) {
                return i;
            }

        }
        return -1;
    }

    public void removeProduct(int index) {
        int newLenght = (int) (products.length == 0 ? 1 : products.length - 1);
        Product[] newProducts = new Product[newLenght];
        System.arraycopy(products, 0, newProducts, 0, index);
        System.arraycopy(products, index + 1, newProducts, index, products.length - index - 1);
        products = newProducts;
    }


    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Deal deal = (Deal) o;
//        return Objects.equals(buyTime, deal.buyTime) && Objects.equals(seller, deal.seller) && Objects.equals(buyer, deal.buyer) && Arrays.equals(products, deal.products);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(buyTime, seller, buyer);
//        result = 31 * result + Arrays.hashCode(products);
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Deal [seller=");
//        builder.append(seller);
//        builder.append(", buyer=");
//        builder.append(buyer);
//        builder.append(", products=");
//        builder.append(Arrays.toString(products));
//        builder.append("]");
//        return builder.toString();
//    }


    public double fullPrice() {
        double result = 0;
        for (Product c : products) {
            result += c.calcPrice();
        }
        return result;
    }


    public void billPrint() {

        if (buyer.getMoney() < fullPrice()) {
            System.out.println("You don't have enough money");
        } else {

            for (int i = 0; i < products.length; i++) {
                            System.out.println(products[i].getName() + ": " + products[i].getQuantity() + " x " + products[i].getPrice() + "$ x discount " + products[i].discount() + " = " + products[i].calcPrice());
            }
            System.out.println("=============================");
            System.out.println("Full price: " + fullPrice() + "$");
            System.out.println("Buyer: " + buyer.getName() + ", money: " + buyer.getMoney());
            System.out.println(LocalDateTime.now());
        }
    }


}



