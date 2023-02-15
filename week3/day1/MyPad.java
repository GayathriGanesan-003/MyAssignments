package week3.day1;

public class MyPad extends iPad{

	public static void main(String[] args) {
		
		iPad i=new iPad();
		i.watchMovie();
		System.out.println(i.watchMovie("a"));
		i.watchMovie("b", 1);
	}

}
