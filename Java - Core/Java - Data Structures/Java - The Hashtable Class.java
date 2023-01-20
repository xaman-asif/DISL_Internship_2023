import java.util.Enumeration;
import java.util.Hashtable;

public class Solution {
  public static void main(String[] args) {
    Hashtable hashtable = new Hashtable();

    Enumeration names;
    Object object;
    double bal;

    hashtable.put("Zara", 3434.34);
    hashtable.put(3.1416, "Bangladesh");
    hashtable.put("Qadir", 1234);

    names = hashtable.keys();

    while (names.hasMoreElements()) {
      object = names.nextElement();
      System.out.println(object + ": " + hashtable.get(object));
    }
  }
}