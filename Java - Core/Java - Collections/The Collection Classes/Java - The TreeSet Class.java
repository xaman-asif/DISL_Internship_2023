// TreeSet provides an implementation of the Set interface that uses a tree for storage. Objects are stored in a sorted and ascending order.

import java.util.TreeSet;

public class Solution {
  public static void main(String[] args) {
    TreeSet tSet = new TreeSet();

    tSet.add("B");
    tSet.add("A");
    tSet.add("D");
    tSet.add("B");
    tSet.add("O");
    tSet.add("Y");

    System.out.println(tSet);
  }
}