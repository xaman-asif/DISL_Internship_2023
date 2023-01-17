import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
  public static void main(String[] args) {
    List<Product> productsList = new ArrayList<>();

    productsList.add(new Product(1, "HP Laptop", 25000f));
    productsList.add(new Product(2, "Dell Laptop", 30000f));
    productsList.add(new Product(3, "Lenevo Laptop", 28000f));
    productsList.add(new Product(4, "Sony Laptop", 28000f));
    productsList.add(new Product(5, "Apple Laptop", 90000f));

    Map<Integer, String> productPriceMap = productsList.stream().filter(product -> product.getPrice() < 30000)
        .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
    System.out.println(productPriceMap);
  }
}
