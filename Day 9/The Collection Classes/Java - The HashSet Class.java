import java.util.LinkedList;

public class Solution {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.add("U");
    ll.add("N");
    ll.add("E");
    ll.addLast("Z");
    ll.addFirst("N");

    System.out.println("Original contents of ll: " + ll);

    ll.remove("Z");
    System.out.println(ll);

    ll.remove(3);
    System.out.println(ll);
  }
}