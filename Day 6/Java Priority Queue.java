//https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=false

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class Student implements Comparable<Student> {
  int id;
  String name;
  double cgpa;

  public Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCGPA() {
    return cgpa;
  }

  public int compareTo(Student s) {
    if (this.cgpa == s.cgpa) {
      if (this.name.compareTo(s.name) == 0) {
        if (this.id == s.id) {
          return 0;
        } else if (this.id > s.id) {
          return 1;
        } else {
          return -1;
        }
      } else {
        return this.name.compareTo(s.name);
      }
    } else if (this.cgpa > s.cgpa) {
      return -1;
    } else {
      return 1;
    }
  }
}

class Priorities {
  public ArrayList<Student> getStudents(List<String> events) {
    int n = events.size();
    PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

    for (int i = 0; i < events.size(); i++) {
      String[] strings = events.get(i).split("\\s");
      if (strings.length > 1) {
        priorityQueue.add(new Student(Integer.parseInt(strings[3]), strings[1], Double.parseDouble(strings[2])));
      } else {
        priorityQueue.poll();
      }
    }
    while (priorityQueue.size() > 1) {
      System.out.println(priorityQueue.poll().name);
    }
    return new ArrayList<Student>(priorityQueue);
  }
}

public class Solution {
  private final static Scanner scan = new Scanner(System.in);
  private final static Priorities priorities = new Priorities();

  public static void main(String[] args) {
    int totalEvents = Integer.parseInt(scan.nextLine());
    List<String> events = new ArrayList<>();

    while (totalEvents-- != 0) {
      String event = scan.nextLine();
      events.add(event);
    }

    List<Student> students = priorities.getStudents(events);

    if (students.isEmpty()) {
      System.out.println("EMPTY");
    } else {
      for (Student st : students) {
        System.out.println(st.getName());
      }
    }
  }
}