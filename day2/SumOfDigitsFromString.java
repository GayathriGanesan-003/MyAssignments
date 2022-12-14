package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		String str=text.replaceAll("[a-zA-Z]*", "");
		//System.out.println(str);
		int sum=0,sum1=0;
		char[] charArray = str.toCharArray();
		for(char x:charArray)
		{
			 sum=sum+Character.getNumericValue(x);
			
		}
		System.out.print(sum);
	}

}
