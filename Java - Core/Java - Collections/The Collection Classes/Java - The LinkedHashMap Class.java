import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
  public static void main(String[] args) {
    LinkedHashMap lhm = new LinkedHashMap();

    lhm.put("Zara", 3.1416);
    lhm.put("Mahraz", 700);
    lhm.put("Ayan", 123);

    Set set = lhm.entrySet();

    Iterator it = set.iterator();

    while (it.hasNext()) {
      Map.Entry me = (Map.Entry) it.next();

      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }

  }
}