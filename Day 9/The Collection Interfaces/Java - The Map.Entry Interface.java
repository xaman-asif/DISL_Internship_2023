import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {
  public static void main(String[] args) {
    HashMap hashMap = new HashMap();

    hashMap.put("Zara", 3.1416);
    hashMap.put("Mahnaz", 7);
    hashMap.put("Ayan", 10);

    // Get a set of the entries
    Set set = hashMap.entrySet();

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