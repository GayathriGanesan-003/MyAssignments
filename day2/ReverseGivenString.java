 package week1.day2;

public class ReverseGivenString {

	public static void main(String[] args) {
		String name="Java Programming";
		char[] charArray = name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
	}

}
