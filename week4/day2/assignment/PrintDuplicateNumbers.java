package week4.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {
public static void main(String[] args) {	
	/*
	 * Problem Statement : Print only duplicate values
	 * Expected output: 4 and 8
	 * 
	 * How to solve?
	 * 1) Regular for loop
	 * 2) Using Set
	 * 
	 * Using Set 
	 * 
	 * a) Add every element into Set
	 * b) If it is already there in the Set -> Print duplicate
	 * 
	 */
	int[] data = {4,3,6,8,29,1,2,4,7,8};
	Set<Integer> set1 = new LinkedHashSet<Integer>();
	Set<Integer> set2 = new LinkedHashSet<Integer>();
    for (Integer integer : data) {
       if(!set1.add(integer)) {
    	   set2.add(integer);
       }
    }
    System.out.println("Duplicate Values: " +set2);
	System.out.println("Non- Duplicate Values: " +set1);
	
	}	
}

