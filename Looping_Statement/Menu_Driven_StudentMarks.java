package Looping_Statement;

import java.util.Scanner;

public class Menu_Driven_StudentMarks {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		for(;;){
			
		System.out.print("Enter your choice (0 or 1) : ");
		int choice=sc.nextInt();
		int marks;
		
		if(choice == 1) {
			System.out.println("Enter your marks : ");
			marks=sc.nextInt();
			if(marks>=90) {
				System.out.println("You got A grade");
			}else if(89 >=marks && marks>=60){
				System.out.println("You got B grade");
			}else {
				System.out.println("You got C grade");
			}
			
		}else if(choice == 0)
		{
			System.out.println("Thank you...!");
			break;
		}else{
			System.out.println("Invalid Choice"); 
		}
		
		}
	}

}
