package week3.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		

		String text = "We learn java basics as part of java sessions in java week1";
		
		//Initialize an integer variable as count
		
		
		 //Split the String into array and iterate over it 
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			int count=0;
			//System.out.println(split[i]);
			
			//Initialize another loop to check whether the word is there in the array
			for (int j = i+1; j < split.length; j++) {
				
				//if it is available then increase and count by 1. 
				if (split[i].equalsIgnoreCase(split[j])) {
					count++;
				}
			}
			 //if the count > 1 then replace the word as "" 
			if (count==0) {
				System.out.print(split[i]+" ");////Displaying the String without duplicate words		 
			}
		}
		
		 	
	}

}
