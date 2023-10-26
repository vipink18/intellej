package Pojos.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductImpl {



    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product1","Electronics",500));
        productList.add(new Product("Product2","Clothing",200));
        productList.add(new Product("Product3","Electronics",700));
        productList.add(new Product("Product4","Home",600));
        productList.add(new Product("Product5","Clothing",250));
        productList.add(new Product("Product6","Home",600));
        productList.add(new Product("Product7","Home",600));

        Map<String, Double> productMap = productList.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));
        System.out.println(productMap);

        Map<String, List<Product>> groupedList = productList.stream().collect(Collectors.groupingBy(Product::getCategory));

        Map.Entry<String, Double> max = productMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(max);


    }

}
