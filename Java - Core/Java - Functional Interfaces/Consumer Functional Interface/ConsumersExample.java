import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumersExample {
  public static void main(String[] args) {
    List<Person> listOfPerson = new ArrayList<>();

    listOfPerson.add(new Person("abc", 27));
    listOfPerson.add(new Person("mno", 26));
    listOfPerson.add(new Person("pqr", 28));
    listOfPerson.add(new Person("xyz", 27));

    listOfPerson.forEach((person) -> {
      System.out.println("Person name: " + person.getName());
      System.out.println("Person age: " + person.getAge());
    });

    Consumer<Person> consumer = (person) -> {
      System.out.println(person.getName());
      System.out.println(person.getAge());
    };

    consumer.accept(new Person("Ramesh", 30));
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}