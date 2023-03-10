interface Vehicle {
  public void move();
}

class Car implements Vehicle {
  @Override
  public void move() {
    System.out.println("Car is moving");
  }
}

class Bike implements Vehicle {
  @Override
  public void move() {
    System.out.println("Bike is moving");
  }
}

class Traveler {
  private Vehicle v; // v is a Vehicle interface object

  public Vehicle getV() {
    return v;
  }

  public void setV(Vehicle v) {
    this.v = v;
  }

  public void startJourney() {
    v.move();
  }
}

public class LooseCoupling {
  public static void main(String[] args) {
    Traveler traveler = new Traveler();

    traveler.setV(new Car()); // Inject Car dependency
    traveler.startJourney(); // Start journey by Car

    traveler.setV(new Bike()); // Inject Bike dependency
    traveler.startJourney(); // Start journey by Bike
  }
}
