interface Printable {
  void print(String msg);
}

public class JLEExampleSingleParameter {
  public static void main(String[] args) {
    // without lambda expression

    // implementation of the interface - @start
    Printable printable = new Printable() {
      @Override
      public void print(String msg) {
        System.out.println(msg);
      }
    };
    // implementation of the interface - @end

    printable.print("Print withoutLambda to console....");

    // with lamda expression
    Printable withLamda = (msg) -> System.out.println(msg); // implementation
    withLamda.print("Print withLambda to console");
  }
}