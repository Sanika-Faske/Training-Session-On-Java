package Looping_Statement;
import java.util.*;
public class SumOfUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for n : ");
		int n=sc.nextInt();
		int i;
		int sum = 0;
		for(i=0;i<=n;i++) {
		sum = sum + i;
		}
		System.out.println("Sum of number from 0 to " + n + " : "+sum);
	}
}
