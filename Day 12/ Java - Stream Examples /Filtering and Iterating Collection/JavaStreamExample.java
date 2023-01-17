import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
  private static List<Product> productsList = new ArrayList<>();

  public static void main(String[] args) {
    productsList.add(new Product(1, "HP Laptop", 25000f));
    productsList.add(new Product(2, "Dell Laptop", 30000f));
    productsList.add(new Product(3, "Lenevo Laptop", 28000f));
    productsList.add(new Product(4, "Sony Laptop", 28000f));
    productsList.add(new Product(5, "Apple Laptop", 90000f));

    withStreamAPI();
  }

  private static void withStreamAPI() {
    // filtering data of list
    List<Float> productPriceList = productsList.stream().filter((product) -> product.getPrice() > 30000)
        .map((product) -> product.getPrice()).collect(Collectors.toList());

    productPriceList.forEach((price) -> System.out.println(price));
  }
}
