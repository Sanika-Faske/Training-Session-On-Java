package Pattern;

public class Hollow_Butterfly {

	public static void main(String[] args) {
		int n=5;
		//Upper Part
		for(int i=1; i<=n; i++) {
			
			
			//first part Star *
			for(int j=1; j<=i; j++) {
				
				if(i==1 || j==1 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			
			
			//Space
			int space=2*(n-i);
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			//first part Star *
			for(int j=1; j<=i; j++) {
				
				if(i==1 || j==1 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			
			System.out.println();			
		}
		
		//Lower Part
		for(int i=n; i>=1; i--) {
					
					
			//first part Star *
			for(int j=1; j<=i; j++) {
						
				if(i==1 || j==1 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
						
			}
					
					
			//Space
			int space=2*(n-i);
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
					
			//first part Star *
			for(int j=1; j<=i; j++) {
						
				if(i==1 || j==1 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			
			System.out.println();			
			}		
		

	}

}
