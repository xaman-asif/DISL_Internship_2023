interface Sayable {
  public String say();
}

public class JLEExampleNoParameter {
  public static void main(String[] args) {
    // without lamda expression

    Sayable sayable = new Sayable() {
      @Override
      public String say() {
        return "WithOut Lambda: Return Something...";
      }
    };
    System.out.println(sayable.say());

    // with lambda expression
    Sayable withLambda = () -> {
      return "WithLambda: Return Something...";
    };
    System.out.println(withLambda.say());
  }
}