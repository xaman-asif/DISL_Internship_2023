import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    scan.close();
    if (str.isBlank()) {
      System.out.println('0');
      return;
    }
    String[] array = str.trim().split("[\s!,?._'@]+");
    System.out.println(array.length);
    for (String a : array) {
      System.out.println(a);
    }
  }
}