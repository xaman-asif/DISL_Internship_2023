// https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    int count = 0;
    Scanner scan = new Scanner(System.in);
    while (scan.hasNext()) {
      count++;
      String s = scan.nextLine();
      System.out.println(count + " " + s);
    }
  }
}