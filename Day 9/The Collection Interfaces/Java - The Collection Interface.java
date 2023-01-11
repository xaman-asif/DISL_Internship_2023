import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
  public static void main(String[] args) {
    List a1 = new ArrayList();

    a1.add("Zara");
    a1.add(3.1416);
    a1.add(100);

    System.out.println("Arraylist Elements: ");
    System.out.println(a1);

    // LinkedList
    List l1 = new LinkedList();
    l1.add("Ayan");
    l1.add(1);
    l1.add(1.2);
    System.out.println("LinkedList Elements: ");
    System.out.println(l1);

    // HashSet
    Set s1 = new HashSet();
    s1.add("Asif");
    s1.add(4.00);
    s1.add("Asif");
    System.out.println("Set Elements: ");
    System.out.println(s1);

    // HashMap
    Map m1 = new HashMap();
    m1.put("Mahnaz", 8);
    m1.put(3.14, "Jaman");
    m1.put("Daisy", 00);
    System.out.println("Map Elements: ");
    System.out.println(m1);
  }
}