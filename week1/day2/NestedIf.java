package week1.day2;

public class NestedIf 
{
public static void main(String[] args) 
{
	
	int mark = 55;
	
	if (mark<=34) {
		System.out.println("Grade F");
	}
	
	else if (mark==35) {
		System.out.println("Grade E");
	}
	
	else if ((mark<=40)||(mark<=50)) {
		System.out.println("Grade O");
	}
	else 
	{
		System.out.println("Not valid mark");
	}
}
}
