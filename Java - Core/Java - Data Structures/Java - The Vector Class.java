import java.util.Enumeration;
import java.util.Vector;

public class Solution {
  public static void main(String[] args) {
    Vector vector = new Vector<>(3, 2);
    System.out.println("Initial size: " + vector.size());
    System.out.println("Initial capacity:" + vector.capacity());

    vector.addElement(new Integer(1));
    vector.addElement("Bangladesh");
    vector.addElement(new Double(3.1416));
    vector.addElement(new Character('C'));

    System.out.println("Capacity after four additions: " + vector.capacity());

    System.out.println("First element: " + vector.firstElement());

    System.out.println("Last element: " + vector.lastElement());

    if (vector.contains(new Double(3.1416))) {
      System.out.println("Vector contains 3.1416");
    }

    Enumeration vEnumeration = vector.elements();

    while (vEnumeration.hasMoreElements()) {
      System.out.println(vEnumeration.nextElement() + " ");
    }
  }

}