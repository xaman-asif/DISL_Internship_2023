//https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();

    System.out.println(s1.length() + s2.length());

    System.out.println((s1.compareTo(s2) > 0) ? "Yes" : "No");

    capitalizeFirstCharOfString(s1);
    System.out.print(' ');
    capitalizeFirstCharOfString(s2);
  }

  private static void capitalizeFirstCharOfString(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (i == 0) {
        System.out.print((char) (s.charAt(i) - 'a' + 'A'));
      } else {
        System.out.print(s.charAt(i));
      }
    }
  }
}