package Condition;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulo or Reminder");
		
		System.out.print("Enter your Choice : ");
		int choice=sc.nextInt();
		
		System.out.print("Enter a value for A : ");
		int a=sc.nextInt();
		
		System.out.print("Enter a value for B : ");
		int b=sc.nextInt();
		
		switch(choice) {
		
		case 1: System.out.println("Additon of A and B is : "+(a+b));
		break;
		case 2: System.out.println("Subtraction of A and B is : "+(a-b));
		break;
		case 3: System.out.println("Multiplication of A and B is : "+(a*b));
		break;
		case 4: System.out.println("Division of A and B is : "+(a/b));
		break;
		case 5: System.out.println("Modulo of A and B is : "+(a%b));
		break;
		default: System.out.println("Invalid Choice");
		}
	}

}
