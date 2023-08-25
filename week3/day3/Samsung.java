package week3.day3;

public class Samsung extends AndroidTV
{

	public void playVideo() {
		System.out.println("Playiong videos..");
		
	}

	public static void main(String[] args) {
		
		Android obj = new Samsung();
		obj.playVideo();
		obj.openApp();
		
	}

	
	
}
