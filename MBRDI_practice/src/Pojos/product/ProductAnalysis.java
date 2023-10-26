package Pojos.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ProductAnalysis {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product1", "Electronics", 500));
        productList.add(new Product("Product2", "Clothing", 200));
        productList.add(new Product("Product3", "Electronics", 700));
        productList.add(new Product("Product4", "Home", 600));
        productList.add(new Product("Product5", "Clothing", 250));
        productList.add(new Product("Product6", "Home", 600));
        productList.add(new Product("Product7","Home",600));

        // Group products by category and calculate the average price for each category
        Map<String, Double> categoryAveragePriceMap = new HashMap<>();
        Map<String, Integer> categoryProductCountMap = new HashMap<>();

        for (Product product : productList) {
            String category = product.getCategory();
            double price = product.getPrice();

            categoryAveragePriceMap.put(category, categoryAveragePriceMap.getOrDefault(category, 0.0) + price);
            categoryProductCountMap.put(category, categoryProductCountMap.getOrDefault(category, 0) + 1);
        }

        for (String category : categoryAveragePriceMap.keySet()) {
            double totalCategoryPrice = categoryAveragePriceMap.get(category);
            int productCount = categoryProductCountMap.get(category);
            double averagePrice = totalCategoryPrice / productCount;

            categoryAveragePriceMap.put(category, averagePrice);
        }

        // Find the category with the highest average price
        String highestAveragePriceCategory = "";
        double highestAveragePrice = 0.0;

        for (String category : categoryAveragePriceMap.keySet()) {
            double averagePrice = categoryAveragePriceMap.get(category);

            if (averagePrice > highestAveragePrice ||
                    (averagePrice == highestAveragePrice && categoryProductCountMap.get(category) >
                            categoryProductCountMap.get(highestAveragePriceCategory))) {
                highestAveragePrice = averagePrice;
                highestAveragePriceCategory = category;
            }
        }

        System.out.println("Category: " + highestAveragePriceCategory);
        System.out.println("Average Price: " + highestAveragePrice);
    }
}
