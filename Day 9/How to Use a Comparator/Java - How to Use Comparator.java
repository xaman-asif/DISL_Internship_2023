import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// obj1 and obj2 are the objects to be compared. This method returns zero if the
// objects are equal. It returns a positive value if obj1 is greater than obj2.
// Otherwise, a negative value is returned.

class Dog implements Comparator<Dog>, Comparable<Dog> {
  private String name;
  private int age;

  Dog() {

  }

  Dog(String n, int a) {
    name = n;
    age = a;
  }

  public String getDogName() {
    return name;
  }

  public int getDogAge() {
    return age;
  }

  // Overriding the compareTo method
  public int compareTo(Dog d) {
    return this.name.compareTo(d.name);
  }

  // Overriding the compareTo method to sort the age
  public int compare(Dog d, Dog d1) {
    return d.age - d1.age;
  }
}

public class Solution {
  public static void main(String[] args) {
    List<Dog> list = new ArrayList<Dog>();

    list.add(new Dog("A", 3));
    list.add(new Dog("B", 2));
    list.add(new Dog("C", 10));
    list.add(new Dog("D", 4));
    list.add(new Dog("E", 1));

    // sort the arraylist based on name
    Collections.sort(list);
    for (Dog a : list)
      System.out.println(a.getDogName() + ": " + a.getDogAge());
    System.out.println();

    // sort the arraylist using comparator
    Collections.sort(list, new Dog());

    for (Dog a : list)
      System.out.println(a.getDogName() + " : " + a.getDogAge());
  }
}