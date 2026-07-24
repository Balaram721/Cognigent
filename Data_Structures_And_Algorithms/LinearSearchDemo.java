public class LinearSearchDemo {

    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(108, "Phone", "Electronics"),
                new Product(101, "Watch", "Accessories"),
                new Product(110, "Bag", "Fashion")
        };

        System.out.println("Available Products");
        System.out.println("------------------------------");
        System.out.println("ID\tName\t\tCategory");

        for (Product p : products) {
            p.display();
        }

        int searchId = 108;

        System.out.println("\nSearching for Product ID: " + searchId);

        Product result = linearSearch(products, searchId);

        if (result != null) {
            System.out.println("\nProduct Found:");
            result.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}