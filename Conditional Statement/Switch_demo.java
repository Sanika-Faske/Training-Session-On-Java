package Condition;

import java.util.Scanner;
public class Switch_demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a=sc.nextInt();
		
		switch(a) {
		
		case 1:System.out.println("Hello");
		break;
		case 2:System.out.println("Namste");
		break;
		case 3:System.out.println("Bonjour");
		break;
		default:System.out.println("Invalid number...!");
		}
			

	}

}
