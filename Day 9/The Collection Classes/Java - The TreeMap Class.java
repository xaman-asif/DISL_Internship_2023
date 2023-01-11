// You should note that, unlike a hash map, a tree map guarantees that its
// elements will be sorted in an ascending key order.

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Solution {

  public static void main(String[] args) {
    TreeMap tm = new TreeMap();

    tm.put("Zara", "8");
    tm.put("Mahnaz", "31");
    tm.put("Ayan", "12");
    tm.put("Daisy", "14");

    // Get a set of entries
    Set set = tm.entrySet();

    // Get an iterator
    Iterator i = set.iterator();

    // Display elements
    while (i.hasNext()) {
      Map.Entry me = (Map.Entry) i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }
  }
}