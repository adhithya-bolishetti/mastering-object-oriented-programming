import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;

    Product() {
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int type = scanner.nextInt();

        Product product;

        if (type == 1) {
            product = new Product();

        } else if (type == 2) {
            String name = scanner.next();
            double price = scanner.nextDouble();

            product = new Product(name, price);

        } else {
            String name = scanner.next();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();

            product = new Product(name, price, quantity);
        }

        product.display();

        scanner.close();
    }
}