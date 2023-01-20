import java.util.function.BiPredicate;

public class BiPredicateDemo {
  public static void main(String[] args) {
    // anonymous class implementation
    BiPredicate<String, String> predicateObject = new BiPredicate<String, String>() {
      @Override
      public boolean test(String s1, String s2) {
        return s1.equals(s2);
      }
    };

    System.out.println(predicateObject.test("Ramesh", "Ramesh"));

    // lamda expression implementation
    BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
    System.out.println(biPredicate.test("ramesh", "ramesh"));
    System.out.println(biPredicate.test("java guides", "Java Guides"));
  }
}
