package Looping_Statement;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		for(int i = 0; i<=n;i++) {
			if(i%2==0) {
				System.out.println("Even No : "+ i);
			}
		}
	
	}

}
