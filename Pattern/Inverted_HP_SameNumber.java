package Pattern;

public class Inverted_HP_SameNumber {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n;i++) {
			//space
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			//Star
			for(int j=5; j>=i; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
