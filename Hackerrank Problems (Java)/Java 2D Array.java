import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true

public class Solution {
  public static void main(String[] args) {
    int[][] array = new int[6][6];

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        array[i][j] = scanner.nextInt();
      }
    }

    scanner.close();

    int max = Integer.MIN_VALUE;

    for (int i = 0; i + 2 < 6; i++) {
      for (int j = 0; j + 2 < 6; j++) {
        int sum = 0;
        sum += array[i][j] + array[i][j + 1] + array[i][j + 2]; // first
        sum += array[i + 1][j + 1]; // middle
        sum += array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2]; // third
        if (sum > max) {
          max = sum;
          // System.out.println("Sum: " + i + " " + j + " " + sum);
        }
      }
    }

    System.out.println(max);
  }
}