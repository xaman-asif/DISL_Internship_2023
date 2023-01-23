public class Motorbike implements Vehicle {
  private final String brand;

  public Motorbike(String brand) {
    this.brand = brand;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  @Override
  public String speedUp() {
    return "The Motorbike is speeding up.";
  }

  @Override
  public String slowDown() {
    return "The Motorbike is slowing down.";
  }

}
