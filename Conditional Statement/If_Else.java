package Condition;
import java.util.*;
public class If_Else {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the age : ");
//		int age=sc.nextInt();
//		
//		if(age>=18) {
//			System.out.println("Adult");
//		}
//		else {
//			System.out.println("Not Adult");
//		}

		
		System.out.println("---------------------------------------------------------");
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}

	}

}
