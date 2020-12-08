

public class Mydetails 
{
	public static void main(String args[])
  
	{
		Details1 p = new Details1();
		p.set('p','b');
		
		p.printDetails();
		
		
		
	}
   
}
 class Details1 
{
	
	char name,university;

	void set( char a,char b)
	{
		name=a;
		university=b;
		
		
	}
	
	void printDetails()
	{
		
		System.out.println("Name: " + name);
		System.out.println("University: " + university);
		
	}
	
}