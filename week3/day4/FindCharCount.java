package week3.day4;

public class FindCharCount {
	public static void main(String[] args) {
		
		String input= "TestLeaf";
		int count = 0;
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
	            if (ch[i]=='e') 
                {
				count++;
                }
				
				}
		System.out.println(count);
			
	}

}
