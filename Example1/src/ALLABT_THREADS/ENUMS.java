package ALLABT_THREADS;

interface popop{
	int getprice();
}
enum mobile implements popop//can write enum inside class,,,,,,,cant extend any classes but implements interface
{
	APPLE,SAMSUNG(100),HTC;//may or may not  ordinal for apple is 0 and samsung is 1
	
	int price;			//enum can have constructors,variables and methods
	mobile()
	{
		price=80;
		System.out.println("constructor");
	}
	mobile(int x)	//called by samsung
	{
		price=x;
	}
	public int getprice()
	{
		return price;
	}
	
	
}
//class mobile{									created object in the back end for enum like this
//	static final other APPLE=new other();
//	static final other SAMSUNG=new other();
//	static final other HTC=new other();
//	
//}


public class ENUMS {
//that is here
	public static void main(String[] args) {
		mobile m=mobile.APPLE;//creating enum object
		System.out.println(m);
		System.out.println(m.price);
		mobile mm=mobile.SAMSUNG;
		System.out.println(mm);
		System.out.println(mm.price);
		System.out.println(mm.ordinal());
		mobile p[]=mobile.values();
		for(mobile r:p) {
			System.out.println(r);
		}

	}

}
