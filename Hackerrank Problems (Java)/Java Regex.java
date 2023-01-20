// https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

    String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

    Pattern p = Pattern.compile(regex);

    while (scanner.hasNext()) {
      String ip = scanner.next();

      Matcher m = p.matcher(ip);

      System.out.println(m.matches());

    }
  }
}