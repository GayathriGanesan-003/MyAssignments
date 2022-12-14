package week1.day2;

import java.util.Arrays;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String name="amazon development";
		char[] charArray = name.toCharArray();
		System.out.println("Duplicate characters:");
		Arrays.sort(charArray);
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=i+1;j<charArray.length;j++)
			{
				if(charArray[i]==charArray[j])
				{
					System.out.println(charArray[j]);
				}
			}
		}

	}

}
