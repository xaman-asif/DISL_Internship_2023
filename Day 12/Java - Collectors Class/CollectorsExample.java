import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<Product> productsList = new ArrayList<>();

    productsList.add(new Product(1, "HP Laptop", 25000f));
    productsList.add(new Product(2, "Dell Laptop", 30000f));
    productsList.add(new Product(3, "Lenevo Laptop", 28000f));
    productsList.add(new Product(4, "Sony Laptop", 28000f));
    productsList.add(new Product(5, "Apple Laptop", 90000f));

    // Java 8 Collectors.toList() Example
    List<Float> productPriceList = productsList.stream().map(x -> x.price).collect(Collectors.toList());
    System.out.println(productPriceList);

    // Java 8 Collectors.toSet() Example
    Set<Float> productPriceSet = productsList.stream().map(
        x -> x.price).collect(Collectors.toSet());

    // Java Collectors Example: using sum method
    Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.price));

    // Java Collectors Example: Getting Product Average Price
    Double average = productsList.stream().collect(Collectors.averagingDouble(x -> x.price));

    // Java 8 Collectors.counting() Example
    Long noOfElements = productsList.stream().collect(Collectors.counting());

    System.out.println("Product price list: " + productPriceList);
    System.out.println("Product price set: " + productPriceSet);
    System.out.println("Product price sum: " + sumPrices);
    System.out.println("Product price average: " + average);
    System.out.println("Product price noOfElements: " + noOfElements);
  }
}

class Product {
  int id;
  String name;
  float price;

  public Product(int id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }
}
