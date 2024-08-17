package Arrays;
import java.util.*;
public class TwoDArray {

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
		//Output
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
