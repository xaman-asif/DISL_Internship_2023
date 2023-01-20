import java.util.BitSet;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt(); // length
    int M = scanner.nextInt(); // operations

    BitSet b1 = new BitSet(N);
    BitSet b2 = new BitSet(N);
    BitSet[] bitSets = new BitSet[3];

    bitSets[1] = b1;
    bitSets[2] = b2;

    for (int i = 0; i < M; i++) {
      String s = scanner.next();
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if (s.equals("AND")) {
        bitSets[x].and(bitSets[y]);
      } else if (s.equals("OR")) {
        bitSets[x].or(bitSets[y]);
      } else if (s.equals("XOR")) {
        bitSets[x].xor(bitSets[y]);
      } else if (s.equals("FLIP")) {
        bitSets[x].flip(y);
      } else if (s.equals("SET")) {
        bitSets[x].set(y);
      }
      System.out.printf("%d %d\n", b1.cardinality(), b2.cardinality());
    }
  }
}
