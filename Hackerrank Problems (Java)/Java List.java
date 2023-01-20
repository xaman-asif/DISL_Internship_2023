import java.util.ArrayList;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      list.add(scanner.nextInt());
    }

    int numOfOperations = scanner.nextInt();

    for (int i = 0; i < numOfOperations; i++) {
      String tempString = scanner.next();

      if (tempString.equals("Insert")) {
        int pos = scanner.nextInt();
        int item = scanner.nextInt();

        list.add(pos, item);
      } else if (tempString.equals("Delete")) {
        int pos = scanner.nextInt();
        list.remove(pos);
      }
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }
}