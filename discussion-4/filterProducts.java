class ProductFilter {

    void filterProducts(String category) {
        System.out.println("Searching products in category: " + category);
    }

    void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching products priced between $" + minPrice + " and $" + maxPrice);
    }

    void filterByBrand(String brand) {
        System.out.println("Searching products of brand: " + brand);
    }

    void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Searching products in category: " + category
                + " priced between $" + minPrice + " and $" + maxPrice);
    }

    void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Searching products in category: " + category
                + ", priced between $" + minPrice + " and $" + maxPrice
                + ", brand: " + brand);
    }
}

public class filterProducts {
    public static void main(String[] args) {
        ProductFilter pf = new ProductFilter();
        pf.filterProducts("electronics");
        pf.filterProducts(100, 500);
        pf.filterByBrand("Apple");
        pf.filterProducts("fashion", 50, 200);
        pf.filterProducts("electronics", 100, 500, "Apple");
    }
}