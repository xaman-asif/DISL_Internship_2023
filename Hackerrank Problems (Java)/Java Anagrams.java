import java.util.ArrayList;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

public class Solution {

  public static void main(String[] args) {
    ArrayList<Character> list = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    String s1 = scan.next().toLowerCase();

    for (int i = 0; i < s1.length(); i++) {
      list.add(s1.charAt(i));
    }

    // System.out.println(list.toString());
    String s2 = scan.next().toLowerCase();

    for (int i = 0; i < s2.length(); i++) {
      if (list.contains(s2.charAt(i))) {
        list.remove(Character.valueOf(s2.charAt(i)));
        // System.out.println("Removed: " + s2.charAt(i));
      } else {
        System.out.println("Not Anagrams");
        return;
      }
    }
    // System.out.println(list.toString());
    if (list.size() != 0) {
      System.out.println("Not Anagrams");
      return;
    } else {
      System.out.println("Anagrams");
    }
  }
}