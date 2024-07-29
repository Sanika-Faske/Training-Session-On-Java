package Looping_Statement;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a No to Check : ");
		int number=sc.nextInt();
		int div=2;
		while(div<number) {
			
			if(number%div==0) {
				System.out.println("Non Prime number");
			}else{
				div++;
			}	
	}
		System.out.println("Prime Number");
	}
}
