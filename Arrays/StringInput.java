package Arrays;
import java.util.*;
public class StringInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Count of Number : ");
		int n=sc.nextInt();
		String[] names=new String[n];
		
		//input
		for(int i=0; i<n; i++) {
			System.out.println("Enter name : ");
			names[i]=sc.next();
		}
		//output
		for(int i=0; i<n; i++) {
			System.out.println("Names at index "+i+" is : "+names[i]);
		}
	}

}
