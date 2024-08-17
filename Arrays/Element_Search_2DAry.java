package Arrays;

import java.util.Scanner;

public class Element_Search_2DAry {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter size of Row : ");
			int rows=sc.nextInt();
			System.out.print("Enter size of Column : ");
			int cols=sc.nextInt();
			
			int[][] numbers=new int[rows][cols];
			
			//input 
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					System.out.print("Enter a value for "+i+" "+j+" : ");
					numbers[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			
			//Element to Search
			System.out.println("Enter element to serach : ");
			int element=sc.nextInt();
			
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					if(element==numbers[i][j]) {
						System.out.println("Element found at element "+"( "+i+" , "+j+" )");
					}
				}
			}
	}

}
