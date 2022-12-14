package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		System.out.println("Intersection of elements are:");
		for(int i=0,j=0;i<a.length && j<b.length;i++,j++)
		{
			if(a[i]==b[j])
			{
				System.out.print(b[j]+" ");
			}
		}
		

	}

}
