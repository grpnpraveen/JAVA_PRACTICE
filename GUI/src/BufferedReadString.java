import java.io.*;
public class BufferedReadString {
	
	public static void main(String args[]) throws Exception
	{
		String s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the characters:");
		do {
			
			s=br.readLine();
			System.out.println(s);
		}while(s!="quit");
	}

}
