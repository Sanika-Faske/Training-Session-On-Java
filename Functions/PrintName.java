package Functions;
import java.util.*;

public class PrintName {
	
	public static void printMyName(String name) {
		System.out.println("My Name is "+name);
		return;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name=sc.next();
		
		printMyName(name); //Calling function

	}

}
