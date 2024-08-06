package Functions;

import java.util.Scanner;

public class GreaterNumber {
	public static void greaterNum(int a, int b) {
		if(a>b) {
			System.out.println("Greater Number is "+a);
		}else if(a<b) {
			System.out.println("Greater Number is "+b);
		}else {
			System.out.println("Both numbers are equal");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("First Number : ");
		int a =sc.nextInt();
		System.out.print("Second Number : ");
		int b =sc.nextInt();
		greaterNum(a,b);
	}

}
