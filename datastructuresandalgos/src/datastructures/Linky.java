package datastructures;

import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		LinkedList linky=new LinkedList();//to get of the under lines see linky2.
		linky.add("praveen");
		linky.add("praveenfdeaafe");
		linky.add(1);
//		linky.remove(2); index number takes 
//		linky.clear();
		System.out.println(linky);

		LinkedList<String> linky2=new LinkedList<String>();
		linky2.add("pasfe");
		linky2.add("Afdf");
		linky2.add("afefa");
		linky2.add("afw");
		System.out.println(linky2);
		LinkedList<Integer> linky3=new LinkedList<Integer>();
		linky3.add(3);
		linky3.add(7);
		System.out.println(linky3);
		System.out.println(linky3.get(1));
		
	}

}
