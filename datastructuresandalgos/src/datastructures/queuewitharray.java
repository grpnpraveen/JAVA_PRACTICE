package datastructures;

public class queuewitharray {
	int front,rear;
	static final int max=100;
	int a[]=new int[max];
	public queuewitharray()
	{
		this.front=this.rear=0;
	}
	public void enqueue(int data) {
		if(rear==(max+1)) {
			System.out.println("Queue is overflow");
		}
		else {
			a[rear]=data;
			rear++;
		}
	}
	public void dequeue() {
		for(int i=0;i<rear;i++)
		{
			a[i]=a[i+1];
		}
		rear--;
		System.out.println("\nDequeued");
	}
	
	public void printlist() {
		System.out.println("Queue elements are:");
		for(int i=0;i<rear;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
	

	public static void main(String[] args) {

		queuewitharray q= new queuewitharray();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.printlist();
		q.dequeue();
		q.printlist();
		q.dequeue();
		q.printlist();
		

	}

}
