import java.io.*;
import java.util.*;

class save implements Serializable{
	int i;
}

public class ObjectSavingFiles {

	
	public static void main(String[] args) throws Exception {
		
		save p=new save();//Creating save object
		p.i=8;
		
		//Saving object in file txt
		File f=new File("ObjectSaving.txt");
		FileOutputStream file=new FileOutputStream(f);
		ObjectOutputStream oob=new ObjectOutputStream(file);
		oob.writeObject(p);
		
		//reading a txt file and saving object in the new save object 
		FileInputStream ff=new FileInputStream(f);
		ObjectInputStream ooob=new ObjectInputStream(ff);
		
		//new save object
		save q=(save)ooob.readObject();
		System.out.println(q.i);//printing Saved data.
	}

}

