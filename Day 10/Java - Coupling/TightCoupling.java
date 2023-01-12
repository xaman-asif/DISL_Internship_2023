class Car {
  public void move() {
    System.out.println("Car is moving");
  }
}

public class Traveler {
  Car c = new Car();

  public void startJourney() {
    c.move();
  }
}
