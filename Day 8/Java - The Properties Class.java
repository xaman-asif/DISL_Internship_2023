import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Solution {
  public static void main(String[] args) {
    Properties properties = new Properties();

    Set states;
    String string;

    properties.put("India", "Mumbai");
    properties.put("Bangladesh", "Dhaka");
    properties.put("USA", "Washington DC");

    states = properties.keySet();
    Iterator itr = states.iterator();

    while (itr.hasNext()) {
      string = (String) itr.next();

      System.out.println("The capital of " + string + " is " + properties.getProperty(string) + ".");
    }

    System.out.println();

    string = properties.getProperty("Florida", "Not Found");
    System.out.println("The capital of Florida is " + string + ".");
  }
}