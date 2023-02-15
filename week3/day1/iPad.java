package week3.day1;

public class iPad extends iOS{
	public void watchMovie()
	{
		System.out.println("Watching Movie");
	}
	public String watchMovie(String orientation)
	{
		return "portrait";
	}
	public void watchMovie(String orientation,int timeout)
	{
		System.out.println("Watching Movie"+","+10);
	}
	

}
