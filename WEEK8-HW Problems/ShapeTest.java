abstract class Shape {
 public abstract double area();
 public abstract double perimeter();
 public void displayInfo() {
 System.out.println("This is a shape.");
 }
}
class Circle extends Shape {
 private double radius;
 public Circle(double radius) {
 this.radius = radius;
 }
 public double area() {
 return Math.PI * radius * radius;
 }
 public double perimeter() {
 return 2 * Math.PI * radius;
 }
}
class Rectangle extends Shape {
 private double length, width;
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 public double area() {
 return length * width;
 }
 public double perimeter() {
 return 2 * (length + width);
 }
}
public class ShapeTest {
 public static void main(String[] args) {
 Shape circle = new Circle(5);
 Shape rectangle = new Rectangle(4, 6);
 circle.displayInfo();
 System.out.println("Circle Area: " + circle.area());
 System.out.println("Circle Perimeter: " + circle.perimeter());
 rectangle.displayInfo();
 System.out.println("Rectangle Area: " + rectangle.area());
 System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
 }
}
