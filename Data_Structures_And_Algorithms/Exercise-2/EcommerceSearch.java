import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    // Linear Search
    static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id)
                return p;
        }
        return null;
    }

    // Binary Search
    static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];
            else if (products[mid].productId < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(110, "Phone", "Electronics"),
                new Product(103, "Watch", "Accessories"),
                new Product(108, "Bag", "Fashion")
        };

        // Linear Search
        Product result1 = linearSearch(products, 103);

        if (result1 != null)
            System.out.println("Linear Search Found: " + result1.productName);
        else
            System.out.println("Product not found");

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary Search
        Product result2 = binarySearch(products, 103);

        if (result2 != null)
            System.out.println("Binary Search Found: " + result2.productName);
        else
            System.out.println("Product not found");
    }
}