//https://www.hackerrank.com/challenges/java-reflection-attributes/problem

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student {
  private String name;
  private String id;
  private String email;

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}

class Solution {

  public static void main(String[] args) {
    Class student = Student.class;
    Method[] methods = student.getDeclaredMethods();

    ArrayList<String> methodList = new ArrayList<>();
    for (int i = 0; i < methods.length; i++) {
      methodList.add(methods[i].getName());
    }
    Collections.sort(methodList);
    for (String name : methodList) {
      System.out.println(name);
    }
  }
}ww