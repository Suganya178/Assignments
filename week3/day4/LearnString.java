package week3.day4;

public class LearnString {
public static void main(String[] args) {
	
	//String Literal
	String s1 = "Testleaf"; 
	String s2 = "TestLeaf";
	
	//Using string instantiation
	String str = new String("Testleaf"); 
	
	System.out.println(s1.equals(str)); //equals
	
	//compare operator == reference(memory)
	System.out.println(s1==str);
	
	//compare literal
	System.out.println(s1==s2);
	
	System.out.println(s1.equalsIgnoreCase(s2));
	
	//count of my char
	int len =s1.length();
	System.out.println(len);
	
	//check whether piece of char is present in string
	System.out.println(s1.contains("Test"));
	
	//charAt(index) - get the index of my string - starts from 0
	System.out.println(s1.charAt(4));
	
	//toCharArray
	
	char[] charArray = s1.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	
	//reverse the string
	 for (int i =charArray.length-1 ; i>=0; i--) {
			System.out.println(charArray[i]);
	}
	
	 String s3 = "Testleaf 60 located in Chennai 1999";
	 //split
	 String[] split = s3.split(" ");
	 
	 for (int i = 0; i < split.length; i++) {
		 System.out.println(split[i]);
	}
	
	 
	 //replace
	 String replace = s3.replace('e', 'o');
	 System.out.println(replace);
	 
	 //replaceall
	 String replaceAll = s3.replaceAll("[^0-9]","");//print only numbers
	 System.out.println(replaceAll);
	 
	 String replaceAll2 = s3.replaceAll("\\d","");
	 System.out.println(replaceAll2);
	 
	 //substring - starts index from 0
	 System.out.println(s3.substring(4));
	 System.out.println(s3.substring(9, 11));
	 
	 String browser1 = "Chrome";
	 String browser2  = "Edge";
	 System.out.println(browser1.toLowerCase());
	 System.out.println(browser1.toUpperCase());
	 
	 //concat
	 System.out.println(browser1+browser2);
	 System.out.println(browser1.concat(browser2));
	 System.out.println("Input" + " "+browser1);

	 //trim
	 String op = "        CRM/SFA    ";
	 System.out.println(op.trim());
	 
	 
	 
	 
	
}
}
