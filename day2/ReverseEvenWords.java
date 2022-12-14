package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] str=test.split(" ");
		String s="";
		System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		{
			if(i%2==0)
			{
				char[] charArray = str[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				{
					s=s+charArray[j];
				}
				s=s+" ";
			}
			else
			{
				s=s+str[i];
				s=s+" ";
			}
		}
		System.out.println(s);

	}

}
