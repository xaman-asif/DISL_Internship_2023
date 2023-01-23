interface Addable {
  int add(int a, int b);
}

public class JLEExampleMultipleParameters {
  public static void main(String[] args) {
    // without lambda expression
    Addable addable = new Addable() {
      @Override
      public int add(int a, int b) {
        return a + b;
      }
    };

    addable.add(10, 20);

    // with lambda expression
    // multiple parametres in lambda expression
    Addable withLambda = (a, b) -> (a + b);
    System.out.println(withLambda.add(10, 20));

    // multiple parametres with data type in lamda expression
    Addable withLambdaType = (int a, int b) -> (a + b);
    System.out.println(withLambdaType.add(10, 15));
  }
}