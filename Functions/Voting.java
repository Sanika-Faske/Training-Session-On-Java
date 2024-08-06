package Functions;

import java.util.Scanner;

public class Voting {
	
	public static void voteOrNot(int age) {
		if(age>=18) {
			System.out.println("You are Eligible for Voting...");
		}else {
			System.out.println("You are not Eligible for voting right now...");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();
		voteOrNot(age);
	}

}
