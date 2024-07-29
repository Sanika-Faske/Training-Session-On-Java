package Looping_Statement;

import java.util.Scanner;

public class TableOfNo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no for Table : ");
	int n=sc.nextInt();
	
	for(int i = 1; i<11; i++) {
		System.out.println(n*i);
	}

}
}
