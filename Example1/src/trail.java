import java.util.Scanner;
class trail{
	public static void main(String[] args)
	{
		Scanner z =new Scanner(System.in);
		int x;
		System.out.println("Enter the number:");
		x=z.nextInt();
		System.out.print("Decimal to binary is:");
		System.out.println(Integer.toBinaryString(x));
		z.close();
	}
}