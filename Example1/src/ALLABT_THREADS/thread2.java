package ALLABT_THREADS;
 class ok implements Runnable{
	public void run()				// must be run here
	{	
		for(int i=0;i<5;i++) 
		{
		System.out.println("hi");
		try 
		{Thread.sleep(400);}
		catch(Exception e)
				{
					
				}
		}
	}
}
 
 class ok1 extends Thread{
		public void run()
		{	
			for(int i=0;i<5;i++) 
			{
			System.out.println("hello");
			try 
			{Thread.sleep(400);}
			catch(Exception e)
					{
						
					}
			}
		}
	}
public class thread2 {
	public static void main(String args[])
	{
		
		Runnable p=new ok();   // can be Runnnable p=new ok(); bcz implements Runnable right 
		ok1 q=new ok1();
		Thread t1=new Thread(p);
		Thread t2=new Thread(q);
		t1.start();
		try														//METHOD 1
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{}
		t2.start();
		
	}
}
