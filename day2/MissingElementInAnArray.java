package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int n=arr.length;
		int sum=n*(n+1)/2;
		int sumOfArray=0;
		for(int i=0;i<arr.length-1;i++)
		{
			sumOfArray=sumOfArray+arr[i];
		}
		int missingNo=sum-sumOfArray;
		System.out.print("Missing No:"+missingNo);
	}

}
