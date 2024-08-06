package Functions;

import java.util.Scanner;

public class ExponentPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number for base : ");
	    int base = sc.nextInt();
	    System.out.print("Enter a Number for base : ");
	    int power = sc.nextInt();
	    long result=1;
	    for(int i=1; i<=power; i++) {
	    	result = result*base;
	    }
	   System.out.println(base+" to the power of "+power+" is : "+result);
	}

}
