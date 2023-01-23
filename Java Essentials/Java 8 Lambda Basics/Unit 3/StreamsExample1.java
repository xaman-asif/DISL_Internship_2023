import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
        new Person("Charles", "Dickens", 60),
        new Person("Lewis", "Carrol", 42),
        new Person("Thomas", "Carlyle", 51),
        new Person("Charlote", "Bronte", 45),
        new Person("Mathew", "Arnold", 39));

    // people.stream().forEach(p -> System.out.println(p.getLastName()));
    people.stream()
        .filter(p -> p.getLastName().startsWith("C"))
        .forEach(System.out::println);

    long count = people.stream()
        .filter(p -> p.getLastName().startsWith("C"))
        .count();
    System.out.println(count);
  }
}
