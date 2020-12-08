package datastructures;


public class stackwithlinkedlist {
	private  Node first=null;
	static stackwithlinkedlist list =new stackwithlinkedlist();
	
	public  void push(int x) {
		Node newnode=new Node(x);
		newnode.next=first;
		first=newnode;
	}
	
	public  void pop()
	{
		Node temp=first;
		first=first.next;
		System.out.println("removed "+temp.data+" from the stack now");
	}
	
	public static void print(stackwithlinkedlist list)
	{
		Node currentnode=list.first;
		System.out.println("Stack elements are:-");
		while(currentnode!=null) {
			System.out.println(currentnode.data);
			currentnode=currentnode.next;
		}
		
	}

	public static void main(String[] args) {
		
		list.push(1);
		list.push(2);
		list.push(21);
		list.push(20);
		print(list);
		list.pop();
		print(list);
		
		

	}

}
