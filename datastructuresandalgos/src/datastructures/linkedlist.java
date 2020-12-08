package datastructures;
class Node{
	int data;
	Node next;
	Node(int c){
		data=c;
		next=null;
	}
	
}

public class linkedlist {

	Node head;
	public static linkedlist append(linkedlist list,int data) {
		Node newnode=new Node(data);
		newnode.next=null;
		
		if(list.head==null) {
			list.head=newnode;
		}
		else {
			Node lastnode=list.head;
			while(lastnode.next!=null) {
				lastnode=lastnode.next;
			}
			lastnode.next=newnode;
		}
		
		return list;
		
	}
	
	
	
	public static void printlist(linkedlist list) {
		Node currentnode=list.head;
		System.out.print("\nelements are:");
		while(currentnode!=null)
		{
			System.out.print(currentnode.data+"=>");
			currentnode=currentnode.next;
		}
	}
	
	
	public static linkedlist delete(linkedlist list,int key)
	{
		Node currentnode=list.head;
		Node previousnode=null;
		
		if(currentnode !=null && currentnode.data==key)
		{
			list.head=currentnode.next;
			return list;
		}
		while(currentnode!=null && currentnode.data!=key)
		{	
			previousnode=currentnode;
			currentnode=currentnode.next;
		}
		if(currentnode!=null)
		{
			previousnode.next=currentnode.next;
					}
		if(currentnode==null)
		{
			System.out.println("element "+key+" not found in the list.");
					}
				return list;
	}
	
	
	public static void main(String args[])
	{
		long start=System.currentTimeMillis();
		linkedlist list=new linkedlist();
		
		list=append(list, 5);
		list=append(list, 9);
		list=append(list, 10);
		list=append(list, 12);
		list=append(list, 2);
		list=append(list, 4);
		list=append(list, 1);
		list=append(list, 102);
		
		
		printlist(list);
		System.out.print("\n\n----------After Deleting\n");
		list=delete(list,102);
		printlist(list);
		
		long end=System.currentTimeMillis();
		System.out.println();
		System.out.println(end-start+"  milli seconds");
		
	}
}
