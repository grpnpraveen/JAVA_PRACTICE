import java.io.*;

public class Filehandling{

	public static void main(String[] args)  throws Exception {
		
		File files=new File("pass.txt");
		//FILE HANDLING
		
		//writing a file
		FileOutputStream fhand=new FileOutputStream(files);
		DataOutputStream file =new DataOutputStream(fhand);
		file.writeUTF("\nok na start");
		
		
		
		//Reading a file
		FileInputStream fhand2 =new FileInputStream(files);
		DataInputStream file2=new DataInputStream(fhand2);
		String abc=file2.readUTF();
		System.out.println(abc);
//		System.out.println(file2.readUTF());
 	}

}
