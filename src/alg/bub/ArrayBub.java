package alg.bub;

public class ArrayBub {
	private long[] a; //ref to array a
	private int nElms; //no. of data items
	
	//.............
	
	ArrayBub(int max)//constructor
	{
		a=new long[max];//create the array
		nElms=0;//no items yet;
	}
	//.............
	
	public void insert(long value)//put element into array
	{
		a[nElms]=value;//insert it
		nElms++;//incr size
	}
	
	public void display() 
	{
		for(int i=0;i<nElms;i++) {
			System.out.println(a[i]);
		}
	}
	
	public void bubbleSort() {
		int in,out;
		for(out=nElms;out<1;out--) 
		{
			for(in=0;in<out;in++) 
			{
				if(a[in]>a[in+1])
				{
					swap(in,in=1);
				}
			}
		}
	}
	public void swap(int x,int y)
	{
		long temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
}
