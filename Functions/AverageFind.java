package Functions;

import java.util.Scanner;

public class AverageFind {
	
	public static void averageFind(int a,int b,int c) {
		int avg=(a+b+c)/3;
		System.out.println("Average Number of "+ a + b + c +" is : "+avg);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("First Number : ");
		int a =sc.nextInt();
		System.out.print("Second Number : ");
		int b =sc.nextInt();
		System.out.print("Third Number : ");
		int c =sc.nextInt();
		averageFind(a,b,c);
	}

}
