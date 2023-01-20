//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }

    for (int i : array) {
      System.out.println(i);
    }
  }
}