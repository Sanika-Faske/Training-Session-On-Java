package Functions;
import java.util.*;
public class SumOfOdd {
	
	public static void SumOfOddNo(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				sum = sum+i;
			}
		}
		System.out.println("Sum of Odd number is : "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n =sc.nextInt();
		SumOfOddNo(n);
	}

}
