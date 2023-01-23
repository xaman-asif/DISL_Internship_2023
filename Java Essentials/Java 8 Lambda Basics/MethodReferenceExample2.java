import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
        new Person("Charles", "Dickens", 60),
        new Person("Lewis", "Carrol", 42),
        new Person("Thomas", "Carlyle", 51),
        new Person("Charlote", "Bronte", 45),
        new Person("Mathew", "Arnold", 39));

    // Sort list by last name
    Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

    // Create a method that prints all elements in the list
    System.out.println("Printing all persons");
    printConditionally(people, p -> true, System.out::println);
  }

  private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
    for (Person p : people) {
      if (predicate.test(p)) {
        consumer.accept(p);
      }
    }
  }
}
