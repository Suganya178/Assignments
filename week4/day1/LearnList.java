package week4.day1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LearnList {
public static void main(String[] args) {
	
	//syntax 
	List <String> companyName = new ArrayList<String>();
	companyName.add("TCS");
	companyName.add("Google");
	companyName.add("CTS");
	companyName.add("Infosys");
	companyName.add("HCL");
	companyName.add("Wipro");
	companyName.add("Hexaware");
	companyName.add("Eagle");
	companyName.add("syntel");
	companyName.add("TestLeaf");
	companyName.add("google");
	//print the list based on ASCII value
	System.out.println(companyName);
	//arrange the list
	Collections.sort(companyName);
	//after sort print list
	System.out.println(companyName);
	//size of list
	System.out.println(companyName.size());
	//particular element
	System.out.println(companyName.get(5));
	//remove element
	System.out.println(companyName.remove(8));
	//clear
	//companyName.clear();
	//isEmpty
	System.out.println(companyName.isEmpty());
	System.out.println(companyName);
	System.out.println(companyName.contains("TCS"));
	List <String> companyName1 =new ArrayList<String>();
	companyName1.add("WIPRO");
	companyName1.addAll(companyName);
	System.out.println(companyName1);
			 
	boolean removeAll = companyName1.removeAll(companyName);
	System.out.println(removeAll);
	System.out.println(companyName1.removeAll(companyName1));
	
}
}
