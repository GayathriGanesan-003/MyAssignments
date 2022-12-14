package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		String str="";
		char oddIndex[]=test.toCharArray();
		int i=0;
		for(i=0;i<oddIndex.length;i++)
		{
			if(i%2!=0)
			{
				str=str+oddIndex[i];
				
			}
			
		}
		System.out.println("Odd Index to upper case: "+str.toUpperCase());

	}

}
