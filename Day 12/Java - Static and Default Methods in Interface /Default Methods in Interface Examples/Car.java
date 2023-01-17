
public class Car implements Vehicle {
  public final String brand;

  public Car(String brand) {
    this.brand = brand;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  @Override
  public String speedUp() {
    return "The car is speeding up.";
  }

  @Override
  public String slowDown() {
    return "The car is slowing down.";
  }
}
