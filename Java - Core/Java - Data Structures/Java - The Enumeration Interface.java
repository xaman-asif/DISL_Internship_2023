import java.util.Enumeration;
import java.util.Vector;

public class Solution {
  public static void main(String[] args) {
    Enumeration days;
    Vector dayNames = new Vector<>();

    dayNames.add("Sunday");
    dayNames.add("Monday");
    dayNames.add("Tuesday");

    days = dayNames.elements();

    while (days.hasMoreElements()) {
      System.out.println(days.nextElement());
    }
  }
}