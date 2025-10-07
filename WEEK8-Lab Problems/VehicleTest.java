abstract class Vehicle {
 protected int speed;
 protected String fuelType;
 public Vehicle(int speed, String fuelType) {
 this.speed = speed;
 this.fuelType = fuelType;
 }
 public abstract void startEngine();
}
interface Maintainable {
 void serviceInfo();
}
class Car extends Vehicle implements Maintainable {
 private String model;
 public Car(int speed, String fuelType, String model) {
 super(speed, fuelType);
 this.model = model;
 }
 public void startEngine() {
 System.out.println(model + " engine started. Fuel Type: " + fuelType);
 }
 public void serviceInfo() {
 System.out.println(model + " requires service every 6 months.");
 }
}
public class VehicleTest {
 public static void main(String[] args) {
 Car car = new Car(180, "Petrol", "Toyota Corolla");
 car.startEngine();
 car.serviceInfo();
 }
}
