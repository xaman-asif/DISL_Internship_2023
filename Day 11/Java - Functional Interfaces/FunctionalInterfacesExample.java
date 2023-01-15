@FunctionalInterface
interface Sayable {
  void say(String msg); // abstract method
}

public class FunctionalInterfacesExample {
  public static void main(String[] args) {
    Sayable sayable = (msg) -> {
      System.out.println(msg);
    };
    sayable.say("Say something");
  }
}