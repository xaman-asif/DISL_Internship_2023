//https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int length = scanner.nextInt();

    int[] array = new int[length];
    int count = 0;

    for (int i = 0; i < length; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < length; i++) {
      int sum = 0;
      for (int j = i; j < length; j++) {
        sum += array[j];
        if (sum < 0) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}