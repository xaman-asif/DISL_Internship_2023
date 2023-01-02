//https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
      String s1 = sc.next();
      System.out.print(s1);
      int x = sc.nextInt();
      for (int j = s1.length(); j < 15; j++) {
        System.out.print(' ');
      }
      Integer integer = new Integer(x);
      String sInteger = integer.toString();
      for (int j = sInteger.length(); j < 3; j++) {
        System.out.print('0');
      }
      System.out.println(sInteger);
    }
    System.out.println("================================");

  }
}