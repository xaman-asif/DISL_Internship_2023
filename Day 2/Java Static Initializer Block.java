//https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {
  static int B;
  static int H;
  static boolean flag;
  static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    flag = true;

    if (!(B > 0 && H > 0)) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
      flag = false;
    }
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }

  }// end of main

}// end of class
