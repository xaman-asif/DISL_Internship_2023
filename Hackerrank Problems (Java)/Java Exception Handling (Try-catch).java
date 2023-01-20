import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true

public class Solution {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    try {
      int x = 0;
      int y = 0;
      try {
        x = scanner.nextInt();
        y = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("java.util.InputMismatchException");
        return;
      }
      System.out.println(x / y);
    } catch (Exception e) {
      System.out.println("java.lang.ArithmeticException: / by zero");
    }
  }
}
