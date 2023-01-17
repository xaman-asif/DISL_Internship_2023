import java.util.StringJoiner;

public class StringJoinerExample {
  public static void main(String[] args) {
    delimiterDemonstration();
  }

  private static void delimiterDemonstration() {
    StringJoiner joinNames = new StringJoiner(",");

    joinNames.add("John");
    joinNames.add("Tony");
    joinNames.add("Amir");
    joinNames.add("Prabhas");

    System.out.println(joinNames);

    // adding prefix and suffix
    StringJoiner joinNames2 = new StringJoiner(",", "[", "]");

    joinNames2.add("Alex");
    joinNames2.add("Turner");
    joinNames2.add("Mia");
    joinNames2.add("Aura");

    System.out.println(joinNames2);

    StringJoiner merge = joinNames.merge(joinNames2);
    System.out.println(merge);

    // We can set default empty value.
    joinNames.setEmptyValue("It is empty");
    // System.out.println(joinNames);

    // Returns length of StringJoiner
    System.out.println(merge.length());

    // Returns StringJoiner as String tyoe
    String str = merge.toString();
    System.out.println(str.getClass());
  }
}
