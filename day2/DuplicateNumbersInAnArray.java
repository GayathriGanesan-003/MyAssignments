package week1.day2;

import java.util.Arrays;

public class DuplicateNumbersInAnArray {

	public static void main(String[] args) {
		
		int nums[]= {2,5,7,7,5,9,2,3};
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println("Duplicate nos 1st way:");
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
			{
				System.out.println(nums[i]);
			}
		}
		System.out.println("Duplicate nos 2nd way:");
	
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					System.out.println(nums[i]);
				}
			}
		}
	}

}
