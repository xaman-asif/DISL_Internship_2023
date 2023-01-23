import java.util.function.BiConsumer;

public class BiConsumersExample {
  public static void main(String[] args) {
    BiConsumer<Person, Person> biConsumer = (p1, p2) -> {
      System.out.println("print first person: ");
      System.out.println(p1.getName());
      System.out.println("print second person: ");
      System.out.println(p2.getName());
    };

    biConsumer.accept(new Person("Ramesh", 10), new Person("ram", 10));
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