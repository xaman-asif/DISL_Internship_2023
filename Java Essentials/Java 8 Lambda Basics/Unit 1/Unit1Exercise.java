import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Exercise {
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
    printConditionally(people, p -> true);

    // Create a method that prints all people that have the last name beginning with
    // C
    System.out.println("Printing all persons with last name beginning with C");
    printConditionally(people, p -> p.getLastName().startsWith("C"));

    System.out.println("Printing all persons with first name beginning with C");
    printConditionally(people, p -> p.getFirstName().startsWith("C"));
  }

  private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
    for (Person p : people) {
      if (predicate.test(p)) {
        System.out.println(p);
      }
    }
  }
}

// interface Condition {
// boolean test(Person p);
// }