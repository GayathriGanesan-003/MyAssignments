package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="We learn java basics as part of java sessions in java week1";
		String[] splitWords=str.split(" ");
		String duplicate="";
		for(String s:splitWords)
		{
			if(duplicate.indexOf(s)==-1)
			{
				duplicate=duplicate+s+" ";
			}
		}
		System.out.println(duplicate);
			
	}


}	