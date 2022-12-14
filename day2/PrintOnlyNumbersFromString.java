package week1.day2;

public class PrintOnlyNumbersFromString {

	public static void main(String[] args) {
		String details = "Amazon has 11400 employees in chennai";
		//1st way
		char[] newDetails=details.toCharArray();

		for(int i=0;i<newDetails.length;i++)
		{
			if(Character.isDigit(newDetails[i]))
			{
				System.out.print(newDetails[i]);
			}
		}
		System.out.println("\n");
		//2nd way
		System.out.println(details.replaceAll("[^0-9]", ""));
		System.out.println("\n");
		//3rd way
		for(char c:newDetails)
		{
			if(Character.isDigit(c))
			{
				System.out.print(c);
			}
		}
		//4th way
		System.out.println("\n");
		for(int i=0;i<newDetails.length;i++)
		{
			if(newDetails[i]>=48 && newDetails[i]<=57)
			{
				System.out.print(newDetails[i]);
			}
		}
		
	}

}
