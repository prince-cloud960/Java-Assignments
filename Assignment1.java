package assignment;

public class Assignment1 {
	
	public int calculate(int a,int b) 
	{
		return a+b;
	}
	
	public int calculate(int radius) {
		double kd = 3.1456 * radius *radius;
		int area = (int) kd;
		return area;
	}
	
	public int calculate(float l,float b)
	{
		double ae = l*b;
		int area = (int) ae;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1  obj = new Assignment1();
		int sum;
		int circle;
		int rect;
		sum = obj.calculate(3,4);
		circle = obj.calculate(100);
		rect = obj.calculate(3.0f,5.0f);
		System.out.println("Sum of 2 numbers is: " + sum);
		System.out.println("Area of circle is: " + circle);
		System.out.println("Area of rectangle is: " + rect);
	}

}
