package Strings;

//String are immutable

public class StringMethods {

	public static void main(String[] args) {
		String fname = "Sanika";
		String lname = "Faske";
		
		//Concatenation
			String fullname = fname+" "+lname;
			System.out.println(fullname);
		
		//Length
			System.out.println("Lenght os Strimg is : "+fullname.length());
		
		//charAt
			for(int i=0; i<fullname.length(); i++) {
			System.out.println("CharAt index "+ i +" : "+fullname.charAt(i));
			}
		
		//Compare
			String name1="Tony";
			String name2="Tony";
			
			//s1>s2 return +ve value
		    //s1==s2 return 0
			//s1<s2 return -ve value
			
			if(name1.compareTo(name2)==0) {
				System.out.println("Strings are equal");
			}else {
				System.out.println("Strings are not equal");
			}
			
		//subString
			String sentence="My name is Tony";
			System.out.println(sentence.substring(11,sentence.length()));
			System.out.println(sentence.substring(0,4));		
		
			
	}

}
