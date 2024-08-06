package Functions;
import java.util.Scanner;
public class Even_Number {
	
	public static void evenOdd(int n) {
		if(n%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		evenOdd(n);
		
	}

}
