package week4.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {
public static void main(String[] args) {
	
	String name = "Suganya";
	
	char[] ch = name.toCharArray();
	
	
	Set<Character> charSet=new LinkedHashSet<Character>();
	
	for (Character character : ch) {
		charSet.add(character);
	}
	
	System.out.println(charSet);
}
}
