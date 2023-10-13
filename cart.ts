// Define a Product class to represent products in the store
class Product {
  constructor(public id: number, public name: string, public price: number) {}
}

// Create some sample products
const product1 = new Product(1, "Laptop", 999.99);
const product2 = new Product(2, "Smartphone", 599.99);
const product3 = new Product(3, "Headphones", 79.99);

// Define a ShoppingCart class to manage the shopping cart
class ShoppingCart {
  private items: Product[] = [];

  // Add a product to the shopping cart
  addItem(product: Product): void {
    this.items.push(product);
  }

  // Calculate the total price of items in the cart
  calculateTotal(): number {
    return this.items.reduce((total, product) => total + product.price, 0);
  }

  // List the items in the cart
  listItems(): void {
    console.log("Items in the cart:");
    this.items.forEach((product) => {
      console.log(`${product.name} - $${product.price}`);
    });
  }
}

// Create a shopping cart and add products to it
const cart = new ShoppingCart();
cart.addItem(product1);
cart.addItem(product2);
cart.addItem(product3);

// List the items in the cart and calculate the total price
cart.listItems();
console.log(`Total price: $${cart.calculateTotal().toFixed(2)}`);
