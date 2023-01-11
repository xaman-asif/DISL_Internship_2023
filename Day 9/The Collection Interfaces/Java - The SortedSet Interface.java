import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
  public static void main(String[] args) {
    SortedSet set = new TreeSet();

    set.add("b");
    set.add("c");
    set.add("a");
    set.add(1);
    set.add(99);
    set.add(1.0);

    Iterator it = set.iterator();

    while (it.hasNext()) {
      Object element = it.next();
      System.out.println(element.toString());
    }
  }
}