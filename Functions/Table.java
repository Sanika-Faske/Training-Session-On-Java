package Functions;

import java.util.Scanner;

public class Table {
	
	public static void tableOfNumber(int n) {
		System.out.println("Table of " + n + ": ");
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number for printing table : ");
		int n=sc.nextInt();
		tableOfNumber(n);
	}

}
