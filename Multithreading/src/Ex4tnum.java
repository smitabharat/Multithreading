
public class Ex4tnum extends Thread
{
Thread t1;
Ex4tnum(Thread t1)
{
this.t1=t1;	
}
public void run()
{
	try
	{
		t1.join();
		for(int i=1;i<=10;i++)
		 {
			 System.out.println(i);
		 }
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
}

}
