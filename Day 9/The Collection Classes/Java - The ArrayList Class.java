import java.util.ArrayList;

public class Solution {
  public static void main(String[] args) {
    ArrayList aList = new ArrayList();
    System.out.println("Initial size of List: " + aList.size());

    aList.add("C");
    aList.add("A");
    aList.add("R");
    aList.add("C");
    aList.add("A");
    aList.add("S");
    aList.add("S");

    System.out.println("Size of aList: " + aList.size());
    System.out.println("Contents of aList: " + aList.clone());

  }
}