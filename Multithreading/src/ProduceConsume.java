
public class ProduceConsume 
{
	int n;
	boolean valueSet=false;
	synchronized void get()
	{
		
		int arr[]=new int[5];
		if(!valueSet)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception caught");
			}
		}	for(int i=0;i<5;i++)
				{
					arr[i]=i;
					//
					System.out.println(arr[i]); 
				}
				System.out.println("choclates produced ");
			
		System.out.println("Got:"+n);
		valueSet=false;
		notify();
		//return n;
	}
	synchronized void put(int n)
	{
		int arr[]=new int[5];
		if(valueSet)
		{
			try
			{
		wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception caught");
			}
			
		}	for(int i=0;i<5;i++)
				{
					arr[i]=i;
					
					System.out.println(arr[i]);
				}
		System.out.println("choclates consumed");
			
			
		this.n=n;
		valueSet=true;
		System.out.println("Put:"+n);
		notify();
	}
}
