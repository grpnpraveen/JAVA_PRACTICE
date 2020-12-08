package datastructures;

public class queuewithlinkedlist {
	Node front,rear;
	
	public queuewithlinkedlist() {
		this.front=null;
		this.rear=null;
	}
	void enqueue(int data) {
		Node temp=new Node(data);
		if(this.rear==null) {
			this.front=this.rear=temp;
		}
		else {
			this.rear.next=temp;
			this.rear=temp;
		}
	}
	
	void dequeue() {
		if(this.front==this.rear) {
			System.out.println("\nQueue is underflow");
		}
		else {
			Node temp=this.front;
			System.out.println("\n"+temp.data+" dequeued");
			this.front=this.front.next;
		}
	}
	public  void printlist() {
		Node temp=this.front;
		if(temp==null) {
			System.out.println("\nQueue underflow");
		}
		System.out.println("Queue elements are:");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}

	public static void main(String[] args) {
		queuewithlinkedlist q=new queuewithlinkedlist();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.printlist();
		q.dequeue();
		q.dequeue();
		q.dequeue();

	}

}
