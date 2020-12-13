
public class Trail4 {

	int num;
	String name;
	Trail4()
	{
		
	}
	Trail4(int a,String b)
	{
		num=a;
		name=b;
	}
	
	Trail4(int a)
	{
		num=a;
		
	}


 public static void main(String args[])
 {
	 int a=9,b=7;
		System.out.printf("%d%d", a, b);//printf for nextline to add beside
	 Trail4 v =new Trail4(5);
	 System.out.println(v.num);
	 
	 Trail4 p =new Trail4(2,"hey");
	 System.out.println(p.num + p.name);
	 
	 Trail4 i= new Trail4();
	 System.out.println(i.num);
	 
	 
	 
 }
}

