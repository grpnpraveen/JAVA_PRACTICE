package ALLABT_THREADS;

public class thread4 {

	public static void main(String[] args) {
		
Runnable p=new Runnable() {
			
			
			public void run() {
				for(int i=0;i<5;i++)
				{
					System.out.println("hi");
					try{Thread.sleep(1000);}
					catch(Exception e) {}
				}
				
			}
		};
		Thread t1=new Thread(p);
		t1.start();
		

		Thread t2=new Thread(()->{													//METHOD 4
										for(int i=0;i<5;i++)
										{
												System.out.println("hello");
												try{Thread.sleep(1000);}
												catch(Exception e) {}
										}
		
					});
		try{Thread.sleep(2);}
		catch(Exception e) {}
		t2.start();
		

	}

}
