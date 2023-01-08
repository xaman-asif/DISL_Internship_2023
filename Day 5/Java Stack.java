import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=false

public class Solution {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    while (scanner.hasNext()) {
      String s = scanner.next();
      System.out.println(isBalanced(s));
    }
  }

  private static boolean isBalanced(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '}') {
        if (stack.size() > 0 && stack.peek() == '{') {
          stack.pop();
        } else {
          return false;
        }
      } else if (c == ')') {
        if (stack.size() > 0 && stack.peek() == '(') {
          stack.pop();
        } else {
          return false;
        }
      } else if (c == ']') {
        if (stack.size() > 0 && stack.peek() == '[') {
          stack.pop();
        } else {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    if (stack.isEmpty()) {
      return true;
    }
    return false;
  }
}