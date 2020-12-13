import java.util.Scanner;
public class bank {
	public static void main (String[] args)
	{
		Scanner z=new Scanner(System.in);
		int x,sqr,y,dig=0;
		System.out.println("Enter an integer:");
		x=z.nextInt();
		sqr=(x*x);
		y=x;
		while(y>0)
		{
			y=y/10;
			dig++;
		}
		int k = (int) (sqr%(Math.pow(10,dig)));
		if(x==k) {
			System.out.println("It is Automorphic number.");
		}
		else {
			System.out.println("No it is not Automorphic number.");
		}
	}
}
