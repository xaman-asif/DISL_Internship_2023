import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
    HashMap m1 = new HashMap();
    m1.put("Zara", "8");
    m1.put("Mahnaz", "31");
    m1.put("Ayan", "12");
    m1.put("Daisy", "14");

    // Get a set of entries
    Set set = m1.entrySet();

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