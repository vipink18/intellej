package Pojos.product;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductMain {
    public static void main(String[] args) {
       Product product1 = new Product("Product1","Electronics",500);
       Product product2 = new Product("Product2","Clothing",200);
       Product product3 = new Product("Product3","Electronics",700);
       Product product4 = new Product("Product4","Home",600);
       Product product5 = new Product("Product5","Clothing",250);
       Product product6 = new Product("Product6","Home",600);
       Product product7 = new Product("Product7","Home",600);


        List<Product> list = List.of(product1,product2,product3,product4,product5,product6,product7);
        System.out.println(list);
        System.out.println();
        Map<String,List<Product>> map= list.stream().collect(Collectors.groupingBy(s-> s.getCategory()));
        System.out.println(map);
        System.out.println();

        //average
        Map<String,Double> average=list.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble( p -> p.getPrice())));
        System.out.println(average);
        Map<String, Long> collectCount = list.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println(collectCount);


        double maxAverage =list.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice))).values().stream().mapToDouble(Double::doubleValue).max().orElse(Double.NaN);
        System.out.println(maxAverage);
        System.out.println();



        Map.Entry<String,Double> maxAvg = average.entrySet().stream().
                collect(Collectors
                        .maxBy( (o1, o2) ->  (o1.getValue().compareTo(o2.getValue()))  ))
                        .get();
        System.out.println(maxAvg);
        System.out.println(collectCount.get("Home").compareTo( collectCount.get("Electronics")) );
    }

}
