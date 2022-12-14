package week1.day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		Arrays.sort(arr);
	/*	
		for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		*/
		System.out.println("The duplicates nos are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
				}
				else
				{
					continue;
				}
			}
		}
		
			
	}

}
