public class ThisReferenceExample {
  public void doProcess(int i, Process p) {
    System.out.println("doProcess: " + this);
    p.process(i);
  }

  public void execute() {
    doProcess(30, i -> {
      System.out.println("Value of i is: " + i);
      System.out.println("Lambda doProcess: " + this);
    });
  }

  public static void main(String[] args) {
    ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
    thisReferenceExample.doProcess(10, new Process() {
      @Override
      public void process(int i) {
        System.out.println("Value of i is: " + i);
        System.out.println("Anonymous doProcess: " + this);
      }
    });

    // thisReferenceExample.doProcess(20, i -> {
    // System.out.println("Value of i is: " + i);
    // // System.out.println(this);
    // });
    thisReferenceExample.execute();
  }

}

interface Process {
  void process(int i);
}