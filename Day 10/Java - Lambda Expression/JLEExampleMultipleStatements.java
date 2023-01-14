interface IAverage {
  double avg(int[] array);
}

public class JLEExampleMultipleStatements {
  public static void main(String[] args) {
    // without lamda expression, IAverage implementation using anonymous class
    IAverage average = new IAverage() {
      @Override
      public double avg(int[] array) {
        double sum = 0;
        int arraySize = array.length;

        System.out.println("arraySize: " + arraySize);

        for (int i = 0; i < arraySize; i++) {
          sum += array[i];
        }

        System.out.println("sum : " + sum);

        return (sum / arraySize);
      }
    };

    int[] array = { 1, 4, 6, 8, 9 };
    System.out.println(average.avg(array));

    // with lambda expression
    // you can pass multiple statements in lambda expression

    IAverage withLambda = (withLambdaArray) -> {
      double sum = 0;
      int arraySize = withLambdaArray.length;

      System.out.println("arraySize: " + arraySize);

      for (int i = 0; i < arraySize; i++) {
        sum += withLambdaArray[i];
      }

      System.out.println("sum : " + sum);

      return (sum / arraySize);
    };

    System.out.println(withLambda.avg(array));
  }
}