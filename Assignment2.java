package assignment;


//Base Class
class Shape {

 Shape() {
     System.out.println("Shape constructor called (default)");
 }


 void area(double d1, double d2) {
     double area = (d1 * d2) / 2;
     System.out.println("Area of Rhombus: " + area);
 }


 void area(double base, double height, boolean isTriangle) {
     if (isTriangle) {
         double area = 0.5 * base * height;
         System.out.println("Area of Triangle: " + area);
     }
 }
}


class Square extends Shape {
 double side;

 Square(double side) {
     this.side = side;
 }

 void displayArea() {
     double area = side * side;
     System.out.println("Area of Square: " + area);
 }
}


class Rectangle extends Shape {
 double length, breadth;

 Rectangle(double length, double breadth) {
     this.length = length;
     this.breadth = breadth;
 }

 void displayArea() {
     double area = length * breadth;
     System.out.println("Area of Rectangle: " + area);
 }
}


class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 void displayArea() {
     double area = 3.14 * radius * radius;
     System.out.println("Area of Circle: " + area);
 }
}


public class Assignment2 {
 public static void main(String[] args) {
     
     Shape shape = new Shape();

     
     Square square = new Square(5);
     Rectangle rectangle = new Rectangle(4, 6);
     Circle circle = new Circle(3.5);

     
     square.displayArea();
     rectangle.displayArea();
     circle.displayArea();

     
     shape.area(10, 8);
     shape.area(6, 7, true);   
  }
}
