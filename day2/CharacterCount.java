package week1.day2;

public class CharacterCount {

	public static void main(String[] args) {
	String company="hexaware";
	char expected='e';
	int cnt=0;
	char[] charArray = company.toCharArray();
	for(int i=0;i<charArray.length;i++)
	{
		if(charArray[i]=='e')
		{
			cnt++;
		}
	}
	System.out.println("No.of 'e' occurences:"+cnt);

	}

}
