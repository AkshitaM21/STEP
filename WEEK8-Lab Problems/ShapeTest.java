abstract class Shape {
 protected double area;
 protected double perimeter;
 public abstract void calculateArea();
 public abstract void calculatePerimeter();
}
interface Drawable {
 void draw();
}
class Circle extends Shape implements Drawable {
 private double radius;
 public Circle(double radius) {
 this.radius = radius;
 }
 public void calculateArea() {
 area = Math.PI * radius * radius;
 }
 public void calculatePerimeter() {
 perimeter = 2 * Math.PI * radius;
 }
 public void draw() {
 System.out.println("Drawing a circle with radius " + radius);
 }
 public void showDetails() {
 System.out.println("Area: " + area + ", Perimeter: " + perimeter);
 }
}
public class ShapeTest {
 public static void main(String[] args) {
 Circle circle = new Circle(5);
 circle.calculateArea();
 circle.calculatePerimeter();
 circle.draw();
 circle.showDetails();
 }
}
