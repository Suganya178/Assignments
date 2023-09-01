package week4.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueEleArray {
public static void main(String[] args) {
	
	 Integer[] nums ={1,2,1,2,3,4,5,4,5,6};
	 Set<Integer> nums1 = new LinkedHashSet<Integer>(Arrays.asList(nums));
     System.out.println(nums1);
	 
	
}
}
