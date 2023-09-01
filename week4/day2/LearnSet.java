package week4.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	
	Set<Integer> nums = new LinkedHashSet<Integer>();
	//add elements into set
	nums.add(10);
	nums.add(10);
	nums.add(2);
	nums.add(21);
	nums.add(5);
	nums.add(7);
	//nums.add(null);
	//nums.add(null);
	//print the set
	System.out.println(nums);
	System.out.println(nums.add(20));
	System.out.println(nums);
	
	System.out.println(nums.size());
	//remove
	System.out.println(nums.remove(10));
	System.out.println(nums);
	//clear the set
	//nums.clear();
	System.out.println(nums);
	System.out.println(nums.contains(10));
	//forEach (Datatype varname : input)
	
	for (Integer output : nums) {
		System.out.println(output);
	}
	//convert set into list
	List<Integer> listName = new ArrayList<Integer>(nums);
	System.out.println(listName);
	
}
	
	
}
