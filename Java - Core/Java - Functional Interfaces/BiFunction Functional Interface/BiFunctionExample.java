import java.util.function.BiFunction;

public class BiFunctionExample {
  public static void main(String[] args) {
    BiFunction<Person, Person, Integer> biFunction = (p1, p2) -> {
      return p1.getAge() + p2.getAge();
    };
    int totalAge = biFunction.apply(new Person("Ramesh", 10), new Person("Ram", 10));

    System.out.println(totalAge);
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