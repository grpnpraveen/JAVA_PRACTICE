import java.util.Scanner;

public class Sumofthreedigitnum {

	public static void main(String args[])
	{
		int n,a,b,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the three digit number or less:");
		n=sc.nextInt();
		a=n%10;
		n=n-a;
		b=(n%100);
		d=b/10;
		n=n-b;
		e=n/100;
		
		System.out.println("The sum of the entered digits is:"+(a+d+e));
		sc.close();
	    
	}
}
