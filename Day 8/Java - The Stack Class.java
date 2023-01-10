import java.util.Stack;

public class Solution {

  public static void main(String[] args) {
    Stack st = new Stack<>();
    System.out.println("Stack: " + st);

    st.push("Bangladesh");
    st.push(42);
    st.push(66.0);
    st.push("Ninety Nine");

    if (st.search("Bangladesh") >= 0) {
      System.out.println(st.search("Bangladesh"));
    }

    try {
      System.out.println(st.pop());
      System.out.println(st.pop());
      System.out.println(st.pop());
      System.out.println(st.pop());
    } catch (Exception e) {
      System.out.println("Empty Stack");
    }

  }
}