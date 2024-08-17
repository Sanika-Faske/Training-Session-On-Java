package Arrays;
import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int size=sc.nextInt();
		int[] number=new int[size];
		//input
		for(int i=0; i<size; i++) {
			System.out.print("Enter value : ");
			number[i]=sc.nextInt(); 
		}
		
		//output
		System.out.println("Elements of Array : ");
		for(int i=0; i<size; i++) {
			System.out.print(number[i]+" ");
		}
	}

}
