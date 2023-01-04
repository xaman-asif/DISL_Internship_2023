//https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    int numberOfLines;
    int numberOfElements;
    int numberOfQueries;

    numberOfLines = scanner.nextInt();

    for (int i = 0; i < numberOfLines; i++) {
      numberOfElements = scanner.nextInt();
      ArrayList<Integer> tempoList = new ArrayList<>();
      for (int j = 0; j < numberOfElements; j++) {
        tempoList.add(scanner.nextInt());
      }
      list.add(tempoList);
    }

    // System.out.println(list.toString());

    numberOfQueries = scanner.nextInt();

    for (int i = 0; i < numberOfQueries; i++) {
      int listIndex = scanner.nextInt();
      int indexItem = scanner.nextInt();
      try {
        int value = list.get(listIndex - 1).get(indexItem - 1);
        System.out.println(value);
      } catch (Exception e) {
        System.out.println("ERROR!");
      }
    }
  }
}