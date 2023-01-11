import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
  public static void main(String[] args) {
    int count[] = { 34, 22, 10, 60, 30, 22 };
    Set<Integer> set = new HashSet<>();

    System.out.println("The set list is: ");
    try {
      for (int i = 0; i < 5; i++) {
        set.add(count[i]);
      }
      System.out.println(set);

      TreeSet<Integer> sortedSet = new TreeSet<>(set);
      System.out.println("The sorted list is: ");
      System.out.println(sortedSet);

      System.out.println(
          "The first element of the set is: " + sortedSet.first());

      System.out.println(
          "The last element of the set is: " + sortedSet.last());
    } catch (Exception e) {

    }

  }

}