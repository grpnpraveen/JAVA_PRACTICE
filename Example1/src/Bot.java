import java.io.*;
public class Bot 
{
	public static void main(String args[])
	{
		Hey s =new Hey();
		s.fun(2,3);
		
		Hey p =new Hey();
		p.fun(2,3);
		
	System.out.print(s.match(p));
	}

}
