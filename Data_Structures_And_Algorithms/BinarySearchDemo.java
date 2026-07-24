public class BinarySearchDemo {

    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            } else if (products[mid].productId < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Watch", "Accessories"),
                new Product(102, "Shoes", "Fashion"),
                new Product(105, "Laptop", "Electronics"),
                new Product(108, "Phone", "Electronics"),
                new Product(110, "Bag", "Fashion")
        };

        System.out.println("Available Products (Sorted by Product ID)");
        System.out.println("-----------------------------------------");
        System.out.println("ID\tName\t\tCategory");

        for (Product p : products) {
            p.display();
        }

        int searchId = 108;

        System.out.println("\nSearching for Product ID: " + searchId);

        Product result = binarySearch(products, searchId);

        if (result != null) {
            System.out.println("\nProduct Found:");
            result.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}