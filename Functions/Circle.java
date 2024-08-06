package Functions;

import java.util.Scanner;

public class Circle {
	public static void circumferenceOfCircle(int radius, double pi) {
		double circumference=2*pi*radius;
		System.out.println("Circumference of Circle : "+circumference);
	}
	
	public static void area(int radius, double pi) {
		double area=pi*radius*radius;
		System.out.println("Area of Circle : "+area);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double pi=3.14;
		System.out.println("Enter a value for Radius : ");
		int radius = sc.nextInt();
		circumferenceOfCircle(radius,pi);
		area(radius,pi);
		
	}

}
