//https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    HashSet<Integer> hashSet = new HashSet<>();
    int n = in.nextInt();
    int m = in.nextInt();
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      deque.add(num);
      hashSet.add(num);

      // System.out.println("START");
      // System.out.println("Deque :" + deque);
      // System.out.println("HashSet: " + hashSet);

      if (deque.size() == m) {
        if (hashSet.size() > max) {
          max = hashSet.size();
        }
        // if (!deque.contains(deque.peekFirst())) {
        // hashSet.remove(deque.pollFirst());
        // }
        int first = deque.remove();
        if (!deque.contains(first)) {
          hashSet.remove(first);
        }
      }

      // System.out.println("Deque :" + deque);
      // System.out.println("HashSet: " + hashSet);
    }

    in.close();
    System.out.println(max);
  }
}
