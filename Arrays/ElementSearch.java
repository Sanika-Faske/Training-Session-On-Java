package Arrays;

import java.util.Scanner;

public class ElementSearch {

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
		System.out.print("Element to search : ");
		int x=sc.nextInt();
		//output
		for(int i=0; i<size; i++) {
			if(number[i]==x) {
				System.out.println("Element found at : "+i);
			}
		}
	}

}
