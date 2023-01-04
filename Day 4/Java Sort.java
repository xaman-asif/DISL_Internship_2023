import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
  private int id;
  private String fname;
  private double cgpa;

  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }

  public int getId() {
    return id;
  }

  public String getFname() {
    return fname;
  }

  public double getCgpa() {
    return cgpa;
  }

  @Override
  public int compareTo(Student s) {
    // TODO Auto-generated method stub
    // Student s = (Student) o; // Typecasted Object -> Student
    if (this.cgpa == s.cgpa) {
      if (this.fname.equals(s.fname)) {
        return this.id - s.id;
      } else {
        return this.fname.compareTo(s.fname);
      }
    } else {
      return (s.cgpa - this.cgpa) > 0 ? 1 : -1;
    }
  }
}

// Complete the code
public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    List<Student> studentList = new ArrayList<Student>();
    while (testCases > 0) {
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();

      Student st = new Student(id, fname, cgpa);
      studentList.add(st);

      testCases--;
    }
    Collections.sort(studentList);
    for (Student st : studentList) {
      System.out.println(st.getFname());
    }
  }
}
