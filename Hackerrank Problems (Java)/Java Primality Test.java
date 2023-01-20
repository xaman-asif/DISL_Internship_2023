// https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String n = bufferedReader.readLine();

    BigInteger bigInteger = new BigInteger(n);

    System.out.println(bigInteger.isProbablePrime(1) ? "prime" : "not prime");

    bufferedReader.close();
  }
}
