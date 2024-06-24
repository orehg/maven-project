package streams_practic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Необходимо рассчитать среднюю цену всех продуктов в списке.
public class AveragePrice {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(2.4, "Apple"),
                new Product(5.32,"Milk"),
                new Product(7.63, "Banana"));
       List<Double> prices = products.stream().map(Product::getPrice).collect(Collectors.toList());
       double finalPrice = 0;
        for (Double price : prices){
           finalPrice = price + finalPrice;
        }
        System.out.println(finalPrice / products.size());

        double averagePrice = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
        System.out.println(averagePrice);
    }
}
