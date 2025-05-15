package assignment;

//Abstract Class
abstract class Marks {
 abstract double getPercentage();
}

//Student A – 3 subjects
class A extends Marks {
 int sub1, sub2, sub3;

 A(int s1, int s2, int s3) {
     this.sub1 = s1;
     this.sub2 = s2;
     this.sub3 = s3;
 }

 @Override
 double getPercentage() {
     int total = sub1 + sub2 + sub3;
     return (total / 3.0);
 }
}

//Student B – 4 subjects
class B extends Marks {
 int sub1, sub2, sub3, sub4;

 B(int s1, int s2, int s3, int s4) {
     this.sub1 = s1;
     this.sub2 = s2;
     this.sub3 = s3;
     this.sub4 = s4;
 }

 @Override
 double getPercentage() {
     int total = sub1 + sub2 + sub3 + sub4;
     return (total / 4.0);
 }
}

//Main class
public class Assignment4 {
 public static void main(String[] args) {
     A studentA = new A(80, 90, 85);
     B studentB = new B(75, 80, 70, 85);

     System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
     System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
 }
}
