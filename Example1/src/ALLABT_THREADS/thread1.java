package ALLABT_THREADS;

class hi extends Thread			// here i wrote extends Thread but cannot extend more than one so check thread2
{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try{Thread.sleep(1000);} catch(Exception e) {};
		}
		}
}

class hello extends Thread
{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try{Thread.sleep(1000);} catch(Exception e) {};
		}
}
}

public class thread1 {
	
	
public static void main(String args[])
{
	hi p =new hi();
	
	hello q=new hello();
	p.start();
	try {Thread.sleep(10);}
	catch(Exception e) {
		
	}
	q.start();
	
}

}
