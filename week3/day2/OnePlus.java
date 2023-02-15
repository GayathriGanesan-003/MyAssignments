package week3.day2;

public class OnePlus extends AndroidTV{

	public String playVideo() {
		
		return "Video works";
	}

	@Override
	public void androidRemote() {
		
		System.out.println("Remote is working fine for oneplus");
	}
	public void openApp()
	{
		System.out.println("For OnePlus,Application is opened successfully");
	}
	

	
}
