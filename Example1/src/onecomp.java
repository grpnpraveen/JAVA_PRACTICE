import java.util.Scanner;
	import java.lang.Math;
		
public class onecomp {
		public static void main(String args[])
		{
			Scanner z =new Scanner(System.in);
			int x;
			System.out.println("Enter the integer:");
			x=z.nextInt();
			hlo g=new hlo();
			g.convert(x);
			z.close();
		}
	}
	class hlo
	{
		public void convert(int x)
		{   
			int y=0,value;
			int hey[]=new int[1000];
			while(x > 0)
			{
			       hey[y++] = x%2;
			       x = x/2;
			}
			
			
			     for(int i = y-1;i >= 0;i--)
			     {
			    	 if(hey[i]==0)
			    	 {
			    		 hey[i]=hey[i]+1;
			    	 }
			    	 else {
			    		 hey[i]=hey[i]-1;
			    	 }
			      
			     }
			     for(int i = y-1;i >= 0;i--)
			     {
			     
			    	value = hey[i]*((int)Math.pow(2,i));
			    	if(i==1)
			    	{
			    		System.out.println(value);
			    	}
			     
			     } 
		}
		}

