package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqChars {
public static void main(String[] args) {
	
	String companyName = "google";
	char[] ch = companyName.toCharArray();
	
	Set<Character> comName = new LinkedHashSet<Character>();
	for (Character name : ch) {
		comName.add(name);
	}
	System.out.println(comName);

	}
}

