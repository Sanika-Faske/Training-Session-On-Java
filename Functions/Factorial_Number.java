package Functions;
import java.util.*;
public class Factorial_Number {
	
	public static void printFactorial(int n) {
		int factorial = 1;
		if(n<=0) {
			System.out.println("Invalid Number");
			return;
		}
		for(int i=n; i>=1; i--) {
			factorial=factorial*i;
		}
		System.out.println("Factorial is : "+factorial);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find Factorial : ");
		int n=sc.nextInt();
		printFactorial(n);
	}

}
