import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product item : items) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

public class ShopBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("Available Products:");
            System.out.println("1. Product 1 - $10.00");
            System.out.println("2. Product 2 - $20.00");
            System.out.println("3. Product 3 - $30.00");
            System.out.println("4. Checkout");
            System.out.print("Enter the product number (1-4): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                Product product = null;
                switch (choice) {
                    case 1:
                        product = new Product("Product 1", 10.00);
                        break;
                    case 2:
                        product = new Product("Product 2", 20.00);
                        break;
                    case 3:
                        product = new Product("Product 3", 30.00);
                        break;
                }
                cart.addItem(product);
                System.out.println(product.getName() + " added to the cart.");
            } else if (choice == 4) {
                cart.displayCart();
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}
