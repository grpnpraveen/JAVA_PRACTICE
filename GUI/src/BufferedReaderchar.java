import java.io.BufferedReader;

import java.io.InputStreamReader;

public class BufferedReaderchar {
	public static void main(String[] args) throws Exception
	{
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the characters:");
		do {
			
			c=(char)br.read();
			System.out.println(c);
		}while(c !='q');
		
	}

}
