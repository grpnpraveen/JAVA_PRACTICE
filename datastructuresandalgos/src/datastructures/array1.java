package datastructures;
import java.util.Arrays;
class ok{
	public int[] resize(int[] a) {
		
		return Arrays.copyOf(a, a.length-1);
		
	}
}

public class array1 {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("====================================================");
		
		ok p=new ok();
		a=p.resize(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
