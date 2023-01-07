import java.util.HashMap;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    HashMap<String, Integer> contacts = new HashMap<>();
    scanner.nextLine();
    for (int i = 0; i < n; i++) {
      String tempString = scanner.nextLine();
      int tempInt = scanner.nextInt();
      contacts.put(tempString, tempInt);
      scanner.nextLine();
    }
    // System.out.println(contacts.toString());

    while (scanner.hasNext()) {
      String tempString = scanner.nextLine();

      if (contacts.containsKey(tempString)) {
        System.out.println(tempString + "=" + contacts.get(tempString));
      } else {
        System.out.println("Not found");
      }
    }
  }
}