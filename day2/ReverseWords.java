package week1.day2;

public class ReverseWords {

	public static void main(String[] args) {
	String name="Amazon Development Center, Chennai";
	String[] split = name.split(" ");
	int cnt=0;
	String rev="";
	for(int i=0;i<split.length;i++)
	{
		System.out.println(split[i]);
		cnt++;
	}
	System.out.println("No.of Words:"+cnt);
	System.out.println("Reverse Words:");
	for(int i=split.length-1;i>=0;i--)
	{
		System.out.println(split[i]);
	}
	System.out.print("Reverse words in lowercase:");
	for(int i=split.length-1;i>=0;i--)
	{
		System.out.print(split[i].toLowerCase()+" ");
		
	}
	
}
	
}