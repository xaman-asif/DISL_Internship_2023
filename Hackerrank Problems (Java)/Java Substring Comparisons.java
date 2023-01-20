//https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=false

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z";
        String largest = "0";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; (i+k) <= s.length(); i++) {
          
          //System.out.println(s.substring(i, i+k));
          if(smallest.compareTo(s.substring(i, i+k)) > 0) {
            smallest = s.substring(i, i+k);
          }
          //System.out.println(smallest);
          if(largest.compareTo(s.substring(i, i+k)) < 0) {
            largest = s.substring(i, i+k);
          }
          //System.out.println(largest);
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}