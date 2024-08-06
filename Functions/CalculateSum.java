package Functions;

import java.util.Scanner;


public class CalculateSum {
	
	public static int calculateSum(int a,int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for A : ");
		int a=sc.nextInt();
		System.out.print("Enter value for B : ");
		int b=sc.nextInt();
		int sum = calculateSum(a,b);
		System.out.println("Sum is : "+sum);
	}

}
