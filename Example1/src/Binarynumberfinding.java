import java.util.LinkedList;
import java.util.Scanner;

public class Binarynumberfinding {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//with array
		int e,r;
		System.out.println("enter the integer:");
		e=scan.nextInt();
		r=e;
		int y[]=new int[1000];
		int i=0;
		while(e>0)
			{
				y[i]=e%2;
				i++;
				e=e/2;
			}
	System.out.println("Binary of "+r+" is: ");
	for(int q=i-1;q>-1;q--) 
		{
			System.out.print(y[q]);
		}
	
	
	
	
	
	
	//with linkedlist
	int t,rs;
	System.out.println("\nenter the integer:");
	t=scan.nextInt();
	LinkedList<Integer> list=new LinkedList<Integer>();
	rs=e;
	

	while(t>0) {
		list.add(t%2);
		t=t/2;
	}
System.out.println("Binary of "+rs+" is: ");
int p=list.size();
for(int q=p-1;q>-1;q--) 
{
	System.out.print(list.get(q));
}
	scan.close();
	}

}
