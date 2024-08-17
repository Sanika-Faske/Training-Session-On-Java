package Arrays;
import java.util.*;

	public class AscendingOrNot {
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter size : ");
	      int size = sc.nextInt();
	      int numbers[] = new int[size];


	      //input
	      for(int i=0; i<size; i++) {
	    	  System.out.println("Enter Element : ");
	          numbers[i] = sc.nextInt();
	      }


	      boolean isAscending = true;
	     
	       for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
	           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
	               isAscending = false;
	           }
	       }


	       if(isAscending) {
	           System.out.println("The array is sorted in ascending order");
	       } else {
	           System.out.println("The array is not sorted in ascending order");
	       }
	      
	   }
	}


