package week4.day2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String name="Testleaf";//Testlaf;
		char[] ch = name.toCharArray();
	
		Set<Character> cname=new LinkedHashSet<Character>();
		for (Character character : ch) {
			System.out.println(cname.add(character));
		}
		System.out.println(cname);
	}
}