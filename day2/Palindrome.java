package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		char[] a=str.toCharArray();
		String rev="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		if(rev.equals(str))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
		
	}

}
