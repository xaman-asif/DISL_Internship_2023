import java.util.ArrayList;
import java.util.List;

public class JavaWithoutStreamExample {
  private static List<Product> productsList = new ArrayList<Product>();

  public static void main(String[] args) {
    productsList.add(new Product(1, "HP Laptop", 25000f));
    productsList.add(new Product(2, "Dell Laptop", 30000f));
    productsList.add(new Product(3, "Lenovo Laptop", 28000f));
    productsList.add(new Product(4, "Sony Laptop", 28000f));
    productsList.add(new Product(5, "Apple Laptop", 90000f));

    withoutStreamAPI();
  }

  private static void withoutStreamAPI() {
    // without Stream API
    List<Float> productPriceList = new ArrayList<>();
    // filtering data of lust
    for (Product product : productsList) {
      if (product.getPrice() >= 30000) {
        // adding price to a productPriceList
        productPriceList.add(product.getPrice());
      }
    }

    // displaying data
    for (Float price : productPriceList) {
      System.out.println(price);
    }
  }
}
