package week1.day1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt<=2)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is a composite number");
		}
		
	}

}
