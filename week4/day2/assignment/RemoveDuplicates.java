package week4.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	
	//Declare a String as "PayPal India"
	String name = "PayPal India";

	//Convert it into a character array
	char[] ch = name.toCharArray();
	
	//Declare a Set as charSet for Character
	Set<Character> charSet=new LinkedHashSet<Character>();

	//Declare a Set as dupCharSet for duplicate Character
	Set<Character> dupCharSet=new LinkedHashSet<Character>();
	
	
	for (Character char1 : ch) {
		//Iterate character array and add it into charSet
		if (!charSet.add(char1)) {
			dupCharSet.add(char1);//if the character is already in the charSet then, 
									//add it to the dupCharSet			
		}
	}
	//Check the dupCharSet elements and remove those in the charSet
	System.out.println("Duplicate chars: "+dupCharSet);
	System.out.println("Non-Duplicate chars: "+charSet);

	//Iterate using charSet
	for (Character char2 : charSet) {
		//Check the iterator variable isn't equals to an empty space
		if (char2 != ' ') {
			System.out.println(char2);//print it
		}
	}

}
}
