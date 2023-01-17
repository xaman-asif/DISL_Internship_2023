import java.util.function.Function;

@FunctionalInterface
interface Printable {
  void print(String msg);
}

public class MethodRefDemo {
  public void display(String msg) {
    System.out.println(msg);
  }

  public static void main(String[] args) {
    // 1. Method reference to an instance method of an object
    MethodRefDemo methodRefDemo = new MethodRefDemo();

    Printable printableLambda = (String msg) -> methodRefDemo.display(msg);
    printableLambda.print("Hello");

    // using lamda expression
    Function<String, String> lowerCaseFunction = (String input) -> input.toLowerCase();
    String result = lowerCaseFunction.apply("Java Guides");
    System.out.println(result);

    // using method references
    Function<String, String> lowerCaseFunctionRef = String::toLowerCase;
    String result1 = lowerCaseFunctionRef.apply("Java Guides");
    System.out.println(result1);
  }
}
