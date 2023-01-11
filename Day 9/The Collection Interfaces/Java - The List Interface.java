import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    List a1 = new ArrayList();
    a1.add("Zara");
    a1.add("Z");
    a1.add("Araz");
    System.out.println("ArrayList Elements: ");
    System.out.println(a1);

    List l2 = new LinkedList();
    l2.add("Zara");
    l2.add("Z");
    l2.add("Araz");
    System.out.println("LinkedList Elements: ");
    System.out.println(l2);

  }
}