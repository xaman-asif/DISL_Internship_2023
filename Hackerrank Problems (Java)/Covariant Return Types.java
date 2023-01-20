import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
  public char[] whatsYourName() {
    return null;
  }
}

class Jasmine extends Flower {
  String name;

  public Jasmine() {
    this.name = "Jasmine";
  }

  @Override
  public char[] whatsYourName() {
    return name.toCharArray();
  }
}

class Lily extends Flower {
  String name;

  public Lily() {
    this.name = "Lily";
  }

  @Override
  public char[] whatsYourName() {
    return name.toCharArray();
  }
}

class Region {

  public Flower yourNationalFlower() {
    return null;
  }
}

class WestBengal extends Region {
  @Override
  public Flower yourNationalFlower() {
    return new Jasmine();
  }
}

class AndhraPradesh extends Region {
  @Override
  public Flower yourNationalFlower() {
    return new Lily();
  }
}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine().trim();
    Region region = null;
    switch (s) {
      case "WestBengal":
        region = new WestBengal();
        break;
      case "AndhraPradesh":
        region = new AndhraPradesh();
        break;
    }
    Flower flower = region.yourNationalFlower();
    System.out.println(flower.whatsYourName());
  }
}