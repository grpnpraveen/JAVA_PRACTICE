package datastructures;

public class stackwitharray {
	
	public final static int max=100;
	static int a[]=new int[max];
	static int top=-1;
	
	boolean push(int data) {
		if(top>=max) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			++top;
			a[top]=data;
			return true;
		}
	}
	static boolean pop() {
		if(top<0) {
			System.out.println("Stack underflow");
			return false;
		}
		else {
			--top;
			System.out.println("One element is popped");
			return true;
			}
	}
	static void printstack() {
		if(top<0) {
			System.out.println("Stack underflow");
		}
		else {
			System.out.println("stack elements are:");
			for(int i=top;i>=0;i--)
			{
				System.out.println(a[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		
		stackwitharray list =new stackwitharray();
		list.push(5);
		list.push(6);
		list.push(7);
		printstack();
		pop();
		printstack();
	}

}
