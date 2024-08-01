package Pattern;

public class Diamond_Pattern {

	public static void main(String[] args) {
		int n=5;
		
		//Upper Part
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Lower Part
		for(int i=n; i>=1; i--) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//stars
			int star=2*i-1;
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
