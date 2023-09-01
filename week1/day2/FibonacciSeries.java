package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
			
	
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
	int range = 8, firstNum = 0, secNum = 1, sum;
			
	// Print first number
	System.out.println(firstNum);
	
	// Iterate from 1 to the range
	for (int i = 1; i <= 8; i++) {
		sum = firstNum+secNum;// add first and second number assign to sum
		firstNum=secNum; // Assign second number to the first number
		secNum=sum;	// Assign sum to the second number
		System.out.println(sum);// print sum
	}
	
}
}
