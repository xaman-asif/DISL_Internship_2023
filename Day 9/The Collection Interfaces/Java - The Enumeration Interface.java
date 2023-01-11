import java.util.Enumeration;
import java.util.Vector;

public class Solution {
  public static void main(String[] args) {
    Vector dayNames = new Vector();

    dayNames.add("SAT");
    dayNames.add("SUN");
    dayNames.add("MON");

    Enumeration days = dayNames.elements();

    while (days.hasMoreElements()) {
      System.out.println(days.nextElement());
    }
  }
}