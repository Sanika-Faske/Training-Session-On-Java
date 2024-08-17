package Strings;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Tony");
		System.out.println(sb);
		//Length
			System.out.println("Length : "+sb.length());
		//Char at Index
			System.out.println(sb.charAt(0));
		
		//Set char at Index
			sb.setCharAt(0,'S');
			System.out.println(sb);
		
		//Insert
			sb.insert(0, 'T');
			System.out.println(sb);
			
			sb.insert(3, 'n');
			System.out.println(sb);
			
		//Delete
			sb.delete(0, 1);
			System.out.println(sb);
		
		//Append - add at last
			sb.append("y");
			System.out.println(sb);
			
		//Reverse
			System.out.println(sb.reverse());
	}

}
