
// LinkedHashSet maintains a linked list of the entries in the set, in the order in which they were inserted. This allows insertion-order iteration over the set.
import java.util.LinkedHashSet;

public class Solution {
  public static void main(String[] args) {
    LinkedHashSet hSet = new LinkedHashSet();

    hSet.add("B");
    hSet.add("A");
    hSet.add("D");
    hSet.add("B");
    hSet.add("O");
    hSet.add("Y");

    System.out.println(hSet);
  }
}