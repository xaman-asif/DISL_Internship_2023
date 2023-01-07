//https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner scan = new Scanner(System.in);
    String s = scan.next();

    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}