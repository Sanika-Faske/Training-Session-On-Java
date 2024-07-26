package Condition;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value for A : ");
		int a=sc.nextInt();
		System.out.print("Enter a value for B : ");
		int b=sc.nextInt();
		
		if(a==b) {
			System.out.println("A and B are Equals");
		}
		else if(a<b) {
			System.out.println("A is Lesser than B");
		}
		else {
			System.out.println("A is Greater then B");
		}
	}

}
