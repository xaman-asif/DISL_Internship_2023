//https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true

class Singleton {
  private static Singleton single_instance;

  public String str;

  private Singleton() {

  }

  public static Singleton getSingleInstance() {
    if (single_instance == null) {
      single_instance = new Singleton();
    }
    return single_instance;
  }
}

public class Solution {
  public static void main(String[] args) {
    Singleton x = Singleton.getSingleInstance();
    Singleton y = Singleton.getSingleInstance();
    Singleton z = Singleton.getSingleInstance();

    System.out.println(x.hashCode());
    System.out.println(y.hashCode());
    System.out.println(z.hashCode());
  }
}