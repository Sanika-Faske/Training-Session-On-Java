package Arrays;

import java.util.Scanner;
public class MinMix {

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
		//Checking MIN and MAX
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<size; i++) {
			if(number[i]>max) {
				max=number[i];
			}
			if(number[i]<min) {
				min=number[i];
			}
		}
		
		System.out.println("Minimum Value is : "+min);
		System.out.println("Maximum Value is : "+max);
	}

}
