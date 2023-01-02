//https://www.hackerrank.com/challenges/java-currency-formatter/submissions/code/307741537

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double pay = scanner.nextDouble();
    scanner.close();

    String us = NumberFormat.getCurrencyInstance(Locale.US).format(pay);
    System.out.println("US: " + us);

    Locale IND = new Locale("en", "IN");
    String in = NumberFormat.getCurrencyInstance(IND).format(pay);
    System.out.println("India: " + in);

    String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(pay);
    System.out.println("China: " + ch);

    String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(pay);
    System.out.println("France: " + fr);

    // String bd = NumberFormat.getCurrencyInstance(new Locale("en",
    // "BD")).format(pay);
    // System.out.println(bd);
  }
}