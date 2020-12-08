package datastructures;

import java.util.LinkedList;

public class graph {
	
	int vertexcount;
	LinkedList<Integer> adjlistarray[];
	 graph(int x){
		vertexcount=x;
		adjlistarray=new LinkedList[vertexcount];
		for(int i=0;i<vertexcount;i++){
			adjlistarray[i]=new LinkedList(); 
		}
	}
	
	void addconnection(int source,int destination) {
		adjlistarray[source].add(destination);
		adjlistarray[destination].add(source);
	}
	
	void print() {
		for(int i=0;i<vertexcount;i++) {
			
			System.out.print("adjlist for given vertex"+i+"is ");
			for(Integer v:adjlistarray[i]) {
				System.out.print("->"+v);
			}
			System.out.println("\n");
			
			
		}
	}
	public static void main(String[] args) {
		graph g=new graph(5);
		g.addconnection(0, 1);
		g.print();

	}

}
