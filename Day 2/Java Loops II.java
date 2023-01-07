//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

import java.util.Scanner;

class Solution {
  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();

      int sum = 0;

      for (int j = 1; j <= n; j++) {
        sum = a;
        for (int k = 0; k < j; k++) {
          sum += ((int) Math.pow(2, k)) * b;
        }
        System.out.printf("%d ", sum);
      }
      System.out.println();
    }
    in.close();
  }
}