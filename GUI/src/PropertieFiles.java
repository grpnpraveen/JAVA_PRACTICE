import java.util.*;
import java.io.*;
public class PropertieFiles {

	public static void main(String[] args) throws Exception 
	{
//		String que[]= {"name","password","place","age","current"};
//		String ans[]= {"praveen","123","skht","12","btech"};
		
		//for properties
		Properties prop=new Properties();
		
		//writing a file
		File file=new File("First.properties");
		OutputStream os=new FileOutputStream(file);

		prop.setProperty("name", "praveen");
		prop.setProperty("age", "12");
		//storing in a file
		prop.store(os, null);
		
		//Reading a file
		InputStream io=new FileInputStream(file);
		prop.load(io);
		System.out.println(prop.getProperty("name"));
		
	}

}
 