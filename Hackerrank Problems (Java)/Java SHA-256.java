// https://www.hackerrank.com/challenges/sha-256?isFullScreen=true

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    try {
      // Static getInstance method is called with hashing MD5
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      // System.out.println(md);

      // digest() method is called to calculate message digest
      // of an input. digest() return array of byte
      byte[] MessageDigest = md.digest(s.getBytes());
      // System.out.println(MessageDigest);

      // Convert byte array into signum representation
      BigInteger bigInteger = new BigInteger(1, MessageDigest);
      // System.out.println(bigInteger);

      // Convert message digest into hex value
      String hashText = bigInteger.toString(16);
      if (hashText.length() < 64) {
        hashText = "0" + hashText;
      }
      System.out.println(hashText);

      // while (hashText.length() < 32) {
      // hashText = "0" + hashText;
      // }

      // System.out.println(hashText);
    } catch (Exception e) {

    }
  }
}
