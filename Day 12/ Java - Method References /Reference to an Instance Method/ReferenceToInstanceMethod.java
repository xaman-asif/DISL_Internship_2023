public class ReferenceToInstanceMethod {
  public void saySomething() {
    System.out.println("Hello, this is non-static method.");
  }

  public static void main(String[] args) {
    // Creating Object
    ReferenceToInstanceMethod methodReference = new ReferenceToInstanceMethod();

    // Refering non-static method using reference
    Sayable sayable = methodReference::saySomething;

    // Calling interface method
    sayable.say();

    // I can use anonymous object also
    Sayable sayable2 = new ReferenceToInstanceMethod()::saySomething;

    // Calling interface method
    sayable2.say();
  }

  interface Sayable {
    void say();
  }
}
