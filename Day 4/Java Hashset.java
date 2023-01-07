import java.util.HashSet;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
public class Solution {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();

    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < T; i++) {
      hashSet.add(scanner.nextLine());
      System.out.println(hashSet.size());
    }
  }
}