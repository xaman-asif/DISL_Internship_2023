import java.util.HashSet;
import java.util.Set;

public class DifferentWaysSetIterateProgram {
  public static void main(String... args) {
    Set<String> courses = new HashSet<>();

    courses.add("C");
    courses.add("C++");
    courses.add("Java");
    courses.add("J2EE");
    courses.add("Python");
    courses.add("Scala");

    // JDK 8 for each with lambda
    courses.forEach(course -> coursePrinter(course));

    // JDK 8 for each method reference
    courses.forEach(DifferentWaysSetIterateProgram::coursePrinter);

  }

  // common method to print map key value
  private static void coursePrinter(String course) {
    System.out.println("Course name : " + course);
  }
}
