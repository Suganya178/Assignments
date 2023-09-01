package week3.day4;

public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	
	String test = "changeme";
	//Convert the String to character array
	char[] ch = test.toCharArray();
	
	//Traverse through each character (using loop)
	for (int i = 0; i < ch.length; i++) {
	
		//find the odd index within the loop (use mod operator)
		if (i%2==0) {
			//within the loop, change the character to uppercase, 
			//if the index is odd else don't change
			char upperCase = Character.toUpperCase(ch[i]);
			System.out.print(upperCase);
			
		}
		else {
			System.out.print(ch[i]);
		}
		
	}
}
}
