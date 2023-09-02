package week4.day1.assignment;

import java.util.List;
import java.util.ArrayList;

public class FindIntersection {
public static void main(String[] args) {
	
	int[] a={3,2,11,4,6,7};
	int[] b={1,2,8,4,9,7};
	
	//create a two empty Lists - list1 & list2
	List<Integer> a1 = new ArrayList<Integer>();
	List<Integer> b1 = new ArrayList<Integer>();
	
	//Declare for loop iterator from 0 to array a.length and add into list1
	for (int i = 0; i < a.length; i++) {
		a1.add(a[i]);
	}
	System.out.println(a1);
	
	//Declare for loop iterator from 0 to array b.length and add into another list2
	for (int i = 0; i < b.length; i++) {
		b1.add(b[i]);
	}
	System.out.println(b1);
	//Compare Both list1 & list2 using a nested for loop
	
	//a1.removeAll(b1);//prints un-common numbers
	//System.out.println(a1);
	//Print the matching number
	b1.retainAll(a1);
	System.out.println(b1);

	
}
}
