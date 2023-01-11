import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Solution {
  public static void main(String[] args) {
    TreeMap treeMap = new TreeMap();

    treeMap.put("Zara", 3.1416);
    treeMap.put("Mahnaz", 123.22);
    treeMap.put("Ayan", 1378.00);
    treeMap.put("Zefrey", 1);
    treeMap.put("Moyna", 2);

    // Get a set of the entries
    Set set = treeMap.entrySet();

    // Get iterator
    Iterator i = set.iterator();

    // Display elements
    while (i.hasNext()) {
      Map.Entry me = (Map.Entry) i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }

  }
}