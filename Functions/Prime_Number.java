package Functions;
import java.util.*;
public class Prime_Number {

	public static void checkPrimeNumber(int number) {
		int div=2;
		while(div<number) {
			if(number%div==0) {
				System.out.println("Not Prime Number");
				return;
			}else {
				div++;
			}	
		}
		System.out.println("Prime Number");
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No to Check Prime Number or Not : ");
		int number=sc.nextInt();
		checkPrimeNumber(number);
		
	}

}
