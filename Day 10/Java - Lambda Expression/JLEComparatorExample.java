import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JLEComparatorExample {
  public static void main(String[] args) {

    List<Person> listOfPerson = new ArrayList<>();

    listOfPerson.add(new Person("abc", 27));
    listOfPerson.add(new Person("mno", 26));
    listOfPerson.add(new Person("pqr", 28));
    listOfPerson.add(new Person("xyz", 21));

    // Without lamda expression
    // Sort lust by age
    Comparator<Person> comparator = new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
      }
    };

    // Collections.sort(listOfPerson, comparator);

    // With lambda expression
    Collections.sort(listOfPerson, (Person o1, Person o2) -> {

      return o1.getAge() - o2.getAge();
    });

    System.out.println("Sort persons by age in ascending order:");

    for (Person person : listOfPerson) {
      System.out.println("Person name: " + person.getName() + " Person age: " + person.getAge());
    }
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