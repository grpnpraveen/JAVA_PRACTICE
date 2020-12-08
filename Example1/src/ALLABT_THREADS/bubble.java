package ALLABT_THREADS;

public class bubble {
	
	void bubblesort(int a[],int size)
	{
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		bubble p=new bubble();
		int a[]= {1,4,9,2};
		p.bubblesort(a,4);
		
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}

	}

}
